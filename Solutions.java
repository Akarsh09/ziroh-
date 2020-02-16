
public class Solutions {

	public void insertionsort(int arr[]) 
	    { 
	       
	        for (int i = 1; i <arr.length; ++i) { 
	            int key = arr[i]; 
	            int j = i - 1; 
	  
	         
	            while (j > 0 && arr[j] > key) { 
	                arr[j + 1] = arr[j]; 
	                j = j - 1; 
	            } 
	            arr[j + 1] = key; 
	        }
		 
	    } 
	public int[] countingsort(int a[])
	
	{
		int[] c=new int[10];
		int[] B=new int[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			c[a[i]]=c[a[i]]+1;
		}
		for(int i=1;i<10;i++)
		{
			c[i]=c[i]+c[i-1];
		}
		for(int j=0;j<a.length;j++)
		{
			B[c[a[j]]]=a[j];
			c[a[j]]=c[a[j]]-1;
		}
		return B;
	}
	void insertionbinary(int a[],int n) {
		int pos,k,temp;
		for(int i=1;i<n;i++)
		{
			temp=a[i];
			int j=i-1;
			pos=binarysearch(a,temp,0,j);
			while(j>=pos)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
		}
	}
	int binarysearch(int a[],int key,int first,int last)
	{
		if(last<=first)
		{
			if(key>a[first]) {
				return last+1;
			}else
			{
				return first;
			}
		}
		int mid=(first+last)/2;
		if(key==a[mid])
		{
			return mid+1;
		}
		if(key>a[mid])
		{
			return binarysearch(a,key,mid+1,last);
		}
		return binarysearch(a,key,last,mid-1);
		
	}
	
}


