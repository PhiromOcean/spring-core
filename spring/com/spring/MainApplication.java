package spring.com.spring;
public class MainApplication {
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50};
        int[] b = {100,200,300,400};
        printArray(b);
    }

    public static void printArray(int[] a) {
        for(int n : a){
            System.out.print(n + ", ");
        }
    }
}
