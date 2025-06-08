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


import com.dao.DiscussshequgonggongchangsuoDao;
import com.entity.DiscussshequgonggongchangsuoEntity;
import com.service.DiscussshequgonggongchangsuoService;
import com.entity.vo.DiscussshequgonggongchangsuoVO;
import com.entity.view.DiscussshequgonggongchangsuoView;

@Service("discussshequgonggongchangsuoService")
public class DiscussshequgonggongchangsuoServiceImpl extends ServiceImpl<DiscussshequgonggongchangsuoDao, DiscussshequgonggongchangsuoEntity> implements DiscussshequgonggongchangsuoService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussshequgonggongchangsuoEntity> page = this.selectPage(
                new Query<DiscussshequgonggongchangsuoEntity>(params).getPage(),
                new EntityWrapper<DiscussshequgonggongchangsuoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussshequgonggongchangsuoEntity> wrapper) {
		  Page<DiscussshequgonggongchangsuoView> page =new Query<DiscussshequgonggongchangsuoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussshequgonggongchangsuoVO> selectListVO(Wrapper<DiscussshequgonggongchangsuoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussshequgonggongchangsuoVO selectVO(Wrapper<DiscussshequgonggongchangsuoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussshequgonggongchangsuoView> selectListView(Wrapper<DiscussshequgonggongchangsuoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussshequgonggongchangsuoView selectView(Wrapper<DiscussshequgonggongchangsuoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
