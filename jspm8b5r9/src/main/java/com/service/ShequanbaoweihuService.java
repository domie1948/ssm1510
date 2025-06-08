package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShequanbaoweihuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShequanbaoweihuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShequanbaoweihuView;


/**
 * 社区安保维护
 *
 * @author 
 * @email 
 * @date 2021-02-27 15:35:54
 */
public interface ShequanbaoweihuService extends IService<ShequanbaoweihuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShequanbaoweihuVO> selectListVO(Wrapper<ShequanbaoweihuEntity> wrapper);
   	
   	ShequanbaoweihuVO selectVO(@Param("ew") Wrapper<ShequanbaoweihuEntity> wrapper);
   	
   	List<ShequanbaoweihuView> selectListView(Wrapper<ShequanbaoweihuEntity> wrapper);
   	
   	ShequanbaoweihuView selectView(@Param("ew") Wrapper<ShequanbaoweihuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShequanbaoweihuEntity> wrapper);
   	
}

