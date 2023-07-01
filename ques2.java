public class ques2 {
  public static void main(String[] args) {
      int n = 5, res = 0;
      for(int i = 0; i<=n; i++)if((n&i) == i)res++;
      System.out.println(res);
}
}