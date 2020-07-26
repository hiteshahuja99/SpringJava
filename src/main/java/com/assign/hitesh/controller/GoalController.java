package com.assign.hitesh.controller;

import com.assign.hitesh.HiteshApplication;
import com.assign.hitesh.modal.Goal;
import com.assign.hitesh.service.GoalService;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@ApiModel
@RestController
public class GoalController {
    private static final Logger LOGGER= LogManager.getLogger(HiteshApplication.class);
    @Autowired
    GoalService goalService;
    @ApiOperation(value = "Add Goal", notes="used to add Goal",nickname = "Enter Goals")
    @PostMapping("/goals")
    @ResponseBody
    public Goal addGoal(@RequestBody Goal goal) {
        try {
            LOGGER.info("Adding goal");

            return goalService.addGoal(goal);
        }
        catch (Exception e)
        {
            LOGGER.info("error while adding goal");
            return null;
        }
    }


    @ApiOperation(value = "get goal", notes="used to get all goals",nickname = "get all goals")
    @GetMapping("/goals")
    public List<Goal> getAllGoal()
    {
        try {
            LOGGER.info("Fetching Goals");
            return goalService.getGoalList();
        }
        catch (Exception e){
            LOGGER.info("Error while Fetching Goals");
            return null;
        }
    }


    @ApiOperation(value = "get goals of particular id", notes="used to get goal of particular goalId")
    @GetMapping("/goals/{goalId}")
    public Goal findByGoalId(@PathVariable int goalId) {
        try {
            LOGGER.info("Fetching goal with specified goalId");

            return goalService.findGoalWithId(goalId);
        }catch (Exception e){
            LOGGER.info("Error having goal with specified goalId");
            return null;
        }
    }


    @ApiOperation(value = "delete goal", notes="used to delete goal",nickname = "delete goal by goalId")
    @DeleteMapping("/goals/{goalId}")
    public String deleteGoal(@PathVariable int goalId)
    {
        try {
            LOGGER.info("Deleting");
            return goalService.deleteGoal(goalId);
        }
        catch (Exception e){
           LOGGER.info("Error while deleting");
            return null;
        }
    }

    @ApiOperation(value = "update goals", notes="used edit particular goal with goalId",nickname = "edit goal")
    @PutMapping("/goals/{goalId}")
    public Goal editGoal(@RequestBody Goal goal,@PathVariable int goalId) {
        try{
            LOGGER.info("updating goal");
        return goalService.editGoal(goal,goalId);
    }
        catch (Exception e)
        {
          LOGGER.info("error while updating goal");
            return null;
        }
    }
}
