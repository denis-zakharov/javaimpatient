package ch03;

public class Ex07DefaultMethods implements Ex07Interface {
    @Override
    public void method1() {
        System.out.println("method1");
    }

    public String getZero() {
        return "zero";
    }
}
