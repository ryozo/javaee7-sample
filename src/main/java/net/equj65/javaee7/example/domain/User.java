package net.equj65.javaee7.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 当システムで取り扱うユーザ情報を表すエンティティです。
 */
@AllArgsConstructor
@Data
public class User implements Serializable {
    private String id;
    private String name;
    private Integer age;
    private String mail;
    private String address;
}
