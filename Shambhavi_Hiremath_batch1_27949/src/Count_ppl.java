
public class Count_ppl {
public static void main(String[] args){

{
	   int a[] = {34,78,56,7,12,67,20,50};
	     int size=a.length;
	     int  child_count = 0,adult_count=0,senior_count=0;

	
    
 for(int i = 0; i <size; i++)
     {
         if(a[i]<18)
         {
            child_count++;
         }
         else if(a[i]>=18 && a[i]<=54){
        	 adult_count++;
         }
         else{
        	 senior_count ++;
         }
     }
     System.out.println("Children:"+child_count);
     System.out.println("Adult:"+adult_count);
     System.out.println("Senior:"+senior_count);
		
		
	}


}
}

