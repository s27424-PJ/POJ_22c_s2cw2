public class aryt {
    private float w;
    private float z;

    public aryt(float w, float z) {
        this.w = w;
        this.z = z;
    }

    public void ary() {
        System.out.println("w = " + w);
        System.out.println("z = " + z);
        System.out.println("w + z = " + (w+z));
        System.out.println("w - z = " + (w-z));
        System.out.println("w * z = " + (w*z));
        System.out.println("w / z = " + (w/z));
        System.out.println("w % z = " + (w%z));
    }
}