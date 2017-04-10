/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Action;

import com.opensymphony.xwork2.ActionSupport;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author vip
 */
public class TestAction extends ActionSupport implements ServletRequestAware {
    
    public TestAction() {
    }
    
    public String execute() throws Exception {
//        throw new UnsupportedOperationException("Not supported yet.");
        try{
            Configuration configuration = new Configuration();
            Configuration config = configuration.configure("hibernate.cfg.xml");
            SessionFactory sessionfactory = config.buildSessionFactory();
            Session session = sessionfactory.openSession();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Test_SUCCESS";
    }

    @Override
    public void setServletRequest(HttpServletRequest hsr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
