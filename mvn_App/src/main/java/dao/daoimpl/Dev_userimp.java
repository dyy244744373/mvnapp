package dao.daoimpl;

import dao.Dev_userDao;
import pojo.Dev_user;
import until.BaseDao;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Dev_userimp extends BaseDao implements Dev_userDao {
//    登录
    @Override
    public int login(Dev_user user) {
        String sql ="select count(1) from dev_user where devCode=? and devPassword=?";
        Object[] object = {user.getDevCode(), user.getDevPassword()};
        ResultSet rs = this.search(sql, object);
        //       遍历
        try {
            rs.next();
            return rs.getInt(1);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.closeResource();
        }
        return 0;
    }
}
