class ArmstrongExample{  
  public static void main(String[] args)  {  
    int c=0,a,temp;  
    int n=371; 
    temp=n;  
    while(n>0)  
    {  
    a=n%10;  
    n=n/10;  
    c=c+(a*a*a);  
    }  
    if(temp==c)  
    System.out.println(" This is an armstrong number...you are a genius");   
    else  
        System.out.println("Sorry idiot this is so not an armstrong number");   
   }  
}  