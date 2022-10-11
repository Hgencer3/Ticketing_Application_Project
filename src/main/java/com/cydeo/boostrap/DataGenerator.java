package com.cydeo.boostrap;

import com.cydeo.dto.ProjectDTO;
import com.cydeo.dto.RoleDTO;
import com.cydeo.dto.UserDTO;
import com.cydeo.enums.Gender;
import com.cydeo.enums.Status;
import com.cydeo.service.ProjectService;
import com.cydeo.service.RoleService;
import com.cydeo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataGenerator implements CommandLineRunner {

    RoleService roleService;
    UserService userService;
    ProjectService projectService;

    public DataGenerator(RoleService roleService, UserService userService, ProjectService projectService) {
        this.roleService = roleService;
        this.userService = userService;
        this.projectService = projectService;
    }

    @Override
    public void run(String... args) throws Exception {

        RoleDTO adminRole=new RoleDTO(1L,"Admin");
        RoleDTO managerRole=new RoleDTO(2L,"Manager");
        RoleDTO employeeRole=new RoleDTO(3L,"Employee");

        roleService.save(adminRole);
        roleService.save(managerRole);
        roleService.save(employeeRole);

        UserDTO user1=new UserDTO("John","Kesy","John@cydeo.com","abc1",true,"123654789",adminRole, Gender.MALE);
        UserDTO user2=new UserDTO("Harold","Finch","Harold@cydeo.com","abc2",true,"987456321",managerRole, Gender.MALE);
        UserDTO user3=new UserDTO("Sameen","Shaw","Sameen@cydeo.com","abc3",true,"654123987",employeeRole, Gender.FEMALE);

        userService.save(user1);
        userService.save(user2);
        userService.save(user3);

        ProjectDTO project1=new ProjectDTO("Spring MVC","PR001",user1, LocalDate.now(),LocalDate.now().plusDays(25),Status.OPEN,"Creating Controllers");
        ProjectDTO project2=new ProjectDTO("Spring ORM","PR002",user2, LocalDate.now(),LocalDate.now().plusDays(10),Status.IN_PROGRESS,"Creating Database");
        ProjectDTO project3=new ProjectDTO("Spring Container","PR003",user1, LocalDate.now(),LocalDate.now().plusDays(32),Status.IN_PROGRESS,"Creating Container");

        projectService.save(project1);
        projectService.save(project2);
        projectService.save(project3);

    }
}
