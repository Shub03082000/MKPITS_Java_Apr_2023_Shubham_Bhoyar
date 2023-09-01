package MonthClassUsingEnum;

import java.util.Scanner;

public class MonthClassUsingEnum {
    enum Months {January(31), February(28), March(31), April(30), May(31), June(30), July(31), August(31), September(30), October(31), November(30), December(31);
        int days;
        Months(int days) {
            this.days = days;
        }
            public void monthClass() {
                Months m = Months.March;
                switch (m){
                    case January:
                    case March:
                    case May:
                    case July:
                    case August:
                    case October:
                    case December:
                        System.out.println(m.ordinal() + " " + m.days +" " +m);
                        break;
                    case February:
                        System.out.println(m.ordinal() + " " + m.days +" " +m);
                        break;
                    case April:
                    case June:
                    case September:
                    case November:
                        System.out.println(m.ordinal() + " " + m.days +" " +m);
                }
            }
    }
}
