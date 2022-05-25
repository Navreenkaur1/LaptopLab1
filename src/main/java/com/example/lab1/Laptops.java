package com.example.lab1;

import java.util.Arrays;
import java.util.List;

public class Laptops {
    private String company,model;
    double price;

    /**
     *
     * @param company-apple,dell,hp;
     * @param model-DEll inspiron, macbook air etc, Dell latitude, HP Envy, Dell xps, Lenove chromebook, Lenovo yoga 9i;
     * @param price;
     */
    public Laptops(String company, String model, int window, double price) {
        setCompany(company);

        setCompany(company);
        setModel(model);
        setPrice(price);
    }

    public void setCompany(String company) {
        List<String> companies = Arrays.asList("Apple","DELL","hp","lenovo");
        if(companies.contains(company))
            this.company=company;
        else throw new IllegalArgumentException(company + " is not found, choose from " + companies);
    }

    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        model =model.trim();
        if (model.length()>5)
            this.model = model;
        else
            throw new IllegalArgumentException("Model should be greater than 5 characters ");
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0)
            this.price = price;
        else
            throw new IllegalArgumentException("price cannot be zero");
    }
}
