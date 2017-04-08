/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Action;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author vip
 */
public class TestAction {
    
    public TestAction() {
    }
    
    public String execute() throws Exception {
//        throw new UnsupportedOperationException("Not supported yet.");
        try{
            Configuration configuration = new Configuration();
            Configuration config = configuration.configure("hibernate.cfg.xml");
//            SessionFactory sessionfactory = config.buildSessionFactory();
//            Session session = sessionfactory.openSession();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Test_SUCCESS";
    }
    
}
