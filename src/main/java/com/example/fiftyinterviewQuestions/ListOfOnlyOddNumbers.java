package com.example.fiftyinterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ListOfOnlyOddNumbers {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.stream(new int[] {13,53,21,55,29}).boxed().collect(Collectors.toList()));
		System.out.println(list.stream().anyMatch(number-> number%2!=0));
		
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(45,32,21,69));
		System.out.println(list2.stream().allMatch(number-> number>20));
		
		ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(45,32,21,69));
		System.out.println(list2.stream().noneMatch(number-> number>70));
		
	}
}
