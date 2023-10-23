class TelevisionMuteTest {

    public static void main(String[] args) {
        Television tv = new Television();
        tv.setBrand("Samsung");
        tv.setVolume(32);
        System.out.println(tv); //to() automatically called

        tv.mute();  // mute it
        System.out.println(tv);

        tv.mute(); //unmute it -> volume should be back to 32
        System.out.println(tv);

        tv.mute(); // mut it again
        tv.setVolume(50); // should automatically unmute, and volume is now 50
        System.out.println(tv);
    }
}