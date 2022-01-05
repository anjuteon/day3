package testclass;

public class runTV {

	public static void main(String[] args) {
		tv tv1=new tv();
		tv tv2=new tv();
		tv tv3=new tv();
		
		tv1.setProducer("LG");
		tv1.setColor("black");
		tv1.setSize(55);
		
		tv2.setProducer("SamSung");
		tv2.setColor("white");
		tv2.setSize(70);
		
		tv3.setProducer("Apple");
		tv3.setColor("gold");
		tv3.setSize(100);
		
		//tv1
		System.out.println("=================");
		System.out.println(tv1.getProducer()+"전자 TV");
		System.out.println(tv1.getSize()+"인치");
		System.out.println(tv1.getColor()+"");
		
		tv1.powerOn();
		for(int i=0; i<7; i++) {
			tv1.upChannel();
		}
		System.out.println("=================");
		
		//tv2
		System.out.println("=================");
		System.out.println(tv2.getProducer()+"전자 TV");
		System.out.println(tv2.getSize()+"인치");
		System.out.println(tv2.getColor()+"");
		
		tv2.powerOn();
		for(int i=0; i<10; i++) {
			tv2.upvolume();
		}
		tv2.powerOff();
		System.out.println("=================");

	}

}
