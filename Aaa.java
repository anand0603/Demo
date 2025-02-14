class Aaa
{
int sum=0,count=0,num=1;
    public void m1(int x)
    {
    int y=x,z=x;
    if(y>0)
     {
     count++;
     y=y/10;
     
     m1(y);
      
     } 
     if(z>0)
     {
    int rem=z%10;
       z=z/10;
      int a=1;
      if(a<=count)
       {
      num= rem*num;
      a++;
       }
      
     
       
      m1(z);
    }
   }
     
     
  public static void main (String[]args)
   {
    Aaa t = new Aaa();
    t.m1(123);
  
  System.out.println(t.count);
   
    System.out.println(t.num);
}
}