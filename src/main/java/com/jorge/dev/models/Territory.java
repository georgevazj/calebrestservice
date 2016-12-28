package com.jorge.dev.models;

import org.springframework.data.annotation.Id;

import java.util.Date;

/**
 * Created by Jorge on 27/12/16.
 */

public class Territory {

    @Id
    private String id;
    private Boolean available;
    private int number;
    private String extension;
    private String address;
    private String zone;
    private Boolean elevator;
    private Boolean restricted;
    private String observations;
    private Date last_assigned;
    private Date last_returned;
    private Publisher publisher;

    public Territory() {
    }

    public Territory(Boolean available, int number, String extension, String address, String zone, Boolean elevator, Boolean restricted, String observations, Date last_assigned, Date last_returned, Publisher publisher) {
        this.available = available;
        this.number = number;
        this.extension = extension;
        this.address = address;
        this.zone = zone;
        this.elevator = elevator;
        this.restricted = restricted;
        this.observations = observations;
        this.last_assigned = last_assigned;
        this.last_returned = last_returned;
        this.publisher = publisher;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public Boolean getElevator() {
        return elevator;
    }

    public void setElevator(Boolean elevator) {
        this.elevator = elevator;
    }

    public Boolean getRestricted() {
        return restricted;
    }

    public void setRestricted(Boolean restricted) {
        this.restricted = restricted;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public Date getLast_assigned() {
        return last_assigned;
    }

    public void setLast_assigned(Date last_assigned) {
        this.last_assigned = last_assigned;
    }

    public Date getLast_returned() {
        return last_returned;
    }

    public void setLast_returned(Date last_returned) {
        this.last_returned = last_returned;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Territory{" +
                "available=" + available +
                ", number=" + number +
                ", extension='" + extension + '\'' +
                ", address='" + address + '\'' +
                ", zone='" + zone + '\'' +
                ", elevator=" + elevator +
                ", restricted=" + restricted +
                ", observations='" + observations + '\'' +
                ", last_assigned=" + last_assigned +
                ", last_returned=" + last_returned +
                ", publisher=" + publisher +
                '}';
    }
}