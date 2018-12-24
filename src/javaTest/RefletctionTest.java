package javaTest;

import charactor.Hero;

public class RefletctionTest {

	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args){
		String className = "charactor.Hero";
		try{
			Class className01 = Hero.class;
			Class className02 = Class.forName(className);
			//className03 = new Hero().getClass();
			System.out.println(className01 + "01");
			System.out.println(className02 + "02");
			//System.out.println(className03 + "03");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			
		}

	}
}
