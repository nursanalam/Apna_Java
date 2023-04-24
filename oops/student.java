public class student{

public static void main(String args[])
{

    pen p1=new pen();
    p1.setcolor("blue");
    System.out.println(p1.color);
    p1.settip(5);
    System.out.println(p1.tip);
}

}
class pen{

String color;
int tip;
void setcolor(String newcolor)
{

    color= newcolor;
}
void settip(int newtip)
{
    tip=newtip;
}

}
class opps{

    String name;
    int age;
    float percentage;
    void calcpercentage(int phy,int chem,int math)
    {

        percentage=(phy+chem+math)/3;
    }
}