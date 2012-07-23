#! /bin/sh

NDK_DIRECTORY="/cygdrive/d/android-ndk-r8/"
PROJECT_DIRECTORY="/cygdrive/d/RZ2Projects/Other/AndEngine/ptekchand/AndEnginePhysicsBox2DExtension/"

# Run build:
cd ${PROJECT_DIRECTORY}
${NDK_DIRECTORY}ndk-build

# Clean temporary files:
rm -rf ${PROJECT_DIRECTORY}obj
find . -name gdbserver -print0 | xargs -0 rm -rf
find . -name gdb.setup -print0 | xargs -0 rm -rf