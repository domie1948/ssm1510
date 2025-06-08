package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShequgonggongchangsuoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShequgonggongchangsuoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShequgonggongchangsuoView;


/**
 * 社区公共场所
 *
 * @author 
 * @email 
 * @date 2021-02-27 15:35:54
 */
public interface ShequgonggongchangsuoService extends IService<ShequgonggongchangsuoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShequgonggongchangsuoVO> selectListVO(Wrapper<ShequgonggongchangsuoEntity> wrapper);
   	
   	ShequgonggongchangsuoVO selectVO(@Param("ew") Wrapper<ShequgonggongchangsuoEntity> wrapper);
   	
   	List<ShequgonggongchangsuoView> selectListView(Wrapper<ShequgonggongchangsuoEntity> wrapper);
   	
   	ShequgonggongchangsuoView selectView(@Param("ew") Wrapper<ShequgonggongchangsuoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShequgonggongchangsuoEntity> wrapper);
   	
}

