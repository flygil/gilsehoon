package boardUI;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public abstract class BaseUI {
	protected Scanner sc = new Scanner(System.in);
	protected SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	abstract void execute();
}
