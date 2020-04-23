package dyy.service;


import dyy.dao.appinfo.AppInfoMapper;
import dyy.pojo.AppInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
@Service
public class AppinfoServiceImpl implements AppinfoService {
   @Resource
   private AppInfoMapper mapper;


    @Override
    @Transactional(propagation = Propagation.SUPPORTS ,readOnly = true)
    public List<AppInfo> all() {
        return mapper.all();
    }

    @Override
    public int add(AppInfo appinfo) {
        return mapper.add(appinfo);
    }

    @Override
    public int modify(AppInfo appInfo) {
        return 0;
    }

    @Override
    public int deleteAppInfoById(Integer delId) {
        return 0;
    }
}
