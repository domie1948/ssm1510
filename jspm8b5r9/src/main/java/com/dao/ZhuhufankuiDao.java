package com.dao;

import com.entity.ZhuhufankuiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhuhufankuiVO;
import com.entity.view.ZhuhufankuiView;


/**
 * 住户反馈
 * 
 * @author 
 * @email 
 * @date 2021-02-27 15:35:54
 */
public interface ZhuhufankuiDao extends BaseMapper<ZhuhufankuiEntity> {
	
	List<ZhuhufankuiVO> selectListVO(@Param("ew") Wrapper<ZhuhufankuiEntity> wrapper);
	
	ZhuhufankuiVO selectVO(@Param("ew") Wrapper<ZhuhufankuiEntity> wrapper);
	
	List<ZhuhufankuiView> selectListView(@Param("ew") Wrapper<ZhuhufankuiEntity> wrapper);

	List<ZhuhufankuiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhuhufankuiEntity> wrapper);
	
	ZhuhufankuiView selectView(@Param("ew") Wrapper<ZhuhufankuiEntity> wrapper);
	
}
