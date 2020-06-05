package persona.oop;

public class Persona {
	
	//Atributes: estados de la clase 

	private String name;
	private int age;
	private float weight;
	private float height;
	
	//constructor
	public Persona() {
		System.out.println("constructor");
	}
	
	public Persona(String name, int age) {
		this.name = name;
		this.age = age;
		this.height= (float) 2.3; 
	}
	
	//Methods
	
	public void run() {}
	
	public void run(String algo) {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}
	
	public String toString() {
		return "Nombre:" + this.getName() + "\n edad:" + this.getAge();
	};

}
