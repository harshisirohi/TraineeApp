package com.cg.ta.dao;

import java.util.List;

import com.cg.ta.entities.Trainee;

public interface TraineeDao 
{
	public void addTrainee(Trainee trainee);
	public void deleteTrainee(Integer traineeId);
	public void updateTrainee(Trainee trainee);
	/*public List<Trainee> retrieveTrainees();
	public List<Trainee> getAllTrainee();
	public Trainee retrieveOneTrainee(Integer traineeId);*/
	public Trainee retrieveOneTrainee(Integer traineeId);
	public List<Trainee> getAllTrainee();
	public Trainee modifyTraineeDetails(Trainee tdetails);
}
