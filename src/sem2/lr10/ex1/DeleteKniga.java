package sem2.lr10.ex1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import java.io.File;

public class DeleteKniga {
    public static void main(String[] args) {
        try {
            File inputFile = new File("src/sem2/lr10/ex1/example.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Корневой элемент: "+doc.getDocumentElement().getNodeName());
            NodeList nodeList = doc.getElementsByTagName("kniga");

            Node node = nodeList.item(0);
            Element knigaElement = (Element) node;
            knigaElement.getElementsByTagName("title").item(0);
            Node parentNode = knigaElement.getParentNode();
            parentNode.removeChild(knigaElement);

            doc.setXmlStandalone(true);
            doc.normalizeDocument();
            javax.xml.transform.TransformerFactory tf = javax.xml.transform.TransformerFactory.newInstance();
            javax.xml.transform.Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            javax.xml.transform.dom.DOMSource source = new javax.xml.transform.dom.DOMSource(doc);
            javax.xml.transform.stream.StreamResult result =
                    new javax.xml.transform.stream.StreamResult(new File ("src/sem2/lr10/ex1/example.xml"));
            transformer.transform(source,result);

            System.out.println("Удалили первую книгу в списке");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}