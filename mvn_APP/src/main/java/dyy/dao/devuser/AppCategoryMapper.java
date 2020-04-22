package dyy.dao.devuser;


import dyy.pojo.AppCategory;

import java.util.List;

public interface AppCategoryMapper {
    List<AppCategory> stair();
    List<AppCategory> secondlevel(int parentId);
}
