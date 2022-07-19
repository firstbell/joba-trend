package com.plus1250.jobaTrend.service;

import com.plus1250.jobaTrend.model.dto.UserDTO;

public interface UserService {
    boolean emailCheckNickname(String email, String nickName);
    UserDTO getInfo(String email);
    void insertUser(UserDTO userDTO);
    // 닉네임 변경
    void updateUserNickname(UserDTO userDTO) throws Exception;
    // 비밀번호 변경
    void updateUserPassword(UserDTO userDTO) throws Exception;
    // 회원 탈퇴
    void deleteUser(String password, String email) throws Exception;
}
