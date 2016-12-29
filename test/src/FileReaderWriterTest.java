import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderWriterTest {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("data/a.txt");
			fw = new FileWriter("data/acopy.txt");
			
			while (true) {
				int ch = fr.read();
				if (ch == -1) break;
				
				fw.write(ch);
			}
			System.out.println("파일복사완료");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if (fr != null) {
				try {
					fr.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			if (fw != null) {
				try {
					fw.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		}
	}
}
