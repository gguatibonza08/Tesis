/**
 * 
 */
package co.com.conociendo_santander.Implements;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.conociendo_santander.dao.IMunicipioDao;
import co.com.conociendo_santander.entities.Departamento;
import co.com.conociendo_santander.entities.Municipio;
import co.com.conociendo_santander.services.IMunicipioService;

/**
 * @author gian
 *
 */
@Service
public class MunicipioImplements implements IMunicipioService {

	@Autowired
	private IMunicipioDao municipioDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.com.conociendo_santander.services.IMunicipioService#findAll()
	 */
	@Override
	public List<Municipio> findAll() {
		// TODO Auto-generated method stub
		return (List<Municipio>) municipioDao.findAll();
	}

	@Override
	public boolean existId(Long id) {
		// TODO Auto-generated method stub
		return municipioDao.existsById(id);
	}

	@Override
	public Municipio findById(Long id) {
		// TODO Auto-generated method stub
		return municipioDao.findById(id).get();
	}

	@Override
	public List<Municipio> findByDepartamento(Departamento departamento) {
		// TODO Auto-generated method stub
		return municipioDao.findByDepartamento(departamento);
	}

	

}
