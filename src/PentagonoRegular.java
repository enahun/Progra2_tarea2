
public class PentagonoRegular {
	
	//Atributo lado
	int lado;
	
	//Constructor de la clase
	PentagonoRegular(int lado)
	{
		this.lado=lado;
	}
	
	int getLado()
	{
		return lado;
	}
	void setLado(int lado)
	{
		this.lado=lado;
	}
	int getPerimetro()
	{
		return 5 * lado;
	}

}
