package newbatch_javainsteadofspring_28022024;
//this is using core java
//public class CallCenter1 {
//	public static void main(String[] args) {
//		Mobile desk1=new Mobile();//in desk1 i have a containerof mobile
//		System.out.println(desk1);
//		Mobile desk2=new Mobile();
//		System.out.println(desk2);
//		Mobile desk3=new Mobile();
//		System.out.println(desk3);
//	}
//}
//public class Mobile {
//
//}
//package newbatch_javainsteadofspring_28022024;
//
//public class CallCenter2 {
//	public static void main(String[] args) {
//		
//	}
//}
//output:-
//newbatch_javainsteadofspring_28022024.Mobile@626b2d4a
//newbatch_javainsteadofspring_28022024.Mobile@5e265ba4
//newbatch_javainsteadofspring_28022024.Mobile@156643d4
//here i am getting different object. i want objects to be same. i want singleton object.


//i am creating some variables for the Mobile 
//public class CallCenter1 {
//	public static void main(String[] args) {
//		Mobile desk1=new Mobile();//in desk1 i have a containerof mobile
//		System.out.println(desk1);
//		Mobile desk2=new Mobile();
//		System.out.println(desk2);
//		Mobile desk3=new Mobile();
//		System.out.println(desk3);
//	}
//}
//
//public class Mobile {
//	private String mobileBrand;
//	private String mobileColour;
//	private int mobileRam;
//}
//
//package newbatch_javainsteadofspring_28022024;
//
//public class CallCenter2 {
//	public static void main(String[] args) {
//		
//	}
//}
//
//output:- 
//newbatch_javainsteadofspring_28022024.Mobile@626b2d4a
//newbatch_javainsteadofspring_28022024.Mobile@5e265ba4
//newbatch_javainsteadofspring_28022024.Mobile@156643d4
//again i am getting object address but i want values that's why i am going to override toString()


//public class CallCenter1 {
//public static void main(String[] args) {
//	Mobile desk1=new Mobile();//in desk1 i have a containerof mobile
//	System.out.println(desk1);
//	Mobile desk2=new Mobile();
//	System.out.println(desk2);
//	Mobile desk3=new Mobile();
//	System.out.println(desk3);
//}
//}
//
//public class Mobile {
//	private String mobileBrand;
//	private String mobileColour;
//	private int mobileRam;
//	@Override
//	public String toString() {
//		return "Mobile [mobileBrand=" + mobileBrand + ", mobileColour=" + mobileColour + ", mobileRam=" + mobileRam
//				+ "]";
//	}
//}
//
//public class CallCenter2 {
//	public static void main(String[] args) {
//		
//	}
//}
//
//output:-
//Mobile [mobileBrand=null, mobileColour=null, mobileRam=0]
//Mobile [mobileBrand=null, mobileColour=null, mobileRam=0]
//Mobile [mobileBrand=null, mobileColour=null, mobileRam=0]


//public class CallCenter1 {
//public static void main(String[] args) {
//	Mobile desk1=new Mobile();//in desk1 i have a containerof mobile
//	System.out.println(desk1);
//	Mobile desk2=new Mobile();
//	System.out.println(desk2);
//	Mobile desk3=new Mobile();
//	System.out.println(desk3);
//}
//}

//public class Mobile {
//	private String mobileBrand="OnePlus";
//	private String mobileColour="golden";
//	private int mobileRam=8;
//	@Override
//	public String toString() {
//		return "Mobile [mobileBrand=" + mobileBrand + ", mobileColour=" + mobileColour + ", mobileRam=" + mobileRam
//				+ "]";
//	}
//}

//public class CallCenter2 {
//public static void main(String[] args) {
//	
//}
//}

//output:-
//Mobile [mobileBrand=OnePlus, mobileColour=golden, mobileRam=8]
//Mobile [mobileBrand=OnePlus, mobileColour=golden, mobileRam=8]
//Mobile [mobileBrand=OnePlus, mobileColour=golden, mobileRam=8]


//public class CallCenter1 {
//public static void main(String[] args) {
//	Mobile desk1=new Mobile("Apple","white",12);
//	System.out.println(desk1);
//	Mobile desk2=new Mobile("Apple","white",12);
//	System.out.println(desk2);
//	Mobile desk3=new Mobile("Apple","white",12);
//	System.out.println(desk3);
//}
//}
//
//public class Mobile {
//private String mobileBrand;
//private String mobileColour;
//private int mobileRam;
//@Override
//public String toString() {
//	return "Mobile [mobileBrand=" + mobileBrand + ", mobileColour=" + mobileColour + ", mobileRam=" + mobileRam
//			+ "]";
//}
//public Mobile(String mobileBrand, String mobileColour, int mobileRam) {
//	super();
//	this.mobileBrand = mobileBrand;
//	this.mobileColour = mobileColour;
//	this.mobileRam = mobileRam;
//}
//
//}
//
//public class CallCenter2 {
//	public static void main(String[] args) {
//		
//	}
//}
//
//output:-
//Mobile [mobileBrand=Apple, mobileColour=white, mobileRam=12]
//Mobile [mobileBrand=Apple, mobileColour=white, mobileRam=12]
//Mobile [mobileBrand=Apple, mobileColour=white, mobileRam=12]


//public class CallCenter1 {
//public static void main(String[] args) {
//	Mobile desk1=new Mobile("Apple","green",12);
//	System.out.println(desk1);
//	Mobile desk2=new Mobile("Apple","white",12);
//	System.out.println(desk2);
//	Mobile desk3=new Mobile("Apple","white",12);
//	System.out.println(desk3);
//}
//}
//public class Mobile {
//private String mobileBrand;
//private String mobileColour;
//private int mobileRam;
//@Override
//public String toString() {
//	return "Mobile [mobileBrand=" + mobileBrand + ", mobileColour=" + mobileColour + ", mobileRam=" + mobileRam
//			+ "]";
//}
//public Mobile(String mobileBrand, String mobileColour, int mobileRam) {
//	super();
//	this.mobileBrand = mobileBrand;
//	this.mobileColour = mobileColour;
//	this.mobileRam = mobileRam;
//}
//
//}
//
//public class CallCenter2 {
//	public static void main(String[] args) {
//		
//	}
//}
//output:-Mobile [mobileBrand=Apple, mobileColour=green, mobileRam=12]
//		Mobile [mobileBrand=Apple, mobileColour=white, mobileRam=12]
//				Mobile [mobileBrand=Apple, mobileColour=white, mobileRam=12]


//public class CallCenter1 {
//public static void main(String[] args) {
//	Mobile desk1=new Mobile("Apple","green",12,new JioSim());
//	System.out.println(desk1);
//	Mobile desk2=new Mobile("Apple","white",12,new JioSim());
//	System.out.println(desk2);
//	Mobile desk3=new Mobile("Apple","white",12,new JioSim());
//	System.out.println(desk3);
//}
//}

//package newbatch_javainsteadofspring_28022024;
//
//public class CallCenter2 {
//	public static void main(String[] args) {
//		
//	}
//}
//
//package newbatch_javainsteadofspring_28022024;
//
//public class JioSim {
//
//	@Override
//	public String toString() {
//		return "JioSim";
//	}
//	
//}
//
//public class Mobile {
//private String mobileBrand;
//private String mobileColour;
//private int mobileRam;
//JioSim jioSim=new JioSim();
//public Mobile(String mobileBrand, String mobileColour, int mobileRam, JioSim jioSim) {
//	super();
//	this.mobileBrand = mobileBrand;
//	this.mobileColour = mobileColour;
//	this.mobileRam = mobileRam;
//	this.jioSim = jioSim;
//}
//
//@Override
//public String toString() {
//	return "Mobile [mobileBrand=" + mobileBrand + ", mobileColour=" + mobileColour + ", mobileRam=" + mobileRam
//			+ ", jioSim=" + jioSim + "]";
//}
//
//
//}
//


//output:-
//Mobile [mobileBrand=Apple, mobileColour=green, mobileRam=12, jioSim=JioSim]
//Mobile [mobileBrand=Apple, mobileColour=white, mobileRam=12, jioSim=JioSim]
//Mobile [mobileBrand=Apple, mobileColour=white, mobileRam=12, jioSim=JioSim]


public class CallCenter1 {
public static void main(String[] args) {
	Mobile desk1=new Mobile("Apple","green",12,new AirtelSim());
	System.out.println(desk1);
	desk1.installSoftware();
	Mobile desk2=new Mobile("Apple","white",12,new AirtelSim());
	System.out.println(desk2);
	desk2.installSoftware();
	Mobile desk3=new Mobile("Apple","white",12,new AirtelSim());
	System.out.println(desk3);
	desk3.installSoftware();
}
}

//public class Mobile {
//private String mobileBrand;
//private String mobileColour;
//private int mobileRam;
//Sim sim;
//public Mobile(String mobileBrand, String mobileColour, int mobileRam, Sim sim) {
//	super();
//	this.mobileBrand = mobileBrand;
//	this.mobileColour = mobileColour;
//	this.mobileRam = mobileRam;
//	this.sim = sim;
//}
//@Override
//public String toString() {
//	return "Mobile [mobileBrand=" + mobileBrand + ", mobileColour=" + mobileColour + ", mobileRam=" + mobileRam
//			+ ", sim=" + sim + "]";
//}
//void installSoftware() {
//	System.out.println("software is installed");
//}
//void deleteData() {
//	System.out.println("Data Formatted");
//}
//}
//
//package newbatch_javainsteadofspring_28022024;
//
//public interface Sim {
//
//}
//
//package newbatch_javainsteadofspring_28022024;
//
//public class JioSim implements Sim{
//
//	@Override
//	public String toString() {
//		return "JioSim";
//	}
//	
//}
//
//package newbatch_javainsteadofspring_28022024;
//
//public class AirtelSim implements Sim {
//
//	@Override
//	public String toString() {
//		return "AirtelSim";
//	}
//	
//}
//output:-Mobile [mobileBrand=Apple, mobileColour=green, mobileRam=12, sim=AirtelSim]
//		software is installed
//		Mobile [mobileBrand=Apple, mobileColour=white, mobileRam=12, sim=AirtelSim]
//		software is installed
//		Mobile [mobileBrand=Apple, mobileColour=white, mobileRam=12, sim=AirtelSim]
//		software is installed