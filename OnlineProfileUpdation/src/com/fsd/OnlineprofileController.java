package com.fsd;

import java.io.BufferedOutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class OnlineprofileController {
	private static final String UPLOAD_DIRECTORY ="/resumes"; 
	@RequestMapping("/employee")
	public ModelAndView EmployeeInitial() {
	   return new ModelAndView("Employeelogin");
	}
	@RequestMapping("/admin")
	public ModelAndView AdminInitial() {
	   return new ModelAndView("Adminlogin");
	}
	@RequestMapping(value="/submitdeleteemployee",method=RequestMethod.GET)
	public ModelAndView DeleteEmployee(@RequestParam String profileid) {
		EmployeeDao a=new EmployeeDao();
		a.delete(profileid);
		  String message="Deleted your profile";
		  return new ModelAndView("success","message",message);
	}
	@RequestMapping(value="/submitaddemployee",method=RequestMethod.POST)
	public ModelAndView AddEmployee(@ModelAttribute("command")Employee employee) {
	  System.out.println(employee);
	  EmployeeDao a=new EmployeeDao();
	  a.add(employee);
	  String message="Thanks for adding your profile";
	   return new ModelAndView("success","message",message);
	}
	@RequestMapping(value="/submitemployee",method=RequestMethod.GET)
	public ModelAndView EmpLogin(@RequestParam String UserId,@RequestParam String pwd) {
       int flag=0;
       if(UserId.equals("employee")&&pwd.equals("employee"))
    	   flag=1;
       String p2="";
       if(flag==1)
    	   p2="EmployeeLoginSuccess";
       if(flag==0)
    	   p2="Employeelogin";
	   return new ModelAndView(p2);
	}
	@RequestMapping(value="/submitmodifyemployee",method=RequestMethod.GET)
	public ModelAndView ModifyEmployee(@ModelAttribute("command")Employee employee1) {
		EmployeeDao a=new EmployeeDao();
	        a.update(employee1);   
		  String message="Updated your profile";
		  return new ModelAndView("success","message",message);
	}
	@RequestMapping(value="/submitadmin",method=RequestMethod.GET)
	public ModelAndView AdminLogin(@RequestParam String userId,@RequestParam String pwd) {
       int flag=0;
       if(userId.equals("admin")&&pwd.equals("admin"))
    	   flag=1;
       String p2="";
       if(flag==1)
    	   p2="AdminLoginSuccess";
       if(flag==0)
    	   p2="loginerror";
	   return new ModelAndView(p2);
	}
	@RequestMapping(value="/submitaddjob",method=RequestMethod.POST)
	public ModelAndView AddJob(@ModelAttribute("command")Administrator ad) {
	  System.out.println(ad);
	  AdminDao d=new AdminDao();
	  long p=d.add(ad);
	  String message="Thanks for adding your job"+"your job id is "+p;
	   return new ModelAndView("success","message",message);
	}
	@RequestMapping(value="/submitmodifyjob",method=RequestMethod.GET)
	public ModelAndView ModifyJob(@ModelAttribute("command")Administrator ad1) {
		 System.out.println(ad1);
		  AdminDao d=new AdminDao();
		  d.update(ad1);
		  String message="Updated the job";
		  return new ModelAndView("success","message",message);
	}
	@RequestMapping(value="/submitdeletejob",method=RequestMethod.GET)
	public ModelAndView DeleteJobid(@RequestParam long jobid) {
		 AdminDao d=new AdminDao();
		 System.out.println(jobid);
		 d.delete(jobid);
		  String message="Deleted the job";
		  return new ModelAndView("success","message",message);
	}
	 @RequestMapping("/uploadprofile")  
	    public ModelAndView uploadForm(){  
	        return new ModelAndView("uploadresume");    
	    }  
	 @RequestMapping(value="savefile",method=RequestMethod.POST)  
	    public ModelAndView saveimage( @RequestParam CommonsMultipartFile file,  
	           HttpSession session) throws Exception{  
	  
	    ServletContext context = session.getServletContext();  
	    String path = context.getRealPath(UPLOAD_DIRECTORY);  
	    String filename = file.getOriginalFilename();  
	  
	    System.out.println(path+" "+filename);        
	  
	    byte[] bytes = file.getBytes();  
	    BufferedOutputStream stream =new BufferedOutputStream(new FileOutputStream(  
	         new File(path + File.separator + filename)));  
	    stream.write(bytes);  
	    stream.flush();  
	    stream.close();  
	           
	    return new ModelAndView("uploadresult","filesuccess","File successfully saved!");  
	    }  
	 @RequestMapping(value="/download")  
	    public void downloadResume( @RequestParam String pid,HttpServletRequest request,HttpServletResponse response) throws IOException{  
		 String dataDirectory = request.getServletContext().getRealPath("/resumes/");
		 String fileName=pid+".pdf";
			Path file = Paths.get(dataDirectory, fileName);
			if (Files.exists(file)) 
			{
				response.setContentType("application/pdf");
				response.addHeader("Content-Disposition", "attachment; filename="+fileName);
				try 
				{
					Files.copy(file, response.getOutputStream());
					response.getOutputStream().flush();
				} 
				catch (IOException ex) {
					ex.printStackTrace();
				}
			}
	          
	    }  
	 @RequestMapping(value="/submitskill")
		public ModelAndView Searchskill(@RequestParam long jobid) {
		 AdminDao d=new AdminDao();
		 Administrator a=d.skillsearch(jobid);
		   System.out.println(a);
		   ModelAndView m=new ModelAndView("job");
		   m.addObject("j",a);
		   return m;
		   
		}
	 @RequestMapping(value="/submitid")
		public ModelAndView Searchskill(@RequestParam String profileid) {
			EmployeeDao a=new EmployeeDao();
		 Employee e=a.skillsearch(profileid);
		   System.out.println(e);
		   ModelAndView m=new ModelAndView("profile");
		   m.addObject("j",e);
		   return m;
		   
		}
}
