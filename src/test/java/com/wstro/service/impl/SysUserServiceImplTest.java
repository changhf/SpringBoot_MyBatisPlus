package com.wstro.service.impl;

import com.wstro.service.SysUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author changhuafeng
 * @since 2019/4/28
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SysUserServiceImplTest {
    @Autowired
    private SysUserService sysUserService;
    @Test
    public void queryAllPerms() throws Exception {
        List<String> allPerms = sysUserService.queryAllPerms(1L);
        System.out.println(allPerms);
    }

    @Test
    public void queryAllMenuId() throws Exception {
    }

    @Test
    public void queryByUserName() throws Exception {
    }

    @Test
    public void save() throws Exception {
    }

    @Test
    public void deleteBatch() throws Exception {
    }

    @Test
    public void updatePassword() throws Exception {
    }

}