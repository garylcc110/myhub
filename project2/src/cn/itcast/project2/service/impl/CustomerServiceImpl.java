package cn.itcast.project2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.project2.dao.mapper.SCustMapper;
import cn.itcast.project2.pojo.SCust;
import cn.itcast.project2.pojo.SCustQuery;
import cn.itcast.project2.service.SCustService;
@Service
public class CustomerServiceImpl implements SCustService {
	@Autowired
	private SCustMapper sCustMapper;

	@Override
	public List<SCustQuery> findCustAndUser() {
		List<SCustQuery> list = sCustMapper.findCustAndUser();
		return list;
	}

	@Override
	public void deleteCustById(Integer cid) {
		sCustMapper.deleteCustById(cid);
	}

	@Override
	public void insertCust(SCust sCust) {
		sCustMapper.insertCust(sCust);
		
	}

	@Override
	public List<SCustQuery> queryByCondation(SCustQuery custQuery) {
		List<SCustQuery> list = sCustMapper.queryByCondation(custQuery);
		return list;
	}

}
