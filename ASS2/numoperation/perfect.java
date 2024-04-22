package numoperation;

public class perfect {
    int n;
    public perfect(int n){
        this.n=n;
    }
    public void isPerfect(){
        int sum=0;
        for(int i=1;i<n/2;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(sum==n){
            System.out.println("number is perfectr");
        }else{
            System.out.println("number is not perfect");
        }
    }
    
}
