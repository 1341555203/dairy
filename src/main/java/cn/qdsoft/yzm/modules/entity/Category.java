package cn.qdsoft.yzm.modules.entity;

import cn.qdsoft.yzm.common.persistence.BaseEntity;

public class Category extends BaseEntity{
    private Integer id;

    private String cName;

    private String cDescription;

    private String delFlag;

    public Category(Integer id, String cName, String cDescription, String delFlag) {
        this.id = id;
        this.cName = cName;
        this.cDescription = cDescription;
        this.delFlag = delFlag;
    }

    public Category() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public String getcDescription() {
        return cDescription;
    }

    public void setcDescription(String cDescription) {
        this.cDescription = cDescription == null ? null : cDescription.trim();
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }

}