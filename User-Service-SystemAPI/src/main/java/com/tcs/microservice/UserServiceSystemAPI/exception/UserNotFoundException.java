package com.tcs.microservice.UserServiceSystemAPI.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.HTTP_VERSION_NOT_SUPPORTED, reason = "User not found please.")
public class UserNotFoundException extends RuntimeException {

}
