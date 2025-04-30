package week4Homeassignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {

		//HCL, Wipro, Aspire Systems,CTS
				List <String> String = new ArrayList<String> ();
				System.out.println("The list is :"+ String);
				
				String.add("HCL");
				System.out.println("The List is after adding 1 data:"+String);
				
				String.add("Wipro");
				System.out.println("The List is after adding 2 data:"+String);
				
				String.add("Aspire Systems");
				System.out.println("The List is after adding 3 data:"+String);
				
				String.add("CTS");
				System.out.println("The List is after adding 4 data:"+String);
				
				Collections.sort(String);
				
				System.out.println("After arranging the data : " +String);
				
				int sizeOfList =String .size();
				
				
				System.out.println("The List size is :"+sizeOfList);
				for (int i =String .size()- 1; i >= 0; i--)  {


		            System.out.println("Reverse order:"+String.get(i));
			        			
				}    
			}

	}


