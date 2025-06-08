package com.dao;

import com.entity.ShequgonggongchangsuoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShequgonggongchangsuoVO;
import com.entity.view.ShequgonggongchangsuoView;


/**
 * 社区公共场所
 * 
 * @author 
 * @email 
 * @date 2021-02-27 15:35:54
 */
public interface ShequgonggongchangsuoDao extends BaseMapper<ShequgonggongchangsuoEntity> {
	
	List<ShequgonggongchangsuoVO> selectListVO(@Param("ew") Wrapper<ShequgonggongchangsuoEntity> wrapper);
	
	ShequgonggongchangsuoVO selectVO(@Param("ew") Wrapper<ShequgonggongchangsuoEntity> wrapper);
	
	List<ShequgonggongchangsuoView> selectListView(@Param("ew") Wrapper<ShequgonggongchangsuoEntity> wrapper);

	List<ShequgonggongchangsuoView> selectListView(Pagination page,@Param("ew") Wrapper<ShequgonggongchangsuoEntity> wrapper);
	
	ShequgonggongchangsuoView selectView(@Param("ew") Wrapper<ShequgonggongchangsuoEntity> wrapper);
	
}
