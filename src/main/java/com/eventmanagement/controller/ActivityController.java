package com.eventmanagement.controller;

import com.eventmanagement.entity.Activity;
import com.eventmanagement.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/activity")
public class ActivityController {

    @Autowired
    private ActivityService activityService;

    @GetMapping
    public List<Activity> findAll(){
        return activityService.listAll();
    }

    @GetMapping("/{id}")
    public Activity findByID(Long id){
        return activityService.findById(id);
    }

    @PostMapping
    public Activity createActivity(@RequestBody Activity activity){
        return activityService.saveActivity(activity);
    }

    @DeleteMapping("/{id}")
    public void deleveActivity(@PathVariable Long id){
        activityService.deleteActivity(id);
    }
}