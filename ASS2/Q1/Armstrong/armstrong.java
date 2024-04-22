package Armstrong;

public class armstrong {
    int n;
    public armstrong(int n){
        this.n=n;
    }
    public void isArm()
    {
        int temp = n;
        int count = 0;
        int sum = 0;
        
        while (n != 0) {
            n =n/10;
            count++;
        }

        n=temp;
        
        while (n > 0) {
            int digit = n % 10;
            n =n/10;

            int power = 1;
            for (int i = 0; i < count; i++) {
                power =power*digit;
            }
            sum=sum+power;
        }
        if(temp==sum)
        {
            System.out.println("THe number is armstrong");
        }
        else 
          System.out.println("number is not armstrong");
    }
    
}
