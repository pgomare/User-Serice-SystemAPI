package com.tcs.microservice.UserServiceSystemAPI.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.microservice.UserServiceSystemAPI.Bean.UserBean;

public interface UserSysRepository extends JpaRepository<UserBean, Long> {

	UserBean findByNameAndPassword(String name, String password);
}
