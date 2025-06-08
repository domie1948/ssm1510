package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShequyonghuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShequyonghuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShequyonghuView;


/**
 * 社区用户
 *
 * @author 
 * @email 
 * @date 2021-02-27 15:35:54
 */
public interface ShequyonghuService extends IService<ShequyonghuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShequyonghuVO> selectListVO(Wrapper<ShequyonghuEntity> wrapper);
   	
   	ShequyonghuVO selectVO(@Param("ew") Wrapper<ShequyonghuEntity> wrapper);
   	
   	List<ShequyonghuView> selectListView(Wrapper<ShequyonghuEntity> wrapper);
   	
   	ShequyonghuView selectView(@Param("ew") Wrapper<ShequyonghuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShequyonghuEntity> wrapper);
   	
}

