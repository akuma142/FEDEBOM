package commandline.runner;

import java.util.logging.Logger;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.Entity.User;
import com.service.UserDaoService;

public class UserDaoServiceCommandLineRunner implements CommandLineRunner {
	
	private static final org.jboss.logging.Logger log = LoggerFactory.logger(UserDaoServiceCommandLineRunner.class);
	 @Autowired
	private UserDaoService daoservice;

	@Override
	public void run(String... args) throws Exception {
		User user = new User("ashu","admin");
		long val = daoservice.insert(user);
		log.info("New User Created "+" "+user);
		
		System.out.println("New User Created "+" "+user);
		
		
		
	}

}
