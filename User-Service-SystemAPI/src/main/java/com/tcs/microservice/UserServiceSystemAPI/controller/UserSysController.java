package com.tcs.microservice.UserServiceSystemAPI.controller;

import java.lang.reflect.InvocationTargetException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.microservice.UserServiceSystemAPI.Bean.UserBean;
import com.tcs.microservice.UserServiceSystemAPI.Bean.UserBeanOpt;
import com.tcs.microservice.UserServiceSystemAPI.Repository.UserSysRepository;
import com.tcs.microservice.UserServiceSystemAPI.exception.UserNotFoundException;

@RestController
public class UserSysController {

	@Autowired
	private UserSysRepository userRepository;

	private UserBeanOpt userBeanOpt = new UserBeanOpt();

	@GetMapping("/login/name/{name}/password/{password}")
	public UserBeanOpt validateUser(@PathVariable String name, @PathVariable String password) {

		UserBean userBean = new UserBean();
		try {
			userBean = userRepository.findByNameAndPassword(name, password);
			userBeanOpt.setFlag(
					name.equalsIgnoreCase(userBean.getName()) && password.equalsIgnoreCase(userBean.getPassword()));
		} catch (Exception e) {
			
			System.out.println("EEEERORRRRRR"+e);
			userBeanOpt.setFlag(false);

		}

		return userBeanOpt;

	}

	@PostMapping("/user-registration")
	public UserBean userRegister(@RequestBody UserBean userBean) {
		return userRepository.save(userBean);
	}

}
