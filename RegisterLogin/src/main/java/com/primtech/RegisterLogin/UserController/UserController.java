package com.primtech.RegisterLogin.UserController;
import com.primtech.RegisterLogin.Dto.LoginDTO;
import com.primtech.RegisterLogin.Dto.UserDTO;
import com.primtech.RegisterLogin.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.primtech.RegisterLogin.Response.LoginMesage;
import org.springframework.http.ResponseEntity;

@RestController
@CrossOrigin
@RequestMapping("api/v1/user")



public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(path="/save")
    public String saveUser(@RequestBody UserDTO userDTO)
    {
        String id= userService.addUser(userDTO);
        return id;
    }
    @PostMapping(path = "/login")
    public ResponseEntity<?> loginEmployee(@RequestBody LoginDTO loginDTO)
    {
        LoginMesage loginResponse = userService.loginUser(loginDTO);
        return ResponseEntity.ok(loginResponse);
    }

}
