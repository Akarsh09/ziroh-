public class Pen
{
    int current;
    public void write(int v)
    {
v=v--;
    }
   
    
     void refill(String typ,int capacity)

    {

        if(typ=="gel")
        {
System.out.print("throw it");
        }
        if(current==0)
        {
      current=current+capacity;
        }
    }

}
class Ink extends Pen
{
    String inktype;
    int volume;
    String colour;


    Ink (String string, int i, String string2inktype,volume,color)
    {
this.inktype=inktype;
this.volume=volume;
this.color=color;
    
     if(inktype=="gell"||inktype=="ball"|| inktype=="liquidink "||inktype=="gliter")
{
    
    if(volume==50)
    {

        write(1);
        if(v==0)
        {
            refill(inktype,50);
        }
        
        System.out.println("your pen type is"+inktype+"with quantity"+v+"and color"+color);

    }
    if(volume<=50)
    {
        write(1);
        if(v==0)
        {
            refill(inktype,25);
        }
        
        System.out.println("your pen type is"+inktype+"with quantity"+v+"and color"+color);
    }
    if(volume>=50){
        write(1);
        if(v==0)
        {
            refill(inktype,70);
        }
          System.out.println("your pen type is"+inktype+"with quantity"+v+"and color"+color);
    }
    
    
    }
    

class B
{
    public void Main(String[]args)
    {
        
     Ink i1=new Ink();
     Ink i2=new Ink("ball",50,"blue");
     Ink i3=new Ink("liq ink",50,"green");
     
          
    }
}