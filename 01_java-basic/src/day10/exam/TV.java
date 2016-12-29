package day10.exam;

public class TV {
	private int volume;
	private int channel;
	
	public int getVolume() {
		return volume;
	}


	public void setVolume(int volume) {
		this.volume = volume;
	}


	public int getChannel() {
		return channel;
	}


	public void setChannel(int channel) {
		this.channel = channel;
	}


	TV (int channel, int volume) {
		setChannel(channel);
		setVolume(volume);
	}
	
	
	void powerOn() {
		System.out.println("티비 전원을 켭니다.");
	}
	void channelUp() {
		setChannel(getChannel() + 1);
	}
	void powerOff() {
		System.out.println("티비 전원을 끕니다.");
	}
	
}
