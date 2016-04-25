package com.briup.syfile.web.action.manager;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.InterceptorRefs;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

@InterceptorRefs(value={@InterceptorRef("myStack")})
public class ManagerAction extends ActionSupport {
	private String name;
	private double price;
	//--------------------
	private File img;
	private String imgFileName;//文件名
	
	private static final long serialVersionUID = 1L;
	
	@Action(value="toIndex",results={@Result(name="success",location="/WEB-INF/jsp/manager/index.jsp")})
	public String toIndex(){
		System.out.println("toIndex");
		return SUCCESS;
	}
	
	@Action(value="toAddProduct",results=
		{@Result(name="success",location="/WEB-INF/jsp/manager/addProduct.jsp")})
	public String toAddProduct(){
		
		return SUCCESS;
	}
	
	@Action(value="addProduct",results=
		{@Result(name="success",location="/WEB-INF/jsp/manager/addProduct.jsp")})
	public String addProduct(){
		String path = ServletActionContext.getServletContext().getRealPath("/upload");
		File file = new File(path,imgFileName);
		try {
			if(!file.exists()){
				file.createNewFile();
				FileUtils.copyFile(img, file);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return SUCCESS;
	}
	
	@Action(value="toFileManager",results={@Result(name="success",location="/WEB-INF/jsp/manager/index.jsp")})
	public String toFileManager(){
		System.out.println("toFileManager");
		return SUCCESS;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public File getImg() {
		return img;
	}

	public void setImg(File img) {
		this.img = img;
	}

	public String getImgFileName() {
		return imgFileName;
	}

	public void setImgFileName(String imgFileName) {
		this.imgFileName = imgFileName;
	}
}
