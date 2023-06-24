public class PlaceDefaultConditionOnTopInSwitch {
    public String placeDefaultConditionOnTopInSwitch(int day){
        switch (day) {
            default:
                return "Invalid condition";
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
        }
    }
}
