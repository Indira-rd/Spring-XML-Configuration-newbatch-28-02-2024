package newbatch_javainsteadofspring_28022024;

//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
////this is using spring
//public class CallCenter2 {
//	public static void main(String[] args) {
//		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("newbatch_javainsteadofspring_28022024/myconfigurationfile.xml");
//		System.out.println(applicationContext.getBean(Mobile.class));
//	}
//}
//<beans xmlns="http://www.springframework.org/schema/beans"
//xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
//xmlns:context="http://www.springframework.org/schema/context"
//xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
//http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context.xsd">
//<bean class="newbatch_javainsteadofspring_28022024.Mobile" name="Mobile">
//	<constructor-arg value="Oppo"></constructor-arg>
//	<constructor-arg value="blue"></constructor-arg>
//	<constructor-arg value="6"></constructor-arg>
//	<constructor-arg ref="JioObjectRef"></constructor-arg> //in ref we need to pass object
//</bean>
//<bean class="newbatch_javainsteadofspring_28022024.JioSim" name="JioObjectRef"></bean>
//</beans>

//package newbatch_javainsteadofspring_28022024;
//
//public interface Sim {
//
//}
//
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
//output:- Mobile [mobileBrand=Oppo, mobileColour=blue, mobileRam=6, sim=JioSim]


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//this is using spring
public class CallCenter2 {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("newbatch_javainsteadofspring_28022024/myconfigurationfile.xml");
		System.out.println(applicationContext.getBean(Mobile.class));
		System.out.println(applicationContext.getBean(Mobile.class));
		System.out.println(applicationContext.getBean(Mobile.class));
	}
}
//output:-
//Mobile [mobileBrand=Oppo, mobileColour=blue, mobileRam=6, sim=JioSim]
//Mobile [mobileBrand=Oppo, mobileColour=blue, mobileRam=6, sim=JioSim]
//Mobile [mobileBrand=Oppo, mobileColour=blue, mobileRam=6, sim=JioSim]