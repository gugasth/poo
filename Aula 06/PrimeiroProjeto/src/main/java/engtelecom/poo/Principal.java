package engtelecom.poo;

public class Principal {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        if (args.length > 0){
            for (var argumento: args){
                System.out.println("arg: " + argumento);
            }
        }
    }
}