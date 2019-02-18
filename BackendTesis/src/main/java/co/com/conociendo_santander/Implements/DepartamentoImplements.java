/**
 * 
 */
package co.com.conociendo_santander.Implements;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.conociendo_santander.dao.IDepartamentoDao;
import co.com.conociendo_santander.entities.Departamento;
import co.com.conociendo_santander.services.IDepartamentoService;

/**
 * @author gian
 *
 */
@Service
public class DepartamentoImplements implements IDepartamentoService {

	@Autowired
	private IDepartamentoDao departamentoDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.com.conociendo_santander.services.IDepartamentoService#findAll()
	 */
	@Override
	public List<Departamento> findAll() {
		// TODO Auto-generated method stub
		return (List<Departamento>) departamentoDao.findAll();
	}

}
