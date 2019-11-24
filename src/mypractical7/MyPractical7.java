/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypractical7;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Toshiba
 */
public class MyPractical7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // find the second largest in an Array
        int[]arr ={6,5,15,4,9,14,30};
        int temp;
        for (int i = 0;i<arr.length;i++){
        
            for (int j =i+1;j<arr.length;j++){
            if(arr[i]<arr[j]){
             temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            
            }
           
            }
        }
        System.out.println("Second largest element is : " +arr[1]);
        
//        find the second smallest in an array

    int[]myArr = {10,2,9,14,25,15,20};
    if(myArr[0]<myArr[1]){
    
        int myTemp = myArr[0];
        myArr[0] = myArr[1];
        myArr[1] = myTemp;
    }
    int first = myArr[0];
    int second = myArr[0];
    for(int i =0;i<myArr.length;i++){
        
    if(first>myArr[i]){
        second = first;
        first = myArr[i];
    
    }else if(second>myArr[i]){ 
        second = myArr[i];  
    
    }
    }
    System.out.println("Second smallest number is " +second);
    
        int []bahWeezy ={12,26,8,8,9,5,5,3};
        int result[];
        System.out.println("Original Array");
        System.out.println(Arrays.toString(bahWeezy));
        result =next_greatest_num(bahWeezy);
        System.out.println("Modified array");
        System.out.println(Arrays.toString(result));
        
    
    
    }

     static int[] next_greatest_num(int[] bahWeezy) {
       
       int size = bahWeezy.length;
       int max_from_right_num = bahWeezy[size-1];
       bahWeezy[size-1]=-1;
       for(int i =size-2;i>=0;i--){
           int temp = bahWeezy[i];
           bahWeezy[i]=max_from_right_num;
           if(max_from_right_num<temp){
           max_from_right_num=temp;
           
           }
           
       }
       return bahWeezy;  
    }
    
}
