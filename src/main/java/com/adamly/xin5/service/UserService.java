package com.adamly.xin5.service;

import com.adamly.xin5.error.BusinessException;
import com.adamly.xin5.service.model.UserModel;

public interface UserService {
    UserModel getUserById(Integer id);
    void register(UserModel userModel) throws BusinessException;
//    void login(String telphone,String encrptPassword) throws BusinessException;
    UserModel login(String telphone,String encrptPassword) throws BusinessException;
}
