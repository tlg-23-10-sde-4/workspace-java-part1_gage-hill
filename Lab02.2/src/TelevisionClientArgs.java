import java.util.Arrays;

class TelevisionClientArgs {
    public static void main(String[] args) {
        if (args.length < 3) { // must first check for the presence of your (required) 3 arguments, if it fails it prints usage instructions
            String usage = "Usage: java TelevisionClientArgs <brand> <volume> <display>";
            String example = "Example: java TelevisionClientArgs Samsung 32 PLASMA";
            String note1 = "Valid options are" + Arrays.toString(Television.Brand.values());
            String note2 = String.format("Volume must be between [%s-%s].", Television.MIN_VOLUME, Television.MAX_VOLUME);
            String note3 = "Valid options are " + Arrays.toString(DisplayType.values());
            System.out.println(usage);
            System.out.println(example);
            System.out.println(note1);
            System.out.println(note2);
            System.out.println(note3);
            return;  // early return from main(), application exits
        }

        // at this point, you can safely proceed, because you got your arguments
        System.out.println("You provided " + args.length + " arguments");

        // parsing and validating brand
        Television.Brand brand;
        try {
            brand = Television.Brand.valueOf(args[0].toUpperCase()); // '.args[0]' is the first argument passed in, which is 'brand',
                                                                     // brand argument converts the input string to uppercase because Enums are Uppercase()
            //                                                          and then '.valueOf()' attempts to match with the 'Television.Brand' enum
        }
        catch (IllegalArgumentException e) {
            System.out.println("Invalid brand. Valid options are: " + Arrays.toString(Television.Brand.values()));
            return; // must 'return' otherwise the program will continue with an 'invalid brand'
        }

        // parsing and validation volume
        int volume;
        try {
            volume = Integer.parseInt(args[1]);
            if (volume < Television.MIN_VOLUME || volume > Television.MAX_VOLUME) {
                throw new IllegalArgumentException("Volume out of range");
            }
        }
        catch (NumberFormatException e) {
            System.out.println("Volume must be an integer.");
            return;
        }
        catch (IllegalArgumentException e) {
            System.out.format("Invalid volume. Volume must be between %s to %s", Television.MIN_VOLUME, Television.MAX_VOLUME);
            return;
        }

        // parsing and validation display type
        DisplayType display = null;
        try {
            display = DisplayType.valueOf(args[2].toUpperCase());
        }
        catch (IllegalArgumentException e) {
            System.out.println("Invalid display type. Valid options are " + Arrays.toString(DisplayType.values()));
            return;
        }

        // validation for all parameters
        if (brand != null && volume >= Television.MIN_VOLUME && volume <= Television.MAX_VOLUME && display != null) {
            Television tv = new Television(brand, volume, display);
            System.out.println(tv);
        }
        else {
            System.out.println("Error: Missing or invalid input parameters.");
        }
    }
}