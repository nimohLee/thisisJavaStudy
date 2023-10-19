package ch13.sec05.question2;


import ch13.sec05.question2.Container;

public class ContainerExample {
    public static void main(String[] args) {
        Container<String, String> container1 = new Container<>();
        container1.set("홍길동", "도적");
        container1.getKey();
        container1.getValue();


        Container<String, Integer> container2 = new Container<>();
        container2.set("홍길동", 35);
        container2.getKey();
        container2.getValue();
    }
}
