package com.primtech.RegisterLogin.Service.impl;

import com.primtech.RegisterLogin.Dto.UserDTO;
import com.primtech.RegisterLogin.Dto.LoginDTO;
import com.primtech.RegisterLogin.Entity.User;
import com.primtech.RegisterLogin.Repo.UserRepo;
import com.primtech.RegisterLogin.Service.UserService;
import com.primtech.RegisterLogin.Response.LoginMesage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.Optional;

@Service
public class UserIMPL implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public String addUser(UserDTO userDTO) {

        User user =new User(
                userDTO.getUserId(),
                userDTO.getUserfname(),
                userDTO.getUserlname(),
                userDTO.getEmail(),
                userDTO.getMobilenumber(),
                userDTO.getNIC(),
                userDTO.getGender(),

                this.passwordEncoder.encode(userDTO.getPassword())
        );

        userRepo.save(user);

        return user.getUserfname();
    }

        UserDTO userDTO;

    @Override
    public String addEmployee(UserDTO employeeDTO) {
        return null;
    }

    @Override
        public LoginMesage  loginUser(LoginDTO loginDTO) {
            String msg = "";
            User user1 = userRepo.findByEmail(loginDTO.getEmail());
            if (user1 != null) {
                String password = loginDTO.getPassword();
                String encodedPassword = user1.getPassword();
                Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
                if (isPwdRight) {
                    Optional<User> user = userRepo.findOneByEmailAndPassword(loginDTO.getEmail(), encodedPassword);
                    if (user.isPresent()) {
                        return new LoginMesage("Login Success", true);
                    } else {
                        return new LoginMesage("Login Failed", false);
                    }
                } else {

                    return new LoginMesage("password Not Match", false);
                }
            }else {
                return new LoginMesage("Email not exits", false);
            }


        }

    }

