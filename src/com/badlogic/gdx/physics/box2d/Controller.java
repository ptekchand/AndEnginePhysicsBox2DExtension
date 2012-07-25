package com.badlogic.gdx.physics.box2d;

import java.util.List;

import com.badlogic.gdx.physics.box2d.ControllerDef.ControllerType;
import com.badlogic.gdx.utils.LongMap;

public abstract class Controller {
	/*JNI
#include <Box2D/Box2D.h> 
	 */
	/** the address of the controller **/
	protected long addr;

	/** world **/
	private final World world;
	

	/** @see b2Controller::m_bodyList */ 
	//protected final LongMap<ControllerEdge> bodyList = new LongMap<ControllerEdge>(10);
	//int bodyCount;

	/** Constructs a new controller
	 * @param addr the address of the controller */
	protected Controller (World world, long addr) {
		this.world = world;
		this.addr = addr;
	}

	/** Controllers override this to implement per-step functionality. @see b2Controller:Step */
	//public void Step (const b2TimeStep& step) = 0;

	/** Controllers override this to provide debug drawing.  @see b2Controller:Draw */
	//void Draw(b2Draw *debugDraw)

	/** Adds a body to the controller list.
	 * This function is locked during callbacks. */
	public void AddBody (Body body) {
		jniAddBody(addr, body.addr);
	}

	private native void jniAddBody (long addr, long bodyAddr); /*
		b2Controller* controller = (b2Controller*)addr;
		b2Body* body = (b2Body*)bodyAddr;
		controller->AddBody(body);
	*/

	/** Removes a body from the controller list.
	 * This function is locked during callbacks. */
	public void RemoveBody (Body body) {
		jniRemoveBody(addr, body.addr);
	}

	private native void jniRemoveBody (long addr, long bodyAddr); /*
		b2Controller* controller = (b2Controller*)addr;
		b2Body* body = (b2Body*)bodyAddr;
		controller->RemoveBody(body);
	*/

	/** Removes all bodies from the controller list. */
	public void Clear() {
		jniClear(addr);
	}
	private native void jniClear(long addr); /*
		b2Controller* controller = (b2Controller*)addr;
		controller->Clear();
	*/

	/** Get the next controller in the world's body list. @see b2Controller::GetNext */
	//b2Controller* GetNext();
	//const b2Controller* GetNext() const;

	/** Get the parent world of this body. @see b2Controller::GetWorld */
	//b2World* GetWorld();
	//const b2World* GetWorld() const;

	/** Get the attached body list @see b2Controller::GetBodyList */
	//b2ControllerEdge* GetBodyList();
	//const b2ControllerEdge* GetBodyList() const;
	
	/** @see b2Controller::Destroy */
	//protected virtual void Destroy(b2BlockAllocator* allocator) = 0;
}
