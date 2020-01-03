package com.standalone.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class CustomPluginInStandaloneProject implements Plugin<Project> {

    @Override
    void apply(Project target) {
        target.task('showCustomPluginInStandalone') {
            doLast {
                println("task in CustomPluginInStandaloneProject")
            }
        }
    }
}