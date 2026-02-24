class Person {
    private String name;
    private String address;
// creating constructor
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
//creating getter and setter methods
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "Person[name=" + name + ",address=" + address + "]";
    }

}    
