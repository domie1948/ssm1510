package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShequgonggongchangsuoDao;
import com.entity.ShequgonggongchangsuoEntity;
import com.service.ShequgonggongchangsuoService;
import com.entity.vo.ShequgonggongchangsuoVO;
import com.entity.view.ShequgonggongchangsuoView;

@Service("shequgonggongchangsuoService")
public class ShequgonggongchangsuoServiceImpl extends ServiceImpl<ShequgonggongchangsuoDao, ShequgonggongchangsuoEntity> implements ShequgonggongchangsuoService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShequgonggongchangsuoEntity> page = this.selectPage(
                new Query<ShequgonggongchangsuoEntity>(params).getPage(),
                new EntityWrapper<ShequgonggongchangsuoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShequgonggongchangsuoEntity> wrapper) {
		  Page<ShequgonggongchangsuoView> page =new Query<ShequgonggongchangsuoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShequgonggongchangsuoVO> selectListVO(Wrapper<ShequgonggongchangsuoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShequgonggongchangsuoVO selectVO(Wrapper<ShequgonggongchangsuoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShequgonggongchangsuoView> selectListView(Wrapper<ShequgonggongchangsuoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShequgonggongchangsuoView selectView(Wrapper<ShequgonggongchangsuoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
