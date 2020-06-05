package persona.oop;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona p1 = new Persona();
		p1.setName("pedro");
		p1.setAge(22);
		System.out.println(p1);
		
		Chico c1 = new Chico();
		c1.setName("carlo");
		c1.setAge(30);
		System.out.println(c1);
		
		Persona p2 = new Chico("pedro", 12, "algo");
		Object o1 = new Chico("Juan", 15, "algo");
		
		System.out.println(p2);
		System.out.println(o1);
		
		ArrayList<Integer> edades = new ArrayList<Integer>();
		
		edades.add(11);
		edades.add(15);
		edades.add(1);
		edades.add(68);
		
		System.out.println("El tercer elemento es: " + edades.get(3));
		System.out.println("El array tiene: " + edades.size() + " Elementos");
		edades.add(2, 4);
		
		System.out.println("El array tiene despues de agregar elemento(s): " + edades.size() + " Elementos");
		
		edades.remove(4);
		
		System.out.println("El array tiene despues de eliminar elementos(s): " + edades.size() + " Elementos");
		System.out.println("El array tiene los siguientes elementos: " + edades);
		System.out.println("El array tiene el valor 15: " + edades.indexOf(15));
		
		
		ArrayList <Object> objetos = new ArrayList<>();
		
		objetos.add(p1);
		objetos.add(p2);
		objetos.add(c1);
		
		System.out.println("El array tiene los siguientes objetos: " + objetos);
		
		ArrayList <Chico> chicos = new ArrayList<Chico>();
		chicos.add(c1);
		
		System.out.println("El array tiene los siguientes chicos: " + chicos);
		
		ArrayList <Persona> personas = new ArrayList<>();
		personas.add(p1);
		personas.add(p2);
		personas.add(c1);
		
		System.out.println("El array tiene los siguientes personas: " + personas);
		
	}

}
