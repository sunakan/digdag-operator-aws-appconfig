#!/bin/sh

MAVEN_PATH=io/digdag/plugin/digdag-operator-aws-appconfig
BUILD_DIR=./build/repo/$MAVEN_PATH
PLUGIN_DIR=./.digdag/plugins/$MAVEN_PATH

if [ -d $BUILD_DIR ]; then
    echo "DELETE: $BUILD_DIR"
    rm -r $BUILD_DIR
fi

if [ -d $PLUGIN_DIR ]; then
    echo "DELETE: $PLUGIN_DIR"
    rm -r $PLUGIN_DIR
fi

./gradlew build
./gradlew publish

digdag run --project sample plugin.dig -p repos=`pwd`/build/repo -a
