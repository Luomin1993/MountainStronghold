package Jama.app;
import Jama.app.PerceptronForHalfspace;
import Jama.*;

public class testPerceptronForHalfspace{
       public static void main(String args[]){
              double[][] X_ = {{1,2,1},{3,1,1},{0,1,3}};
              double[]   y_ = {-1,1,1};
              Matrix X = new Matrix(X_);
              Matrix y = new Matrix(y_,3);
              PerceptronForHalfspace pfh = new PerceptronForHalfspace(3);
              pfh.train(X,y);
              Matrix x = new Matrix(X_[1],3);
              System.out.println(pfh.predict(x));
       }
}
