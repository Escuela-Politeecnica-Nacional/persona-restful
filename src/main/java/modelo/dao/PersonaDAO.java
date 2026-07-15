package modelo.dao;

import modelo.entities.Persona;
import java.util.*;

public class PersonaDAO {

	private static List<Persona> personas;

	public PersonaDAO() {
		if (personas == null) {
			personas = new ArrayList<Persona>();
			personas.add(new Persona(1, "Jose", "1714171819", 22));
			personas.add(new Persona(2, "Maria", "1714171820", 42));
		}
	}

	public void create(Persona p) {
		personas.add(p);
	}

	public void update(Persona p) {
		for (int i = 0; i < personas.size(); i++) {

			if (personas.get(i).getId() == p.getId()) {
				personas.get(i).setNombre(p.getNombre());
				personas.get(i).setCedula(p.getCedula());
				personas.get(i).setEdad(p.getEdad());
			}

		}
	}

	public void delete(int id) {
		personas.removeIf(persona -> persona.getId() == id);
	}

	public Persona getByCedula(String c) {
		for (Persona persona : personas) {
			if (persona.getCedula().equals(c)) {
				return persona;
			}
		}
		return new Persona();
	}

	public List<Persona> getAll() {
		return personas;
	}

}
