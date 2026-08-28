import java.util.Scanner;

public class CajaRegistradora {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

         String articulo;
        double valorAticulo  ;
        boolean categoria = true;
        double acomuladorTotalArticulo  = 0.0;
        double descuento= 0.10;
        double IMPUESTO_IVA = 0.10;
        int contadorPremiun = 0;
       int contadorAticulo = 0;


        do{ System.out.println("ingrese el valor del producto");
        valorAticulo = leer.nextDouble();

System.out.println(" seleccione el tipo de producto del 1 al 4");
        System.out.println("1.basico");
        System.out.println("2.medio");
        System.out.println("3.premiun");
        System.out.println("4.finalizar compra");
         articulo = leer.next();

     
        switch (articulo) {
            case "1":
                 System.out.println("ha elegido el articulo basico");
                 acomuladorTotalArticulo  += valorAticulo;
                 contadorAticulo++;
                break;

                case "2":
                 System.out.println("ha elegido el articulo medio");
                 acomuladorTotalArticulo  += valorAticulo;
                 contadorAticulo++;
                break;

                case "3":
                 System.out.println("ha elegido el articulo premiun");
                 acomuladorTotalArticulo += valorAticulo;
                 contadorPremiun ++; contadorAticulo++;
                 
                break;

                case "4":
                 System.out.println("compra finalizada");
                 categoria = false;
                break;

                default:
                    System.out.println("Opción invalidad");
                    break;
        }
        } while (categoria);
       
        
            if (acomuladorTotalArticulo > 100000) {
                acomuladorTotalArticulo = acomuladorTotalArticulo- (acomuladorTotalArticulo*descuento);
                System.out.println("aplica para descuento");
                
            }else {System.out.println("pagar el valor total"+acomuladorTotalArticulo);

            }
             double impuestoIva, totalFinal, porcentajePremiun;;
             
             impuestoIva = acomuladorTotalArticulo*IMPUESTO_IVA; 
             System.out.println("el valor del impueto del IVA es:"+impuestoIva);
             totalFinal =  acomuladorTotalArticulo + impuestoIva;
             System.out.println("el valor final:"+totalFinal);
             porcentajePremiun = (contadorPremiun*100.0) / contadorAticulo;
             System.out.println("el porcentaje de productos premiun:"+porcentajePremiun);



        
    }
}