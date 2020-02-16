public class Sortings
{
	int key;
	int[] InsertionSort(int[] a)
	{
		for(int i=2;i<=a.length;i++)
		{
			key=a[i];
			int j=i-1;
			while(j>0&&key<a[j])
			{
				a[j+1]=a[j];
				j=j-1;
			}
			a[j+1]=key;
		}
		return a;
	}
}