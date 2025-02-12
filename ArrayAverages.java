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
    System.out.println("");
    double colAvg = 0;
    int colSum = 0;
    int rowNum = 0;
    
    for(int col = 0; col < ray[0].length; col++)
    {
      rowNum = 0;
      
      for(int row = 0; row < ray[col].length; row++)
      {
        rowNum+=col;
        //colSum += 1;
      }
      colSum = rowNum;
      colAvg = colSum;
      System.out.println("The average of column " + col + " is: " + colAvg);
    }
  }

  public void arrayAverage()
  {
    System.out.println("");

    int total = 0;
    int cnt = 0;
    double arrayAvg = 0;
    

    for(int row = 0; row<ray.length; row++)
    {

      for(int col = 0; col < ray[row].length; col++)
      {
        
        total+=col;
        cnt++;
      }
      arrayAvg = total/cnt;
    }
    System.out.println("The average of this array is: " + arrayAvg);
  }

  public String toString(){
    for(int row=0; row<ray.length; row++)
    {
      System.out.println(Arrays.toString(ray[row]));
    }

    return "";
  }
}
