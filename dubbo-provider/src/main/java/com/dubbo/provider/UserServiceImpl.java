package com.dubbo.provider;

import com.dubbo.api.UserService;

import java.util.HashMap;
import java.util.Map;

public class UserServiceImpl implements UserService {
    @Override
    public Map<String, Object> getUserInfo(int id) {
        Map<String, Object> map = new HashMap<>();
        map.put("name","张三");
        map.put("sex","男");
        map.put("id",id);
        return map;
    }
}
