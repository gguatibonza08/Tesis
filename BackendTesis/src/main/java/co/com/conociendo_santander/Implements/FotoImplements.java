/**
 * 
 */
package co.com.conociendo_santander.Implements;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.conociendo_santander.dao.IFotoDao;
import co.com.conociendo_santander.entities.Foto;
import co.com.conociendo_santander.services.IFotoService;

/**
 * @author gian
 *
 */
@Service
public class FotoImplements implements IFotoService {

	@Autowired
	private IFotoDao fotoDao;
	
	/* (non-Javadoc)
	 * @see co.com.conociendo_santander.services.IFotoService#findAll()
	 */
	@Override
	public List<Foto> findAll() {
		// TODO Auto-generated method stub
		return (List<Foto>) fotoDao.findAll();
	}

}
