package az.elvinali.designpatterns.builder;

public class User {
    private String name;
    private String surname;
    private String fincode;
    private int age;
    private String address;



     static class Builder{
        private String name;
        private String surname;
        private String fincode;
        private int age;
        private String address;

        public Builder name(String value){
            this.name=value;
            return this;
        }

        public Builder surname(String value){
            this.surname=value;
            return this;
        }

        public Builder age(String value){
            this.age=Integer.valueOf(value);
            return this;
        }

        public Builder address(String value){
            this.address=value;
            return this;
        }

        public Builder fincode(String value){
            this.fincode=value;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }

    private User(Builder builder){
        name= builder.name;
        address= builder.address;
        surname= builder.surname;
        age= builder.age;
        fincode=builder.fincode;
    }

}
