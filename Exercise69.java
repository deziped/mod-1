public class Exercise69 {

    /** the program converts units here */
    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }
    /** as well as here*/
    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }
    /**this is where the program outputs  */
    public static void main(String[] args) {
        System.out.printf("%-10s%-10s    %-10s%-10s\n", "Feet", "Meters", "Meters", "Feet");
        double foot = 1.0;
        double meter = 20.0;
        for (int i = 0; i < 10; i++) {
            double metersFromFeet = footToMeter(foot);
            double feetFromMeters = meterToFoot(meter);
            System.out.printf(
                "%-10.1f%-10.3f    %-10.1f%-10.3f\n",
                foot, metersFromFeet, meter, feetFromMeters
            );
            foot++;
            meter += 5;
        }
    }
}