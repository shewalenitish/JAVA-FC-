package Prime;
public class primeNo {
    int n;
    public primeNo(int n){
        this.n=n;
    }
    public void isPrime(){
        int c=0;
        for(int i=2; i<n/2; i++)
        {
            if(n%i==0)
            {
                c=1; 
            }
     
        }
        if(c==1){
            System.out.println("not a prime");
        }
        else
          System.out.println("prime");
          

    }
}
