package com.cg.ta.controller;


import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.cg.ta.entities.Trainee;
import com.cg.ta.service.TraineeService;



@Controller
public class TraineeController 
{   
	
	@Autowired
	TraineeService tser;
	
	
	@RequestMapping("dashboard")
	public String showDashboard(Model model){return "Home";}
	
	@RequestMapping("traineemanagement")
	public String manageTrainee(@RequestParam("choice")Integer choice, Model model)
	{
		Trainee trainee=new Trainee();
		
		switch(choice)
		{
		case 1: model.addAttribute("trainee",trainee);
		return "addTrainee";
		
		case 2:model.addAttribute("trainee",trainee);
		return "deleteTrainee";
		
		case 3:model.addAttribute("trainee",trainee);
		return "modifyTrainee";
		
		case 4:model.addAttribute("trainee",trainee);
		    return "retrieveOneTrainee";
		
		case 5: List<Trainee> tlist= tser.getAllTrainee();
		        model.addAttribute("tlist", tlist);
		        return "retrieveAllTrainees";
		
		default:
			return "Home";
			
			
		}
		
		
	}
	
	@RequestMapping("addTrainee")
	public String addTrainee(@ModelAttribute("trainee")Trainee trainee, Model model)
	{
		tser.addTrainee(trainee);
		return "success";
		
//		if(res.hasErrors())
//		{
//			model.addAttribute("trainee", trainee);
//			return "add";
//	}
//		else
//	{	
//		tser.addTrainee(trainee);
//		model.addAttribute("trainee", trainee);
//		return "success"; 
//	}
	}
	
	
		@RequestMapping("delete")
		public String deleteTrainee(@RequestParam("traineeId")Integer traineeId,  Model model)
		{
			model.addAttribute("traineeId",traineeId);
			tser.deleteTrainee(traineeId);
			return "deleted";
		}
		
		@RequestMapping("retrieveone")
		public String retrieveOneTrainee(@RequestParam("traineeId")Integer traineeId, Model model)
		{
			model.addAttribute("traineeId",traineeId);
			Trainee tdetails = tser.retrieveOneTrainee(traineeId);
			model.addAttribute("tdetails",tdetails);
			return "retrieved";
		}
		
		@RequestMapping("modify")
		public String modifyDetails(@RequestParam("traineeId")Integer traineeId, Model model)
		{
			retrieveOneTrainee(traineeId, model);
			return "modifyDetails";
		}
		
		@RequestMapping("modified")
		public String edit(@Valid@ModelAttribute("tdetails")Trainee tdetails, BindingResult res, Model model)
		{
			if(res.hasErrors())
			{
				model.addAttribute("tdetails", tdetails);
				return "modified";
		}else
		{	
			tser.modifyTraineeDetails(tdetails);
			model.addAttribute("tdetails", tdetails);
			return "updated";
		}
		}
}
	

