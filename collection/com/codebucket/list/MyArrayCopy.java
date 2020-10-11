package org.office.project.collections;

import java.util.Arrays;

public class MyArrayCopy{
    
   public static void main(String a[]){
        
       int[] myArr = {2,4,2,4,5,6,3};
       System.out.println("Array size before copy: "+myArr.length+"  Array content "+myArr);
       int[] newArr = Arrays.copyOf(myArr, 10);
       System.out.println("New array size after copying: "+newArr.length+"  Array content "+myArr);
   }
}
