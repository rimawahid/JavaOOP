package oop;

public class Test {

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();//object create
        teacher1.name = "Anis";
        teacher1.gender = "Male";
        teacher1.phone = 0134545654;
        teacher1.displayInfo();

        //Parametrized Method
        Teacher teacher3 = new Teacher();//object create
        teacher3.setInfo("Shan", "Male", 0122222344);//value Initialized
        teacher3.displayInfo();


        Teacher teacher2 = new Teacher();//object create
        teacher2.name = "Maruf";
        teacher2.gender = "Male";
        teacher2.phone = 0134545654;
        teacher2.displayInfo();
    }
}
