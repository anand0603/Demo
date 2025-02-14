class Armstong_using_recursion
{
int count=0,sum=0,num,a2,a3,aa=1,multi=1;
 public void m1(int a1)
  {
num=a2=a3=a1;
 m2(a2);
    }
public void m2(int a2)
{
if(a2>0)
 {
  count++;
  a2=a2/10;  
  m2(a2);

 }
m3(a3);

}
public void m3 (int a3)
  {
  if(a3>0)
   {
  int rem=a3%10;
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
 a3=a3/10;
 aa=1;
multi=1; 
 m3(a3);
 
 
}

}


  
public static void main(String[]args)
{
Arm t = new Arm();
 t.m1(123);

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
System.out.println(t.a2);
}
}


