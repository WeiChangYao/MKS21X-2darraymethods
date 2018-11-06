public class ArrayMethods{
  public static int rowSum(int[][] ary, int x){
    if (x > ary.length-1 || x < 0){
      return 0;
    }
    int sum = 0;
    for(int i = 0; i<ary[x].length; i++){
      sum = sum + ary[x][i];
    }
    return sum;
  }
  public static int columnSum(int[][] ary, int x){
    if (x < 0){
      return 0;
    }
    int sum = 0;
    for (int i = 0; i<ary.length; i++){
      if (x>ary[i].length-1){
        sum = sum + 0;
      }
      else{
        sum = sum + ary[i][x];
      }
    }
    return sum;
  }
  public static int[] allRowSums(int[][] ary){
    int[] sum = new int[ary.length];
    for (int i = 0;i<sum.length;i++){
      sum[i] = rowSum(ary, i);
    }
    return sum;
  }
  public static int[] allColSums(int[][] ary){
    //find longest row
    int longest = 0;
    for (int i = 0; i < ary.length; i++){
      if (ary[i].length > longest){
        longest = ary[i].length;
      }
    }
    int[] sum = new int[longest];
    for(int i = 0; i< longest; i++){
      sum[i] = columnSum(ary, i);
    }
    return sum;
  }
  public static boolean isRowMagic(int[][] ary){
    int m = rowSum(ary, 0);
    for (int i = 0; i < ary.length; i++){
      if (rowSum(ary,i) != m){
        return false;
      }
    }
    return true;
  }
  public static boolean isColumnMagic(int[][] ary){
    int longest = 0;
    for (int i = 0; i<ary.length; i++){
      if (ary[i].length > longest){
        longest = ary[i].length;
      }
    }
    for (int i = 0; i < longest; i++){
      if (columnSum(ary, i) != columnSum(ary,0)){
        return false;
      }
    }
    return true;
  }
}
