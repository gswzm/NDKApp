//
// Created by 王志明 on 2017/11/9.
//
#include <string>
#include <jni.h>
#include <android/log.h>

#define LOGI(format, ...) __android_log_print(ANDROID_LOG_INFO,"hello",format, ##__VA_ARGS__)
#define LOGE(format, ...) __android_log_print(ANDROID_LOG_ERROR,"hello",format, ##__VA_ARGS__)
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

    LOGI("%s","add");
    return a+b;

}
extern "C"
JNIEXPORT jobject JNICALL
Java_com_wzm_ndkapp_NDKUtils_getList(JNIEnv *env, jclass type, jobject list) {

    // TODO
    LOGI("%s","getList");
    

}extern "C"
JNIEXPORT jintArray JNICALL
Java_com_wzm_ndkapp_NDKUtils_getIntArray(JNIEnv *env, jclass type, jintArray ints_) {

    jint *ints = env->GetIntArrayElements(ints_, NULL);
    //获取长度
    int size=env->GetArrayLength(ints_);
    int i=0;
    // TODO
    LOGI("%s","getIntArray");
    for(i;i<size;i++){
        //遍历数组
        LOGI("int[%d]=%d",i,ints[i]);
        *(ints+i)+=10;
    }

    return ints_;
}