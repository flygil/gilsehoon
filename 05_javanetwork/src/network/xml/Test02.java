package network.xml;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Test02 {
	public static void main(String[] args) {
		//파서 객체를 가져오기 위한 팩토리 객체 얻기
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		//xml내용을 파싱할 파서 준비
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			//xml 형식의 데이터 파싱처리하기
			Document dom = builder.parse("src/network/xml/family.xml");
			NodeList list = dom.getElementsByTagName("family");
			int len = list.getLength();
			System.out.println("family의 수 : " + len);
			for(int i = 0; i < len; i++) {
				Node cNode = list.item(i);
				String cName = cNode.getNodeName();
				System.out.println("cNode name : " + cName);
				NodeList chList = cNode.getChildNodes();
				int chLen = chList.getLength();
				System.out.println("family의 자식수 : " + chLen);
				for(int j = 0; j < chLen; j++) {
					Node chNode = chList.item(j);
					String chName = chNode.getNodeName();
					if("#text".equals(chName)) continue;
					String value = chNode.getTextContent();
					System.out.println(chName + "," + value);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}











