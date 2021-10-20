
package overloadingConstructor;


public class OverloadingConstructor {
    String name, gender;
    int phone;

    OverloadingConstructor(){
        System.out.println("No value ");
    }
    OverloadingConstructor(String n, String g){
        name = n;
        gender = g;
    }
    OverloadingConstructor(String n, String g,int p){
        name = n;
        gender = g;
        phone = p;
    }
    void getInfo(){
        System.out.println("Name : " + name);
        System.out.println("Gender : " + gender);
        System.out.println("Phone : " + phone);
    }    
   
    
}
