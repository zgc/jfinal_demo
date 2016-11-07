package com.hxgsn.controller;

import com.hxgsn.model.StudentModel;
import com.hxgsn.model.StudentService;
import com.jfinal.core.Controller;

/**
 * Created by zgc on 16-11-7.
 */
public class StudentController extends Controller {

    public void index() {
        renderText("student controller index.");

        StudentModel studentModel = StudentService.DAO.findById("test", 1);
        System.out.println(studentModel);
    }
}
