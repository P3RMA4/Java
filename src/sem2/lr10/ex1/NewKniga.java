package sem2.lr10.ex1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class NewKniga {
    public static void main(String[] args) {
        try{
            Scanner in = new Scanner(System.in);
            File inputFile = new File("src/sem2/lr10/ex1/example.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            System.out.println("Введите название книги:");
            String title = in.nextLine();

            System.out.println("Введите автора:");
            String author = in.nextLine();

            System.out.println("Введите год:");
            String year = in.nextLine();

            Element kniga1 = doc.createElement("kniga");
            doc.getDocumentElement().appendChild(kniga1);

            Element title1 = doc.createElement("title");
            title1.appendChild((doc.createTextNode(title)));
            kniga1.appendChild(title1);

            Element author1 = doc.createElement("author");
            author1.appendChild(doc.createTextNode(author));
            kniga1.appendChild(author1);

            Element year1 = doc.createElement("year");
            year1.appendChild(doc.createTextNode(year));
            kniga1.appendChild(year1);

            doc.setXmlStandalone(true);
            doc.normalizeDocument();
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "no");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount","2");
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new FileOutputStream("src/sem2/lr10/ex1/example.xml"));
            transformer.transform(source, result);
            System.out.println("Книга добавлена!");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}