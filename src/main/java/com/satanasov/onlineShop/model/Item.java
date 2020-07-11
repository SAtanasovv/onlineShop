package com.satanasov.onlineShop.model;

import com.satanasov.onlineShop.model.enums.ItemType;

public class Item {
    private Long id;
    private ItemType itemType = ItemType.NONE;
    private Review review;
    private Media media;
    private SellerInformation sellerInformation;
    private String itemName;
    private String itemDescription;
    private Double price;
    private Double quantity;

    public Long getId() {
        return id;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }

    public Media getMedia() {
        return media;
    }

    public void setMedia(Media media) {
        this.media = media;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public SellerInformation getSellerInformation() {
        return sellerInformation;
    }

    public void setSellerInformation(SellerInformation sellerInformation) {
        this.sellerInformation = sellerInformation;
    }
}
