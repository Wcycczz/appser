package com.ruiliang.appser.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruiliang.appser.dao.ManagementDAO;
import com.ruiliang.appser.service.ManagementService;

/**
 * 管理业务实现类
 * @author LinJian.Liu
 *
 */
@Service
public class ManagementServiceImpl implements ManagementService{

	@Autowired
	private ManagementDAO mDao;
	
	/* (non-Javadoc)
	 * @see com.ruiliang.service.ManagementService#getResult()
	 */
	@Override
	public Map<String, Object> getResult() {
		
		Map<String, Object> result = mDao.getResult();
		
		return result;
	}

}
