package com.example.practice3;

public class NoConcectiveDuplicates {

	public static StringBuilder remove(String s){
		StringBuilder str = new StringBuilder();
		for(int i=0;i<s.length();i++){
			
			int lastAppearance =s.indexOf(s.charAt(i),i-1);
			if(lastAppearance!= i){
				continue;
			}
			str.append(String.valueOf(s.charAt(i)));
		}
		return str;
		

	}
	
	public static void main(String[] args) {
		StringBuilder remove = remove("COTTZAAZT");
		System.out.println(remove);
	}

//	COTTZAAZT
}
