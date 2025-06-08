package com.dao;

import com.entity.GonggongchangsuoyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GonggongchangsuoyuyueVO;
import com.entity.view.GonggongchangsuoyuyueView;


/**
 * 公共场所预约
 * 
 * @author 
 * @email 
 * @date 2021-02-27 15:35:54
 */
public interface GonggongchangsuoyuyueDao extends BaseMapper<GonggongchangsuoyuyueEntity> {
	
	List<GonggongchangsuoyuyueVO> selectListVO(@Param("ew") Wrapper<GonggongchangsuoyuyueEntity> wrapper);
	
	GonggongchangsuoyuyueVO selectVO(@Param("ew") Wrapper<GonggongchangsuoyuyueEntity> wrapper);
	
	List<GonggongchangsuoyuyueView> selectListView(@Param("ew") Wrapper<GonggongchangsuoyuyueEntity> wrapper);

	List<GonggongchangsuoyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<GonggongchangsuoyuyueEntity> wrapper);
	
	GonggongchangsuoyuyueView selectView(@Param("ew") Wrapper<GonggongchangsuoyuyueEntity> wrapper);
	
}
