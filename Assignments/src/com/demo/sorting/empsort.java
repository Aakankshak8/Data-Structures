package com.demo.sorting;

import java.util.Scanner;

class Employe{
	int eid;
	String ename;
	double sal;
	Employe(int eid, String ename, double sal) {
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "emp [eid=" + eid + ", ename=" + ename + ", sal=" + sal + "]";
	}
	
	
	
	
}

public class empsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		Employe[] employees=new Employe[15];
		int count=0;
		
		System.out.println("Enter 15 employee details: (eid, ename, sal)");
		for(int i=0;i<2;i++) {
			int eid=sc.nextInt();
			String ename=sc.next();
			double sal=sc.nextDouble();
			
			employees[count++]=new Employe(eid,ename,sal); 
			
			
		}
		
		bubblesort(employees,count);
		System.out.println("Employees after bubblesort");
		printdata(employees,count);
		
		System.out.println("Enter another 5 employee details");
		for(int i=0;i<5;i++) {
			int eid=sc.nextInt();
			String ename=sc.next();
			double sal=sc.nextDouble();
			Employe newEmp=new Employe(eid,ename,sal);
			
			insertEmploye(employees,count,newEmp);
			count++;
			
			
			
		}
		
		System.out.println("Final employee array sorting on salary");
		printdata(employees,count);

	}

	

	private static void insertEmploye(Employe[] employees, int count, Employe newEmp) {
		// TODO Auto-generated method stub
		
		int i=count-1;
		while(i>=0 && employees[i].sal>newEmp.sal) {
			employees[i+1]=employees[i];
			i--;
		}
		employees[i+1]=newEmp;
		
	}



	private static void bubblesort(Employe[] arr, int count) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<count-1;i++) {
			for(int j=0;j<count-i-1;j++) {
				if(arr[j].sal>arr[j+1].sal) {
					Employe temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
				
				
			}
		}
		
	}
	public static void printdata(Employe[] arr,int count) {
		for(int i=0;i<count;i++) {
			System.out.println(arr[i]);
		}
	}

}
