import java.util.*;
interface Java_Array{
    int[] reverse(int arr[]);
    int[] copy(int arr[]);
    int max(int arr[]);
}
class operation implements Java_Array{
    public int[] reverse(int arr[]) {
        int temp;
        int start = 0;
        int end = arr.length - 1;
        while (start < end) { 
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
    public int[] copy(int arr[]) {
        int[] copyArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copyArray[i] = arr[i];
        }
        return copyArray;
      
    }
    public int max(int arr[]) {
     int max=arr[0];
     for(int i=0; i<arr.length; i++)
     {
        if(arr[i]>max){
            max=arr[i];
        }
     }
     return max;
    }

}
public class First {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("Enter array elements");
        for(int i=0; i<5; i++){
           arr[i]=sc.nextInt();
        }
        System.out.println("Max....");
        operation o=new operation();   
        System.out.println(o.max(arr));


        int[] res=o.reverse(arr);
        System.out.println("Reverse.......");
        for(int i=0; i<5; i++)
        {
            System.out.println(res[i]);
        }

        int[] copiedArray = o.copy(arr);
        System.out.println("copy.....");
        for (int i = 0; i < 5; i++) {
            System.out.println(copiedArray[i]);
        }
    }
}
