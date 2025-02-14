class Butterfly
{
public static void main(String[]args)
{
int a=4;
for (int i=1;i<=a;i++)
{
for (int j=1;j<=i;j++)
{
System.out.print("*");

}
for(int z=1*i;z<a*2-i;z++)
{
System.out.print(" ");
} 
for(int j=1;j<=i;j++)
{
System.out.print("*");

}
System.out.println();
}
for (int i=1;i<=a;i++)
{
for (int j=1;j<=a-i;j++)
{
System.out.print("*");

}
for(int z=1;z<=i*2;z++)
{
System.out.print(" ");
} 
for(int j=i;j<=a-1;j++)
{
System.out.print("*");

}
System.out.println();
}
}
}