/**
 * 
 */
package co.com.conociendo_santander.Implements;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.conociendo_santander.dao.ILogroObjetivo;
import co.com.conociendo_santander.entities.Logro;
import co.com.conociendo_santander.entities.LogroObjetivo;
import co.com.conociendo_santander.entities.Objetivo;
import co.com.conociendo_santander.services.ILogroObjetivoService;

/**
 * @author gian
 *
 */
@Service
public class LogroObjetivoImplements implements ILogroObjetivoService {

	@Autowired
	private ILogroObjetivo logroObjetivoDao;

	@Override
	public List<LogroObjetivo> findByLogro(Logro logro) {
		// TODO Auto-generated method stub
		return logroObjetivoDao.findByLogro(logro);
	}

	@Override
	public LogroObjetivo findByLogroAndObjetivo(Logro logro, Objetivo objetivo) {
		// TODO Auto-generated method stub
		return logroObjetivoDao.findByLogroAndObjetivo(logro, objetivo);
	}

	@Override
	public void save(LogroObjetivo logro) {
		// TODO Auto-generated method stub
		logroObjetivoDao.save(logro);

	}

}
