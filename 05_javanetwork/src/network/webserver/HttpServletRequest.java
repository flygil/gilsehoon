package network.webserver;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

public class HttpServletRequest {
	private InputStream in;
	private String method; //GET OR POST
	private String requeUri;//사용자가 요청한 URI(파라미터제외)
	private String queryString;//
	private Map<String, String> paramMap;
	public HttpServletRequest(InputStream in) throws Exception{
		this.in = in;
		init();
	}
	private void init() throws Exception{
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		String startLine = br.readLine();
		if (startLine == null) return;
		
		String[] data =startLine.split(" ");
		method = data[0]; //요청 메소드 설정	
		// /test?id=aaa&pass=1111
		String [] uri = data[1].split("\\?");
		requeUri = uri[0];
		if (uri.length == 2) {
			queryString = uri[1];
			setParamMap();
		}
		
		//POST방식 처리하기
		//파라미터가 시작라인이 아닌 바디에 넘어오기 때문에 헤더 정보를 읽고 
//		바디에 있는 데이터를 꺼낸다.
		
		//헤더읽기
		while(true) {
			String line = br.readLine();
			if (line.equals("")) break;
		}
		if ("POST".equals(method)) {
			String bodyParam = "";
			int ch = 0;
			while(br.ready()) {
				ch = br.read();
				bodyParam += (char)ch;
			}
			if (bodyParam.length() > 0) {
				queryString = bodyParam;
				setParamMap();
			}
		}
	}
	
	private void setParamMap() throws Exception{
		paramMap = new HashMap<>();
		String[] params = queryString.split("&");
		for (String param : params) {
			String[] pArr = param.split("=");
			paramMap.put(pArr[0], URLDecoder.decode(pArr[1], "utf-8"));
		}
	}
	
	public String getMethod(){
		return method;
	}
	public String getRequestUri(){
		return requeUri;
	}
	public String getQueryString() {
		return queryString;
	}
	public String getParameter(String key){
		return paramMap == null ? null : paramMap.get(key);
	}
}
