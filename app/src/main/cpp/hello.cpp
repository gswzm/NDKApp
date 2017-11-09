//
// Created by 王志明 on 2017/11/9.
//
#include <string>
#include <jni.h>

extern "C"
JNIEXPORT jstring JNICALL
Java_com_wzm_ndkapp_NDKUtils_sayHello(JNIEnv *env, jclass type) {

    // TODO
    std::string hello="这是一个加法计算方法：";
    return env->NewStringUTF(hello.c_str());
}
extern "C"
JNIEXPORT jdouble JNICALL
Java_com_wzm_ndkapp_NDKUtils_add(JNIEnv *env, jclass type, jdouble a, jdouble b) {

    // TODO
    return a+b;

}