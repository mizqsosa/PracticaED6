package practica6;
public class Coche {
	String matricula;			
	String combustible; 
	String modelo;
	String fabricante;

	public Coche() {
		matricula = "";
		combustible = "";  
		modelo = "";
		fabricante = "";
	}
	public Coche(String m, String c, String mo, String f) {
		matricula = m;
		combustible = c;
		modelo = mo;
		fabricante = f;
	}
	public String AtributosCoche() { 
		String resultado = "";
String enunciado = "El coche con matrícula ";           
		switch (combustible)
		case "Gasolina":
			resultado += enunciado + matricula + " ";
			resultado += ConsumoCocheA("Corsa", "Opel"); 
			break;
		case "Diesel":
			resultado += enunciado + matricula + " ";
			resultado += ConsumoCocheB("Ibiza", "Seat");
			break;
		case "Híbrido":
			resultado += enunciado + matricula + " ";
			resultado += ConsumoCocheC("Getz", "Hyundai");
			break;
		default:
			resultado += enunciado + matricula + " ";
			resultado += "no dispone de información";
			break;
		}
		return resultado;
	}

	public String ConsumoCocheA(String modelo, String fabricante) 
	{
	String resultado = "";
	resultado = "El " + fabricante + modelo + " gasta 1,337 euros por 									litro";
	return resultado;
	}
	public String ConsumoCocheB(String modelo, String fabricante) 
	{
		String resultado = "";
		resultado = "El " + fabricante + modelo + " gasta 1,052 euros 										por litro";
		return resultado; 
	}
	public String ConsumoCocheC(String modelo, String fabricante) {
		String resultado = "";
		resultado = "El " + fabricante + modelo + " no necesita 											combustible";
		return resultado;
}
