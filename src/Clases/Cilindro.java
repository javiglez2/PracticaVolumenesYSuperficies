
public class Cilindro {

	int radio;
	int altura;

	public Cilindro(int radio, int altura) {
		
		this.radio = radio;
		this.altura = altura;
	}
	
	
	public Cilindro() {
		
		this.radio = 1;
		this.altura = 1;
	}
	
	/****
	 * Metodo para calcular la superficie
	 * 
	 * @return int
	 */
	
	public int superficie() {
		
		int Su = (int) (2 * 3.14) * radio * radio + (int) (2 * 3.14) * radio * altura;
		return Su;
	}
	
	/****
	 * Metodo para calcular el volumen
	 * 
	 * @return int
	 */
	
	public int volumen() {
		int Vo = (int) 3.14 * radio * radio * altura;
		return Vo;
	}
}