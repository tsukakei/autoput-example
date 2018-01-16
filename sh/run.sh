#!/bin/sh

SUBJECT=${1}
TYPE=${2}
ACTION=${3}

TEST_NAME=${SUBJECT}${TYPE}

CLASS_PATH="target/classes:target/test-classes:target/dependency/*"

if [ ${ACTION} = "test" ]; then
    mvn clean test-compile dependency:copy-dependencies
    mvn test -Dtest=${TEST_NAME}
elif [ ${ACTION} = "jacoco" ]; then
    mvn clean test-compile dependency:copy-dependencies
    mvn jacoco:prepare-agent test -Dtest=${TEST_NAME} jacoco:report
fi
