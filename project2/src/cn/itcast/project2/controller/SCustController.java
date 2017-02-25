package cn.itcast.project2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.project2.pojo.SCust;
import cn.itcast.project2.pojo.SCustQuery;
import cn.itcast.project2.service.SCustService;

@Controller
@RequestMapping("scust")
public class SCustController {
	@Autowired
	private SCustService sCustService;

	@RequestMapping("custList")
	public String custList(SCustQuery custQuery, Model model) {
		List<SCustQuery> list = sCustService.findCustAndUser();
		model.addAttribute("custlist", list);
		return "center";

	}

	@RequestMapping("deleteCustById")
	public String deleteCustById(Integer cid) {
		sCustService.deleteCustById(cid);
		return "redirect:custList.action";

	}
	@RequestMapping("addCust")
	public String addCust(SCust sCust) {
		sCustService.insertCust(sCust);
		return "redirect:custList.action";

	}
	
	@RequestMapping("queryByCondition")
	public String queryByCondition(String cust_name1,String cust_type1,Model model ) {
		
		SCustQuery custQuery=new SCustQuery();
		custQuery.setCust_name(cust_name1);
		custQuery.setCust_type(cust_type1);
		System.out.println(custQuery.getCust_name());
		System.out.println(custQuery.getCust_type());

		List<SCustQuery> list = sCustService.queryByCondation(custQuery);
		model.addAttribute("custlist", list);
		return "center";

	}
	
	

}
