class parent{
    void work(){
        System.out.println("Parent is working.");
    }
}

class child extends parent{
    void work(){
        System.out.println("Child is not working.");
        super.work();
    }
}

public class Method_Overriding {
    public static void main(String[] args) {
        parent obj = new child();
        obj.work();
    }
}
