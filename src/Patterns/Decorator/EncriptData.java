package Patterns.Decorator;

import java.util.Arrays;
import java.util.Base64;

public class EncriptData implements FileActions {
  private FileActions fileActions;

  public EncriptData(FileActions fileActions) {
    this.fileActions = fileActions;
  }

  @Override
  public String readFromFile() {
    String encryptedStr = fileActions.readFromFile();
    return decrypt(encryptedStr);
  }

  @Override
  public void writeToFile(String str) {
    fileActions.writeToFile(encrypt(str));
  }

  private String decrypt(String decryptdStr) {
    byte[] decodeFromBase64 = Base64.getDecoder().decode(decryptdStr);
    decodeFromBase64 = applyMask(decodeFromBase64);
    return new String(decodeFromBase64);
  }

  private String encrypt(String str) {
    byte[] bytes = applyMask(str.getBytes());
    return Base64.getEncoder().encodeToString(bytes);
  }

  private byte[] applyMask(byte[] bytesForMask) {
    final int MASK = 666;
    byte[] bytes = Arrays.copyOfRange(bytesForMask, 0, bytesForMask.length);
    for (int i = 0; i < bytes.length; i++) {
      bytes[i] ^= MASK;
    }
    return bytes;
  }
}
