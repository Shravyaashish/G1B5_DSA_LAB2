package com.greatelearning.lab2;

public class Mergesort {
void sort(int[]arr,int left,int right) {
	if(left<right)
	{
	int mid=(left+right)/2;	
	sort(arr,left,mid);
	sort(arr,mid+1,right);
	merge(arr,left,mid,right);
	}
}

private void merge(int[] arr, int left, int mid, int right) {
	int i=left;
	int j=mid+1;
	int k=right;
	int brr[]=new int[right+1];
	while(i<mid&&j<=right)
	{
		if(arr[i]>=arr[j])
			brr[k++]=arr[i++];
		else
			brr[k++]=arr[j++];
	}
}


	
}





