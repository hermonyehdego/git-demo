package gitdemo.gitdemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(GitDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("hello hermon");

		System.out.println("luwam was here too say hello");
	}
}
