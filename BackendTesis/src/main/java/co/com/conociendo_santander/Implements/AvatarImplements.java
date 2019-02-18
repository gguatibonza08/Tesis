/**
 * 
 */
package co.com.conociendo_santander.Implements;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.conociendo_santander.dao.IAvatarDao;
import co.com.conociendo_santander.entities.Avatar;
import co.com.conociendo_santander.services.IAvatarService;

/**
 * @author gian
 *
 */
@Service
public class AvatarImplements implements IAvatarService {

	@Autowired
	private IAvatarDao avatarDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.com.conociendo_santander.services.IAvatarService#findAll()
	 */
	@Override
	public List<Avatar> findAll() {
		// TODO Auto-generated method stub
		return (List<Avatar>) avatarDao.findAll();
	}

}
