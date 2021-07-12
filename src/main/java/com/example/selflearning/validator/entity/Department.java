package com.example.selflearning.validator.entity;

import lombok.Builder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.PastOrPresent;
import java.time.LocalDateTime;

@Builder
public class Department {
    @Null(message = "id must be null!")
    Integer id;

    @NotNull(message = "parentId cannot be null!")
    Integer parentId;

    @NotBlank(message = "name cannot be blank!")
    String name;

    @PastOrPresent(message = "createTime cannot be in future!")
    @NotNull(message = "createTime cannot be null!")
    LocalDateTime createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
}
