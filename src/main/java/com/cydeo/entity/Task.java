package com.cydeo.entity;

import com.cydeo.dto.ProjectDTO;
import com.cydeo.dto.UserDTO;
import com.cydeo.enums.Status;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.time.LocalDate;

@NoArgsConstructor
@Data
@Entity
@Table(name = "tasks")
@Where(clause = "is_deleted=false")
public class Task extends BaseEntity {

    private String taskSubject;
    private String taskDetail;

    @Enumerated(EnumType.STRING)
    private Status taskStatus;
    @Column(columnDefinition = "Date")
    private LocalDate assignedDate;
    @ManyToOne(fetch = FetchType.LAZY)
    private User assignedEmployee;
    @ManyToOne(fetch = FetchType.LAZY)
    private Project project;

    private Long id;






}
