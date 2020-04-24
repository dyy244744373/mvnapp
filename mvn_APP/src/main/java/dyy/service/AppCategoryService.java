package dyy.service;



import dyy.pojo.AppCategory;

import java.util.List;

public interface AppCategoryService {
    //获取状态
    List<AppCategory> stair();
//    二级菜单
    List<AppCategory> secondlevel(int parentId);
}
