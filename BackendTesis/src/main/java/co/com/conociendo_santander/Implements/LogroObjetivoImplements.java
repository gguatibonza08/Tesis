/**
 * 
 */
package co.com.conociendo_santander.Implements;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.conociendo_santander.dao.ILogroObjetivo;
import co.com.conociendo_santander.entities.LogroObjetivo;
import co.com.conociendo_santander.services.ILogroObjetivoService;

/**
 * @author gian
 *
 */
@Service
public class LogroObjetivoImplements implements ILogroObjetivoService {

	@Autowired
	private ILogroObjetivo logroObjetivoDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.com.conociendo_santander.services.ILogroObjetivoService#findAll()
	 */
	@Override
	public List<LogroObjetivo> findAll() {
		// TODO Auto-generated method stub
		return (List<LogroObjetivo>) logroObjetivoDao.findAll();
	}

}
