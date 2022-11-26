package com.cydeo.dto;

import com.cydeo.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProjectDTO {

    private String projectName;
    private String projectCode;
    private UserDTO assignedManager;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate projectStartDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate projectEndDate;
    private Status projectStatus;
    private String projectDetail;
    private int completeTaskCounts;
    private int unfinishedTaskCounts;

    public ProjectDTO(String projectName, String projectCode, UserDTO assignedManager, LocalDate projectStartDate, LocalDate projectEndDate, String projectDetail, Status projectStatus) {
        this.projectName = projectName;
        this.projectCode = projectCode;
        this.assignedManager = assignedManager;
        this.projectStartDate = projectStartDate;
        this.projectEndDate = projectEndDate;
        this.projectStatus = projectStatus;
        this.projectDetail = projectDetail;


    }

}
