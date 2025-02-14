class Prime_N
{
  public static void p1(int num1,int num2)
  {

  for(int i=num1;i<=num2;i++)
    {
    int count=0;
	for(int j=num1;j<=i;j++)
	{
	if(i%j==0)
	 {
	  count++;
	  }
 	 }
	 if(count==2)
	 {
	 System.out.println(i);
	 }
      }
    }
  public static void main(String[]args)
  { 
  p1(1,100); 
}
}