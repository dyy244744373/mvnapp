package dyy.service;


import dyy.dao.devuser.AppCategoryMapper;
import dyy.pojo.AppCategory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
@Transactional
public class AppCategoryServiceImpl implements AppCategoryService {
    @Resource
    private AppCategoryMapper appCategoryDao;
    @Override
    @Transactional(propagation = Propagation.SUPPORTS ,readOnly = true)
    public List<AppCategory> stair() {
        return appCategoryDao.stair();
    }

    @Override
    public List<AppCategory> secondlevel(int parentId) {
        return appCategoryDao.secondlevel(parentId);
    }
}
