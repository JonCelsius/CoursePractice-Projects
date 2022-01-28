import FirstProfect.ClassInPackage;

public class p1 {

    public static void printName(String name){
        System.out.println(name);
    }
    public static void main(String args[]) {
/*        for (int i = 1; i <= 20; i++) {
            System.out.println("THe number Ion is good !!!!!!!");
            String name="Anna";
            printName(name);
        }*/
        Example example = new Example();
        example.setTestValue("Test");
        example.getTestValue();

        /*System.out.println(example.testValue);
         */

        ClassInPackage classInPackage = new ClassInPackage();
        classInPackage.test();
    }
}

