
public class Rectangulo {
	//Atributos
int base, altura;
	
	Rectangulo(int base, int altura)
	{
		this.base=base;
		this.altura=altura;
	}
	
	int getBase()
	{
		return base;
	}
	void setBase(int base)
	{
		this.base=base;
	}
	int getAltura()
	{
		return altura;
	}
	void setAltura(int altura)
	{
		this.altura=altura;
	}
	int getArea()
	{
		return (base * altura);
	}
	int getPerimetro()
	{
		return 2*(base+altura);
	}
	

}
