import java.util.Scanner;
 class Notebook extends Page
{
     int price;
 String brand;


	Notebook(String brand,int price)

    {
        this.brand=brand;
        this.price=price;
    
    }
 System.out.print(brand);
   System.out.print("and price is"+price);
    int filled=0;
    int blankpage=tp;
    int currentpage=0;
    
    
    void fillpage(int position)
    {
while(position!=totalpage)
{
    dostuff();
    filled++;
   blankpage=blankpage--;
    currentpage=currentpage++;
}
    System.out.print("no of filledpage are"+filled);
      System.out.print("no of blankpage are"+blankpage);
        System.out.print("you are currently on"+currentpage);

}
    }
  void  dostuff()
  {
      if(type=="writing"){
      Scanner sc =new Scanner(System.in);
      for(int i=0;i<=lines;i++)
      {
          String s=sc.nextLine();
          System.out.print(sc);
      }
      
      blankpage--;
      }
      else
      {
          System.out.print("Draw some images");
          blankpage--;
      }
  }
  void removepage()
  {
     int totalpage;
	--totalpage;
  }
  
  
void fillpage(10);
System.out.print(quality);
  System.out.print("and currently on"+currentpage);
    
}
public class Page
{
     int tp;
	 int lines;
	double thickness;
	 String type;
	 String quality;

	Page(int tp,int lines,double thickness )
    {
        this.quality=quality;
        this.type=type;
        this.thickness=thickness;
        this.lines=lines;
        this.tp=tp;
    }
    

}
class Mainn
{
    public void main(String[] args)
    {

        Page p=new Page();
        Notebook nb =new Notebook("camlin",250);
    }
}