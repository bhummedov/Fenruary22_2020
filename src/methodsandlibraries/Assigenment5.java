package methodsandlibraries;
public class Assigenment5 {
    public static void printSome() {
        int i = 0;
        do {
            System.out.println("Hello World ");
            i++;
        }
        while (i < 10);
    }

    public static void printNumbers() {
        for (int a = 1; a <= 100; a++) {
            System.out.println(a);
        }
    }

    public static void main(String[]args) {
        printSome();
        printSome();
        printNumbers();
        printNumbers();
    }
}

