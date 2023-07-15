package gitdemo.gitdemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitDemoApplication implements CommandLineRunner {
	@GetMapping("/welcome")
	public  String welcome(){
		return "welcome to hermon app";
	}

	public static void main(String[] args) {
		SpringApplication.run(GitDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("hello hermon");
         System.out.println("beylul hii");
		System.out.println("luwam was here too say hello");
	}
}
