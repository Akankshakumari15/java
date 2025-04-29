public class Exhanging_first_last_digit_of_no {
    
    public static void main(String[] args){
        int num=1234;
        int org=num;
        int last=num%10;
        String str=Integer.toString(num);
        int size=str.length();
        int x=1;
        while (size>1) {
            x*=10;
            size--;
        }
        int first=num/x;
        int diff=last-first;
        if(diff<0)
          diff=-diff;
        if(last>first){
            int y = diff*x;
            num+=y;
            num-=diff;
        }
        else{
            int y = diff*x;
            num-=y;
            num+=diff;
        }
        System.out.println("After swapping: "+num);
      }
    }
    

