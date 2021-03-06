package com.wstro.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Redis读写测试(项目打包会报错java.lang.ClassNotFoundException:
 * com.jagregory.shiro.freemarker.ShiroTags)
 * 
 * @author changhf
 * @date
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisCacheTest {

	@Resource
	StringRedisTemplate stringRedisTemplate;

	@Test
	public void redisTest() throws Exception {
		// 保存字符串
		stringRedisTemplate.opsForValue().set("aaa", "111");
		// 读取字符串
		String aaa = stringRedisTemplate.opsForValue().get("aaa");
		System.out.println(aaa);
	}
}