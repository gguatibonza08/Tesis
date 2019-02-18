/**
 * 
 */
package co.com.conociendo_santander.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.conociendo_santander.entities.Avatar;
import co.com.conociendo_santander.services.IAvatarService;

/**
 * @author gian
 *
 */
@RestController
@RequestMapping(value = "/avatares")
public class AvatarController {

	@Autowired
	private IAvatarService avatarService;

	@GetMapping(value = "/listar")
	public List<Avatar> listar() {
		return avatarService.findAll();
	}

}
