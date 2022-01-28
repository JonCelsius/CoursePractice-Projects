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
        
    }

}
