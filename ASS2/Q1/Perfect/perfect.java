package Perfect;

public class perfect {
    int n;
    public perfect(int n)
    {
      this.n=n;
    }
    public void isPerfect()
    {
        int sum=0;
        for(int i=1; i<=n/2; i++)
        {
           if(n%i==0)
           {
             sum=i+sum;
           }
        }
        if(sum==n){
           System.out.println("The number is perfect");
        }
        else{
            System.out.println("Numbe is not perfect");
        }
        
    }
}
