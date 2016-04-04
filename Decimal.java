//U10416035 Cheng Chih Lin


import java.lang.*;
import java.util.*;


public class Decimal 
{
	String x ,y;
	ArrayList<Integer> list = new ArrayList<>();
	
	
	
	//CharArrayWriter caw = new CharArrayWriter();
	
	Decimal(String newX , String newY)
	{
		x = newX;
		y = newY;
		
	}
	
	//check the two number ' s length 
	public void Plus(){
		
		//case one is the two numbers are equal
		if(x.length() == y.length()){
			
			
			//put the numbers into array
			for(int i = x.length() -1 ; i >=0  ; i--) {

				//use the toCharArray to store the number 
				char[] ch1 = x.toCharArray();
				char[] ch2 = y.toCharArray();
				
				//get the number and put it into String
				String a = String.valueOf(ch1[i]); 
				String b = String.valueOf(ch2[i]);
				
				//plus the number
				int c = Integer.parseInt(a) + Integer.parseInt(b);
				
				//put them into array
				list.add(c);
				
				//System.out.print(c);	
				
			}
			
			// if the digit more than 10 will add 1 to the left digit
			for(int i = 0; i  < list.size()-1 ; i++) {
				if(list.get(i) >=10){	
					//use the [java.util.ArrayList.set(index , element) method]
					list.set( i+1 ,list.get(i+1) +1);
					list.set(i , list.get(i) % 10);
			
				}
			}
			
			//print the ans
			System.out.print("the fist number plus the second number is = ");
			for(int j = list.size()-1 ; j >=0 ; j--){
				
				System.out.print(list.get(j));
			}
			
		}
		
		//case two is the first number 's length is longer than the other
		if(x.length() > y.length()){
			
			// In order to put "0" into the list (keep the two string has the same length) ,
			//to put them into arraylist , thus ,
			//to put "0" into the String so the type need convert to int			

			ArrayList<Integer> list1 = new ArrayList<>();
			ArrayList<Integer> list2 = new ArrayList<>();
			

			//put the first number into the list1
			//int order to add"0" into the String so the type need convert to int
			
			for(int i = x.length()-1 ; i >=0 ; i-- ) {
				String s1 = String.valueOf(x.charAt(i));
				list1.add(Integer.valueOf(s1));
			}
			
			//put the first number into the list2
			for(int i  = y.length()-1; i >=0 ; i--){	
				String s2 = String.valueOf(y.charAt(i));
				list2.add(Integer.valueOf(s2));
				
			}
			//because of the first number is longer than the second number 
			//add "0" into the second number to keep the two number has the same length
			for(int i = list2.size() ; i< list1.size() ; i++){
				
				list2.add(0);
			}
			
			//plus the two numbers
			for(int i = 0 ; i < list1.size() ; i++){
				int plus = list1.get(i) + list2.get(i);
				list.add(plus);
				
			}
			
			
			for(int i = 0; i  < list.size()-1 ; i++) {
				if(list.get(i) >=10){	
					//use the [java.util.ArrayList.set(index , element) method]
					list.set( i+1 ,list.get(i+1) +1);
					list.set(i , list.get(i) % 10);
			
				}
			}
			
			//print the ans
			System.out.print("the fist number plus the second number is = ");
			
			//print the number 
			for(int j = list.size()-1 ; j >=0 ; j--){
				System.out.print(list.get(j));
			}
			
		
			
		}
		
		
		if(x.length() < y.length()){
			
			ArrayList<Integer> list1 = new ArrayList<>();
			ArrayList<Integer> list2 = new ArrayList<>();
			
			
			for(int i = x.length()-1 ; i >=0 ; i-- ) {
				String s1 = String.valueOf(x.charAt(i));
				list1.add(Integer.valueOf(s1));
			}
			
			//put the first number into the list2
			for(int i  = y.length()-1; i >=0 ; i--){	
				String s2 = String.valueOf(y.charAt(i));
				list2.add(Integer.valueOf(s2));
				
			}
			
			for(int i = list1.size() ; i< list2.size() ; i++){
				list1.add(0);
				
			}
			
			for(int i = 0 ; i < list2.size() ; i++){
				int plus = list1.get(i) + list2.get(i);
				list.add(plus);
			}
			
			
			for(int i = 0; i  < list.size()-1 ; i++) {
				if(list.get(i) >= 10){	
					//use the [java.util.ArrayList.set(index , element) method]
					list.set( i+1 ,list.get(i+1) +1);
					list.set(i , list.get(i) % 10);
			
				}
			}
		
			//print the ans
			System.out.print("the fist number plus the second number is = ");
			//print the number 
			for(int j = list.size()-1 ; j >=0 ; j--){
				System.out.print(list.get(j));
			}
		}
	
	}
}
