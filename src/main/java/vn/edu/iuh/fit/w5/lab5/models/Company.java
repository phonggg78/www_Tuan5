package vn.edu.iuh.fit.w5.lab5.models;

import jakarta.persistence.*;

@Entity
@Table(name = "company")
public class Company {
    @Id
    @Column(name = "comp_id")
    private long id;

    @ManyToOne
    @JoinColumn(name = "address")
    private Address address;
    private String about;
    private String email;
    @Column(name = "company_Name")
    private String name;
    private String phone;
    @Column(name = "web_url")
    private String webUrl;

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", address=" + address +
                ", about='" + about + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", webUrl='" + webUrl + '\'' +
                '}';
    }

    public Company() {
    }

    public Company(long id, Address address, String about, String email, String name, String phone, String webUrl) {
        this.id = id;
        this.address = address;
        this.about = about;
        this.email = email;
        this.name = name;
        this.phone = phone;
        this.webUrl = webUrl;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }
}
