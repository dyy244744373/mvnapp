package dyy.pojo;
import lombok.Data;

@Data
public class AppInfo {
    private int id;//主键id
    private String softwareName; // 软件名称
    private String APKName;// APK名称（唯一）
    private String supportROM;// 支持ROM
    private String interfaceLanguage;//界面语言
    private String softwareSize;//软件大小（单位：M）
    private String updateDate;//更新日期,
    private int devId;//'开发者id（来源于：dev_user表的开发者id）',
    private String appInfo;//'应用简介',
    private int status;//'状态（来源于：data_dictionary，1 待审核 2 审核通过 3 审核不通过 4 已上架 5 已下架）',
    private String onSaleDate;//'上架时间',
    private String offSaleDate;// '下架时间',
    private int flatformId;// '所属平台（来源于：data_dictionary，1 手机 2 平板 3 通用）',
    private int categoryLevel3;// '所属三级分类（来源于：data_dictionary）',
    private int downloads;// '下载量（单位：次）',
    private int createdBy;//'创建者（来源于dev_user开发者信息表的用户id）',
    private String creationDate;// '创建时间',
    private int modifyBy;// '更新者（来源于dev_user开发者信息表的用户id）',
    private String modifyDate;// '最新更新时间',
    private int categoryLevel1;// '所属一级分类（来源于：data_dictionary）',
    private int categoryLevel2;// '所属二级分类（来源于：data_dictionary）',
    private String logoPicPath;// 'LOGO图片url路径',
    private String logoLocPath;// 'LOGO图片的服务器存储路径',
    private int versionId;//'最新的版本id',


}
