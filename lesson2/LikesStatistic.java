package homework.les2;

public class LikesStatistic {

    public static void main(String[] args) {

        long likesCount = 1045; // Input: any valid number of likes
        int registrationYear = 2010; // Input: any valid registration year
        int currentYear = java.time.Year.now().getValue();

        double l = likesCount;
        double likesPerYear = l / ((currentYear - registrationYear) + 1);

        System.out.println(likesPerYear + " likes / year");
    }
}
