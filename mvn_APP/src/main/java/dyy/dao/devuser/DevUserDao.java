package dyy.dao.devuser;


import dyy.pojo.DevUser;


public interface DevUserDao {

//     根据DevCode获取用户记录

    public DevUser login(String devCode);
}
