package cn.itcast.project2.service;

import java.util.List;

import cn.itcast.project2.pojo.SCust;
import cn.itcast.project2.pojo.SCustQuery;

public interface SCustService {
	
	List<SCustQuery>findCustAndUser();
	void deleteCustById(Integer cid);
	void insertCust(SCust sCust);
	List<SCustQuery> queryByCondation(SCustQuery custQuery);
}
