#include <jni.h>
#include <string>
#include <math.h>
extern "C"
JNIEXPORT jstring JNICALL
Java_com_wzm_ndkapp_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}
extern "C"
JNIEXPORT jint JNICALL
Java_com_wzm_ndkapp_MainActivity_getAdd(JNIEnv *env, jobject instance, jint a, jint b) {

    // TODO
    return a+b;

}

double nResult(double x, double n)
{
    //(n^2n+1)/(2n+1)!也就是n/1*n/2*n/3*n/4*.....n/(2n+1)
    return n==1?x:nResult(x,n-1)*x/n;
}

extern "C"
JNIEXPORT jdouble JNICALL
Java_com_wzm_ndkapp_MainActivity_getSin(JNIEnv *env, jobject instance, jdouble a) {
    return sin(a);
}

JNIEXPORT jstring
Java_com_wzm_ndkapp_MainActivity_getCos(JNIEnv *env, jobject instance, jstring str){

    return
}
