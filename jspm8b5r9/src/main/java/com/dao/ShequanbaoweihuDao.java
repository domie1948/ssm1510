package com.dao;

import com.entity.ShequanbaoweihuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShequanbaoweihuVO;
import com.entity.view.ShequanbaoweihuView;


/**
 * 社区安保维护
 * 
 * @author 
 * @email 
 * @date 2021-02-27 15:35:54
 */
public interface ShequanbaoweihuDao extends BaseMapper<ShequanbaoweihuEntity> {
	
	List<ShequanbaoweihuVO> selectListVO(@Param("ew") Wrapper<ShequanbaoweihuEntity> wrapper);
	
	ShequanbaoweihuVO selectVO(@Param("ew") Wrapper<ShequanbaoweihuEntity> wrapper);
	
	List<ShequanbaoweihuView> selectListView(@Param("ew") Wrapper<ShequanbaoweihuEntity> wrapper);

	List<ShequanbaoweihuView> selectListView(Pagination page,@Param("ew") Wrapper<ShequanbaoweihuEntity> wrapper);
	
	ShequanbaoweihuView selectView(@Param("ew") Wrapper<ShequanbaoweihuEntity> wrapper);
	
}
