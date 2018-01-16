#!/bin/sh

SUBJECT=${1}
TYPE=${2}
ACTION=${3}

TEST_NAME=${SUBJECT}${TYPE}

CLASS_PATH="target/classes:target/test-classes:target/dependency/*"

if [ test ${ACTION} = "test" ]; then
    mvn clean test-compile dependency:copy-dependenceies
    mvn test -Dtest=${TEST_NAME}
elif [ test ${ACTION} = "jacoco" ]; then
    mvn clean test-compile dependency:copy-dependenceies
    mvn jacoco:prepare-agent test -Dtest=${TEST_NAME} jacoco:report
fi