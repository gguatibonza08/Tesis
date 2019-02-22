package co.com.conociendo_santander.services;

import java.util.List;

import co.com.conociendo_santander.entities.Departamento;

/**
 * 
 * @author gian
 *
 */
public interface IDepartamentoService {

	public List<Departamento> findAll();
	
	public Departamento findById(Long id);
	
	public boolean existId(Long id);

}
