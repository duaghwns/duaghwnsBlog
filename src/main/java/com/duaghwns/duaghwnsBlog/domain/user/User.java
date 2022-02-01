package com.duaghwns.duaghwnsBlog.domain.user;

import javax.persistence.*;
import java.util.Date;

@Entity
public class User {
    @Id @Column(name = "USR_SEQ")
    private int user_seq;

    @Column(name = "ID",length = 15)
    private String userid;

    @Column(name = "NM",length = 15)
    private String usernm;

    @Column(name = "PW",length = 20)
    private String userpw;

    @Column(name = "NICK",length = 10)
    private String usernick;

    @Column(name = "BIRTH")
    @Temporal(TemporalType.DATE)
    private Date birth;
}
