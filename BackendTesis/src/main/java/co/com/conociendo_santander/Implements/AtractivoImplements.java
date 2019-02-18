/**
 * 
 */
package co.com.conociendo_santander.Implements;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.conociendo_santander.dao.IAtractivoDao;
import co.com.conociendo_santander.entities.Atractivo;
import co.com.conociendo_santander.services.IAtractivoService;

/**
 * @author gian
 *
 */
@Service
public class AtractivoImplements implements IAtractivoService {

	@Autowired
	private IAtractivoDao atractivoDao;

	@Override
	public List<Atractivo> findAll() {
		// TODO Auto-generated method stub
		return (List<Atractivo>) atractivoDao.findAll();
	}

}
