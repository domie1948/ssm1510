package com.dao;

import com.entity.DiscussshequzhengwufuwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussshequzhengwufuwuVO;
import com.entity.view.DiscussshequzhengwufuwuView;


/**
 * 社区政务服务评论表
 * 
 * @author 
 * @email 
 * @date 2021-02-27 15:35:54
 */
public interface DiscussshequzhengwufuwuDao extends BaseMapper<DiscussshequzhengwufuwuEntity> {
	
	List<DiscussshequzhengwufuwuVO> selectListVO(@Param("ew") Wrapper<DiscussshequzhengwufuwuEntity> wrapper);
	
	DiscussshequzhengwufuwuVO selectVO(@Param("ew") Wrapper<DiscussshequzhengwufuwuEntity> wrapper);
	
	List<DiscussshequzhengwufuwuView> selectListView(@Param("ew") Wrapper<DiscussshequzhengwufuwuEntity> wrapper);

	List<DiscussshequzhengwufuwuView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussshequzhengwufuwuEntity> wrapper);
	
	DiscussshequzhengwufuwuView selectView(@Param("ew") Wrapper<DiscussshequzhengwufuwuEntity> wrapper);
	
}
