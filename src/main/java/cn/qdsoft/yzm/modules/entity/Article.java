package cn.qdsoft.yzm.modules.entity;

import cn.qdsoft.yzm.common.persistence.BaseEntity;

import java.util.Date;

public class Article extends BaseEntity{
    private Integer id;

    private Integer uId;

    private Integer cId;

    private String title;

    private Date createDate;

    private String privilege;

    private String delFlag;

    private String content;

    public Article(Integer id, Integer uId, Integer cId, String title, Date createDate, String privilege, String delFlag, String content) {
        this.id = id;
        this.uId = uId;
        this.cId = cId;
        this.title = title;
        this.createDate = createDate;
        this.privilege = privilege;
        this.delFlag = delFlag;
        this.content = content;
    }

    public Article() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getPrivilege() {
        return privilege;
    }

    public void setPrivilege(String privilege) {
        this.privilege = privilege == null ? null : privilege.trim();
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

}