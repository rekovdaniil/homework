
public class homework
{
  public static void main(String[] args)
  {
  // Task 1
  System.out.printf("______________________\n");
  System.out.printf("TASK 1 VARIABLES\n");
  System.out.printf("______________________\n");
    int a = 1000;
    float b = 14.88f;
    String c = "Task 1 String Variable";
    System.out.printf("Integer = %d \nFloat = %.2f \nString = %s\n",a,b,c);
    System.out.printf("______________________\n");
// Task 2
System.out.printf("______________________\n");
System.out.printf("TASK 2 METHOD\n");
System.out.printf("______________________\n");
for(int i =1;i<6;i++)
   {
     ShowME();
    }
System.out.printf("______________________\n");
System.out.printf("TASK 3 YEAR\n");
System.out.printf("______________________\n");
    int Year = 1996;
        for(int i=Year;i<2018;i++)
        {
          WhatsTheYear();
        }
  }
    public static void ShowME()
      {
        System.out.println(" ***** ");
       }
    public static void WhatsTheYear(int Year)
       {
        if(Year % 4 == 0)
          {
            if(Year % 100 != 0  || Year % 400 == 0)
            {
              System.out.println(year + "It's 366 days year");
            }
            else System.out.println(year + "It's 365 days year");
          }
          else System.out.println(year + "It's 365 days year");
        }


  }
