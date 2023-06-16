package BuldPattern;


import BuldPattern.Exception.InvalidNameException;
import BuldPattern.Exception.InvalidNoPlateException;
import BuldPattern.Exception.InvalidWeightException;

public class Bike {
    @Override
    public String toString() {
        return "Bike{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", noPlate='" + noPlate + '\'' +
                '}';
    }

    private String name;
    private int weight;
    private String noPlate;

    public Bike(Builder builder){
        this.name=builder.name;
        this.noPlate=builder.noPlate;
        this.weight=builder.weight;
    }

    public static Builder builder(){
        Builder builder=new Builder();
        return builder;
    }
    public static class Builder {

        public String name;
        public int weight;
        public String noPlate;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        public Builder setWeight(int weight) {
            this.weight = weight;
            return this;
        }
        public Builder setNoPlate(String noPlate) {
            this.noPlate = noPlate;
            return this;
        }

        public void Validate(){

            if (noPlate.length()<1 || noPlate.length()>6){
                throw new InvalidNoPlateException("No plate length should be 1 to 6");
            }
            else if(weight>100){
                throw new InvalidWeightException("Weight can be less than 100kgs");
            }

            else if(! name.startsWith("V")) {

                throw new InvalidNameException("name should startes with V");
            }
            String newOne=name.substring(0,3)+name.substring(3,4).toUpperCase()+name.substring(4);
//            System.out.println("name is"+newOne);
        }

        public Bike build(){
            this.Validate();
            Bike bike=new Bike(this);
            return bike;
        }


    }



}
