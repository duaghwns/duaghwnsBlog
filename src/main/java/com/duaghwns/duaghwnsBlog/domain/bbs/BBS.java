package com.duaghwns.duaghwnsBlog.domain.bbs;

import javax.persistence.*;
import java.util.Date;

@Entity
public class BBS {
    @Id
    private int bbs_seq;
    @Column(name = "TITLE", length = 30)
    private String title;

    @Column(name = "CONTENT")
    @Lob
    private String content;
    @Column(name = "AUTHOR", length = 15)
    private String author;
    @Column(name = "REG_DTE")
    @Temporal(TemporalType.DATE)
    private Date regdate;
    @Column(name = "UPT_DTE")
    @Temporal(TemporalType.DATE)
    private Date moddate;


}
