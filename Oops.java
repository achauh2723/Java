package packages;

import java.util.Scanner;

public class Oops{  
static void showMessage()   
{  
System.out.println("The static method invoked.");  
}    
void displayMessage()   
{  
System.out.println("Non-static method invoked.");  
}  
public static void main(String[] args)   
{    
showMessage();     
Oops me=new Oops();    
me.displayMessage(); 
}  
}  
