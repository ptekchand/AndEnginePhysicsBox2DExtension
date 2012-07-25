
//import com.badlogic.gdx.jnigen.NativeCodeGenerator;
// @see com.badlogic.gdx.utils.GdxBuild
/** Class to build JNI bindings for Box2D */
public class BuildJniHelper {

	/**
	 * Build JNI bindings for Box2D
	 * 
	 * cd AndEnginePhysicsBox2DExtension
	 * javac -classpath ./bin/classes;libs/gdx-jnigen.jar -d ./bin/classes src/BuildJniHelper.java
	 * java -classpath ./bin/classes;libs/gdx-jnigen.jar BuildJniHelper
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		System.out.println("This requires gdx-jnigen in your project/classpath.");
		System.out.println("The class will also need to be rebuilt after un-commenting required code below.");
		// Un-comment the following code to use gdx-jnigen to build wrappers.
		// Consider looking at source code for NativeCodeGenerator and Mario Zechner's YouTube video as well.
//		String JNI_DIR = "jni";
//		
//		// Box2D
//		//String[] includes = new String[] { "**/box2d/**"};
//		//String[] includes = new String[] { "**/box2d/controllers/*", "**/box2d/World.java"};
//		String[] includes = new String[] { "**/box2d/Controller.java", "**/box2d/World.java"};
//		// source directory - where you java files are
//		// class path - the directory where you .class files are
//		// output directory - where the .h and .cpp files would be generated.
//		new NativeCodeGenerator().generate("src", "bin/classes", JNI_DIR + "/", includes, null);
	}

}
