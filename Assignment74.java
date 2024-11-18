package assignments;
//WAP for Encapsulation
class Amazon_Info
{
	private String emailid="contact@grotechminds.com";
	public String getEmailid()
	{
		return emailid;
	}
	public void setEmailid(String emailid)
	{
		this.emailid=emailid;
	}
	private String password="contact@groPassword";
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	//62->find broken links in the webs page
}
public class Assignment74
{

	public static void main(String[] args) 
	{
		Amazon_Info a1=new Amazon_Info();
		a1.setEmailid("stbymkt@gmail.com");
		System.out.println(	a1.getEmailid());
		
		
		

	}

}

