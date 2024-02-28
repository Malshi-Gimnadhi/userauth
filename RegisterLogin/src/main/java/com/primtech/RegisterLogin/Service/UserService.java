package com.primtech.RegisterLogin.Service;

import com.primtech.RegisterLogin.Dto.UserDTO;

import com.primtech.RegisterLogin.Dto.LoginDTO;
import com.primtech.RegisterLogin.Response.LoginMesage;

//import com.primtech.RegisterLogin.payload.response.LoginMesage;
public interface UserService {
    String addUser(UserDTO userDTO);

    String addEmployee(UserDTO employeeDTO);

    LoginMesage loginUser(LoginDTO loginDTO);
    //LoginMesage loginEmployee(LoginDTO loginDTO);
}
