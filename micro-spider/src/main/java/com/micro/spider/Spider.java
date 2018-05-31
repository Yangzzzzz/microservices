package com.micro.spider;

import com.micro.spider.factory.PerformerFactory;
import com.micro.spider.page.Page;
import com.micro.spider.performer.Performer;
import org.htmlcleaner.CleanerProperties;
import org.htmlcleaner.DomSerializer;
import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.TagNode;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Spider {

    private LinkedList<Page> pages ;
    private LinkedList<String> requests;
    private HashMap<String,String> header = new HashMap<String, String>();
    private HashMap<String,String> cookie;
    private Performer performer = PerformerFactory.getInstance();


    /**
     * 新增请求url
     * @param url
     */
    public Spider addRequest(String url){

        if(requests == null){
            requests = new LinkedList<String>();
        }

        this.requests.add(url);
        return  this;
    }

    /**
     * 新增请求头
     * @param name
     * @param val
     */
    public Spider addHead(String name,String val){
        header.put(name,val);
        return this;
    }

    public Spider addHead(Map<String,String> header){
        this.header.putAll(header);
        return this;
    }


    public Spider(){

    }

    /**
     * 开始抓取
     */
    public void start(){
        for(String request : requests){
            Page page = performer.execute(request,header);
            page.setCharSet("utf-8");
            System.out.println(page);
            HtmlCleaner hc = new HtmlCleaner();
            TagNode tn = hc.clean(page.toString());
            Object result;
            try {
                Document dom = new DomSerializer(new CleanerProperties()).createDOM(tn);
                XPath xPath = XPathFactory.newInstance().newXPath();

                result = xPath.evaluate("//span/figure", dom, XPathConstants.NODESET);

                if (result instanceof NodeList) {
                    NodeList nodeList = (NodeList) result;
                    System.out.println(nodeList.getLength());
                    for (int i = 0; i < nodeList.getLength(); i++) {
                        Node node = nodeList.item(i);
                        /**
                         * Node.getTextContent() 此属性返回此节点及其后代的文本内容。
                         * Node.getFirstChild()  此节点的第一个子节点。
                         * Node.getAttributes() 包含此节点的属性的 NamedNodeMap（如果它是 Element）；否则为 null
                         * 如果想获取相应对象的相关属性，可以调用  getAttributes().getNamedItem("属性名") 方法
                         */
                        System.out.println(node.getTextContent());
                    }

                }

            } catch (Exception e) {
                e.printStackTrace();
            }
//            try {
//            } catch (XPathExpressionException e) {
//                e.printStackTrace();
//            }
//            JsoupParser jsoupParser = new JsoupParser();
//
//            try {
//                jsoupParser.parser(page.toString(),"\\\\figure");
//            } catch (XPathExpressionException e) {
//                e.printStackTrace();
//            }
        }
    }



}
