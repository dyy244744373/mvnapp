package dyy.controller;


import dyy.pojo.AppCategory;
import dyy.pojo.DataDictionary;
import dyy.pojo.DevUser;
import dyy.service.AppCategoryService;
import dyy.service.AppSearch1Service;
import dyy.service.DevUserService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.annotation.Resource;
import java.util.List;


@Controller
@RequestMapping("/DevUser")
public class DevUserController {
    @Resource
    private DevUserService service;

    @RequestMapping("/login")
    public String login(ModelMap modelMap, String devCode, String devPassword) {
        DevUser devUser = service.login(devCode);
        if (devUser.getDevPassword().equals(devPassword)) {
            System.out.println(devUser);
            modelMap.addAttribute("devUser", devUser);
            return "jsp/developer/main";
        } else {
            return "jsp/devlo gin";
        }
    }

    @RequestMapping("/logout")
    public String login(ModelMap modelMap) {
        DevUser devUser = (DevUser) modelMap.get("devUser");
        modelMap.remove("delUser");
        return "jsp/index";
    }
    @Resource
    private AppSearch1Service appSearch1Service;
    @Resource
    private AppCategoryService appCategoryService;
@RequestMapping("appinfolist")
public String appinfolist(ModelMap modelMap){
    List<DataDictionary> appstatus= appSearch1Service.appStatus();
    List<DataDictionary> appflatform=appSearch1Service.appFlatform();
    List<AppCategory> appCategories=appCategoryService.stair();
    modelMap.addAttribute("statusList",appstatus);
    modelMap.addAttribute("flatFormList",appflatform);
    modelMap.addAttribute("categoryLevel1List",appCategories);
    return "jsp/developer/appinfolist";
}
    @RequestMapping("categorylevellist")
    @ResponseBody
    public List<AppCategory> categorylevellist(String pid){
        System.out.println(pid);
        List<AppCategory> secondList=appCategoryService.secondlevel(Integer.parseInt(pid));
        System.out.println(secondList.get(0));
        return secondList;
    }
}
