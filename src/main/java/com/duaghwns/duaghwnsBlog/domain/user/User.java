package com.duaghwns.duaghwnsBlog.domain.user;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.web.servlet.handler.UserRoleAuthorizationInterceptor;

import javax.persistence.*;
import java.util.Date;

@Entity @Getter
@NoArgsConstructor
public class User {
    @Id @Column(name = "USR_SEQ")
    private int user_seq;

    @Column(name = "ID",length = 15)
    private String userid;

    @Column(name = "NM",length = 15)
    private String userNm;

    @Column(name = "PW",length = 20)
    private String userPw;

    @Column(name = "NICK",length = 10)
    private String userNick;

    @Column(name = "BIRTH")
    @Temporal(TemporalType.DATE)
    private Date birth;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    public User nickUpdate(String name, String nick){
        this.userNm = name;
        this.userNick = nick;
        return this;
    }

    @Builder
    public User(String name, String nick, Role role){
        this.userNm = name;
        this.userNick = nick;
        this.role = role;
    }

    public String getRoleKey() {
        return this.role.getKey();
    }
}
