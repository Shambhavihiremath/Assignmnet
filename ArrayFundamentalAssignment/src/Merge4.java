import java.util.Arrays;

public class Merge4 {
	public static void main(String[] args){
	int[] a= {2,5,8,9}; 
	int[] b = {15,3,7,12};  
	
	int length = a.length + b.length;  
	int[] mergedArray = new int[length];    
	int pos = 0;  
	for (int element :a)  
	{  
	mergedArray[pos] = element;  
	pos++;              
	}  
	for (int element : b)  
	{  
	mergedArray[pos] = element;  
	pos++;  
	}  
	System.out.println("Merged Array is");
	System.out.println(Arrays.toString(mergedArray));     
	}  
	}  

