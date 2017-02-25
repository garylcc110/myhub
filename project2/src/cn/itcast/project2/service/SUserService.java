package cn.itcast.project2.service;

import java.util.List;

import cn.itcast.project2.pojo.SUser;

public interface SUserService {
	 List<SUser> selectByExample(SUser sUser);
	 
	 List<SUser> selectAll();

}
