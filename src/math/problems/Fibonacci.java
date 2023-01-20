package math.problems;

public class Fibonacci {

    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
        fibonacci();

    }
    public static void fibonacci(){
        int n =40;
      int firstTerm=0;
      int secondTerm=1;
      for(int i=1; i<= n;++i) {
          System.out.println(firstTerm + " , ");
          int nextTerm = firstTerm+ secondTerm;
          firstTerm=secondTerm;
          secondTerm =nextTerm;

      }
    }

}
