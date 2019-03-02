/**
 * 
 */
package co.com.conociendo_santander.Implements;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.conociendo_santander.dao.ILogroDao;
import co.com.conociendo_santander.entities.Logro;
import co.com.conociendo_santander.services.ILogroService;

/**
 * 
 * @author gian
 *
 */
@Service
public class LogroService implements ILogroService {

	@Autowired
	private ILogroDao logroDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.com.conociendo_santander.services.ILogroService#findAll()
	 */
	@Override
	public List<Logro> findAll() {
		// TODO Auto-generated method stub
		return (List<Logro>) logroDao.findAll();
	}

	@Override
	public Logro findById(Long id) {
		// TODO Auto-generated method stub
		return logroDao.findById(id).get();
	}

	@Override
	public boolean existId(Long id) {
		// TODO Auto-generated method stub
		return logroDao.existsById(id);
	}

}
