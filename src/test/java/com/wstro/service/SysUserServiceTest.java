package com.wstro.service;

import java.util.List;

import javax.annotation.Resource;

import com.wstro.entity.SysUserEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 系统用户测试
 * 
 * @author changhf
 * @date
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SysUserServiceTest {

	@Resource
	private SysUserService sysUserService;

	/**
	 * 查询列表
	 */
	 @Test
	public void selectList() {
		List<SysUserEntity> selectList = sysUserService.selectList(null);
		for (SysUserEntity sysUserEntity : selectList) {
			System.out.println(sysUserEntity);
		}
	}

}
