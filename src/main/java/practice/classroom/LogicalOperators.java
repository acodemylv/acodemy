package practice.classroom;

public class LogicalOperators {
    public static void main(String[] args) {

        // operator: switch

        returnDayOfTheWeek(1);
        returnDayOfTheWeek(5);
        returnDayOfTheWeek(6);

        System.setProperty("default.browser", "safari");
        String currentBrowserName = System.getProperty("default.browser");

//        switch (currentBrowserName.toUpperCase(Locale.ROOT)) {
//            case "CHROME":
//                System.out.println("Here we will setup chrome browser configuration");
//                break;
//            case "firefox":
//            case "opera":
//                System.out.println("Here we will setup firefox/opera browser configuration");
//                break;
//            default:
//                System.out.println("Browser with current name does not exist:" + currentBrowserName);
//        }

    }
        public static void returnDayOfTheWeek(int dayOfTheWeek) {
            switch (dayOfTheWeek) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Monday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("This value is not correct: " + dayOfTheWeek);
            }
        }
}
