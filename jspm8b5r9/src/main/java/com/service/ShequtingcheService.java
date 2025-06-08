package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShequtingcheEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShequtingcheVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShequtingcheView;


/**
 * 社区停车
 *
 * @author 
 * @email 
 * @date 2021-02-27 15:35:54
 */
public interface ShequtingcheService extends IService<ShequtingcheEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShequtingcheVO> selectListVO(Wrapper<ShequtingcheEntity> wrapper);
   	
   	ShequtingcheVO selectVO(@Param("ew") Wrapper<ShequtingcheEntity> wrapper);
   	
   	List<ShequtingcheView> selectListView(Wrapper<ShequtingcheEntity> wrapper);
   	
   	ShequtingcheView selectView(@Param("ew") Wrapper<ShequtingcheEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShequtingcheEntity> wrapper);
   	
}

