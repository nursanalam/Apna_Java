import java.util.*;

public class income
{
public static void main(String args[])
{

    Scanner sc=new Scanner(System.in);
    System.out.println("enter any number");
    int ali = sc.nextInt();
    int tax = sc.nextInt();

    if(ali<10000 )
    {

        tax=0;
    }
    else if(ali>=50000 && ali<100000)
    {

        tax= (int) (ali*0.2);
    }
    else
    {

        tax=(int) (ali*0.4);
    }

}
}