package org.example

class Utils implements Serializable {
    def steps
    Utils(steps) { this.steps = steps }

    void printEnv() {
        steps.echo "JOB: ${steps.env.JOB_NAME} | BUILD: ${steps.env.BUILD_NUMBER}"
    }
}