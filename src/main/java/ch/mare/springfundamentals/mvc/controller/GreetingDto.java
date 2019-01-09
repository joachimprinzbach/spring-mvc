package ch.mare.springfundamentals.mvc.controller;

public class GreetingDto {

    private String greeting;
    private String name;

    public GreetingDto() {
    }

    public GreetingDto(String greeting, String name) {
        this.greeting = greeting;
        this.name = name;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
