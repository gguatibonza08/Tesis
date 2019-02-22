/**
 * 
 */
package co.com.conociendo_santander.Implements;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.conociendo_santander.dao.IAlojamientoDao;
import co.com.conociendo_santander.entities.Alojamiento;
import co.com.conociendo_santander.entities.Municipio;
import co.com.conociendo_santander.services.IAlojamientoService;

/**
 * @author gian
 *
 */
@Service
public class AlojamientoImplements implements IAlojamientoService {

	@Autowired
	private IAlojamientoDao alojamientoDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.com.conociendo_santander.services.IAlojamientoService#findAll()
	 */
	@Override
	public List<Alojamiento> findAll() {
		// TODO Auto-generated method stub
		return (List<Alojamiento>) alojamientoDao.findAll();
	}

	@Override
	public List<Alojamiento> findByMunicipio(Municipio municipio) {
		// TODO Auto-generated method stub
		return alojamientoDao.findByMunicipio(municipio);
	}

}
