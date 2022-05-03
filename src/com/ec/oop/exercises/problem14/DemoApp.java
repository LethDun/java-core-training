package com.ec.oop.exercises.problem14;

import com.ec.oop.exercises.problem14.service.RecruitmentManager;

public class DemoApp {

    public static void main(String[] args) {
        RecruitmentManager recruitmentManager = new RecruitmentManager();
        while (true) {
            recruitmentManager.menu();
        }
    }
}
