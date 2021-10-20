package overloadingConstructor;

public class OverloadingConstructorTest {

    public static void main(String[] args) {
        OverloadingConstructor teacher1 = new OverloadingConstructor();
        OverloadingConstructor teacher2 = new OverloadingConstructor("Anis", "male");
        teacher2.getInfo();
        OverloadingConstructor teacher3 = new OverloadingConstructor("Maruf", "Male", 0123456577);
        teacher3.getInfo();

    }
}
