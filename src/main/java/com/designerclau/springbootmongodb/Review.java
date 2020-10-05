package com.designerclau.springbootmongodb;

public class Review {

      private String usename;
      private int rating;
      private boolean approved;

      protected Review(){};


    public Review(String usename, int rating, boolean approved) {
        this.usename = usename;
        this.rating = rating;
        this.approved = approved;
    }

    public String getUsename() {
        return usename;
    }

    public int getRating() {
        return rating;
    }

    public boolean isApproved() {
        return approved;
    }
}
