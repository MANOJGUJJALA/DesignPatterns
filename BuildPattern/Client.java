package BuildPattern;

public class Client {
    public static void main(String[] args) {

        Bike newBike=Bike.builder()
                .setName("VasuBrand")
                .setWeight(70)
                .setNoPlate("AP1541")
                .build();

        System.out.println(newBike);
    }
}
