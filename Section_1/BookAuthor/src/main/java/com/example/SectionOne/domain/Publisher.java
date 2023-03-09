package com.example.SectionOne.domain;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String addressLine;
    private String city;
    private String state;
    private String zip;
    @OneToMany
    @JoinColumn(name="publisher_id") //hibernate
    private Set<Book> bookSet = new HashSet<>();

    public Publisher(Long id, String name, Set<Book> bookSet) {
        this.id = id;
        name = name;
        this.bookSet = bookSet;
    }
    public Publisher(){}
    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public Set<Book> getBookSet() {return bookSet;}
    public void setBookSet(Set<Book> bookSet) {this.bookSet = bookSet;}
    public String getAddressLine() {return addressLine;}
    public void setAddressLine(String addressLine) {this.addressLine = addressLine;}
    public String getCity() {return city;}
    public void setCity(String city) {this.city = city;}
    public String getState() {return state;}
    public void setState(String state) {this.state = state;}
    public String getZip() {return zip;}
    public void setZip(String zip) {this.zip = zip;}

    @Override
    public String toString() {
        return "Publisher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", addressLine='" + addressLine + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", bookSet=" + bookSet +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Publisher publisher = (Publisher) o;

        return Objects.equals(id, publisher.id);
    }
    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
