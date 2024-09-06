import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class WWW {

	public static void main(String[] args) throws Exception {

		try{
	        DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
	 
	            DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
	 
	            Document document = documentBuilder.newDocument();
	 
	            // root element
	            Element root = document.createElement("cre:ORD");
	            document.appendChild(root);

	            Attr attr = document.createAttribute("xmlns:cre");
	            attr.setValue("http://www");
	            root.setAttributeNode(attr);

	            Element recordType = document.createElement("cre:RecordType");
	            recordType.appendChild(document.createTextNode("C"));
	            root.appendChild(recordType);
	            Element recordType1 = document.createElement("cre:RecordType1");
	            recordType1.appendChild(document.createTextNode("D"));
	            root.appendChild(recordType1);

	            
	            Element subRootElement = document.createElement("cre:ORL");
	            root.appendChild(subRootElement);
for(int i=1;i<=100;i++)
{
	  Element lineNum = document.createElement("cre:LineNum"+i);
      lineNum.appendChild(document.createTextNode(i+""));
      subRootElement.appendChild(lineNum);
}
	         

	            
	            // create the xml file
	            //transform the DOM Object to an XML File
	            TransformerFactory transformerFactory = TransformerFactory.newInstance();
	            Transformer transformer = transformerFactory.newTransformer();
	            DOMSource domSource = new DOMSource(document);
	            StreamResult streamResult = new StreamResult(new File("F:\\Amrutha\\sub.xml"));
	 
	            // If you use
	            // StreamResult result = new StreamResult(System.out);
	            // the output will be pushed to the standard output ...
	            // You can use that for debugging
	 
	            transformer.transform(domSource, streamResult);
	 
	            System.out.println("Done creating XML File");
	 
	        } catch (ParserConfigurationException pce) {
	            pce.printStackTrace();
	        } catch (TransformerException tfe) {
	            tfe.printStackTrace();
	        }

	    }
}
