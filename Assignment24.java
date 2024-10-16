package assignments;
//WAP on multiple level inheritance using Interface

import package_inheritance.One;
import package_inheritance.Two;
interface Amazon{
	
	void registration(); 
	void login();
}
interface Flipkart{
	void registrationFlipkart(); 
	void loginFlipkart();
	
}


public class Assignment24 implements Amazon,Flipkart {

	@Override
	public void registration() {
		System.out.println("amazon registration succesfull");
		
	}

	@Override
	public void login() {
		System.out.println("amazon login successfull");
		
	}

	

	@Override
	public void registrationFlipkart() {
		System.out.println("flipkart registration succesfull");
		
	}

	@Override
	public void loginFlipkart() {
		System.out.println("flipkart login succesfull");
		
	}
	
	
	
public static void main(String[] args) {
		
		Assignment24 m1=new Assignment24();
		//m1.registration();
		//m1.login();
		Amazon a=new Assignment24();
		a.registration();
		a.login();
		m1.registrationFlipkart();
		m1.loginFlipkart();
		
	}
	
	
	
	
	
	
}

