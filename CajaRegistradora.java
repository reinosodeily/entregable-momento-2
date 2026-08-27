import java.util.Scanner;

public class CajaRegistradora {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String articulo;
        Double valorAticulo;
        boolean categoria = true;

        do{
 System.out.println("ingrese el nombre del articulo");
        articulo =leer.next();

        System.out.println("ingrese el valor del producto");
        valorAticulo = leer.nextDouble();

        System.out.println("elija el tipo de categoria del producto");
        System.out.println("1.basico");
        System.out.println("2.medio");
        System.out.println("3.premiun");
        System.out.println("4.finalizar compra");

         articulo = leer.next();

        switch (articulo) {
            case "1":
                 System.out.println("ha elegido el articulo basico");
                break;

                case "2":
                 System.out.println("ha elegido el articulo medio");
                break;

                case "3":
                 System.out.println("ha elegido el articulo premiun");
                break;

        case "4":
                 System.out.println("compra finalizada");
                 categoria = false;
                break;

            default:

            System.out.println("opcion incorrecta");
                break;
        }
        } while (categoria);
        
            
        
    }
}