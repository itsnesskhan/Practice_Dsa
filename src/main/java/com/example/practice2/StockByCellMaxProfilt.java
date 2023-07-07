package com.example.practice2;

import java.util.ArrayList;

public class StockByCellMaxProfilt {

	public static int maximumProfit(ArrayList<Integer> prices){
        int maxProfit = 0;
        int currProfit = 0;
        for(int i=0;i<prices.size();i++){

            for(int j=i+1;j<prices.size();j++){
                currProfit = prices.get(j)-prices.get(i);
                maxProfit = Math.max(maxProfit, currProfit);
            }
        }

        return maxProfit;
    }
	
	public static int maximumProfitOptamized(ArrayList<Integer> prices){
        int maxProfit =0
        		;
        int minSoFar = prices.get(0);
        for(int i=0;i<prices.size();i++){

            minSoFar = Math.min(minSoFar, prices.get(i));
            int profite = prices.get(i)-minSoFar;
            maxProfit = Math.max(maxProfit, profite);
        }

        return maxProfit;
    }
	
	public static void main(String[] args) {
	  ArrayList<Integer> list = new ArrayList<>();  //{17,20,11,9,12,6};
	  list.add(17);
	  list.add(20);
	  list.add(11);
	  list.add(9);
	  list.add(12);
	  list.add(6);
	  System.out.println(maximumProfitOptamized(list));
	}
}
