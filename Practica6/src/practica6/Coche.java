package practica6;

	/**
	 * Clase Coche
	 * Tiene información de todos los coches (matrícula, combustible, modelo y fabricante)
	 * También contiene los métodos AtributosCoche, ConsumoCocheA, ConsumoCocheB y ConsumoCocheC
	 * @author Manuel Izquierdo Sosa
	 * @version 1.1
	 */
public class Coche {
	/**
	 * Matrícula del coche
	 */
	String matricula;
	/**
	 * Combustible del coche 
	*/
	String combustible;
	/** 
	 * Modelo del coche 
	*/
	String modelo;
	/**
	 * Fabricante del coche
	 */
	String fabricante;

	/**
	 * Constructor
	 */
	public Coche() {
		matricula = "";
		combustible = "";
		modelo = "";
		fabricante = "";
	}

	/**
	 * Constructor 4 parámetros
	 * @parametro m //matricula del coche
	 * @parametro c //combustible que usa el coche
	 * @parametro mo //modelo del coche
	 * @parametro f //fabricante del coche
	 */
	public Coche(String m, String c, String mo, String f) {
		matricula = m;
		combustible = c;
		modelo = mo;
		fabricante = f;
	}
	/**
	 * Método AtributosCoche
	 * Muestra los atributos de los coches
	 */
	public String AtributosCoche() {
		String resultado = "";
		String texto = "El coche con matricula ";
		switch (combustible) {
		case "Gasolina": 
			resultado += texto + matricula + " ";
			resultado += ConsumoCocheA("Corsa", "Opel");
			break;
		case "Diesel":
			resultado += texto + matricula + " ";
			resultado += ConsumoCocheB("Ibiza", "Seat");
			break;
		case "Híbrido":
			resultado += texto + matricula + " ";
			resultado += ConsumoCocheC("Getz", "Hyundai");
			break;
		default:
			resultado += texto + matricula + " ";
			resultado += "no dispone de información";
			break;
		}
		return resultado;
	}
	/**
	 * Método ConsumoCocheA
	 * Muestra modelo, fabricante y lo que gasta
	 * @parametro modelo //modelo del coche
	 * @parametro fabricante //fabricante del coche
	 */
	public String ConsumoCocheA(String modelo, String fabricante) {
		String resultado = "";
		resultado = "es un " + fabricante + modelo + " y gasta 1,337 euros por litro";
		return resultado;	
	}
	/**
	 * Método ConsumoCocheB
	 * Muestra modelo, fabricante y lo que gasta
	 * @parametro modelo //modelo del coche
	 * @parametro fabricante //fabricante del coche
	 */
	public String ConsumoCocheB(String modelo, String fabricante) {
		String resultado = "";
		resultado = "es un " + fabricante + modelo + " y gasta 1,052 euros por litro";
		return resultado; 
	}
	/**
	 * Método ConsumoCocheA
	 * Muestra modelo, fabricante y lo que gasta
	 * @parametro modelo //modelo del coche
	 * @parametro fabricante //fabricante del coche
	 */
	public String ConsumoCocheC(String modelo, String fabricante) {
		String resultado = "";
		resultado = "es un " + fabricante + modelo + " y no necesita combustible";
		return resultado;
	}
}
