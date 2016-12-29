import java.io.FileWriter;

public class FileOutputStreamTest {
	public static void main(String[] args) {
		
		FileWriter fr = null;
		try {
			fr = new FileWriter("data/a3.txt", true);
			fr.write('a');
			fr.write(97);
			fr.write('가');
			fr.write("어디가");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fr != null)
				fr.close();
			} catch (Exception   e2) {
				e2.printStackTrace();
			}
		}
	}
}
