package numoperation;

public class prime {
    int n;
   public  prime(int n){
        this.n=n;
    }
    public void isPrime(){
        int c=0;
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0) 
            {
                c=1;

            }
        }
        if(c==1){
            System.out.println("number is prime");
        }else{
            System.out.println("numbwr is not prime");
        }
    }
    
}
