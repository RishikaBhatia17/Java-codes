import java.util.Scanner;

class year
{
    int year;
    String type;
}

class checkleapyear extends year
{
    checkleapyear()
    {
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Enter Year : ");
       year = scan.nextInt();
	   
       if((year % 4 == 0) && (year % 100 !=0))
       {
           type = "leap year";
       }
       else if(year % 400 == 0)
       {
           type = "leap year";
       }
       else
       {
           type = "not leap year";
       }
    }
}

 class assignment8
{
    public static void main(String args[])
    {
       Scanner scan = new Scanner(System.in);
	   
       checkleapyear obj = new checkleapyear();

       System.out.print("This year is a " + obj.type);
       
    }
}
