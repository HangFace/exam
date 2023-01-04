package com.exam;

import com.exam.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExamserverApplication implements CommandLineRunner {

    @Autowired
    private UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(ExamserverApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("starting code");

		/*User user = new User();
		user.setFirstname("Dhruv");
		user.setLastname("Vyas");
		user.setPassword("123");
		user.setEmail("dvyas@gmail.com");
		user.setUsername("dhruv_vyas");
		user.setProfile("default.png");

		Role role = new Role();
		role.setRoleName("Admin");

		Set<UserRole> userRoles = new HashSet<>();
		UserRole userRole = new UserRole();
		userRole.setUser(user);
		userRole.setRole(role);
		userRoles.add(userRole);

		User user1 = userService.createUser(user, userRoles);
		System.out.println(user1.getUsername());*/
    }
}
