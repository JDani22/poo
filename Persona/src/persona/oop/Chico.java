package persona.oop;

//Ejemplo de herencia
public class Chico extends Persona {
    //Superclase: la clase cuyas características se heredan se conoce como superclase 
	//(o una clase base o una clase principal).
    //Subclase: la clase que hereda la otra clase se conoce como subclase 
	//(o una clase derivada, clase extendida o clase hija). La subclase puede agregar 
	//sus propios campos y métodos además de los campos y métodos de la superclase.
    //Reutilización: la herencia respalda el concepto de “reutilización”, es decir,
	//cuando queremos crear una clase nueva y ya hay una clase que incluye parte del 
	//código que queremos, podemos derivar nuestra nueva clase de la clase existente.
	//Al hacer esto, estamos reutilizando los campos/atributos y métodos de la clase
	//existente.
	private String algo;
	public Chico() {
		super();
	}
	
	public Chico(String name, int age, String algo) {
		super(name, age);
		this.algo = algo;
		
	}
	
	//Ejemplo de polimorfismo
	public String toString() {
		return "soy un chico " + super.toString();
	};

}
