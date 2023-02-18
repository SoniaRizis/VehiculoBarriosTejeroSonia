
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoBarriosTejeroSonia2223 miVehiculoBarriosTejeroSonia2223;
        int stockActual;
        
        miVehiculoBarriosTejeroSonia2223 = new VehiculoBarriosTejeroSonia2223("Seat",18000,100);
        operativaVehiculoBarriosTejeroSonia2223(miVehiculoBarriosTejeroSonia2223, 50); 
        stockActual = miVehiculoBarriosTejeroSonia2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

    public static void operativaVehiculoBarriosTejeroSonia2223(VehiculoBarriosTejeroSonia2223 miVehiculoBarriosTejeroSonia2223, java.lang.Integer cantidad) {
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoBarriosTejeroSonia2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoBarriosTejeroSonia2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
    }

}
    
