package net.equj65.javaee7.example.backendbean;

import lombok.Getter;
import net.equj65.javaee7.example.entity.User;
import net.equj65.javaee7.example.service.UserService;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import java.util.List;

/**
 * ユーザ一覧画面に関するManagedBeanです。
 */
@ManagedBean
public class UserListBean {
    /** ユーザ情報一覧 */
    @Getter
    private List<User> userList;

    /** ユーザ情報を提供するEJB */
    @EJB
    private UserService userService;

    /**
     * 初期表示を行います。
     * @return
     */
    public String init() {
        userList = userService.getAllUsers();
        return "/view/userList?faces-redirect=true";
    }

}
