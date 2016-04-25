package com.briup.syfile.web.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

public class CustomerAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 跳转到首页
	 * */
	@Action(value="toIndex",results={
			@Result(name="success",location="/WEB-INF/jsp/index.jsp"),
			@Result(name="error",location="/WEB-INF/jsp/error.jsp")})
	public String toIndex(){
		
		return SUCCESS;
	}
	
	@Action(value="toLogin",results={
			@Result(name="success",location="/WEB-INF/jsp/index.jsp")})
	public String toLogin(){
		
		return SUCCESS;
	}
	
	@Action(value="toRegister",results={
			@Result(name="success",location="/WEB-INF/jsp/index.jsp")})
	public String toRegister(){
		
		return SUCCESS;
	}
}
