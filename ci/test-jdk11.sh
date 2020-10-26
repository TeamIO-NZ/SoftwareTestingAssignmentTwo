#!/bin/sh
# Used to test java projects with gradle on concourse
# From TeamIO-NZ/concourse-scripts
# Use along with the test-jdk11.yml task config.

export ROOT_FOLDER=$( pwd )
export GRADLE_USER_HOME="${ROOT_FOLDER}/.gradle"

./gradlew clean test --stacktrace