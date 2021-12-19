
package brackets;

import java.util.ArrayList;
import java.util.Scanner;

public class Brackets {
 public static void main(String[] args) {
  
     Scanner sc =new Scanner (System.in);      
     
     ArrayList<Character>array=new ArrayList<Character> ();
     System.out.println("INSERT THE BRACKETS HOE");
        String contain =sc.next();
        
  for(int x=0;x<contain.length();x++){
  
  array.add(contain.charAt(x));
 
  
  
  }
  
 if(array.get(0)=='{'&&array.get(contain.length()-1)=='}'){
 int num=contain.length()-1;
 
     array.remove(num);
 
      array.remove(0);

      if(array.isEmpty()==true){
      
      
          System.out.println("true");
      
      }
      
      else if(array.get(0)=='['&&array.get(contain.length()-3)==']') {
               array.remove(contain.length()-3);
 
      array.remove(0);

       if(array.isEmpty()==true){
      
      
          System.out.println("true");
      
      }
       
      
       else if (array.get(0)=='('&&array.get(contain.length()-5)==')'){
         array.remove(contain.length()-5);
 
      array.remove(0);
         if(array.isEmpty()==true){
      
      
          System.out.println("true");
      
      }
       

       
       
       }
       
       
      }
      
      
 }
 else if(array.get(0)=='['&&array.get(contain.length()-1)==']'){
 
 int num=contain.length()-1;
 
     array.remove(num);
 
      array.remove(0);
      
        if(array.isEmpty()==true){
      
      
          System.out.println("true");
      
      }
        else if (array.get(0)=='('&&array.get(contain.length()-3)==')' ){
               array.remove(contain.length()-3);
 
      array.remove(0);

           if(array.isEmpty()==true){
      
      
          System.out.println("true");
      
      }
        
        }
        

      
        
     
 
 }else if (array.get(0)=='('&&array.get(contain.length()-1)==')'){
        array.remove(contain.length()-1);
 
      array.remove(0);
      
           if(array.isEmpty()==true){
      
      
          System.out.println("true");
      
      }
      
 }
 else {
 
        System.out.println("false");
 
 }
      
  
  }
}
      
     