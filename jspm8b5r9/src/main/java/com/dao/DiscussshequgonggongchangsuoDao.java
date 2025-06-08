package com.dao;

import com.entity.DiscussshequgonggongchangsuoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussshequgonggongchangsuoVO;
import com.entity.view.DiscussshequgonggongchangsuoView;


/**
 * 社区公共场所评论表
 * 
 * @author 
 * @email 
 * @date 2021-02-27 15:35:54
 */
public interface DiscussshequgonggongchangsuoDao extends BaseMapper<DiscussshequgonggongchangsuoEntity> {
	
	List<DiscussshequgonggongchangsuoVO> selectListVO(@Param("ew") Wrapper<DiscussshequgonggongchangsuoEntity> wrapper);
	
	DiscussshequgonggongchangsuoVO selectVO(@Param("ew") Wrapper<DiscussshequgonggongchangsuoEntity> wrapper);
	
	List<DiscussshequgonggongchangsuoView> selectListView(@Param("ew") Wrapper<DiscussshequgonggongchangsuoEntity> wrapper);

	List<DiscussshequgonggongchangsuoView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussshequgonggongchangsuoEntity> wrapper);
	
	DiscussshequgonggongchangsuoView selectView(@Param("ew") Wrapper<DiscussshequgonggongchangsuoEntity> wrapper);
	
}
