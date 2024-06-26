package com.obredor.library.mappers.user;

import org.springframework.stereotype.Component;

import com.obredor.library.mappers.base.GenericMapper;
import com.obredor.library.models.dtos.UserDTO;
import com.obredor.library.models.entities.User;

@Component
public class UserMapper extends GenericMapper<User, UserDTO>  {

}
