package dyy.dao.devuser;


import dyy.pojo.AppCategory;

import java.util.List;

public interface AppCategoryDao {
    List<AppCategory> stair();
    List<AppCategory> secondlevel(int parentId);
}
