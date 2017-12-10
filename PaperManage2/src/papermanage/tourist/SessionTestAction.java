package papermanage.tourist;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class SessionTestAction extends ActionSupport implements SessionAware {

    private Map<String,Object> session;

    public void setSession(Map<String,Object> session) {

    this.session = session;

    }

    public String execute() {

    String a="1";
    a=a+a;
    this.session.put("USER_NAME", "Test User 1");

    return "userSuccess";

    }

}
