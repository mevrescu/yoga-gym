package com.yoga.gym.model;

import com.yoga.gym.model.constants.EffortType;

import java.io.Serializable;

/**
 * Created by cimbonda on 10/29/2017.
 */
public class WorkoutDetail implements Serializable{
    private long id;
    private String name;
    private EffortType effortType;
    private String description;
    private int duration;
    private long videoId;
}
