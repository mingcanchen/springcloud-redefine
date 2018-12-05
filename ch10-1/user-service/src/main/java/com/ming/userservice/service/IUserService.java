package com.ming.userservice.service;


import java.util.List;	

/**
 * @author chenmingcan
 */
public interface IUserService {
    String getDefaultUser();
    String getContextUserId();
    List<String> getProviderData();
}
