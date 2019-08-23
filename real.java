import java.util.*;
public class real
{
    public static void main(String args[])
    {
        int n,i;
        Scanner sc=new Scanner(System.in);
        employee ob=new employee();
        System.out.println("Enter the number of employees");
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {   
            ob.read();
            ob.calculate();
            ob.display();
        }
    }
}