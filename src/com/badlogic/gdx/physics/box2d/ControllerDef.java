/*******************************************************************************
 * Copyright 2011 See AUTHORS file.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Erin Catto created box2d (C++)
 * boristhebrave created BuoyancyController for box2d (AS3)
 * Yannick Loriot's added b2BuoyancyController to cocos2d's box2d (C++) 
 * badlogic games (Mario Zechner, Nathan Sweet) wrapped box2d to Java in libgdx (JNI)
 * Nicolas Gramlich created AndEngine (See AUTHORS) where libgdx's box2d wrapper is used
 * Pranav Tekchand wrapping b2BuoyancyController to libgdx/AndEngine.
 ******************************************************************************/
package com.badlogic.gdx.physics.box2d;

public class ControllerDef {
	public enum ControllerType {
		Unknown(0), BuoyancyController(1);

		public static ControllerType[] valueTypes = new ControllerType[] {Unknown, BuoyancyController};
		private int value;

		ControllerType (int value) {
			this.value = value;
		}

		public int getValue () {
			return value;
		}
	}

	/** The controller type is set automatically for concrete controller types. **/
	public ControllerType type = ControllerType.Unknown;

}
