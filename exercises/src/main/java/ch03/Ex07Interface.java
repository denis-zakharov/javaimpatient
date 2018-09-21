package ch03;

interface Ex07Interface {
    void method1();

    default void method2() {
        System.out.println("method2");
    }

//    default int getZero() {
//        return 0;
//    }
}
