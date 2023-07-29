package interfacesP;

class TestInterfaceDefaultAndStatic {
    public static void main(String args[]){
        Drawable d=new Rectangle();
        d.draw();
        d.msg();

        //
        System.out.println("static  " + Drawable.cube(3));

        //An interface which has no member is known as a marker or tagged interface, for example, Serializable, Cloneable, Remote, etc. They are used to provide some essential information to
        // the JVM so that JVM may perform some useful operation.

    }}
