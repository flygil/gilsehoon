package day17.exam;

import java.util.Scanner;

public abstract class BaseUI {
	protected Scanner baseSc = new Scanner(System.in);
	public abstract void execute();
}
