
package app3;


public class App3 {

    
    public static void main(String[] args) {
        int a = 3, b = 2, c = 1;
        
        if (a > c){
            a = b = c = 1;

            display(b);
        }
    }
    
    public static void display(int b){
        System.out.println(b);

    }
}
