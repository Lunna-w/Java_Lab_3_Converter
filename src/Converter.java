public class Converter {
    public Converter(){}
    public static void main(String[] args){
        int feet = Input.getInteger("feet: ");
        int inches = Input.getInteger("inches: ");
        double meters= feet*0.3048;
        double centi=inches*2.54;
        long roundedM = Math.round(meters);
        long roundedC = Math.round(centi);
        System.out.println(roundedM+"m"+" "+ roundedC+"cm");

    }
    }

