package dyy.dao.devuser;


import dyy.pojo.DevUser;


public interface DevUserMapper {

//     根据DevCode获取用户记录

    public DevUser getLoginUser(String devCode);
}
