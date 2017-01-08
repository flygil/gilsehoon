import java.io.FileReader;

public class FileReaderTest {
	public static void main(String[] args) {
	
		FileReader fr = null;
		try {
			fr = new FileReader("data/a.txt");
			while (true) {
				int ch = fr.read();
				if (ch == -1) break;
				System.out.print((char)ch);
			} 
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fr != null) {
				try {
					fr.close();
				} catch (Exception e2) {
					
				}
			}
		}
		
	}
}
