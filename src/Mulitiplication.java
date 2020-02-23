public class Mulitiplication {
    public static void multiplication() {
        for (int i = 1; i <= 10; i++) {
            System.out.print("\t" + i);
        }
        System.out.println("\n--------------------------------------------");
            for (int j = 1; j <= 10; j++) {
                System.out.print(+j+":");
                for (int i=1; i<=10; i++){
                    System.out.print("\t"+(i*j));
            }
                System.out.println();
        }
    }
        public static void main (String[] args){
            multiplication();
        }
    }

