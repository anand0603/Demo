class Ttest
{
 public static void  main(String[]args)
 {
  int rows=9,col=9;
   for(int i=1;i<=rows;i++)
    {
     for(int j=1;j<=col;j++)
      {
       
            if((i>=5&&j==1)||(i>=8&&j==7)||(i>=8&&j==3)||(i==9&&j==4)||(i>=5&&j==9)||(i>=7&&j==8)||(i>=8&&j==7)||(i==9&&j==6)||(i==1&&j==1)||(i==1&&j==9)||(i==1&&j==3)||(i==1&&j==4)||(i<=3&&j==5)||(i==1&&j==6)||(i==1&&j==7)||(i>=7&&j==2))
                 {
               System.out.print("  ");
               }  
             else
              {
               System.out.print("* ");
               }  
      
             } 
System.out.println();
            
    
         

      
      }
    }
 }
