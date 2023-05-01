public class Main {
    public static void main(String[] args) {
        CreditPaymentService serv = new CreditPaymentService();
        double summ = 1000000; // сумма кредита
        double term = 24; // срок в месяцах
        double percent = 9.99; // процентная ставка
        double percent2 = percent / (100 * 12); // процентная ставка в месяц
        int annuit = 0; // аннуительный платеж
        annuit = (int) serv.calculate(summ, term, percent2);
        System.out.println(annuit);
    }
}
