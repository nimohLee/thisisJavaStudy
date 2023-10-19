package ch11.sec05;

public class ThrowsExample1 {
    public static void main(String[] args) throws Exception{
            findClass();
    }

    public static void findClass() throws Exception {
        Class.forName("java.lang.String2");
    }
}
