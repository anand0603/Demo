class Withoutreturn$witharguement
{
   public static void m1(int num)
   {
      if(num%2==0)
      {
       System.out.println("give number is even");
      }
      else
      {
      System.out.println("given number is odd");
      }
   }
   public static void m2(int a,int b)
   {

	for(int i=a;i>=b;i--)
	{
	int count=0;
	    for(int j=1;j<=i;j++)
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
  public static void m3(int num)
  {
   int count=0,temp=num,sum=0,dupli=num;
  
	while(num>0)
	{
	 num = num/10;
         count++; 
	}
        while(temp>0)
	{
	  int mul = 1;
	  int rem = temp%10;
	  temp=temp/10;
	 for(int i=1;i<=count;i++)
	 {
	  mul=rem*mul;
	 }

	  sum=sum+mul;
	}
         if(sum==dupli)
	 {
           System.out.println("given number is armstrong");
	 }
	  else
     	  {
	   System.out.println("given number is not armstrong");
	  }
    }
   public static void main(String[]args)
   {
  m1(66);
  m2(200,100);
  m3(153);
   }
}
