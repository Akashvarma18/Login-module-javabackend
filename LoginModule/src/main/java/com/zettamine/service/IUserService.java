package com.zettamine.service;

import java.util.Map;

import com.zettamine.dto.LoginDto;
import com.zettamine.dto.UserDto;

public interface IUserService {
	
	void save(UserDto userDto);
	
	Boolean checkValidUser(String email);
	
	Map<String, String> checkValidPassword(LoginDto dto);

	Boolean updatePassword(LoginDto dto);

}
