package com.wstro.util;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.authz.AuthorizationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理器
 * 
 * @author Joey
 * @Email 2434387555@qq.com
 *
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

	// public static final String DEFAULT_404_VIEW = "/pages/404";
	private Logger logger = LoggerFactory.getLogger(getClass());

	@ExceptionHandler(RRException.class)
	public BaseResult handleRRException(RRException e) {
		BaseResult baseResult = new BaseResult();
		baseResult.put("code", e.getCode());
		baseResult.put("msg", e.getMessage());
		return baseResult;
	}

	@ExceptionHandler(DuplicateKeyException.class)
	public BaseResult handleDuplicateKeyException(DuplicateKeyException e) {
		logger.error(e.getMessage(), e);
		return BaseResult.error("数据库中已存在该记录");
	}

	@ExceptionHandler(AuthorizationException.class)
	public BaseResult handleAuthorizationException(AuthorizationException e) {
		logger.error(e.getMessage(), e);
		return BaseResult.error("没有权限，请联系管理员授权");
	}

	// 添加全局异常处理流程，根据需要设置需要处理的异常
	@ExceptionHandler(Exception.class)
	@ResponseBody
	public Object MethodArgumentNotValidHandler(HttpServletRequest request, Exception exception) throws Exception {// 记录异常日志
		logger.error(exception.getMessage(), exception);
		return BaseResult.error();
	}

	// @ExceptionHandler(value = NoHandlerFoundException.class)
	// @ResponseStatus(HttpStatus.NOT_FOUND)
	// public ModelAndView defaultErrorHandler(HttpServletRequest req, Exception
	// e) throws Exception {
	// logger.info("找不到页面...");
	// ModelAndView mav = new ModelAndView();
	// mav.addObject("exception", e);
	// mav.addObject("url", req.getRequestURL());
	// mav.setViewName(DEFAULT_404_VIEW);
	// return mav;
	// }

}