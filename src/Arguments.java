/**
 * Created by Lasantha Madushan on 2/28/2019.
 */
public class Arguments {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Arguments(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Arguments{" +
                "number=" + number +
                '}';
    }
}
