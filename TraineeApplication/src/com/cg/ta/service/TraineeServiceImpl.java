package com.cg.ta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.ta.dao.TraineeDao;
import com.cg.ta.entities.Trainee;
@Service
@Transactional
public class TraineeServiceImpl implements TraineeService 
{
	@Autowired
	TraineeDao tdao;

	@Override
	public void addTrainee(Trainee trainee) 
	{
		tdao.addTrainee(trainee);
		
	}

	@Override
	public void deleteTrainee(Integer traineeId) 
	{
		tdao.deleteTrainee(traineeId);
		
	}

	@Override
	public void updateTrainee(Trainee trainee) 
	{
		tdao.updateTrainee(trainee);
	}

	@Override
	public Trainee retrieveOneTrainee(Integer traineeId) 
	{
		return tdao.retrieveOneTrainee(traineeId);
		
	}

	@Override
	public List<Trainee> getAllTrainee() 
	{
		
		return tdao.getAllTrainee();
	}

	@Override
	public Trainee modifyTraineeDetails(Trainee tdetails) {
		// TODO Auto-generated method stub
		return tdao.modifyTraineeDetails(tdetails);
	}

	/*@Override
	public List<Trainee> retrieveTrainees() 
	{
		return tdao.retrieveTrainees();
	}

	@Override
	public List<Trainee> getAllTrainee() 
	{
		return tdao.getAllTrainee();
	}*/

	/*@Override
	public Trainee retrieveOneTrainee(Integer traineeId)
	{
		return tdao.retrieveOneTrainee();
	}*/

	
	
}
