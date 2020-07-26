package com.assign.hitesh.service;

import com.assign.hitesh.modal.Goal;
import com.assign.hitesh.repository.GoalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoalService {

    @Autowired
    GoalRepository goalRepository;

    public Goal addGoal(Goal goal)
    {
        return goalRepository.save(goal);
    }

    public List<Goal> getGoalList() {
        return goalRepository.findAll();
    }

    public Goal findGoalWithId(int id) {
        return goalRepository.findByGoalId(id);
    }

    public String deleteGoal(int id) {
        goalRepository.deleteById(id);
        return "\"deleted\"";
    }

    public Goal editGoal(Goal goal,int id) {
        Goal oldGoal=goalRepository.findByGoalId(id);
        oldGoal.setGoalId(id);
        oldGoal.setTitle(goal.getTitle());
        oldGoal.setDetails(goal.getDetails());
        oldGoal.setUpdateDate(goal.getUpdateDate());
        oldGoal.setCreateDate(goal.getCreateDate());
        oldGoal.setEta(goal.getEta());
        goalRepository.saveAndFlush(oldGoal);
        return oldGoal;
    }
}
