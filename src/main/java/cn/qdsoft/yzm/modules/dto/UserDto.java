package cn.qdsoft.yzm.modules.dto;

import cn.qdsoft.yzm.common.persistence.BaseEntity;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by Administrator on 2016/10/19.
 */
public class UserDto extends BaseEntity {
    @NotEmpty
    private String loginName;
    @NotEmpty
    private String password;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
