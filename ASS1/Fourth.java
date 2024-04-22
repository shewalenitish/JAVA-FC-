import java.util.*;
public class Fourth {
   static void display(int res[][],int row,int col)//methods should  be static in public class
   {
       for(int i=0; i<row; i++)
       {
           for(int j=0; j<col; j++)
           {   
               System.out.print(res[i][j]+" ");
           }
           System.out.println();
       }
   }
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter no of rows for  m1");
            int row1 = sc.nextInt();
            System.out.println("Enter no of columns for  m1");
            int col1 = sc.nextInt();

            System.out.println("Enter no of rows for m2");
            int row2 = sc.nextInt();
            System.out.println("Enter no of columns for m2");
            int col2 = sc.nextInt();
    
            int m1[][]=new int[row1][col1];
            int m2[][]=new int[row2][col2];
            if(row1 == row2 && col1 == col2)//in matrix add no of rows and columns should be same of both matrices
            {
                System.out.println("Enter elements of m1 ");
                for(int i=0; i<row1; i++)
                {
                    
                   for(int j=0; j<col1; j++)
                   {
                      m1[i][j]=sc.nextInt();
                   }
                }
                System.out.println("Enter elements of m1 ");
                
                for(int i=0; i<row2; i++)
                {
                   for(int j=0; j<col2; j++)
                   {
                      m2[i][j]=sc.nextInt();
                   }
                } 
                int res[][]=new int[row1][col2];
                int result[][]=MatrixAdd(m1, m2, res,row1,col1);
                display(result,row1,col1);
            } 
            else
              System.out.println("number of rows and columns should be same chapati");
        }  
       static int[][] MatrixAdd(int m1[][],int m2[][],int res[][],int row,int col){
        for(int i=0; i<row; i++)
        {
           for(int j=0; j<col; j++)
           {
              res[i][j]=m1[i][j]+m2[i][j];
           }
        }
        return res;
    }
   
}

