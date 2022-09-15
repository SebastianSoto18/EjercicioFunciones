import java.util.Scanner;

public class calcprecio {

    public static double preciofinal(double precio){
        return precio*1.19;
    }


public static void main(String[] args) {
        double precio;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el precio del producto");
        precio = sc.nextDouble();
        System.out.println("El precio final es " + preciofinal(precio));
    }
}
