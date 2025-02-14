class Abc
 {

  public static void main(String[]args)
   {
  int row=6,col=2,space=2;
    for(int i=1;i<=row;i++)
     {
      if(i<=2||i>=5)
       {
       for(int j=1;j<=space;j++)
         {
          System.out.print("  ");
         }
         for(int z=1;z<=col;z++)
           {
          System.out.print("1 ");
          }
          }
         else
          {
          for(int z=1;z<=row;z++)
           {
          System.out.print("1 ");
           }
       }
        System.out.println();
     
   }
  }
   
}