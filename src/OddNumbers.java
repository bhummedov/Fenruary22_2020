public class OddNumbers {
    public static void oddNumbers(int start, int end){
        for (int i=start; i<end; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }}
          public static void evenNumbers(int start, int end ) {
              for (int i = start; i < end; i++) {
                  if (i % 2 == 0) {
                      System.out.println(i);
                  }
              }
          }
          public static void main(String[] args){
          OddNumbers.oddNumbers(5,30);
          OddNumbers.evenNumbers(5,30);
    }
}
