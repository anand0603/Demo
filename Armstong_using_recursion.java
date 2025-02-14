class Armstong_using_recursion
{
int count=0,sum=0,num,a1,a2,aa=1,multi=1;
 public void m1(int a)
  {
num=a1=a2=a;
 m2(a1);
    }
public void m2(int a1)
{
if(a1>0)
 {
  count++;
  a1=a1/10;  
  m2(a1);

 }
m3(a2);

}
public void m3 (int a2)
  {
  if(a2>0)
   {
  int rem=a2%10;
    m4(rem);
   
   



   }
 
   }

  public void m4(int rem)
  {
 
  if(aa<=count)
  {
   multi=multi*rem;
  aa++;
 m4(rem);
 
  }

  else
  {
 
 sum=sum+multi;
 a2=a2/10;
 aa=1;
multi=1; 
 m3(a2);
 
 
}

}


  
public static void main(String[]args)
{
Armstong_using_recursion t = new Armstong_using_recursion();
 t.m1(213);

if(t.num==t.sum)
{
 System.out.println("given number is arm strong");
 }
 else
 {
 System.out.println("given number is not arm strog");
 }
 
System.out.println(t.sum);
System.out.println(t.num);
System.out.println(t.a1);
System.out.println(t.a2);
System.out.println(t.count);
System.out.println(t.aa);
System.out.println(t.multi);




}
}


