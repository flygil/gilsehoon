package network.xml;

import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Test01 {
	public static void main(String[] args) {
		//파서 객체를 가져오기 위한 팩토리 객체 얻기
		//xml내용을 파싱할 파서 준비
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			//xml 형식의 데이터 파싱처리하기
			Document dom = builder.parse("src/network/xml/family.xml");
			NodeList list = dom.getElementsByTagName("family");
			int len = list.getLength();
			
			List<FamilyVO> familys = new ArrayList();
		
			for(int i = 0; i < len; i++) {
				FamilyVO family = new FamilyVO();
				
				Node cNode = list.item(i);
				String cName = cNode.getNodeName();
		
				NodeList chList = cNode.getChildNodes();
				int chLen = chList.getLength();
		
				for(int j = 0; j < chLen; j++) {
					Node chNode = chList.item(j);
					String chName = chNode.getNodeName();
					//if("#text".equals(chName)) continue;
					String value = chNode.getTextContent();
					System.out.println(chName);
					switch(chName) {
					case "father" : family.setFather(value); break;
					case "mother" : family.setMother(value); break;
					case "me" : family.setMe(value); break;
					}
	
				}
				familys.add(family);
			}
			System.out.println("------------------------");
			System.out.println("가족정보");
			System.out.println("------------------------");
			for(FamilyVO f : familys) {
				System.out.printf("%s   %s   %s\n",
						f.getFather(), f.getMother(), f.getMe());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}











