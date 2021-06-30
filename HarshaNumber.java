  
class Main  
{  
public static void main(String arg[])  
{  
int num=156;
int rem=0,sum=0,n;
n=num;
while(num>0)
{
rem=num%10;
sum=sum+rem;
num=num/10;
}
if(n%sum==10)
System.out.println(n+"is a harshada number");
else
System.out.println(n+"is not a harshada number");
}
} 


























