
public class Ejercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangulo rectangulo=new Rectangulo(5,20);
		System.out.println("El area del rectangulo es:"+rectangulo.getArea());
		System.out.println("El perimetro del rectangulo es:"+rectangulo.getPerimetro());
		
		PentagonoRegular pentagono=new PentagonoRegular(5);
		System.out.println("El perimetro del pentagono es:"+pentagono.getPerimetro());

	}

}
