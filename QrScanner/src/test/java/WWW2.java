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

public class WWW2 {

	public static void main(String[] args) throws Exception {

		boolean status = false;
		try {
			DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();

			DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();

			Document document = documentBuilder.newDocument();

			// root element
			Element root = document.createElement("cre:ORD");
			document.appendChild(root);

			Attr attr = document.createAttribute("xmlns:cre");
			attr.setValue("http://");
			root.setAttributeNode(attr);

			File path = new File(".\\src\\main\\resources\\root.xlsx");

			InputStream lo = new FileInputStream(path);

			XSSFWorkbook book = new XSSFWorkbook(lo);
			XSSFSheet sheet = book.getSheet("root");
			int last = sheet.getLastRowNum();
			DataFormatter formatter = new DataFormatter();
			Element subRootElement = null;
			for (int i = 0; i <= last; i++) {
				String element = formatter.formatCellValue(sheet.getRow(i).getCell(0));
				String text = formatter.formatCellValue(sheet.getRow(i).getCell(1));

				if (status == false) {
					subRootElement = document.createElement("cre:" + element);
					subRootElement.appendChild(document.createTextNode(text));

					root.appendChild(subRootElement);

				} else {
					Element lineNum = document.createElement("cre:" + element);
					lineNum.appendChild(document.createTextNode(text));
					subRootElement.appendChild(lineNum);

				}

				if (element.equalsIgnoreCase("orl")) {
					status = true;
				}

			}

			/*
			 * Element subRootElement = document.createElement("cre:ORL");
			 * root.appendChild(subRootElement);
			 * 
			 * Element lineNum = document.createElement("cre:LineNum");
			 * lineNum.appendChild(document.createTextNode("1"));
			 * subRootElement.appendChild(lineNum);
			 */

			// create the xml file
			// transform the DOM Object to an XML File
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			StreamResult streamResult = new StreamResult(new File("F:\\good.xml"));

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
