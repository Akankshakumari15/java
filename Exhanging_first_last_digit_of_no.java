import java.util.Scanner;

public class Exhanging_first_last_digit_of_no {
    // public static void exchangeFirstLastDigit(int num){
    //     int org=num;
    //     int last=num%10;
    //     String str=Integer.toString(num);
    //     int size=str.length();
    //     int x=1;
    //     while (size>1) {
    //         x*=10;
    //         size--;
    //     }
    //     int first=num/x;
    //     int diff=last-first;
    //     if(diff<0)
    //       diff=-diff;
    //     if(last>first){
    //         int y = diff*x;
    //         num+=y;
    //         num-=diff;
    //     }
    //     else{
    //         int y = diff*x;
    //         num-=y;
    //         num+=diff;
    //     }
    //     System.out.println("After swapping: "+num);
    //   }
    // }
    
    public static void main(String[] args){
      Scanner sc= new Scanner(System.in);
      int num=sc.nextInt();
      sc.close();
      exchangeFirstLastDigit(num);
    }
  }

    public static void exchangeFirstLastDigit(int num) {
      String str = Integer.toString(num);

      // If the number has only one digit, there's nothing to swap
      if (str.length() == 1) {
          System.out.println("After swapping: " + num);
          return;
      }

      // Convert to character array for swapping
      char[] digits = str.toCharArray();

      // Swap first and last digits
      char temp = digits[0];
      digits[0] = digits[digits.length - 1];
      digits[digits.length - 1] = temp;

      // Convert back to integer
      int swappedNum = Integer.parseInt(new String(digits));

      System.out.println("After swapping: " + swappedNum);
  }

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int num = sc.nextInt();
      sc.close();

      exchangeFirstLastDigit(num);
  }
