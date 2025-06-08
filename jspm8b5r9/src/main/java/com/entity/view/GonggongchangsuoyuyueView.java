package com.entity.view;

import com.entity.GonggongchangsuoyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 公共场所预约
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-27 15:35:54
 */
@TableName("gonggongchangsuoyuyue")
public class GonggongchangsuoyuyueView  extends GonggongchangsuoyuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GonggongchangsuoyuyueView(){
	}
 
 	public GonggongchangsuoyuyueView(GonggongchangsuoyuyueEntity gonggongchangsuoyuyueEntity){
 	try {
			BeanUtils.copyProperties(this, gonggongchangsuoyuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
