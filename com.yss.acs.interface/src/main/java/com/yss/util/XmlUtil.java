package com.yss.util;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * 解析-xml文件
 * 
 * @author Administrator
 *
 */
public class XmlUtil {

	public static void main(String[] args) {
		new XmlUtil().readXML("src/main/resources/test.xml");
	}

	public void readXML(String filePath) {
		File file = new File(filePath);
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(file);
			Element element = doc.getDocumentElement();
			listAllChildNodes(element, 0);
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void listAllChildNodes(Node node, int level) {
		if (node.getNodeType() == Node.ELEMENT_NODE) {
			boolean hasTextChild = false;
			String levelSpace = "";
			for (int i = 0; i < level; i++) {
				levelSpace += "    ";
			}
			System.out.print(levelSpace + "<" + node.getNodeName() + (node.hasAttributes() ? " " : ">"));
			if (node.hasAttributes()) {
				NamedNodeMap nnmap = node.getAttributes();
				for (int i = 0; i < nnmap.getLength(); i++) {
					System.out.print(nnmap.item(i).getNodeName() + "=\"" + nnmap.item(i).getNodeValue() + "\""
							+ (i == (nnmap.getLength() - 1) ? "" : " "));
				}
				System.out.print(">");
			}
			if (node.hasChildNodes()) {
				NodeList nodelist = node.getChildNodes();
				for (int i = 0; i < nodelist.getLength(); i++) {
					if (nodelist.item(i).getNodeType() == Node.TEXT_NODE
							&& (!nodelist.item(i).getTextContent().matches("\\s+"))) {
						hasTextChild = true;
						System.out.print(nodelist.item(i).getTextContent());
					} else if (nodelist.item(i).getNodeType() == Node.ELEMENT_NODE) {
						System.out.println();
						listAllChildNodes(nodelist.item(i), level);
					}
				}
				level--;

			}
			System.out.print(((hasTextChild) ? "" : "\n" + levelSpace) + "</" + node.getNodeName() + ">");
		}
	}
}
