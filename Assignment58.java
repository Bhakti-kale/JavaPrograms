package assignments;
//WAP to perform add,sub,multi,div using same 2 variables in switch case
public class Assignment58 
{
	public static void main(String[] args)
{
		
int a=10;
int b=20;
switch(1) {
case 1:int sum=a+b;
System.out.println(sum);
break;
case 2:int dif=b-a;
System.out.println(dif);
break;
case 3:int mul=a*b;
System.out.println(mul);
break;
case 4:int div=b/a;
System.out.println(div);
break;
default:
	System.out.println("no arithmetic operation");
}
}

}
