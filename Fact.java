class Fact
{
int count =1,mult=1;

public void m1(int x)
  {
  if (count<=x)
 {
  mult=mult*count;
  count++;
  m1(x);
  }
 }
 public static void main(String[]args)
 {
 Fact t = new Fact();
 t.m1(5);
 System.out.println(t.mult);
}
}