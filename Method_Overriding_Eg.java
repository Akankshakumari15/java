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

public class Method_Overriding_Eg {
    public static void main(String[] args) {
    parent Parent = new parent();
        child obj = new child();
        obj.work();
        Parent.work();
    
}
}
