package login;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by gany on 2017/3/17.
 */
public class LoginAction extends ActionSupport {
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String execute() {
        if ("xingoo".equals(getUserName()) && "123".equals(getPassword())){
            ActionContext.getContext().getSession().put("user",getUserName());
            return  SUCCESS;
        }else{
            return ERROR;
        }
    }
}
