# MountainStronghold
A mountain stronghold of Python's Scikit-Learn by Java;
现在的情况是这样：

```
hanss@master_o:/App/Jama/examples$ ls
MagicSquareExample.java
```
由于MagicSquareExample.java开头是：
```
package Jama.examples;
import Jama.*;
//等等
```
于是乎，编译需要：
```
hanss@master_o:/App/Jama/examples$ javac MagicSquareExample.java -cp /Homework/JavaDeepLearning/Jama/Jama-1.0.3.jar:../..
```
运行：
```
hanss@master_o:/App/Jama/examples$ cd ../..
hanss@master_o:/App$ java Jama.examples.MagicSquareExample -cp /Homework/JavaDeepLearning/Jama/Jama-1.0.3.jar
```
即可

