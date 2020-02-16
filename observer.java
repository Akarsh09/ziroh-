import java.util.ArrayList;
class A<T> extends Container
{
	int variable=10;
	Container<T> con =new Container<T>();
	
	B<T> b=new B<T>();
	C<T> c =new C<T>();
	D<T> d =new D<T>();

	void  register()
	{
		con.adding(b);
		con.adding(c);
		con.adding(d);
	}
	void remove()
	{
	con.remove(b);
	con.remove(c);
	con.remove(d);
		
	}
	void createEvent(int val)
	{
		if(val<variable)
		{
			for(Object o:al)
			{
			b.getNotify(o);
			}
			
	}
		
	
	
}


	
class B<T> implements inotify
{
	public void getNotify(Object ob) {
		if(ob.getClass().getSimpleName()=="Integer")
		{
			System.out.print("B notified");
			refill((T)ob);
		}
			if(ob.getClass().getSimpleName()=="String") {
				System.out.print("B notified");
		rename((T)ob);
			}
	
	
}

	  void refill(T ob) {
	int quantity=(int)ob;
		
	}

	void rename(T ob) {
		String name=(String)ob;
		
	}
}
class C<T> implements inotify{

public void getNotify(Object ob) {
	if(ob.getClass().getSimpleName()=="Integer")
		
		
	{System.out.print("called c");
		refill((T)ob);
	}
		

if(ob.getClass().getSimpleName()=="String")
	
	
{System.out.print("called c");
	rename((T) ob);
}
}
void rename(T ob)
{
	String name=(String) ob;
}
void refill(T ob)
{
	int newquantity=(int)ob;
}
	
}



	}
class D<T> implements inotify
{	
	public void getNotify(Object ob) {
		if(ob.getClass().getSimpleName()=="Integer")
			
			
		{System.out.print("called D");
			refill((T)ob);
		}
			
	
	if(ob.getClass().getSimpleName()=="String")
		
		
	{System.out.print("called D");
		rename((T) ob);
	}
}
	void rename(T ob)
	{
		String name=(String) ob;
	}
	void refill(T ob)
	{
		int newquantity=(int)ob;
	}
	
}
