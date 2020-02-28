package com.madhu.task2;

public  class Chocolates extends Abstract_Method{
	public int total_weight(int[] choc,int n)
	{
		int tota=0;
		for(int i=0;i<n;i++)
		{
			tota+=choc[i];
		}
		return tota;
	}
	public int num_of_candy(int low,int high,int[] choc,int c)
	{
		int co=0;
		for(int i=0;i<c;i++)
		{
			if(choc[i]>=low && choc[i]<=high)
				co++;
		}
		return co;
	}

}
