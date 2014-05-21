package concesionario.aplicacion;
import concesionario.datos.Coche;
/**
 * <p>Descripción: Trabajo de práctica para entornos de desarrollo con git </p>
 * @author grupo1dam Alejandro Fernando Roberto Yaiza
 * @date 20142803
 *
 */


public class Concesionario {
	public static void main(String [] args) {
		new Concesionario();
	}
	public Concesionario() {
		Coche coche1 = new Coche ();
		coche1.setModelo("Panda");
		coche1.setMarca("Seat");
		Coche coche2 = new Coche ("Z4", "BMW");
		
		System.out.println("\nTenemos estos coches:");
		System.out.println("\nEl primer coche:");
		System.out.println("Modelo: " + coche1.getModelo());
		System.out.println("Marca: " + coche1.getMarca());
		System.out.println("\nEl segundo coche:");
		System.out.println("Modelo: " + coche2.getModelo());
		System.out.println("Marca: " + coche2.getMarca());
		
	}
}

