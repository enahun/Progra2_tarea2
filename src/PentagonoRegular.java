
public class PentagonoRegular {
	
	//Atributo lado
	int lado;
	
	//Constructor de la clase
	PentagonoRegular(int lado)
	{
		this.lado=lado;
	}
	//metodo get retorna el valor de lado
	int getLado()
	{
		return lado;
	}
	//Metodo set asigna valor a lado
	void setLado(int lado)
	{
		this.lado=lado;
	}
	//metodo retorna el calculo del perimetro del Pentagono
	int getPerimetro()
	{
		return 5 * lado;
	}

}
