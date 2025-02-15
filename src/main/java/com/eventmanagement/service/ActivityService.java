package com.eventmanagement.service;

import com.eventmanagement.entity.Activity;
import com.eventmanagement.repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ActivityService {

    @Autowired
    private ActivityRepository activityRepository;

    public List<Activity> listAll() {
        return activityRepository.findAll();
    }

    public Activity findById(Long id){
        return activityRepository.findById(Math.toIntExact(id)).orElseThrow(() -> new RuntimeException("Evento não encontrado"));
    }

    public Activity saveActivity(Activity activity){
        return activityRepository.save(activity);
    }

    public void deleteActivity(Long id){
        activityRepository.deleteById(Math.toIntExact(id));
    }
}