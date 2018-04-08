package runner;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class TestRunner {

	public static void main(String[] args) {
		TestNG runner=new TestNG();
		List<String>list=new ArrayList<String>();
		list.add("D:\\Repository\\SeleniumPractice\\test-output\\SmokeSuite\\testng-failed.xml");//you can add multiple files
		runner.setTestSuites(list);
		runner.run();
	}

}
