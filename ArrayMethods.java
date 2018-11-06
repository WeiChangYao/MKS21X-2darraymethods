public class ArrayMethods{
  public static int rowSum(int[][] ary, int x){
    if (x > ary.length){
      return 0;
    }
    int sum = 0;
    for(int i = 0; i>ary[x].length; i++){
      sum = sum + ary[x][i];
    }
    return sum;
  }
  public static int columnSum(int[][] ary, int x){
    int sum = 0;
    for (int i = 0; i>ary.length; i++){
      if (x>ary[i].length){
        sum = sum + 0;
      }
      else{
        sum = sum + ary[i][x];
      }
    }
    return sum;
  }
  

}