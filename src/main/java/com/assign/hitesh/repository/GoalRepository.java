package com.assign.hitesh.repository;

import com.assign.hitesh.modal.Goal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoalRepository extends JpaRepository<Goal, Integer> {
    Goal findByGoalId(int id);
}
