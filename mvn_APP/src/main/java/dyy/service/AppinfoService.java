package dyy.service;

import dyy.pojo.AppInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AppinfoService {
    List<AppInfo> all();
    int add(AppInfo appinfo);
    public int modify(AppInfo appInfo);

    public int deleteAppInfoById(@Param(value = "id") Integer delId);

}
