package com.github.vbogutskiish.wsplugin.services

import com.intellij.openapi.project.Project
import com.github.vbogutskiish.wsplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
