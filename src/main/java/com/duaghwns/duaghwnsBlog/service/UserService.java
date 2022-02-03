package com.duaghwns.duaghwnsBlog.service;

import com.duaghwns.duaghwnsBlog.domain.user.UserRepository;
import com.duaghwns.duaghwnsBlog.web.dto.user.UserSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    @Transactional
    public Long save(UserSaveRequestDto requestDto){
        return userRepository.save(requestDto.toEntity()).getUserid();
    }
}