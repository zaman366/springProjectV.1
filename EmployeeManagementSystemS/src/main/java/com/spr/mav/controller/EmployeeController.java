
package com.spr.mav.controller;

import com.spr.mav.controller.impl.IEmployeeController;
import com.spr.mav.dao.impl.IEmployeeDAO;
import com.spr.mav.model.Employee;
import com.spr.mav.service.impl.IEmployeeService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController

public class EmployeeController implements IEmployeeController {
     @Autowired
      IEmployeeService employeeService;
     
      @Autowired
       IEmployeeDAO employeeDAO;

    @Override
    public String getAllEmployees() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ModelAndView create() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
    
    
    @Override
     @RequestMapping(value ="/save", method = RequestMethod.POST)
      public ModelAndView save(HttpServletRequest request) {
      employeeService.save(request);
      System.out.println("hello");
      return new ModelAndView("/admin/employeeData");
    }
    
    
    
    
    
    
    

    @Override
    public ModelAndView edit(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ModelAndView update(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ModelAndView delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Employee> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
//    New Generated Method
    
    
     @RequestMapping(value ="/empVi")
    public ModelAndView viewEmp() {
      List<Employee> emps = employeeService.getAll();
      
     Map<String,Object> map=new HashMap<String,Object>();
       map.put("employees",emps);
        
      return new ModelAndView("/admin/empView1","map",map);
        
 }
    
    
      @RequestMapping(value ="/leaveD")
    public ModelAndView leaveDe() {
//      List<Employee> emps = employeeService.getAll();
//      
//     Map<String,Object> map=new HashMap<String,Object>();
//       map.put("employees",emps);
//        
//      return new ModelAndView("/admin/empView","map",map);
      return new ModelAndView("/admin/leaveDetails");
        
      
        
        
    }
    
    
    
}
