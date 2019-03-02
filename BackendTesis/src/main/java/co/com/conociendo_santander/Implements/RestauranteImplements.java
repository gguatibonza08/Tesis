/**
 * 
 */
package co.com.conociendo_santander.Implements;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.conociendo_santander.dao.IRestauranteDao;
import co.com.conociendo_santander.entities.Municipio;
import co.com.conociendo_santander.entities.Restaurante;
import co.com.conociendo_santander.services.IRestauranteService;

/**
 * @author gian
 *
 */
@Service
public class RestauranteImplements implements IRestauranteService {

	@Autowired
	private IRestauranteDao restauranteDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.com.conociendo_santander.services.IRestauranteService#findAll()
	 */
	@Override
	public List<Restaurante> findAll() {
		// TODO Auto-generated method stub
		return (List<Restaurante>) restauranteDao.findAll();
	}

	@Override
	public List<Restaurante> findByMunicipio(Municipio municipio) {
		// TODO Auto-generated method stub
		return restauranteDao.findByMunicipio(municipio);
	}

}
