package com.mindtree.finalassignment.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mindtree.finalassignment.entity.Login;
import com.mindtree.finalassignment.entity.Project;
import com.mindtree.finalassignment.entity.User;
import com.mindtree.finalassignment.serviceimpl.ProjectServiceImpl;
import com.mindtree.finalassignment.serviceimpl.UserServiceImpl;
import com.mindtree.finalassignment.serviceimpl.ValidateLogin;

@Controller
public class HelloController {
	
   	@RequestMapping("/index")
	public String index(ModelMap model) {
	   System.out.println("hi");
      return "index";
   }
	@RequestMapping(value = "/validate",method = RequestMethod.POST)
	public String validate(@Validated Login login,Model model)
	{
		System.out.println("Hiiii");
		
		model.addAttribute("message","Successfull login");
		ValidateLogin VL = new ValidateLogin();
		String msg = VL.validateLogin(login);
		if(msg!=null)
		{
		if(msg.equals("admin"))
				return "adminoptions";
		else if(msg.equals("user"))
			return "useroptions";
		}
		return "invalidlogin";
	}
	@RequestMapping("/adminoptions")
	public String adminoptions(ModelMap model) {
	   System.out.println("hi");
       return "adminoptions";
   }
	@RequestMapping("/useroptions")
	public String useroptions(ModelMap model) {
	   System.out.println("hi");
       return "useroptions";
   }
	@RequestMapping("/addproject")
	public String addProject(ModelMap model) {
	   System.out.println("hi");
       return "addproject";
   }
	@RequestMapping("/adduser")
	public String addUser(ModelMap model) {
	   System.out.println("hi");
      return "adduser";
   }
	@RequestMapping("/changepassword")
	public String changepassword(ModelMap model) {
	   System.out.println("hi");
      return "changepassword";
   }
	@RequestMapping(value = "/passwordchanged",method = RequestMethod.POST)
	public String passwordchanged(@Validated Login login,Model model)
	{
		ValidateLogin VL = new ValidateLogin();
		VL.changePassword(login);
		return "passwordchanged";
	}
	@RequestMapping("/viewempid")
	public String viewempid(ModelMap model) {
	   System.out.println("hi");
      return "viewempid";
   }	
	@RequestMapping("/viewproject")
	public String viewproject(ModelMap model) {
	  System.out.println("hi");
	  ProjectServiceImpl PSI = new ProjectServiceImpl();
	  List<Project> list = PSI.getAllProjects();
	  String message = "";
	  for(Project P : list)
		  message += P + "<br>";
	  model.addAttribute("message",message);
	  System.out.println(message);
      return "viewproject";
   }
	@RequestMapping("/viewteammembers")
	public String viewteammembers(ModelMap model) {
	   System.out.println("hi");
	   
      return "teammembersviewed";
   }
	@RequestMapping(value = "/teammembersviewed",method = RequestMethod.POST)
	public String teammembersviewed(@Validated Login login,Model model)
	{
		ValidateLogin VL = new ValidateLogin();
		List<User> list = VL.viewTeamMembers(login);
		String message = "";
		  for(User U : list)
			  message += U + "<br>";
		  model.addAttribute("message",message);
		  System.out.println(message);
		return "teammembersviewed";
	}
	@RequestMapping("/viewuser")
	public String viewuser(ModelMap model) {
	   System.out.println("hi");
	   UserServiceImpl USI = new UserServiceImpl();
		  List<User> list = USI.getAllUsers();
		  String message = "";
		  for(User U : list)
			  message += U + "<br>";
		  model.addAttribute("message",message);
		  System.out.println(message);
      return "viewuser";
   }
	@RequestMapping("/projectadded")
	public String projectadded(@Validated Project project,ModelMap model) {
	   System.out.println("hi");
	   System.out.println("Entered addition.");
	   System.out.println(project.getProjectId());
	   ProjectServiceImpl PSI = new ProjectServiceImpl();
	   System.out.println(project);
	   PSI.insert(project);	
	   
       return "adminoptions";
   }
	@RequestMapping("/useradded")
	public String useradded(@Validated User user,ModelMap model) {
	   System.out.println("hi");
	   System.out.println("Entered addition.");
	   System.out.println(user.getUserId());
	   System.out.println(user);
	   UserServiceImpl USI = new UserServiceImpl(); 
	   System.out.println(user);
	   USI.insert(user);
       return "useroptions";
   }
}