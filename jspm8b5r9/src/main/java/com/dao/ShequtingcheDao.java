package com.dao;

import com.entity.ShequtingcheEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShequtingcheVO;
import com.entity.view.ShequtingcheView;


/**
 * 社区停车
 * 
 * @author 
 * @email 
 * @date 2021-02-27 15:35:54
 */
public interface ShequtingcheDao extends BaseMapper<ShequtingcheEntity> {
	
	List<ShequtingcheVO> selectListVO(@Param("ew") Wrapper<ShequtingcheEntity> wrapper);
	
	ShequtingcheVO selectVO(@Param("ew") Wrapper<ShequtingcheEntity> wrapper);
	
	List<ShequtingcheView> selectListView(@Param("ew") Wrapper<ShequtingcheEntity> wrapper);

	List<ShequtingcheView> selectListView(Pagination page,@Param("ew") Wrapper<ShequtingcheEntity> wrapper);
	
	ShequtingcheView selectView(@Param("ew") Wrapper<ShequtingcheEntity> wrapper);
	
}
