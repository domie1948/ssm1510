package com.entity.view;

import com.entity.ShequanbaoweihuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 社区安保维护
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-27 15:35:54
 */
@TableName("shequanbaoweihu")
public class ShequanbaoweihuView  extends ShequanbaoweihuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShequanbaoweihuView(){
	}
 
 	public ShequanbaoweihuView(ShequanbaoweihuEntity shequanbaoweihuEntity){
 	try {
			BeanUtils.copyProperties(this, shequanbaoweihuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
