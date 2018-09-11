package com.cg.ta.service;

import java.util.List;

import com.cg.ta.entities.Trainee;

public interface TraineeService 
{
public void addTrainee(Trainee trainee);
public void deleteTrainee(Integer traineeId);
public void updateTrainee(Trainee trainee);
public Trainee retrieveOneTrainee(Integer traineeId);
public List<Trainee> getAllTrainee();
public Trainee modifyTraineeDetails(Trainee tdetails);

/*public List<Trainee> retrieveTrainees();
public List<Trainee> getAllTrainee();*/
//public Trainee retrieveOneTrainee(Integer traineeId);

}
