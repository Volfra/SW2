package co.edu.poli.wsoto.modelo;

/**
 * 
 */
public class Cliente {

	/**
	 * 
	 */
	private String id;
	private String nombres;
	
	public Cliente(String id, String nombres) {
		super();
		this.id = id;
		this.nombres = nombres;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombres=" + nombres + "]";
	}
	
}
