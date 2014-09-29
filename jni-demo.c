#include "jni-demo.h"


JNIEXPORT jint JNICALL Java_JNIDemo_add1
  (JNIEnv *env, jobject obj, jint a){
    return a+1;
  }

