package com.buildsrc.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class CustomPluginInBuildSrc implements Plugin<Project> {

    @Override
    void apply(Project target) {
        target.task('showCustomPluginInBuildSrc') {
            doLast {
                println("task in CustomPluginInBuildSrc")
            }
        }
    }
}