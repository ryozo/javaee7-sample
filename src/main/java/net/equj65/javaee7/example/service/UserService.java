package net.equj65.javaee7.example.service;

import net.equj65.javaee7.example.entity.User;

import javax.ejb.Local;
import java.util.List;

/**
 * ユーザに関するサービスを提供するビジネスインタフェースです。
 * @author ryozo
 */
@Local
public interface UserService {

    /**
     * 全ユーザの一覧を取得します。
     * @return ユーザの一覧
     */
    List<User> getAllUsers();
}
