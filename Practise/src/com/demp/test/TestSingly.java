package com.demp.test;

import com.demo.prac.Singlylist;

public class TestSingly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singlylist ob=new Singlylist();
		ob.addnode(45);
		ob.addnode(32);
		ob.addnode(14);
		ob.addnode(67);
		ob.display();
		
		ob.Reverselist();

	}

}
