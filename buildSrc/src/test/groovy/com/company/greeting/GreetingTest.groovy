package com.company.greeting

import org.gradle.testkit.runner.BuildResult
import org.gradle.testkit.runner.TaskOutcome
import org.junit.rules.TemporaryFolder
import spock.lang.Shared
import spock.lang.Specification


public class GreetingTest extends Specification {
    @Shared
    File outputDir
    TemporaryFolder testProjectDir

    def setupSpec() {
        outputDir = TestUtils.prepTestSpecDir(this.class)
    }

    def setup() {
        testProjectDir = new TemporaryFolder(outputDir)
        testProjectDir.create()
    }

    void cleanup() {
        testProjectDir.delete()
    }


}
