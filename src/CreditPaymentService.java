public class CreditPaymentService {

    public double calculate(double summ, double term, double percent2) {
        double result;
        if (summ > 0 || term > 0 || percent2 > 0) {
            result = summ * (percent2 / (1 - (Math.pow((1 + percent2), -term))));
        } else {
            result = 0;
        }

        return result;
    }
}
