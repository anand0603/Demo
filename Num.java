class Num
{
  public static void main (String[]args)
  {
   int row =3,col=1,gap=2;
       for(int i=1;i<=row;i++)
        {
	 for(int z=1;z<=gap;z++)
	   {
            System.out.print("  ");
	    }
	  for(int j=1;j<=col;j++)
	    {
	    if(i==1&&j==1)
	     {
	     System.out.print("1 ");
	     }
	     else if((i+j)%2==0)
		{
		System.out.print("0 ");
		}
		else
		{
		System.out.print("1 ");
		}
	    }
	System.out.println();
col=col+2;
gap--;
	}  
    }
}