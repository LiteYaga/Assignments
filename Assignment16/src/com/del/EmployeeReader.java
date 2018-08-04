package com.del;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EmployeeReader {
	static FileReader fr;
	static BufferedReader br;
	
	private static void createobject(String input) {
	//	Employee employee=new Employee();
	//	int index=0,saveindex=0;
	/*	index=checkindex(input,index);
		employee.setId(input.substring(saveindex,index));
		saveindex=index+1;
		index=checkindex(input,saveindex);
		employee.setName(input.substring(saveindex,index));
		saveindex=index+1;
		index=checkindex(input,saveindex);
		employee.setAge(Integer.parseInt(input.substring(saveindex,index)));
		saveindex=index+1;
		employee.setPhone(input.substring(saveindex));*/
		
		int index=0,saveindex=0;
		
		index=checkindex(input,index);
		String id=input.substring(saveindex,index);
		saveindex=index+1;
		
		index=checkindex(input,saveindex);
		String name=input.substring(saveindex,index);
		saveindex=index+1;
		
		index=checkindex(input,saveindex);
		int age=Integer.parseInt(input.substring(saveindex,index));
		saveindex=index+1;
		
		String phone=input.substring(saveindex);
		
		Employee employee=new Employee(id,name,age,phone);
		
		System.out.println(employee);
		return;
		
	}

	private static int checkindex(String input,int index) {
		
		return input.indexOf(',',index);
	}

	public static void main(String[] args) {
		try {
			fr=new FileReader("ObjectDetails.txt");
			br=new BufferedReader(fr);
			String input;
			while((input=br.readLine())!= null)
			{
				EmployeeReader.createobject(input);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
			 if(fr!=null && br!=null)
			 {
				
					br.close(); 
					fr.close();
			 }
			}
					catch (IOException e) {
					
					e.printStackTrace();
				}
				 
			 }
		}
		

	}
