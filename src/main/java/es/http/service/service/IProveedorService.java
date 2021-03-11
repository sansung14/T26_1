package es.http.service.service;

import java.util.List;

import es.http.service.dto.Proveedor;



public interface IProveedorService {

	//Metodos del CRUD
		public List<Proveedor> listarProveedors(); //Listar All 
		
		public Proveedor guardarProveedor(Proveedor proveedor);	//Guarda un Proveedor CREATE
		
		public Proveedor proveedorXID(String id); //Leer datos de un Proveedor READ
		
		public Proveedor actualizarProveedor(Proveedor proveedor); //Actualiza datos del Proveedor UPDATE
		
		public void eliminarProveedor(String id);// Elimina el Proveedor DELETE
	

}


