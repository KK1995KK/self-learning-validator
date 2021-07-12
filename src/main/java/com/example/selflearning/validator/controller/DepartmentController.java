package com.example.selflearning.validator.controller;

import com.example.enums.ErrorCode;
import com.example.selflearning.validator.entity.Department;
import com.example.selflearning.validator.vo.ResultVO;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/department")
@Validated
public class DepartmentController {

    /**
     * Add a department.
     * @param department
     * @return
     */
    @PostMapping
    public ResultVO add(@RequestBody @Valid Department department){
        /**
         * id must be   null
         * parent_id    cannot be null, and must larger than 0.
         * name cannot  be null, and the length must larger than 0.
         * createTime   cannot be a time in the future.
         */
        return ResultVO.success();
    }

    @ExceptionHandler
    public ResultVO exceptionHandler(MethodArgumentNotValidException e) {
        return ResultVO.fail(ErrorCode.PARAM_ERROR, e.getBindingResult().getAllErrors().stream()
                .map(DefaultMessageSourceResolvable::getDefaultMessage).collect(Collectors.toList()));
    }
}
