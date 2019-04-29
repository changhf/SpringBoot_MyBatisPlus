package com.wstro.util;

import java.util.HashMap;
import java.util.Map;

/**
 * 返回数据
 * 
 * @author Joey
 * @Email 2434387555@qq.com
 *
 */
public class BaseResult extends HashMap<String, Object> {
	private static final long serialVersionUID = 1L;

	public BaseResult() {
		put("code", 0);
	}

	public static BaseResult error() {
		return error(500, "未知异常，请联系管理员");
	}

	public static BaseResult error(String msg) {
		return error(500, msg);
	}

	public static BaseResult error(int code, String msg) {
		BaseResult baseResult = new BaseResult();
		baseResult.put("code", code);
		baseResult.put("msg", msg);
		return baseResult;
	}

	public static BaseResult ok(String msg) {
		BaseResult baseResult = new BaseResult();
		baseResult.put("msg", msg);
		return baseResult;
	}

	public static BaseResult ok(Map<String, Object> map) {
		BaseResult baseResult = new BaseResult();
		baseResult.putAll(map);
		return baseResult;
	}

	public static BaseResult ok() {
		return new BaseResult();
	}

	public BaseResult put(String key, Object value) {
		super.put(key, value);
		return this;
	}
}
