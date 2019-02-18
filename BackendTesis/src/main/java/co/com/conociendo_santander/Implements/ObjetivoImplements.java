package co.com.conociendo_santander.Implements;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.conociendo_santander.dao.IObjetivoDao;
import co.com.conociendo_santander.entities.Objetivo;
import co.com.conociendo_santander.services.IObjetivoService;

@Service
public class ObjetivoImplements implements IObjetivoService {

	@Autowired
	private IObjetivoDao objetivoDao;

	@Override
	public List<Objetivo> findAll() {
		// TODO Auto-generated method stub
		return (List<Objetivo>) objetivoDao.findAll();
	}

}
