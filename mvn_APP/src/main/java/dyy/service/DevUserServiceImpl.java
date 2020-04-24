package dyy.service;


import dyy.dao.devuser.DevUserDao;
import dyy.pojo.DevUser;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


@Service
@Transactional
public class DevUserServiceImpl implements DevUserService {
    @Resource
    private DevUserDao devUserDao;


    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public DevUser login(String devCode) {
       return devUserDao.login(devCode);
    }
}
