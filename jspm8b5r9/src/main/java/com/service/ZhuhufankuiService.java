package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhuhufankuiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhuhufankuiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhuhufankuiView;


/**
 * 住户反馈
 *
 * @author 
 * @email 
 * @date 2021-02-27 15:35:54
 */
public interface ZhuhufankuiService extends IService<ZhuhufankuiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhuhufankuiVO> selectListVO(Wrapper<ZhuhufankuiEntity> wrapper);
   	
   	ZhuhufankuiVO selectVO(@Param("ew") Wrapper<ZhuhufankuiEntity> wrapper);
   	
   	List<ZhuhufankuiView> selectListView(Wrapper<ZhuhufankuiEntity> wrapper);
   	
   	ZhuhufankuiView selectView(@Param("ew") Wrapper<ZhuhufankuiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhuhufankuiEntity> wrapper);
   	
}

