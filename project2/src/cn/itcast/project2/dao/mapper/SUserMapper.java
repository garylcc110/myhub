package cn.itcast.project2.dao.mapper;

import cn.itcast.project2.pojo.SUser;
import cn.itcast.project2.pojo.SUserExample;
import java.util.List;

public interface SUserMapper {
   

    List<SUser> selectByExample(SUserExample example);
    
    List<SUser> selectAll();

}