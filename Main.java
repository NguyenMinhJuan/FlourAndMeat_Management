package NguyenLieu;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // tao cac doi tuong
        Material chicken = new Meat("Thit ga", 20000, LocalDate.parse("2002-12-12"), "thit01", 5);
        Material dog = new Meat("Thit cho", 30000, LocalDate.parse("2002-01-01"), "thit02", 6);
        Material shrimp = new Meat("Thit tom", 40000, LocalDate.parse("2002-02-22"), "thit03", 7);
        Material oyster = new Meat("Hau", 50000, LocalDate.parse("2002-03-03"), "thit04", 8);
        Material pig = new Meat("Thit lon", 60000, LocalDate.parse("2002-04-04"), "thit05", 9);
        Material botChienXu = new CrispyFlour("Bot chien xu", 10000, LocalDate.parse("2002-11-11"), "bot01", 3);
        Material botLamBanh = new CrispyFlour("Bot lam banh", 12000, LocalDate.parse("2001-09-02"), "bot02", 5);
        Material botTreEm = new CrispyFlour("Bot tre em", 11000, LocalDate.parse("2000-11-12"), "bot03", 1);
        Material botSan = new CrispyFlour("Bot San", 22000, LocalDate.parse("2001-03-05"), "bot04", 10);
        Material botMi = new CrispyFlour("Bot mi", 37000, LocalDate.parse("2010-08-12"), "bot05", 7);

        // them doi tuong vao mang
        ArrayList<Material> materials = new ArrayList<>();
        materials.add(chicken);
        materials.add(dog);
        materials.add(shrimp);
        materials.add(oyster);
        materials.add(pig);
        materials.add(botChienXu);
        materials.add(botLamBanh);
        materials.add(botTreEm);
        materials.add(botSan);
        materials.add(botMi);


        int choice;
        Scanner sc = new Scanner(System.in);
        while (true) {
            //Menu
            System.out.println("---------------------------------");
            System.out.println("-1/Tong tien 10 vat lieu\t\t" + "-");
            System.out.println("-2/Sap xep theo gia tang dan\t" + "-");
            System.out.println("-3/Sap xep theo gia giam dan\t" + "-");
            System.out.println("-4/Them san pham\t\t\t\t-");
            System.out.println("-5/Xoa san pham \t\t\t\t-");
            System.out.println("-6/Sua san pham \t\t\t\t-");
            System.out.println("-7/Hien thi ds san pham\t\t\t-");
            System.out.println("-8/Thoat chuong trinh\t\t\t-");
            System.out.println("---------------------------------");
            System.out.println("Moi nhap lua chon");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    addMaterial();
                    break;
                case 5:
                    for (Material m : materials) {
                        System.out.println(m.toString());
                    }
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lua chon khong hop le !");
                    break;
            }
        }

    }

    public static void addMaterial() {
        System.out.println("Menu them san pham ");
        System.out.println("1/Them thit ");
        System.out.println("2/Them bot");
        System.out.println("3/Tro ve menu chinh");
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap lua chon");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                addMeat();
                break;
            case 2:
                addFlour();
                break;
            case 3:
                return;
        }
    }

    private static void addFlour() {
        System.out.println("Menu them bot ");
        System.out.println("Moi ban nhap ");
    }

    private static void addMeat() {
        System.out.println("Menu them thit");
    }
}
