public class mothlyBalance {
        public static void main(String []args){
            int startingBalance = 5000;
            double interestRate = .17;
            double oneMonthInterest = startingBalance + interestRate;
            double twoMonthInterest = oneMonthInterest + startingBalance + interestRate;
            System.out.println ("Your starting credit card balance is a 5,000");
            System.out.println("Your interest after one month is $" + oneMonthInterest);
            System.out.println("Your interest after two months is $" + twoMonthInterest);
        }
}
