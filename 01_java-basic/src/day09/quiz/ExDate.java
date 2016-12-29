package day09.quiz;

public class ExDate {
	private int year;
	private int month;
	private int day;

	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}


	
	
	public ExDate() {
		this(2013, 4, 1);
	}
	public ExDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	
	void showDate() {
		System.out.printf("%4d년 %2d월 %02d일\n",year, month, day);
	}
}
