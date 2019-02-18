/**
 * 
 */
package co.com.conociendo_santander.Implements;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.conociendo_santander.dao.IRutaDao;
import co.com.conociendo_santander.entities.Ruta;
import co.com.conociendo_santander.services.IRutaService;

/**
 * @author gian
 *
 */
@Service
public class RutaImplements implements IRutaService {

	@Autowired
	private IRutaDao rutaDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.com.conociendo_santander.services.IRutaService#findAll()
	 */
	@Override
	public List<Ruta> findAll() {
		// TODO Auto-generated method stub
		return (List<Ruta>) rutaDao.findAll();
	}

}
