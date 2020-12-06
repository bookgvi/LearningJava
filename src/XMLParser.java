import XMLParser.*;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.FileNotFoundException;

public class XMLParser {
  public static void main(String[] args) throws ParserConfigurationException, FileNotFoundException, TransformerException {
    CreateXML createXML = new CreateXML();
    String[] tags = new String[]{ "User",  "Credentials" };
    createXML.createSimpleXML(tags);
  }
}
