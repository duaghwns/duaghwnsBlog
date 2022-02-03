package com.duaghwns.duaghwnsBlog.web.dto.user;

import com.duaghwns.duaghwnsBlog.domain.user.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserSaveRequestDto {
    private String name;
    private String nick;
    private String pw;

    @Builder
    public UserSaveRequestDto(String name, String nick, String pw){
        this.name = name;
        this.nick = nick;
        this.pw = pw;
    }

    public User toEntity(){
        return User.builder()
                .name(name)
                .nick(nick)
                .build();
    }
}
