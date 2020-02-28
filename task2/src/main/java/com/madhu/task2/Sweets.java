package com.madhu.task2;

public class Sweets extends Abstract_Method{
	public int total_weight(int[] sweets,int n)
	{
		int tota=0;
		for(int i=0;i<n;i++)
		{
			tota+=sweets[i];
		}
		return tota;
	}
	public int num_of_candy(int low,int high,int[] sweets,int c)
	{
		int co=0;
		for(int i=0;i<c;i++)
		{
			if(sweets[i]>=low && sweets[i]<=high)
				co++;
		}
		return co;
	}

}
