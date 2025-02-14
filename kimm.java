class kimm
{
public static void main(String[] args)
{
int count=0;
for(int i=1;true;i++)
{
int prime=0;
for(int j=1;j<=i;j++)
{
if(i%j==0)
{
prime++;
}
}
if(prime==2)
{
System.out.println(i);
count++;
}
if(count==50)
{
break;
}
}
}
}