
package staticKeyword;

public class StaticClassTest {
    public static void main(String[] args) {
       // StaticClass ob = new StaticClass();
      StaticClass.value = 23;
        System.out.println(StaticClass.value);
    }
}
