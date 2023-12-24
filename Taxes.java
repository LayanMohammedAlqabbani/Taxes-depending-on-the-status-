import java.util.*;

public class Taxes {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter your income : ");
        double income = input.nextInt();
        System.out.println(
                "Enter your Status as number from 1 to 4 as the following : 1- Single , 2- Married Filing Jointly or Qualifaying Widow , 3- MArried Filing Separately , 4- Head of Household .");
        int Status = input.nextInt();
        double Tax = 0;
        switch (Status) {
            case 1:
                if (income <= 8350) {
                    Tax = (10 / 100.0) * income;
                    System.out.println(
                            " you have pay  as Tax monthly depending on your Status and your income is :" + Tax);
                } else if (income <= 33950) {
                    Tax = (15 / 100.0) * income;
                    System.out.println(
                            " you have pay  as Tax monthly depending on your Status and your income is :" + Tax);
                } else if (income <= 82250) {
                    Tax = (25 / 100.0) * income;
                    System.out.println(
                            " you have pay  as Tax monthly depending on your Status and your income is :" + Tax);
                } else if (income <= 171550) {
                    Tax = (28 / 100.0) * income;
                    System.out.println(
                            " you have pay  as Tax monthly depending on your Status and your income is :" + Tax);
                } else if (income <= 372950) {
                    Tax = (33 / 100.0) * income;
                    System.out.println(
                            " you have pay  as Tax monthly depending on your Status and your income is :" + Tax);
                } else if (income > 372950) {
                    Tax = (35 / 100.0) * income;
                    System.out.println(
                            " you have pay as Tax monthly depending on your Status and your income is :" + Tax);
                }
                break;
            case 2:
                if (income <= 16700) {
                    Tax = (10 / 100.0) * income;
                    System.out.println(
                            " you have pay  as Tax monthly depending on your Status and your income is :" + Tax);
                } else if (income <= 67900) {
                    Tax = (15 / 100.0) * income;
                    System.out.println(
                            " you have pay  as Tax monthly depending on your Status and your income is :" + Tax);
                } else if (income <= 137050) {
                    Tax = (25 / 100.0) * income;
                    System.out.println(
                            " you have pay  as Tax monthly depending on your Status and your income is :" + Tax);
                } else if (income <= 208850) {
                    Tax = (28 / 100.0);
                    System.out.println(
                            " you have pay  as Tax monthly depending on your Status and your income is :" + Tax);
                } else if (income <= 372950) {
                    Tax = (33 / 100.0) * income;
                    System.out.println(
                            " you have pay  as Tax monthly depending on your Status and your income is :" + Tax);
                } else if (income > 372950) {
                    Tax = (35 / 100.0);
                    System.out.println(
                            " you have pay  as Tax monthly depending on your Status and your income is :" + Tax);
                }
                break;
            case 3:
                if (income <= 8350) {
                    Tax = (10 / 100.0) * income;
                    System.out.println(
                            " you have pay  as Tax monthly depending on your Status and your income is :" + Tax);
                } else if (income <= 33950) {
                    Tax = (15 / 100.0) * income;
                    System.out.println(
                            " you have pay  as Tax monthly depending on your Status and your income is :" + Tax);
                } else if (income <= 68525) {
                    Tax = (25 / 100.0);
                    System.out.println(
                            " you have pay  as Tax monthly depending on your Status and your income is :" + Tax);
                } else if (income <= 104425) {
                    Tax = (28 / 100.0) * income;
                    System.out.println(
                            " you have pay  as Tax monthly depending on your Status and your income is :" + Tax);
                } else if (income <= 186475) {
                    Tax = (33 / 100.0);
                    System.out.println(
                            " you have pay  as Tax monthly depending on your Status and your income is :" + Tax);
                } else if (income > 186475) {
                    Tax = (35 / 100.0) * income;
                    System.out.println(
                            " you have pay  as Tax monthly depending on your Status and your income is :" + Tax);
                }
                break;
            case 4:
                if (income <= 11950) {
                    Tax = (10 / 100.0);
                    System.out.println(
                            " you have pay  as Tax monthly depending on your Status and your income is :" + Tax);
                } else if (income <= 45500) {
                    Tax = (15 / 100.0) * income;
                    System.out.println(
                            " you have pay  as Tax monthly depending on your Status and your income is :" + Tax);
                } else if (income <= 117450) {
                    Tax = (25 / 100.0) * income;
                    System.out.println(
                            " you have pay  as Tax monthly depending on your Status and your income is :" + Tax);
                } else if (income <= 190200) {
                    Tax = (28 / 100.0) * income;
                    System.out.println(
                            " you have pay  as Tax monthly depending on your Status and your income is :" + Tax);
                } else if (income <= 372950) {
                    Tax = (33 / 100.0) * income;
                    System.out.println(
                            " you have pay  as Tax monthly depending on your Status and your income is :" + Tax);
                } else if (income > 372950) {
                    Tax = (35 / 100.0) * income;
                    System.out.println(
                            " you have pay  as Tax monthly depending on your Status and your income is :" + Tax);
                }
                break;
            default:
                System.out.println("Error : invalid Status ");
                break;

        }
    }
}
