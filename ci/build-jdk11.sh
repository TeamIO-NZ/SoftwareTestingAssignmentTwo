#!/bin/sh
# Used to build java 11 projects with gradle on concourse
# From TeamIO-NZ/concourse-scripts
# Use along with the build-jdk11.yml task config.

export ROOT_FOLDER=$( pwd )
export GRADLE_USER_HOME="${ROOT_FOLDER}/.gradle"

./gradlew clean build --stacktrace