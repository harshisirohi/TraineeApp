package com.cg.ta.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.ta.entities.Trainee;
@Repository
public class TraineeDaoImpl implements TraineeDao
{
 @PersistenceContext
 EntityManager em;

@Override
public void addTrainee(Trainee trainee) 
{
	em.persist(trainee);
	
}

@Override
public void deleteTrainee(Integer traineeId) 
{
	em.remove(em.find(Trainee.class, traineeId));
	
}

@Override
public void updateTrainee(Trainee trainee)
{
	em.merge(trainee);
	
}

@Override
public Trainee retrieveOneTrainee(Integer traineeId) 
{
	
	return em.find(Trainee.class, traineeId);
}

@Override
public List<Trainee> getAllTrainee() 
{
	String jpql="Select t from Trainee t";
	TypedQuery<Trainee> query=em.createQuery(jpql, Trainee.class);
	return query.getResultList();
}

@Override
public Trainee modifyTraineeDetails(Trainee tdetails) 
{
	
	return em.merge(tdetails);
}




/*@Override
public Trainee retrieveOneTrainee(Integer traineeId) 
{
	
	return em.find(Trainee.class, traineeId);
}

@Override
public List<Trainee> retrieveTrainees()
{
	
	return null;
}

@Override
public List<Trainee> getAllTrainee() {
	// TODO Auto-generated method stub
	return null;
}*/
}
