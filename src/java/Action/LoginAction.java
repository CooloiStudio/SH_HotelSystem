/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Action;

import com.opensymphony.xwork2.ActionSupport;
import com.orm.Staff;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author vip
 */
public class LoginAction extends ActionSupport implements ServletRequestAware{
    
    private int staff_id;
    private String password;
    private HttpServletRequest request;

    public LoginAction(int staff_id, String password, HttpServletRequest request) {
        this.staff_id = staff_id;
        this.password = password;
        this.request = request;
    }
    
    public LoginAction() {
    }
    public void validate(){
        List<Staff> list_s = null;//验证用户名是否正确
        List<Staff> list_p = null;//验证用户密码是否正确
        try{
            //加载hibernate配置文件
            Configuration configuration = new Configuration();
            Configuration config = configuration.configure("hibernate.cfg.xml");
            //建立session
            SessionFactory sessionfactory = config.buildSessionFactory();
            Session session = sessionfactory.openSession();
            //查询账号和密码
            String hql_s = "from Staff where staff_id=?";
            String hql_p = "from Staff where staff_id=? and password=?";
            //不开启事物，查询用户名和密码
            Query query_s = session.createQuery(hql_s);
            Query query_p = session.createQuery(hql_p);
            query_s.setParameter(0, staff_id);
            query_p.setParameter(0, staff_id);
            query_p.setParameter(1, password);
            //查询，将结果返回到list中
            list_s = query_s.list();
            list_p = query_p.list();
        }catch(Exception e){
            e.printStackTrace();
        }
        if(this.staff_id==0){//判断是否输入用户账号
            this.addFieldError("staff_id", "请输入用户名");
        }else if(this.password.length()==0||this.password==null){//判断是否输入用户密码
            this.addFieldError("password", "请输入密码");
        }else if(list_s.size()==0||list_s==null){//判断用户存在
            this.addFieldError("staff_id", "用户名不存在");
        }else if(list_p.size()==0||list_p==null){//判断输入密码是否正确
            this.addFieldError("password", "密码输入错误");
        }else{//通过验证，将用户信息通过session传回前台
            HttpSession httpsession = request.getSession();
            httpsession.setAttribute("staff", list_s);
        }
    }
    
    public String execute() throws Exception {
//        throw new UnsupportedOperationException("Not supported yet.");
        return "login_success";
    }

    @Override
    public void setServletRequest(HttpServletRequest request) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.request = request;
    }

    public int getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(int staff_id) {
        this.staff_id = staff_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
