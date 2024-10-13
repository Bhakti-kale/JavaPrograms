package packageaccessspecifier20;
//what happen within the package- only private method not accessible
public class TestCase2 {

	public static void main(String[] args) {
		TestCase1 s1=new TestCase1();
		s1.add();	//public method
		s1.mul();	//default
		s1.div();	//protected

	}

}
