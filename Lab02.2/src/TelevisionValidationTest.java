class TelevisionValidationTest {
    public static void main(String[] args) {
        Television tv = new Television();

        // test setting volume to lower boundary
        tv.setVolume(0);
        System.out.println("volume: " + tv.getVolume());

        // test setting volume to upper boundary
        tv.setVolume(100);
        System.out.println("volume: " + tv.getVolume());

        // test setting volume to an invalid lower value
        tv.setVolume(-1);
        System.out.println("Invalid volume. Set volume range [0-100]." + tv.getVolume());

        // test setting volume to invalid upper boundary
        tv.setVolume(101);
        System.out.println("Invalid volume. Set volume range [0-100]." + tv.getVolume());

        System.out.println();

        // test setting all valid brands
        for (Television.Brand brand : Television.Brand.values()) {
            tv.setBrand(brand);
            System.out.println("Brand set to " + brand + ": " + tv.getBrand());
        }

        tv.setBrand(Television.Brand.SAMSUNG);
        System.out.println("brand: " + tv.getBrand());

        tv.setBrand(Television.Brand.LG);
        System.out.println("brand: " + tv.getBrand());

        tv.setBrand(Television.Brand.SONY);
        System.out.println("brand: " + tv.getBrand());

        tv.setBrand(Television.Brand.TOSHIBA);
        System.out.println("brand: " + tv.getBrand());
    }
}