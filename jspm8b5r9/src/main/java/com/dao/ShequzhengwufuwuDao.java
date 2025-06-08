package com.dao;

import com.entity.ShequzhengwufuwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShequzhengwufuwuVO;
import com.entity.view.ShequzhengwufuwuView;


/**
 * 社区政务服务
 * 
 * @author 
 * @email 
 * @date 2021-02-27 15:35:54
 */
public interface ShequzhengwufuwuDao extends BaseMapper<ShequzhengwufuwuEntity> {
	
	List<ShequzhengwufuwuVO> selectListVO(@Param("ew") Wrapper<ShequzhengwufuwuEntity> wrapper);
	
	ShequzhengwufuwuVO selectVO(@Param("ew") Wrapper<ShequzhengwufuwuEntity> wrapper);
	
	List<ShequzhengwufuwuView> selectListView(@Param("ew") Wrapper<ShequzhengwufuwuEntity> wrapper);

	List<ShequzhengwufuwuView> selectListView(Pagination page,@Param("ew") Wrapper<ShequzhengwufuwuEntity> wrapper);
	
	ShequzhengwufuwuView selectView(@Param("ew") Wrapper<ShequzhengwufuwuEntity> wrapper);
	
}
