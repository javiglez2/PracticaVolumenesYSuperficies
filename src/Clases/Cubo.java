
public class Cubo {

	int lado;

	/****
	 * Constructor que obtiene los parametros
	 * @param lado
	 */
	
	public Cubo(int lado) {
		this.lado = lado;
	}

	public Cubo() {
		lado = 1;
	}

	/****
	 * Metodo para calcular la superficie del cubo
	 * 
	 * @return int
	 */
	
	public int superficie() {
		int superficie = (lado * lado) * 6;
		return superficie;
	}
	
	/****
	 * Metodo para calcular el volumen
	 * 
	 * @return int
	 */
	
	public int volumen() {
		int volumen = (lado * lado * lado);
		return volumen;
	}

}
