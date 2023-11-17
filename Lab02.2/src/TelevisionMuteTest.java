class TelevisionMuteTest {
    public static void main(String[] args) {
        Television tv = new Television();

        tv.setBrand(Television.Brand.SAMSUNG);
        tv.setVolume(32);
        System.out.println(tv); //to() automatically called

        tv.mute();  // mute tv
        System.out.println(tv);

        tv.mute(); //unmute tv -> volume should be back to 32
        System.out.println(tv);

        tv.mute(); // mute tv again
        tv.setVolume(50); // unmute and volume is 'set' to 50
        System.out.println(tv);
    }
}