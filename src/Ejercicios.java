
public class Ejercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instancia de la clase Rectangulo y asignacion de valores
		Rectangulo rectangulo=new Rectangulo(5,20);
		//Imprime el area del rectangulo
		System.out.println("El area del rectangulo es:"+rectangulo.getArea());
		//Imprime el perimetro del rectangulo
		System.out.println("El perimetro del rectangulo es:"+rectangulo.getPerimetro());
		//Instancia de la clase Pentagono y asignacion de valores
		PentagonoRegular pentagono=new PentagonoRegular(5);
		//Imprime el perimetro del pentagono
		System.out.println("El perimetro del pentagono es:"+pentagono.getPerimetro());

	}

}
