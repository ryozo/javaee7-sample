package net.equj65.javaee7.example.backendbean;

import javax.faces.bean.ManagedBean;

/**
 * ユーザ一覧画面に関するManagedBeanです。
 */
@ManagedBean
public class UserListBean {
    private String hoge;

    /**
     * 初期表示を行います。
     * @return
     */
    public String init() {
        this.hoge = "from backend bean";
        return "/view/userList?faces-redirect=true";
    }

    public String getHoge() {
        return hoge;
    }

    public void setHoge(String hoge) {
        this.hoge = hoge;
    }
}
