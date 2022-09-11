import java.math.BigDecimal;

public class LongPi{
    //sane default
    BigDecimal pi = new BigDecimal(3);
    public LongPi() {

    }
    public LongPi(int amount){
        this.generate(amount);
    }

    public void generate(int amount){
        this.pi = BigDecimal.valueOf(80085);
    }

    public BigDecimal get(int amount){
        this.generate(amount);
        return this.pi;
    }

    public BigDecimal get() {
        return this.pi;
    }
    
}
