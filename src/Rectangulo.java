
public class Rectangulo {
	//Atributos de la clase
	int base, altura;
	
	//Se crea constructor de la clase Rectangulo
	//Se asignan los valores a base y altura
	Rectangulo(int base, int altura)
	{
		this.base=base;
		this.altura=altura;
	}
	//Retorno el valor del atributo base
	int getBase()
	{
		return base;
	}
	//Inicia metodo set base
	void setBase(int base)
	{
		this.base=base;
	}
	//Retorno valor del atributo altura
	int getAltura()
	{
		return altura;
	}
	//Inicia metodo set altura
	void setAltura(int altura)
	{
		this.altura=altura;
	}
	//metodo retorna el calculo de la area
	int getArea()
	{
		return (base * altura);
	}
	//Metodo retorna el calculo del perimetro
	int getPerimetro()
	{
		return 2*(base+altura);
	}
	

}
