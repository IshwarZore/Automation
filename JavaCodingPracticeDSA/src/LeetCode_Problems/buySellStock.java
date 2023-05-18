package LeetCode_Problems;

public class buySellStock {

	class Solution {
	    public int maxProfit(int[] prices) {
	        
	        int tProfit=0;
	        int minVal= Integer.MAX_VALUE;
	        for(int i=0;i<prices.length;i++){
	            if(minVal>prices[i]){
	               minVal= prices[i];
	            }
	            
	           int cProfit = prices[i]-minVal;
	            if(cProfit>tProfit){
	                tProfit=cProfit;
	            }
	            
	        }
	        return tProfit;
	        
	    }
	}
	
}
