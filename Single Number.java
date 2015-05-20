/**
Given an array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory? 
*/
public class Solution {
    public int singleNumber(int[] A) {
        if(A.length==0)
			return 0;
		int res = A[0];
		for(int i=1;i<A.length;i++)
		{
			res^=A[i];
		}
		return res;
    }
}
