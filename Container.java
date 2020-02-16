import java.util.ArrayList;
 class  Container<T> {
	int quantity=10;
	ArrayList<T> al= new ArrayList<T>();
	
	
	void remove(Object ob)
	{
		al.remove((T) ob);
	}
	
	public void adding(Object z) {
		al.add((T) z);
			}

	
	
	
}

	


