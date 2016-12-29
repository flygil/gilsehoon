package day10.exam;

public class Bus {
	private int passenger;
	private static int totalP;
	private int busNum;
	private String result;
	
	public int getBusNum() {
		return busNum;
	}
	public void setBusNum(int busNum) {
		this.busNum = busNum;
	}
	public int getPassenger() {
		return passenger;
	}
	public void setPassenger(int passenger) {
		this.passenger = passenger;
	}
	public int getTotalP() {
		return totalP;
	}
	public void setTotalP(int totalP) {
		this.totalP = totalP;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
	Bus() {
	}
	Bus(int i) {
		setBusNum(i);
		System.out.println(i + "번 버스 운행시작");		
	}
	
	
	
	public void ride() {
		setPassenger(getPassenger() + 1);
		setTotalP(getTotalP() + 1);
		System.out.println("승객 1명 승차.");
	}
	public void ride(int i) {
		setPassenger(getPassenger() + i);
		setTotalP(getTotalP() + i);
		System.out.println("승객 " +  i + "명 승차.");
	}
	public void leave () {
		setPassenger(getPassenger() - 1);
		System.out.println("승객 1명 하차.");
	}
	public void leave (int i) {
		setPassenger(getPassenger() - i);
		System.out.println("승객 " +  i + "명 하차.");
		
	}
	/*String convertString() {
		setResult(String.format("%d번 버스의 현재 승차인원: %d명.\n"
				+ "모든버스의 누적승차인원: %d명.\n ", busNum, passenger, totalP));
		return result;
	}
	*/
	public String toString() {
		return busNum+"번 버스의 현재 승차인원: " + passenger + "명.\n" +
				"모든 버스의 누적 승차인원: " + totalP + "명.";
	}
}
