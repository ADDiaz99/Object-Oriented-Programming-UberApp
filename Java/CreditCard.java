class CreditCard extends Payment {
    String number;
    String cvv;
    String date;

    public CreditCard(Integer id, String number, String cvv, String date){
        super(id);
        this.number = number;
        this.cvv = cvv;
        this.date = date;
    }
}
