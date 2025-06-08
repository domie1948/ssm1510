package com.entity.view;

import com.entity.ShequzhengwufuwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 社区政务服务
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-27 15:35:54
 */
@TableName("shequzhengwufuwu")
public class ShequzhengwufuwuView  extends ShequzhengwufuwuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShequzhengwufuwuView(){
	}
 
 	public ShequzhengwufuwuView(ShequzhengwufuwuEntity shequzhengwufuwuEntity){
 	try {
			BeanUtils.copyProperties(this, shequzhengwufuwuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
