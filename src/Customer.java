public class Customer {
    private String name;
    private String phone;
    private String email;
    private int order_id;

    public Customer(String name, String phone, String email, int order_id) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.order_id = order_id;
    }

    // get set region
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
// end region

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", order_id=" + order_id +
                '}';
    }
}
