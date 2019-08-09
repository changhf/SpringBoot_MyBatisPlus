package com.wstro.controller;

import com.wstro.util.Constant;
import com.wstro.util.EhcacheUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;

/**
 * Controller公共组件
 *
 * @author changhf
 * @date
 */
abstract class AbstractController {
    protected final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 常量帮助类
     */
    @Resource
    protected Constant constant;

    @Resource
    protected EhcacheUtil ehcacheUtil;

}
