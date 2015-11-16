/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab;

import java.util.Objects;

/**
 *
 * @author Scott
 */
public class Contact {
    String FirstName;
    String LastName;
    String StreetAddress;
    String City;
    String State;
    String ZipCode;

    public Contact(String FirstName, String LastName, String StreetAddress, String City, String State, String ZipCode, String Email, String Phone) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.StreetAddress = StreetAddress;
        this.City = City;
        this.State = State;
        this.ZipCode = ZipCode;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.StreetAddress);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Contact other = (Contact) obj;
        if (!Objects.equals(this.StreetAddress, other.StreetAddress)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Contact{" + "FirstName=" + FirstName + ", LastName=" + LastName + ", StreetAddress=" + StreetAddress + ", City=" + City + ", State=" + State + ", ZipCode=" + ZipCode + '}';
    }
    
    public Contact(){
        
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getStreetAddress() {
        return StreetAddress;
    }

    public void setStreetAddress(String StreetAddress) {
        this.StreetAddress = StreetAddress;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public String getZipCode() {
        return ZipCode;
    }

    public void setZipCode(String ZipCode) {
        this.ZipCode = ZipCode;
    }
}