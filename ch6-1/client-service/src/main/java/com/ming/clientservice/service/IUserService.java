package com.ming.clientservice.service;

/**
 * @author chenmingcan
 */
public interface IUserService {
    /**
     * 用户信息
     *
     * @param username 名称
     * @return
     */
    String getUser(String username) throws Exception;
}
