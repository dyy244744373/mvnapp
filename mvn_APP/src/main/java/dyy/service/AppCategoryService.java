package dyy.service;



import dyy.pojo.AppCategory;

import java.util.List;

public interface AppCategoryService {
    List<AppCategory> stair();
    List<AppCategory> secondlevel(int parentId);
}
