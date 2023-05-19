package com.sayat.tipbox.entities.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class WorkerWithDepartmentDto {
    private int id;
    private String workerName;
    private String departmentName;

    public WorkerWithDepartmentDto(int id, String workerName, String departmentName) {
        this.id = id;
        this.workerName = workerName;
        this.departmentName = departmentName;
    }

}
