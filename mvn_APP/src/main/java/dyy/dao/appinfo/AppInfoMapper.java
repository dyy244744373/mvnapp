package dyy.dao.appinfo;

import java.util.List;

import dyy.pojo.AppInfo;
import org.apache.ibatis.annotations.Param;


public interface AppInfoMapper {


	List<AppInfo> all();
	int add(AppInfo appinfo);
	public int modify(AppInfo appInfo);
	
	public int deleteAppInfoById(@Param(value = "id") Integer delId);



}
