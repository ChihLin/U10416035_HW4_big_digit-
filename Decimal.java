
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
			for(int i = 0; i  < x.length()-1 ; i++) {
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
	}	
}	
