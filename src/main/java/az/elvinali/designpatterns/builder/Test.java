package az.elvinali.designpatterns.builder;

public class Test {
    public static void main(String[] args) {
        User user=new User.Builder()
                .name("Elvin")
                .surname("Aliyev")
                .fincode("1111111")
                .address("baku")
                .build();


    }
}
