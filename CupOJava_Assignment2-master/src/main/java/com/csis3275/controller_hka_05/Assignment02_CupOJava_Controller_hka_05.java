package com.csis3275.controller_hka_05;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.csis3275.model_hka_05.Assignment02_CupOJava_Model_hka_05;

/**
 * Controller class for feature 
 * @author Heena
 *
 */
@Controller
public class Assignment02_CupOJava_Controller_hka_05 {

 @RequestMapping(method = RequestMethod.GET, value = "/assignment02_hka_05")
 public String createDescription(ModelMap model) {
	 
	 Assignment02_CupOJava_Model_hka_05 assignment02_CupOJava_Model_hka_05 = new Assignment02_CupOJava_Model_hka_05();
	 assignment02_CupOJava_Model_hka_05.setFeatureDescription("This Will be the controller which will be used to develop one of the feature of the project.<br>");
	 model.addAttribute("assignment02_CupOJava_Model_hka_05", assignment02_CupOJava_Model_hka_05);
	 return "assignment02_CupOJava_hka_05";
	 
 }
 
}
