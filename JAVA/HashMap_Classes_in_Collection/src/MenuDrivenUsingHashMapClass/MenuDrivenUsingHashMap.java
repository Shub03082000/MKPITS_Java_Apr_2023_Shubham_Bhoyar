package MenuDrivenUsingHashMapClass;

import java.util.*;

public class MenuDrivenUsingHashMap {
    public static void displayDetailsOfHashMap(){
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        Scanner scanner = new Scanner(System.in);
        int choice;
        while (true){
            System.out.println("1 - Add" + "\n" + "2 - Display All" + "\n" + "3 - find" + "\n" + "4 - Delete data" + "\n" + "5 - Replace or Update Data" + "\n" + "6 - Clear All" + "\n" + "0 - Exit");
            System.out.println("Enter your choice ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Add keys(city code) and values(city name) : ");
                    hashMap.put(scanner.nextInt(),scanner.next());
                    break;
                case 2:
                    Set set = hashMap.entrySet();
                    System.out.println("Display data -------------------");
                    System.out.println(set);
                    break;
                case 3:
                    System.out.println("Enter city code to find city : ");
                    System.out.println(hashMap.get(scanner.nextInt()));
                    break;
                case 4:
                    System.out.println("Enter city code to remove data : ");
                    hashMap.remove(scanner.nextInt());
                    System.out.println(hashMap);
                    break;
                case 5:
                    System.out.println("Enter city code to update data ");
                    hashMap.replace(scanner.nextInt(),scanner.next());
                    break;
                case 6:
                    hashMap.clear();
                    System.out.println("your data deleted successfully");
                    break;
                case 0:
                    return;
            }
        }
    }
}
