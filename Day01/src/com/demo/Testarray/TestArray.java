package com.demo.Testarray;
import java.util.stream.IntStream;

import com.demo.array.Array;
import com.demo.array.*;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		
				Array ob=new Array();
				ob.add(4);
				ob.add(7);
				System.out.println(ob);
				ob.add(8,1);
				System.out.println(ob);
				System.out.println("position of 10 : "+ob.searchByValue(10));
				ob.add(3);
				ob.add(5);
				System.out.println(ob);
				
				ob.add(1);
				System.out.println(ob);
		
				int []arr1 = ob.exchangeIndexValue();
				IntStream.of(arr1).forEach(e->System.out.print(e+","));
			
				
			}

		

	}


