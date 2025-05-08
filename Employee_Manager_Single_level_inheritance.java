 class Employee{
    void work(){
        System.out.println("employee is working.");
    }
}

class Manager extends Employee{
    void attendMeeting(){
        System.out.println("manager is attending a meeting.");
    }
}



public class Employee_Manager_Single_level_inheritance {
    public static void main(String[] args) {
        Manager obj = new Manager();
        obj.work();
        obj.attendMeeting();
    }
}
