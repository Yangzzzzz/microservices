package com.micro.spider.parser.jsoup;

import com.micro.spider.page.Page;
import org.htmlcleaner.CleanerProperties;
import org.htmlcleaner.DomSerializer;
import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.TagNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

public class JsoupParser {


//    public String parser(String html,String exp)  {
//        HtmlCleaner hc = new HtmlCleaner();
//        TagNode tn = hc.clean(html);
//        Object result;
//        try {
//            org.w3c.dom.Document dom = new DomSerializer(new CleanerProperties()).createDOM(tn);
//            XPath xPath = XPathFactory.newInstance().newXPath();
//
//            result = xPath.evaluate("//span/figure", dom, XPathConstants.NODESET);
//
//            if (result instanceof NodeList) {
//                NodeList nodeList = (NodeList) result;
//                System.out.println(nodeList.getLength());
//                for (int i = 0; i < nodeList.getLength(); i++) {
//                    Node node = nodeList.item(i);
//                    /**
//                     * Node.getTextContent() 此属性返回此节点及其后代的文本内容。
//                     * Node.getFirstChild()  此节点的第一个子节点。
//                     * Node.getAttributes() 包含此节点的属性的 NamedNodeMap（如果它是 Element）；否则为 null
//                     * 如果想获取相应对象的相关属性，可以调用  getAttributes().getNamedItem("属性名") 方法
//                     */
//                    System.out.println(node.getTextContent());
//                }
//
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }



}
