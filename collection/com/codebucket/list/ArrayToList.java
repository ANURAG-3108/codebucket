package org.office.project.collections;

import java.util.Arrays;
import java.util.List;

public class ArrayToList { 
    public static void main(String a[]){
        String[] strArr = {"JAVA", "C++", "PERL", "STRUTS", "PLAY","Anurag"};
        List<String> strList = Arrays.asList(strArr);
        System.out.println("Created List Size: "+strList.size());
        System.out.println(strList);
    }
}