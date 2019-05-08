/**
 * 
 */
package co.com.conociendo_santander.Implements;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import co.com.conociendo_santander.dao.IPaisDao;
import co.com.conociendo_santander.entities.Pais;
import co.com.conociendo_santander.services.IPaisService;

/**
 * @author gian
 *
 */
public class PaisImplements implements IPaisService {

	@Autowired
	private IPaisDao paisDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.com.conociendo_santander.services.IPaisService#findAll()
	 */
	@Override
	public List<Pais> findAll() {
		// TODO Auto-generated method stub
		return (List<Pais>) paisDao.findAll();
	}

}
