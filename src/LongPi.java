import java.math.BigDecimal;

public class LongPi{
    //sane default
    BigDecimal pi = new BigDecimal(3.14); // sane init
    int accurateUpTo = 2;
    public LongPi() {
        //do nothing? in case of user being interested in later fill-in
    }
    public LongPi(int amount){
        this.generate(amount);
    }

    public void generate(int amount){
        //https://math.stackexchange.com/questions/2996541/how-are-the-known-digits-of-pi-guaranteed
        //this one provides a good math backbone, with digit accuracy guarantee
        //the main meat of the program
        //only do this if the amount stored is lower than what is requested
        this.pi = BigDecimal.valueOf(80085);
    }

    public BigDecimal get(int amount){
        this.generate(amount);
        return new BigDecimal(this.pi.toString().substring(0, amount+2));//trim if internal val is too much
    }

    public BigDecimal get() {
        return new BigDecimal(this.pi.toString().substring(0, accurateUpTo+2));//just the current one
    }
    
}
