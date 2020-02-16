
public class Sortingmain {

	public static void main(String[] args)
	{
		int[] a= {2,1,3,2,0,1,1,3};
		int[] b=new int[a.length];
		
		Solutions s=new Solutions();
 /*s.insertionsort(a);
 for(int i=0;i<a.length;i++)
 {
	 System.out.print(a[i]+" ");
 }*/
b=s.countingsort(a);
for(int i=0;i<b.length;i++)
{
	 System.out.print(b[i]+" ");
}

 
	}
	
}
