package com.badlogic.gdx.physics.box2d.controllers;

//import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Controller;
import com.badlogic.gdx.physics.box2d.World;

/** Calculates buoyancy forces for fluids in the form of a half plane. */
public class BuoyancyController extends Controller {

	/** Constructs a new Buoyancy Controller
	 * @param addr the address of the controller */
	public BuoyancyController (World world, long addr) {
		super(world, addr);
	}

	/// @see b2Controller::Step
	//void Step(const b2TimeStep& step);

	/// @see b2Controller::Draw
	//void Draw(b2Draw *debugDraw);
	
	// If required, implement setters for the public members of b2BuoyancyController
	/** Set the outer surface normal. */
//	public void setNormal (Vector2 normal) {
//		jniSetNormal(addr, normal.x, normal.y);
//	}
//
//	private native void jniSetNormal (long addr, float normalX, float normalY); /*
//		b2BuoyancyController* buoyancyController = (b2BuoyancyController*)addr;
//		buoyancyController->normal.Set( b2Vec2(normalX, normalY) );
//	*/
}
