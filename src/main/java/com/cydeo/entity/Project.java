package com.cydeo.entity;

import com.cydeo.dto.UserDTO;
import com.cydeo.enums.Status;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "projects")
@NoArgsConstructor
@Where(clause = "is_deleted=false")
@Getter
@Setter
public class Project extends BaseEntity{

    @Column(unique = true)
    private String projectCode;
    private String projectName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "manager_id")
    private User assignedManager;
    @Column(columnDefinition = "Date")
    private LocalDate projectStartDate;
    @Column(columnDefinition = "Date")
    private LocalDate projectEndDate;

    private String projectDetail;
    @Enumerated(EnumType.STRING)
    private Status projectStatus;


}
