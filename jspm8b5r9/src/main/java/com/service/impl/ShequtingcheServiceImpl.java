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


import com.dao.ShequtingcheDao;
import com.entity.ShequtingcheEntity;
import com.service.ShequtingcheService;
import com.entity.vo.ShequtingcheVO;
import com.entity.view.ShequtingcheView;

@Service("shequtingcheService")
public class ShequtingcheServiceImpl extends ServiceImpl<ShequtingcheDao, ShequtingcheEntity> implements ShequtingcheService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShequtingcheEntity> page = this.selectPage(
                new Query<ShequtingcheEntity>(params).getPage(),
                new EntityWrapper<ShequtingcheEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShequtingcheEntity> wrapper) {
		  Page<ShequtingcheView> page =new Query<ShequtingcheView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShequtingcheVO> selectListVO(Wrapper<ShequtingcheEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShequtingcheVO selectVO(Wrapper<ShequtingcheEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShequtingcheView> selectListView(Wrapper<ShequtingcheEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShequtingcheView selectView(Wrapper<ShequtingcheEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
