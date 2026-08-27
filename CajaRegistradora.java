import java.util.Scanner;

public class CajaRegistradora {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String articulo;
        double valorAticulo  ;
        boolean categoria = true;
        double acomuladorValorArticulo = 0.0;
       double descuento= 0.10;
       double IMPUESTO_IVA = 0.10;
       int contadorPemiun = 0;


        do{
        System.out.println(" seleccione el tipo de producto del 1 al 4");
        System.out.println("1.basico");
        System.out.println("2.medio");
        System.out.println("3.premiun");
        System.out.println("4.finalizar compra");
         articulo = leer.next();

 System.out.println("ingrese el valor del producto");
        valorAticulo = leer.nextDouble();

        switch (articulo) {
            case "1":
                 System.out.println("ha elegido el articulo basico");
                 acomuladorValorArticulo += valorAticulo;
                break;

                case "2":
                 System.out.println("ha elegido el articulo medio");
                 acomuladorValorArticulo += valorAticulo;
                break;

                case "3":
                 System.out.println("ha elegido el articulo premiun");
                 acomuladorValorArticulo += valorAticulo;
                 contadorPemiun ++;
                 
                break;

        case "4":
                 System.out.println("compra finalizada");
                 categoria = false;
                break;

        }
        } while (categoria);
       
        
            if (acomuladorValorArticulo > 100000) {
                acomuladorValorArticulo = acomuladorValorArticulo- (acomuladorValorArticulo*descuento);
                System.out.println( "el valor de la cuenta co el descuento es" + acomuladorValorArticulo);

                
            }else {System.out.println("pagar el valor total"+acomuladorValorArticulo);

            }
            
        
    }
}