package packageaccessspecifier201;
//What happening outside the package without becoming subclass
import packageaccessspecifier20.TestCase1;

public class TestCase3_20 {

	public static void main(String[] args) 
	{
		TestCase1 s1= new TestCase1();
		s1.add();	//only public method is accessible from package packageaccessspecifier20 of class TestCase1
		

	}

}
