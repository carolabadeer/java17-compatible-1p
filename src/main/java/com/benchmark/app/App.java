package com.benchmark.app;

// 1p dependency incompatible with Java 17
import com.example.MyUtility;

public class App 
{
    public static void main( String[] args ){
        System.out.println("Java 17 compatible 1p dependency: " + callJava17Compatible1pDependency("Test Java 17 compatible 1p dependency"));
    }
  
    public static String callJava17Compatible1pDependency(String myUtilityImport) {
      return MyUtility.doNothing(myUtilityImport);
    }

}