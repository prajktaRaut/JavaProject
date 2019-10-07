package com.bridgelabz.algorithm;

/**
 * purpose: Merge sort for string array
 * @author Bridgelabz
 * @version 1.8
 */

public class MergeSort {

	String[] array;
	String[] tempMergeArray;
	int length;
	
	public static void main(String[] args) 
	{
		
		String[] inputArray= {"java","angular","python","hibernate","spring"};
		
		MergeSort ms = new MergeSort();
		
		ms.Sort(inputArray);
		
		for (String i : inputArray) {
			
			System.out.print(i + " ");
		}

	}
	
	
	public void Sort(String[] inputArray)
	{
		
	 this.array=inputArray;
	 this.length=inputArray.length;
	 this.tempMergeArray= new String[length];
	 
	 divideArray(0, length-1);
		
	}
	
	public void divideArray(int lowerIndex,int higherIndex)
	{
		if(lowerIndex<higherIndex)
		{
		int middle=lowerIndex+(higherIndex-lowerIndex)/2;
		
		divideArray(lowerIndex, middle);
		
		divideArray(middle+1, higherIndex);
		
		mergeSort(lowerIndex, middle, higherIndex);
		}
		
		
	}

	public void mergeSort(int lowerIndex,int middle,int higherIndex)
	{
		for(int i=lowerIndex;i<=higherIndex;i++)
		{
			
			tempMergeArray[i]=array[i];
			
		}
		
		int i=lowerIndex;
		int j=middle+1;
		int k=lowerIndex;
		
		
		while(i<=middle && j<=higherIndex)
		{
		if(tempMergeArray[i].compareTo(tempMergeArray[j])<=0)
		{
			array[k]=tempMergeArray[i];
			i++;
		}
		else
		{
			array[k]=tempMergeArray[j];
			j++;
		}
		
		k++;
		}
		
		while(i<=middle)
		{
			array[k]=tempMergeArray[i];
			k++;
			i++;
		}
		
	}
}
