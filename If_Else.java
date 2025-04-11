import java.util.*;

public class If_Else {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      //if,else
      //   int a = sc.nextInt();

      //   if(a>=18){
      //       System.out.println("adult");
      // }
      // else{
      //   System.out.println("not adult");
      // }

      
      //if else
      // int button = sc.nextInt();

      // if(button==1){
      //   System.out.println("helllo");        
      // }
      // else if(button==2){
      //   System.out.println("namaste");
      // }
      // else{
      //   System.out.println("bonjour");
      // }


      //odd even
      // int x = sc.nextInt();
      // if(x%2==0){
      //   System.out.println("it is an even number");
      // }
      // else{
      //   System.out.println("it is an odd number");
      // }


      //switch
      int button = sc.nextInt();
      sc.close();
      switch(button){

      case 1:System.out.println("hello");
             break;
      case 2:System.out.println("namaste");
             break;
      case 3:System.out.println("bonjour");    
             break;
        default:System.out.println("invalid button");        
      }
    }
}
