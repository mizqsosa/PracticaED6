package practica6;

	/**
	 * Clase Moto
	 * Tiene informaci�n de cada moto (matr�cula, cilindrada)
	 * Contiene los getter y setters
	 * @author Manuel Izquierdo Sosa
	 * @version 1.1
	 */
public class Moto {
	/**
	 * matr�cula de la moto
	 */
	String matricula;
	/**
	 * cilindrada de la moto
	 */
	int cilindrada;

	/**
	 * Constructor por defecto
	 */
	public Moto() {
		matricula = "";
		cilindrada = 0;
	}

	/**
	 * Constructor con 2 par�metros
	 * @parametro m //matr�cula de la moto
	 * @parametro c //cilindrada de la moto
	 */
	public Moto(String m, int c) {
		matricula = m;
		cilindrada = c;
	}

	/**
	 * @return matricula
	 */
	public String getMatricula() {
		return matricula;
	}
	/**
	 * @return cilindrada
	 */
	public int getCilindrada() {
		return cilindrada;
	}
	/**
	 * @parametro m //Cambia la matricula
	 */
	public void setMatricula(String m) {
		matricula = m;
	}

	/**
	 * @parametro c //Cambia la cilindrada
	 */
	public void setCilindrada(int c) {
		cilindrada = c;
	}
}
