import java.util.Scanner;

public class MoneyDenominationChecker
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the amount of money: ");

    int money = input.nextInt();

    if(money >= 1000)
    {
      int thousand = money / 1000;
      money %= 1000;
      System.out.println("Thousand's "+ thousand);
    }

    if(money >= 500)
    {
      int fivehundred = money / 500;
      money %= 500;
      System.out.println("Fivehundred's "+ fivehundred);
    }

    if(money >= 200)
    {
      int twohundred = money / 200;
      money %= 200;
      System.out.println("Two hundred's "+ twohundred);
    }

    if(money >= 100)
    {
      int onehundred = money / 100;
      money %= 100;
      System.out.println("One hundred's "+ onehundred);
    }

    if(money >= 50)
    {
      int fifty = money / 50;
      money %= 50;
      System.out.println("Fifty's "+ fifty);
    }
    
    if(money >= 20)
    {
      int bente = money / 20;
      money %= 20;
      System.out.println("Twenty's "+ bente);
    }

    if(money >= 10)
    {
      int ten = money / 10;
      money %= 10;
      System.out.println("Ten's "+ ten);
    }

    if(money >= 5)
    {
      int five = money / 5;
      money %= 10;
      System.out.println("five's "+ five);
    }

    if(money >= 1)
    {
      int piso = money / 1;
      money %= 1;
      System.out.println("peso's "+ piso);
    }
  }
}