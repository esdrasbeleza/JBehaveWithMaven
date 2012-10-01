package com.esdrasbeleza.java;

import java.util.List;

import org.jbehave.core.io.CodeLocations;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.junit.JUnitStories;
import org.junit.runner.RunWith;

import de.codecentric.jbehave.junit.monitoring.JUnitReportingRunner;

@RunWith(JUnitReportingRunner.class)
public class CalculatorStories extends JUnitStories {
	@Override
	protected List<String> storyPaths() {
		return new StoryFinder().findPaths(
				CodeLocations.codeLocationFromPath("src/main/resources"), "**/*.story",
				"**/excluded*.story");
	}

}
