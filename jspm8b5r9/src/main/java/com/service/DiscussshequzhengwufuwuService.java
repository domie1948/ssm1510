package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussshequzhengwufuwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussshequzhengwufuwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussshequzhengwufuwuView;


/**
 * 社区政务服务评论表
 *
 * @author 
 * @email 
 * @date 2021-02-27 15:35:54
 */
public interface DiscussshequzhengwufuwuService extends IService<DiscussshequzhengwufuwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussshequzhengwufuwuVO> selectListVO(Wrapper<DiscussshequzhengwufuwuEntity> wrapper);
   	
   	DiscussshequzhengwufuwuVO selectVO(@Param("ew") Wrapper<DiscussshequzhengwufuwuEntity> wrapper);
   	
   	List<DiscussshequzhengwufuwuView> selectListView(Wrapper<DiscussshequzhengwufuwuEntity> wrapper);
   	
   	DiscussshequzhengwufuwuView selectView(@Param("ew") Wrapper<DiscussshequzhengwufuwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussshequzhengwufuwuEntity> wrapper);
   	
}

