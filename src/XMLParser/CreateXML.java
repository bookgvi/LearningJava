package XMLParser;

import StreamIO.File;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import java.util.Random;

public class CreateXML {
  private final String DEFAULT_NAME = "/Users/bookgvi/IdeaProjects/LearningJava/src/XMLParser/default.xml";
  private String XMLFileName;
  private FileOps fileOps;

  public CreateXML() throws ParserConfigurationException {
    fileOps = new FileOps();
    this.XMLFileName = DEFAULT_NAME;
  }

  public CreateXML(String XMLFileName) throws ParserConfigurationException {
    fileOps = new FileOps();
    this.XMLFileName = XMLFileName;
  }

  public void createSimpleXML(String[] tags) throws FileNotFoundException, TransformerException {
    Document document = null;
    try {
      DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
      DocumentBuilder db = dbf.newDocumentBuilder();
      document = db.newDocument();
      Element root = document.createElement("root");
      document.appendChild(root);
      root.setAttribute("lang", "en");
      for (String tag : tags) {
        Element node = document.createElement(tag);
        node.setTextContent("QQQ");
        node.setAttribute("attr", String.valueOf(new Random().nextInt(100)));
        root.appendChild(node);
      }

    } catch (ParserConfigurationException ignored) {

    } finally {
      if (document != null) fileOps.saveXMLToFile(document);
    }
  }

  private class FileOps {
    private final int BUFFER_SIZE = 8196;

    private FileOps() {
    }

    void saveXMLToFile(Document document) {
      byte[] buffer = new byte[BUFFER_SIZE];
      try {
        FileOutputStream fos = new FileOutputStream(CreateXML.this.XMLFileName);
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        DOMSource source = new DOMSource(document);
        Result result = new StreamResult(fos);
        transformer.transform(source, result);
      } catch (FileNotFoundException | TransformerException ex) {
        System.out.printf("Error: %s%n", ex);
      }
    }
  }

}
