package methodsandlibraries;
public class Pyramid {
    public static void pyramid(){
        for (int i=0; i<10; i++){
            for (int j=0; j<1+i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        pyramid();
    }
}
