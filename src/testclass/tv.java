package testclass;

public class tv {
	private String color, producer;
	private int size, channel, volume;
	
	public void setColor(String color) {
		this.color=color;
	}
	
	public String getcolor() {
		return color;
	}
	
	

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public String getColor() {
		return color;
	}

	
	public void powerOn() {
		System.out.println(producer+"TV 전원 켜짐");
	}
	
	public void powerOff() {
		System.out.println(producer+"TV 전원 꺼짐");
	}
	
	public void upChannel() {
		channel++;
		System.out.println("현재 채널 : "+channel+"번");
	}
	
	public void downChannel() {
		channel--;
		System.out.println("현재 채널 : "+channel+"번");
	}
	
	public void upvolume() {
		volume++;
		System.out.println("현재 볼륨 : "+volume);
	}
	
	public void downvolume() {
		volume--;
		System.out.println("현재 볼륨 : "+volume);
	}

	@Override
	public String toString() {
		return "tv [color=" + color + ", producer=" + producer + ", size=" + size + ", channel=" + channel + ", volume="
				+ volume + "]";
	}
	public static void main(String[] args) {
		
	}

}
