package packageaccessspecifier201;
////What happening outside the package by becoming subclass
import packageaccessspecifier20.TestCase1;

public class TestCase4_21 extends TestCase1 
{

	public static void main(String[] args) 
	{
		TestCase4_21 s1=new TestCase4_21();
		s1.add();			//public method of Testcase1 class
		s1.div();			//default method of testcase1 class
	}

}
