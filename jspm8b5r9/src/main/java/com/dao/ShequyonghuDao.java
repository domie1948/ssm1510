package com.dao;

import com.entity.ShequyonghuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShequyonghuVO;
import com.entity.view.ShequyonghuView;


/**
 * 社区用户
 * 
 * @author 
 * @email 
 * @date 2021-02-27 15:35:54
 */
public interface ShequyonghuDao extends BaseMapper<ShequyonghuEntity> {
	
	List<ShequyonghuVO> selectListVO(@Param("ew") Wrapper<ShequyonghuEntity> wrapper);
	
	ShequyonghuVO selectVO(@Param("ew") Wrapper<ShequyonghuEntity> wrapper);
	
	List<ShequyonghuView> selectListView(@Param("ew") Wrapper<ShequyonghuEntity> wrapper);

	List<ShequyonghuView> selectListView(Pagination page,@Param("ew") Wrapper<ShequyonghuEntity> wrapper);
	
	ShequyonghuView selectView(@Param("ew") Wrapper<ShequyonghuEntity> wrapper);
	
}
