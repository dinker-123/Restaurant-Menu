import java.util.Scanner;

public class menu {

    }

     class Drink {
         public int displayMenu() {
             System.out.println("   Mocktail = 100   ");
             System.out.println("   Tea = 20   ");
             System.out.println("   Cocktail = 100   ");
             System.out.println("   ColdCofee = 50   ");
             System.out.println("   Cofee = 30   ");

             return 0;
         }


         int Mocktail = 100;
         int Tea = 20;
         int Cocktail = 100;
         int ColdCofee = 50;
         int cofee = 30;
         int total;
         int Quant=0;
         Scanner sc = new Scanner(System.in);
         char s;
         public void
         generateBill()
         {
             System.out.println();
             System.out.println("thank you for Coming");
             System.out.println("your BIll is : "+total);
         }
         public void order()
         {

             Scanner sc = new Scanner(System.in);
             int y = sc.nextInt();

             switch (y)
             {
                 case 1:
                     System.out.println("you choosed Mocktail");
                     System.out.println("Enter your Quantity");
                      Quant = sc.nextInt();
                     total = total +Quant*Mocktail;
                     break;
                 case 2:
                     System.out.println("you choosed Tea");
                     System.out.println("Enter your Quantity");
                      Quant = sc.nextInt();
                     total = total +Quant*Tea;
                     break;
                 case 3:
                     System.out.println("you choosed Cocktail");
                     System.out.println("Enter your Quantity");
                      Quant = sc.nextInt();
                     total = total +Quant*Cocktail;
                     break;
                 case 4:
                     System.out.println("Enter your ColdCofee");
                      Quant = sc.nextInt();
                     total = total +Quant*ColdCofee;
                     break;
                 case 5:
                     System.out.println("you choosed Cofee");
                     System.out.println("Enter your Quantity");
                      Quant = sc.nextInt();
                     total = total +Quant*cofee;
                     break;

             }
             System.out.println("now you want to add anthing (Y/N)?");

              s= sc.next().charAt(0);

             if (s=='Y'|| s=='y')
             {
                 order();
             }
             else {
                generateBill();
             }
             }
         }




         class FastFood
{
    public int DisplayMenu()
    {
        System.out.println("   Chauwmin = 40  ");
        System.out.println("   Manchuriyan= 40   ");
        System.out.println("   PavBhaji = 50   ");
        System.out.println("   Momos = 10   ");
        System.out.println("   Tikki = 30   ");
        return 0;
    }

    int Chauwmin = 40;
    int Manchuriyan = 40;
    int PavBhaji = 50;
    int Momos = 10;
    int Tikki = 30;
    int total;
    int Quant=0;
    Scanner sc = new Scanner(System.in);
    char s;



    public void generateBill()
    {
        System.out.println();
        System.out.println("thank you for Coming");
        System.out.println("your BIll is : "+total);
    }



    public void order()
    {

        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();

        switch (y)
        {
            case 1:
                System.out.println("you choosed Chauwmin");
                System.out.println("Enter your Quantity");
                Quant = sc.nextInt();
                total = total +Quant*Chauwmin;
                break;
            case 2:
                System.out.println("you choosed Manchuriyan");
                System.out.println("Enter your Quantity");
                Quant = sc.nextInt();
                total = total +Quant*Manchuriyan;
                break;
            case 3:
                System.out.println("you choosed PavBhaji");
                System.out.println("Enter your Quantity");
                Quant = sc.nextInt();
                total = total +Quant*PavBhaji;
                break;
            case 4:
                System.out.println("Enter your Momos");
                Quant = sc.nextInt();
                total = total +Quant*Momos;
                break;
            case 5:
                System.out.println("you choosed Tikki");
                System.out.println("Enter your Quantity");
                Quant = sc.nextInt();
                total = total +Quant*Tikki;
                break;

        }
        System.out.println("now you want to add anthing (Y/N)?");
        s= sc.next().charAt(0);

        if (s=='Y'|| s=='y')
        {
            order();
        }
        else {
            generateBill();
        }
    }
}
