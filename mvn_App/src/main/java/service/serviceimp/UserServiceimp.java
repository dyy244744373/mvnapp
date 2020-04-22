package service.serviceimp;

import dao.Dev_userDao;

import dao.daoimpl.Dev_userimp;

import pojo.Dev_user;

import service.UsersService;


public class UserServiceimp implements UsersService {
    private Dev_userDao dao=new Dev_userimp();

    @Override
    public int login(Dev_user dev_user) {
        return dao.login(dev_user);
    }
}
