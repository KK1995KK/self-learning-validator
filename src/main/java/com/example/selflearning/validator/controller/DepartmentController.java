package com.example.selflearning.validator.controller;

import com.example.selflearning.validator.entity.Department;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


@RestController
@RequestMapping("/department")
public class DepartmentController {

    /**
     * Add a department.
     * @param department
     * @return
     */
    @PostMapping
    public String add(@RequestBody @Valid Department department){
        /**
         * id must be   null
         * parent_id    cannot be null, and must larger than 0.
         * name cannot  be null, and the length must larger than 0.
         * createTime   cannot be a time in the future.
         */
        return "OK";
    }
}
