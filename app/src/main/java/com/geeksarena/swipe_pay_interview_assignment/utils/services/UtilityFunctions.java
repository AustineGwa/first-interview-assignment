package com.geeksarena.swipe_pay_interview_assignment.utils.services;

import android.content.Context;
import android.content.Intent;

import com.geeksarena.swipe_pay_interview_assignment.models.SwipepayUser;

public class UtilityFunctions {

    public static SwipepayUser getUser(String identifier){

        return new SwipepayUser();
    }
}
