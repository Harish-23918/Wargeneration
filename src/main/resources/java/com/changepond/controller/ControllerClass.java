package com.changepond.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.changepond.model.Model;
import com.changepond.service.ServiceClass;
//import com.changepond.service.ServiceClass;
import com.changepond.service.ServiceImpl;

@Controller
public class ControllerClass {
	@Autowired
	private ServiceClass sc;

	@RequestMapping(value = "/add", method = RequestMethod.GET)
//	@ResponseBody
	public ModelAndView getAll() {
		
		List<Model> md = sc.getEmploye();
		ModelAndView mv= new ModelAndView();
		mv.setViewName("employes");
		mv.addObject("employes", md);
		return mv;
	}
	
//	@RequestMapping(value = "/add", method = RequestMethod.GET)
//	public String addPage() {
//		return "hai";
//	}
		
//		  HttpHeaders headers = new HttpHeaders();
//		  List<Model>md=sc.getEmploye();
//		 
//		  if (md == null) {
//		   return new ResponseEntity<List<Model>>(HttpStatus.NOT_FOUND);
//		  }
//		  headers.add("Number Of Records Found", String.valueOf(md.size()));
//		  return new ResponseEntity<List<Model>>(md, headers, HttpStatus.OK);
//		 }
//	@RequestMapping("/display")
//	public ModelAndView display(@RequestParam ("empid") int empid,@RequestParam ("empname") String empname,@RequestParam ("emprole") String emprole,HttpServletRequest request,HttpServletResponse response  ) {
//	
////		int i= Integer.parseInt(request.getParameter("a"));
////		int j= Integer.parseInt(request.getParameter("b"));
//		
//		
//		
//		ModelAndView mav= new ModelAndView();
//		mav.setViewName("display1");
////		mav.addObject("dis", k);
//		return mav;
//	}
//	@RequestMapping( "/display")
//	public void display(HttpServletRequest request,HttpServletResponse response) {
//		System.out.println("hai");
//	}

//	@RequestMapping(value = "/display", method = RequestMethod.POST)
//	@ResponseBody
//	public String add(@RequestParam(value = "empid", required = true) int empid,
//			@RequestParam(value = "empname", required = true) String empname,
//			@RequestParam(value = "emprole", required = true) String emprole,
//			HttpServletRequest request,HttpServletResponse response)throws IOException, NullPointerException {
//	
//	 ServiceImpl impl= new ServiceImpl();
//		Model md= new Model();
//		md.setEmpid(empid);
//		md.setEmpname(empname);
//		md.setEmprole(emprole);

//	ModelAndView mav= new ModelAndView();
//	mav.setViewName("hello");
//	List<Model> mv = sc.getEmploye();
//	mav.addObject("disp", mv);

//		return mav;
//		int checkFlag=impl.insert(md);
//		if(checkFlag!=0){
//			
//		return "success..";
//		}
//		else
//		{
//			return "failure..";
//		}
//	}

	

	
}
