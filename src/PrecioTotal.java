public class PrecioTotal {
    private double totalCalfe  = 0.0;
    private double totalCafeExportacion = 0.0 ;
    private double totalCafeNacional=0.0;
    private Cafe[] listaCafe;


    PrecioTotal(Cafe []  pelectrodomesticos){
        this.listaCafe=pelectrodomesticos;

    }
public void mostrarTotales(){
for (int i = 0;i < listaCafe.length; i++){

    if (listaCafe [i] instanceof Cafe ){
        totalCalfe += listaCafe[i].calcularPrecio();
    }
    if (listaCafe[i] instanceof CafeNacional){
        totalCafeNacional += listaCafe[i].calcularPrecio();
    }
    if (listaCafe[i]instanceof CafeExportacion){
        totalCafeExportacion += listaCafe[i].calcularPrecio();
    }
}

System.out.println("La suma del precio del café es de " +totalCalfe );
 System.out.println("La suma del precio del café tipo nacional es de " + totalCafeNacional);
 System.out.print("La suma del precio del café tipo exportación es de " + totalCafeExportacion);
 

}
}
