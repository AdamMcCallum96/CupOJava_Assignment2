package com.csis3275.controller_amc_37;


//Commented out the not used imports.
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.csis3275.model_amc_37.GroupDescription_amc_37;
@Controller

@RequestMapping("")
public class GroupDescriptionController_amc_37 {

 @RequestMapping(method = RequestMethod.GET)
 public String createDescription(GroupDescription_amc_37 description, ModelMap model) {
	 
	 GroupDescription_amc_37 groupDescription_amc_37 = new GroupDescription_amc_37();
	 groupDescription_amc_37.setDescription(""
	 		+ "Cup O Java is a group of students who got together to complete a project.<br>"
			+ "We decided to create this project about transport payment systems. This is <br>"
	 		+ "something new for us so we will learn to cope with the many challenges <br>"
			+ "along the way.");
			
	 	 
	 model.addAttribute("groupDescription_amc_37", groupDescription_amc_37);
	 
	 return "groupDescription_amc_37";
 }

}
 
 