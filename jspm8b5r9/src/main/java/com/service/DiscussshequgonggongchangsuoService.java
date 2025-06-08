package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussshequgonggongchangsuoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussshequgonggongchangsuoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussshequgonggongchangsuoView;


/**
 * 社区公共场所评论表
 *
 * @author 
 * @email 
 * @date 2021-02-27 15:35:54
 */
public interface DiscussshequgonggongchangsuoService extends IService<DiscussshequgonggongchangsuoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussshequgonggongchangsuoVO> selectListVO(Wrapper<DiscussshequgonggongchangsuoEntity> wrapper);
   	
   	DiscussshequgonggongchangsuoVO selectVO(@Param("ew") Wrapper<DiscussshequgonggongchangsuoEntity> wrapper);
   	
   	List<DiscussshequgonggongchangsuoView> selectListView(Wrapper<DiscussshequgonggongchangsuoEntity> wrapper);
   	
   	DiscussshequgonggongchangsuoView selectView(@Param("ew") Wrapper<DiscussshequgonggongchangsuoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussshequgonggongchangsuoEntity> wrapper);
   	
}

