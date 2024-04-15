/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkstring;

/** This class to checks the given string has any numbers/digits or not.
 * Complete this method and test this method in JUnit.
 * @author srinivsi August 
  */
public class CheckString {

    /**
     * @param name
     * 
     * @return 
     */
    
    public static boolean checkchar(String name){
    for(int i = 0; i<name.length();i++){
    if (Character.isDigit(name.charAt(i))){
    return true;
    }
    }
    return false;
    }
    
    public static void main(String[] args) {
  
    String c="as23g";
    if(checkchar(c))
    {
        System.out.println("Given String has digits");
    }
    else
    {
    System.out.println("Given String has only characters no digits");
    }
    }     
  
  //create method here to check the given String has numbers or not
}
