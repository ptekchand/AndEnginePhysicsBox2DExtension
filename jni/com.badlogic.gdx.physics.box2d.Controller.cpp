#include <com.badlogic.gdx.physics.box2d.Controller.h>

//@line:9

#include <Box2D/Box2D.h> 
	 JNIEXPORT void JNICALL Java_com_badlogic_gdx_physics_box2d_Controller_jniAddBody(JNIEnv* env, jobject object, jlong addr, jlong bodyAddr) {


//@line:42

		b2Controller* controller = (b2Controller*)addr;
		b2Body* body = (b2Body*)bodyAddr;
		controller->AddBody(body);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_gdx_physics_box2d_Controller_jniRemoveBody(JNIEnv* env, jobject object, jlong addr, jlong bodyAddr) {


//@line:54

		b2Controller* controller = (b2Controller*)addr;
		b2Body* body = (b2Body*)bodyAddr;
		controller->RemoveBody(body);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_gdx_physics_box2d_Controller_jniClear(JNIEnv* env, jobject object, jlong addr) {


//@line:64

		b2Controller* controller = (b2Controller*)addr;
		controller->Clear();
	

}

