package com.entity.model;

import com.entity.ShequanbaoweihuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 社区安保维护
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-02-27 15:35:54
 */
public class ShequanbaoweihuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 维护类型
	 */
	
	private String weihuleixing;
		
	/**
	 * 时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shijian;
		
	/**
	 * 地点
	 */
	
	private String didian;
		
	/**
	 * 内容
	 */
	
	private String neirong;
				
	
	/**
	 * 设置：维护类型
	 */
	 
	public void setWeihuleixing(String weihuleixing) {
		this.weihuleixing = weihuleixing;
	}
	
	/**
	 * 获取：维护类型
	 */
	public String getWeihuleixing() {
		return weihuleixing;
	}
				
	
	/**
	 * 设置：时间
	 */
	 
	public void setShijian(Date shijian) {
		this.shijian = shijian;
	}
	
	/**
	 * 获取：时间
	 */
	public Date getShijian() {
		return shijian;
	}
				
	
	/**
	 * 设置：地点
	 */
	 
	public void setDidian(String didian) {
		this.didian = didian;
	}
	
	/**
	 * 获取：地点
	 */
	public String getDidian() {
		return didian;
	}
				
	
	/**
	 * 设置：内容
	 */
	 
	public void setNeirong(String neirong) {
		this.neirong = neirong;
	}
	
	/**
	 * 获取：内容
	 */
	public String getNeirong() {
		return neirong;
	}
			
}
