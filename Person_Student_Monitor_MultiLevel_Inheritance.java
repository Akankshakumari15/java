class Person{
    void displayName(){
        System.out.println("AKANKSHA");
    }
}

class Student extends Person{
    void displayClass(){
        System.out.println("CSE");
    }
}

class Monitor extends Student{
    void checkDiscipline(){
        System.out.println("Monitor is checking the discipline.");
    }
}



public class Person_Student_Monitor_MultiLevel_Inheritance {
    public static void main(String[] args) {
        Monitor m = new Monitor();
        m.displayName();
        m.displayClass();
        m.checkDiscipline();
    }
}
