public class Main {
    public static void main(String[] args) {
        PlaceDefaultConditionAtEndInSwitch placeDefaultConditionAtEndInSwitch = new PlaceDefaultConditionAtEndInSwitch();
        placeDefaultConditionAtEndInSwitch.placeDefaultConditionAtEndInSwitch(7);

        PlaceDefaultConditionCenterInSwitch placeDefaultConditionCenterInSwitch = new PlaceDefaultConditionCenterInSwitch();
        placeDefaultConditionCenterInSwitch.placeDefaultConditionCenterInSwitch(5);

        PlaceDefaultConditionOnTopInSwitch placeDefaultConditionOnTopInSwitch = new PlaceDefaultConditionOnTopInSwitch();
        placeDefaultConditionOnTopInSwitch.placeDefaultConditionOnTopInSwitch(0);

        SwitchByte switchByte = new SwitchByte();
        switchByte.switchByte((byte) 6);

        WithoutBreakStatementInSwitch withoutBreakStatementInSwitch = new WithoutBreakStatementInSwitch();
        withoutBreakStatementInSwitch.withoutBreakStatementInSwitch(2);
    }
}