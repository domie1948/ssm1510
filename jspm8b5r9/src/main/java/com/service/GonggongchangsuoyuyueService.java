package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GonggongchangsuoyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GonggongchangsuoyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GonggongchangsuoyuyueView;


/**
 * 公共场所预约
 *
 * @author 
 * @email 
 * @date 2021-02-27 15:35:54
 */
public interface GonggongchangsuoyuyueService extends IService<GonggongchangsuoyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GonggongchangsuoyuyueVO> selectListVO(Wrapper<GonggongchangsuoyuyueEntity> wrapper);
   	
   	GonggongchangsuoyuyueVO selectVO(@Param("ew") Wrapper<GonggongchangsuoyuyueEntity> wrapper);
   	
   	List<GonggongchangsuoyuyueView> selectListView(Wrapper<GonggongchangsuoyuyueEntity> wrapper);
   	
   	GonggongchangsuoyuyueView selectView(@Param("ew") Wrapper<GonggongchangsuoyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GonggongchangsuoyuyueEntity> wrapper);
   	
}

