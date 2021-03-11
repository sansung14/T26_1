package es.http.service.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "suministra") // en caso que la tabala sea diferente
public class Suministra {

	// Atributos de entidad registro_curso
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	private int id;
	@ManyToOne
	@JoinColumn(name = "codigopieza")
	Pieza codigopieza;

	@ManyToOne
	@JoinColumn(name = "idproveedor")
	Proveedor idproveedor;

	@Column(name = "precio") // no hace falta si se llama igual
	private int precio;

	// Constructores

	public Suministra() {

	}

	public Suministra(int id, Pieza codigopieza, Proveedor idproveedor, int precio) {
		super();
		this.id = id;
		this.codigopieza = codigopieza;
		this.idproveedor = idproveedor;
		this.precio = precio;
	}

	// Getters y Setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Pieza getCodigopieza() {
		return codigopieza;
	}

	public void setCodigopieza(Pieza codigopieza) {
		this.codigopieza = codigopieza;
	}

	public Proveedor getIdproveedor() {
		return idproveedor;
	}

	public void setIdproveedor(Proveedor idproveedor) {
		this.idproveedor = idproveedor;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

}
