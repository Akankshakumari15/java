class parent{
    void sum(int a,int b){
        System.out.println(a+b);
    }

    void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }

    void sum(int a,int b,int c,int d){
        System.out.println(a+b+c+d);
    }


}


public class Method_Overloading {
    public static void main(String[] args) {
    
    parent obj = new parent();
    obj.sum(4, 7);
    obj.sum(2, 4, 4);
    obj.sum(3, 3, 3, 2);
    }
}
