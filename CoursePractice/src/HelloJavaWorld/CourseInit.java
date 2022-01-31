package HelloJavaWorld;

import HelloJavaWorld.FirstPackage.PackageOneMethod;
import HelloJavaWorld.SecondPackage.AnotherPackageMethod;

public class CourseInit {
    public static void main(String[] args){
        System.out.println("Hello Java World!");
        PackageOneMethod packageOneMethod=new PackageOneMethod();
        packageOneMethod.printFromPackageOne();
        AnotherPackageMethod anotherPackageMethod=new AnotherPackageMethod();
        anotherPackageMethod.printFromSecondPackage();
      /*  float i=10.0f;
        long f= i;
        System.out.println(i);
        System.out.println(f);*/
    }

}
