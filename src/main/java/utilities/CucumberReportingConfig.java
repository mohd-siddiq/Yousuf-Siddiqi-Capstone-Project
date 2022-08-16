package utilities;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;
import net.masterthought.cucumber.json.support.Status;
import net.masterthought.cucumber.presentation.PresentationMode;

public class CucumberReportingConfig {

	//one of the reason we are using cucumber reporting config if we are using a project management,
	//like Jira so that we can attached to our test ticket;
	
	//first we can create a method and name it reportConfig;
	public static void reportConfig( ) {

		File reportOutputDirectory = new File("target");

		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add("target\\cucumber.json");

		String buildNumber = "1";
		String ProjectName = "Tek School Retail Website - Tigers";
		String windows = "Windows 11";

		Configuration configuration = new Configuration(reportOutputDirectory, ProjectName);
		// optional configuration - check java doc for details
		configuration.addPresentationModes(PresentationMode.RUN_WITH_JENKINS);
		// do not make scenario failed when step has status SKIPPED;
		configuration.setNotFailingStatuses(Collections.singleton(Status.SKIPPED));
		configuration.setBuildNumber(buildNumber);
		// Additional metadata presented on main page;
		configuration.addClassifications("Platform", windows);
		configuration.addClassifications("Browser", "chrome");
		configuration.addClassifications("Branch", "release/1.0");

		ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
		@SuppressWarnings("unused")
		Reportable result = reportBuilder.generateReports();

	}

}
