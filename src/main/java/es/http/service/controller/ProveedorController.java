package es.http.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.http.service.dto.Proveedor;
import es.http.service.service.ProveedorServiceImpl;

@RestController
@RequestMapping("/api")
public class ProveedorController {
	
	@Autowired
	ProveedorServiceImpl proveedorServiceImpl;
	
	@GetMapping("/proveedors")
	public List<Proveedor> listaProveedors(){
		return proveedorServiceImpl.listarProveedors();
	}
	
	
	@PostMapping("/proveedors")
	public Proveedor salvarProveedor(@RequestBody Proveedor proveedor) {
		
		return proveedorServiceImpl.guardarProveedor(proveedor);
	}
	
	
	@GetMapping("/proveedors/{id}")
	public Proveedor proveedorXID(@PathVariable(name="id") String id) {
		
		Proveedor Proveedor_xid= new Proveedor();
		
		Proveedor_xid=proveedorServiceImpl.proveedorXID(id);
		
		//System.out.println("Proveedor XID: "+Proveedor_xid);
		
		return Proveedor_xid;
	}
	
	@PutMapping("/proveedors/{id}")
	public Proveedor actualizarProveedor(@PathVariable(name="id")String id,@RequestBody Proveedor proveedor) {
		
		Proveedor Proveedor_seleccionado= new Proveedor();
		Proveedor Proveedor_actualizado= new Proveedor();
		
		Proveedor_seleccionado= proveedorServiceImpl.proveedorXID(id);
		
		Proveedor_seleccionado.setNombre(proveedor.getNombre());
		
		Proveedor_actualizado = proveedorServiceImpl.actualizarProveedor(Proveedor_seleccionado);
		
		//System.out.println("El Proveedor actualizado es: "+ Proveedor_actualizado);
		
		return Proveedor_actualizado;
	}
	
	@DeleteMapping("/proveedors/{id}")
	public void eleiminarProveedor(@PathVariable(name="id")String id) {
		proveedorServiceImpl.eliminarProveedor(id);
	}
	
	
}
