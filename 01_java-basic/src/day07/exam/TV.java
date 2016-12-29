package day07.exam;

public class TV {
	private int channel;
	private int volume;
	//private boolean onOff = false;
	
	public int getChannel () {
		return channel;
	}
	public void setChannel (int channel) {
		this.channel = channel;
	}
	public int getVolume () {
		return volume;
	}
	public void setVolume (int volume) {
		this.volume = volume;
	}
	void channelUp () {
		setChannel(channel+1);
	}
	void powerOn() {
	//	onOff = true;
		System.out.println("티비 전원을 켭니다.");
	}
	void powerOff() {
	//	onOff = false;
		System.out.println("티비 전원을 끕니다.");
	}
}
