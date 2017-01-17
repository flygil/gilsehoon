package network.api;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Test02 {
	public static void main(String[] args) {
		String requestURL =	"https://apis.daum.net/search/blog";
		String parameter ="?apikey=6dc740459aff9f405663028e27666639&q=java&result=3&output=xml";
		
		String apiUrl = requestURL + parameter;
		try {
			URL url =new URL(apiUrl);
			InputStream in = url.openStream();
			
			//Dom Parser에게 입력스트림 처리를 넘기기
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			//xml 형식의 데이터 파싱처리하기
			Document dom = builder.parse(in);
			NodeList list = dom.getElementsByTagName("item");
			int len = list.getLength();
			List<ItemVO> iList = new ArrayList();
			for (int i = 0; i < len; i++) {
				ItemVO vo = new ItemVO();
				Node cNode = list.item(i);
				String cName = cNode.getNodeName();
				NodeList chList = cNode.getChildNodes();
				int chLen = chList.getLength();
				for(int j = 0; j < chLen; j++){
					Node chNode = chList.item(j);
					String chName = chNode.getNodeName();
					if ("#text".equals(chName)) continue;
					String value = chNode.getTextContent();
					switch(chName) {
					case "title": vo.setTitle(value); break;
					case "description": vo.setDescription(value); break;
					case "link": vo.setLink(value); break;
					case "author": vo.setAuthor(value); break;
					case "comment": vo.setComment(value); break;
					case "pubDate": vo.setPubDate(value); break;
					}
				}
				iList.add(vo);
			}
			for(ItemVO i : iList) {
				System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");
				System.out.printf("title : %s\ndescription : %s\nlink : %s\nauthor : %s\ncomment : %s\npubDate : %s\n", 
									i.getTitle(), i.getDescription(), i.getLink(), i.getAuthor(), i.getComment(), i.getPubDate());
				System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
