package ch06.sec10.exam02;

public class Television {
    static String company = "MyCompany";
    static String model = "LCD";
    static String info;
    String a;
    static {
        info = company + "-" + model;
    }
}
