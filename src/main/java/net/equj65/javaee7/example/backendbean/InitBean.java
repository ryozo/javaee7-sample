package net.equj65.javaee7.example.backendbean;

import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import java.io.IOException;

/**
 * 初期画面への遷移を行うための管理Beanです。
 *
 * @author ryozo
 */
@ManagedBean
public class InitBean {

    public void init() {
        try {
            ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
            String applicationName = context.getRequestContextPath();
            context.redirect(applicationName + "/view/userList.faces");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}