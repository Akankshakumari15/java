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

    void sum(double p, double q){
        System.out.println(p+q);
    }


}


public class Method_Overloading_Sum {
    public static void main(String[] args) {
    
    parent obj = new parent();
    obj.sum(4, 7);
    obj.sum(2, 4, 4);
    obj.sum(3, 3, 3, 2);
    obj.sum(2.4, 5.76);
    }
}
