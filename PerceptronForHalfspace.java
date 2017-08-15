//2017.08.15 13:41 @hanss401
package Jama.app;
import Jama.*;

public class PerceptronForHalfspace{
       public int    n;
       public Matrix W;
       public PerceptronForHalfspace(int dimOfX){
              n = dimOfX;
              double[] w = new double[n];
              W = new Matrix(w,n); 
       }
       
       public void train(Matrix X,Matrix y){
              int col = X.getColumnDimension();
              while(true){
                 Matrix W_init = W;
                 for(int i=0;i<col;i++){
                     int[] r  = new int[1];
                     r[0] = i;  
                     Matrix x = X.getMatrix(r,0,n-1);
                     //System.out.println(x.getColumnDimension());
                     //System.out.println(x.getRowDimension());
                     //System.out.println(W.getColumnDimension());
                     //System.out.println(W.getRowDimension());
                     if(y.get(i,0)*(x.times(W).get(0,0)) <= 0){
                          W = W.plus(x.times(y.get(i,0)).transpose());
                     }    
                  }
                  if (isEqual(W_init,W)) {   
                     break;
                  }
              }                  
       }
       
       public double predict(Matrix x){
              return W.times(x.transpose()).get(0,0);
       }

       public boolean isEqual(Matrix x1,Matrix x2){
              return x1.getArray() == x2.getArray();
       }
}
