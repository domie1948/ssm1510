package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShequzhengwufuwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShequzhengwufuwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShequzhengwufuwuView;


/**
 * 社区政务服务
 *
 * @author 
 * @email 
 * @date 2021-02-27 15:35:54
 */
public interface ShequzhengwufuwuService extends IService<ShequzhengwufuwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShequzhengwufuwuVO> selectListVO(Wrapper<ShequzhengwufuwuEntity> wrapper);
   	
   	ShequzhengwufuwuVO selectVO(@Param("ew") Wrapper<ShequzhengwufuwuEntity> wrapper);
   	
   	List<ShequzhengwufuwuView> selectListView(Wrapper<ShequzhengwufuwuEntity> wrapper);
   	
   	ShequzhengwufuwuView selectView(@Param("ew") Wrapper<ShequzhengwufuwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShequzhengwufuwuEntity> wrapper);
   	
}

