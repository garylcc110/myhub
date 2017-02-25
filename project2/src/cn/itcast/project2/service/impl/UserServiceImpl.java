package cn.itcast.project2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.project2.dao.mapper.SUserMapper;
import cn.itcast.project2.pojo.SUser;
import cn.itcast.project2.pojo.SUserExample;
import cn.itcast.project2.pojo.SUserExample.Criteria;
import cn.itcast.project2.service.SUserService;
/**
 * 
* @ClassName: UserServiceImpl 
* @Description: 用户 业务逻辑类
* @author RockyZhao  
* @date 2016年7月18日 下午3:19:48 
* @version V1.0
 */
@Service
public class UserServiceImpl implements SUserService {

	@Autowired
	private SUserMapper sUserMapper;
	
	@Override
	public List<SUser> selectByExample(SUser sUser) {

		// 创建查询对象
		SUserExample sUserExample = new SUserExample();
		Criteria criteria = sUserExample.createCriteria();
		// 设置查询条件
		criteria.andUsernameEqualTo(sUser.getUsername());
		criteria.andPasswordEqualTo(sUser.getPassword());
		// 查询结果集
		List<SUser> list = sUserMapper.selectByExample(sUserExample);
		return list;
	}

/**
 * 查询所有用户
 */
	public List<SUser> selectAll() {
		List<SUser> list = sUserMapper.selectAll();
		
		return list;
	}

}
