
public class Ejercicio1 {
	
	public static char generaLetras(){
		
		return (char)(Math.random()*26 + 'a');
		
		}
		public static void main(String[] args) {
			char a;
			
			a= generaLetras();
			
		System.out.println("El valor de a es "+ a);
		System.out.println(generaLetras());
		System.out.println(generaLetras());
		System.out.println(generaLetras());
		
		}
}
