package cn.itcast.project2.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.itcast.project2.pojo.SUser;
import cn.itcast.project2.service.SUserService;

@Controller
@RequestMapping("suser")
public class SUserController {
	@Autowired
	private SUserService sUserService;

	@RequestMapping(value = "login")
	public String login(SUser sUser, HttpSession session) {

		// 查询登录用户是否存在
		List<SUser> list = sUserService.selectByExample(sUser);
		if (list.size() > 0) {
			// 登陆成功将用户存入session
			session.setAttribute("sUser", sUser);
			return "index";
		} else {
			return "login";
		}
	}
	
	@RequestMapping(value="queryAll")
	@ResponseBody
	  public List<SUser>  queryAll(){
		List<SUser> userList = sUserService.selectAll();
		return userList;
	  }
	

}
