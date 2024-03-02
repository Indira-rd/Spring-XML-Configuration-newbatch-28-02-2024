package newbatch_javainsteadofspring_28022024;

//public class Mobile {
//
//}

//public class Mobile {
//	private String mobileBrand;
//	private String mobileColour;
//	private int mobileRam;
//}


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
//}


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
////if we wan't to change jio to airtel, we should never make the changes in mobile(object) for that i used sim interface for that i used interface. so,it will belittle bit loosely coupled
//}


public class Mobile {
private String mobileBrand;
private String mobileColour;
private int mobileRam;
Sim sim;
public Mobile(String mobileBrand, String mobileColour, int mobileRam, Sim sim) {
	super();
	this.mobileBrand = mobileBrand;
	this.mobileColour = mobileColour;
	this.mobileRam = mobileRam;
	this.sim = sim;
}
@Override
public String toString() {
	return "Mobile [mobileBrand=" + mobileBrand + ", mobileColour=" + mobileColour + ", mobileRam=" + mobileRam
			+ ", sim=" + sim + "]";
}
void installSoftware() {
	System.out.println("software is installed");
}
void deleteData() {
	System.out.println("Data Formatted");
}
}