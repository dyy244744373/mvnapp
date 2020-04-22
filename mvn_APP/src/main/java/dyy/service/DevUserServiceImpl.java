package dyy.service;


import dyy.dao.devuser.DevUserMapper;
import dyy.pojo.DevUser;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class DevUserServiceImpl implements DevUserService {
    @Resource
    private DevUserMapper mapper;
    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public DevUser login(String devCode) {

        return mapper.getLoginUser(devCode);
    }
}
