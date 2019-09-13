import java.util.*;
class patients
{
	
	String pid,pname,page;
	String doc;
	void input()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the patient ID:");
		pid=in.next();
		System.out.println("Enter the name of the patient:");
		pname=in.next();
		System.out.println("Enter the Age of the Patient:");
		page=in.next();
		System.out.println("Enter the Name of thre Doc Incharge:");
		doc=in.next();
	}
	void output(String id)
	{
		if(id==pid)
		{
			System.out.println("name:"+pname);
			System.out.println("ID:"+pid);
			System.out.println("Age:"+page);
			System.out.println("Name of Doc:"+doc);
		}
	}
	void output1(String ndoc)
	{
		if(doc==ndoc)
		System.out.println("Name of the Patient:"+pname);
	}
}
class pat
{
	
	public static void main(String args[])
	{	Scanner in=new Scanner(System.in);
		int n;
		System.out.println("Enter the no of patients");
		n=in.nextInt();
		System.out.println("Enter the details");
		patients ob[]=new patients[n];
		for(int i=0;i<n;i++)
		{
			ob[i]=new patients();
			ob[i].input();
		}
		System.out.println("Enter the patient id whose details has to be accessed");
		String det;
		det=in.next();
		for(int i=0;i<n;i++)
		{
			
			ob[i].output(det);
		}
		System.out.println("enter the name of the doctor:");
		String doc;
		doc=in.next();
		for(int i=0;i<n;i++)
		{
			
			ob[i].output1(doc);
		}
	}
	
}
		
		
		
		
			
		
		
	
		
