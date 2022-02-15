package com.hello.java.world;

import com.hello.java.world.FirstPackage.PackageOneMethod;
import com.hello.java.world.SecondPackage.AnotherPackageMethod;

public class CourseInit {
    public static void main(String[] args){
        System.out.println("Hello Java World!");
        PackageOneMethod packageOneMethod=new PackageOneMethod();
        packageOneMethod.printFromPackageOne();
        AnotherPackageMethod anotherPackageMethod=new AnotherPackageMethod();
        anotherPackageMethod.printFromSecondPackage();
        int a=10;
        int b= a++ + a-- + a++ + a++ + ++a - a-- + ++a + --a;
        System.out.println(b);
      /*  float i=10.0f;
        long f= i;
        System.out.println(i);
        System.out.println(f);*/
    }

}
