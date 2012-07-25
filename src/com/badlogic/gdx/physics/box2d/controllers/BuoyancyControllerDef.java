package com.badlogic.gdx.physics.box2d.controllers;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.ControllerDef;

/** Buoyancy Controller Definition @see b2BuoyancyControllerDef */
public class BuoyancyControllerDef extends ControllerDef {

	public BuoyancyControllerDef () {
		type = ControllerType.BuoyancyController;
	}

	/** Initialize the properties of the buoyancy controller. */
	public void initialize (Vector2 normal, float offset, float density,
			Vector2 velocity, float linearDrag, float angularDrag, boolean useDensity, boolean useWorldGravity,
			Vector2 gravity) {
		this.normal.set(normal);
		this.offset = offset;
		this.density = density;
		this.velocity.set(velocity);
		this.linearDrag = linearDrag;
		this.angularDrag = angularDrag;
		this.useDensity = useDensity;
		this.useWorldGravity = useWorldGravity;
		this.gravity.set(gravity);
		
	}
	
	/// The outer surface normal
	public final Vector2 normal = new Vector2(0, 1);
	/// The height of the fluid surface along the normal
	public float offset = 0;
	/// The fluid density
	public float density = 0;
	/// Fluid velocity, for drag calculations
	public final Vector2 velocity = new Vector2(0, 0);
	/// Linear drag co-efficient
	public float linearDrag = 0;
	/// Linear drag co-efficient
	public float angularDrag = 0;
	/// If false, bodies are assumed to be uniformly dense, otherwise use the shapes densities
	public boolean useDensity = false; //False by default to prevent a gotcha
	/// If true, gravity is taken from the world instead of the gravity parameter.
	public boolean useWorldGravity = true;
	/// Gravity vector, if the world's gravity is not used
	public final Vector2 gravity = new Vector2(0, 0);
}
