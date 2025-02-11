import java.util.Arrays;

public class ArrayAverages{
  
  int[][] ray;

  public ArrayAverages(int[][] rayray){
    ray = rayray;
  }

  public void rowAverages()
  {
    double rowAvg = 0;
    int sum = 0;
    for(int row = 0; row < ray.length; row++)
    {
      //sum = 0;
      for(int col = 0; col < ray[row].length; col++)
      {
        sum+=col;
      }

      rowAvg=sum/ray[row].length;

      System.out.println("The average of row " + row + " is: " + rowAvg);
    }
  }

  public void columnAverages()
  {
    //column major order
    //take each column and go through all the rows
    //top down and left to right

    //reverse of what we wrote yesterday

  }

  public void arrayAverage()
  {

  }

  public String toString(){
    for(int row=0; row<ray.length; row++)
    {
      System.out.println(Arrays.toString(ray[row]));
    }

    return "";
  }
}
