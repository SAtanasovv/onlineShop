package com.satanasov.onlineShop.model;

import com.satanasov.onlineShop.model.enums.ItemType;

import javax.persistence.*;

@Entity
@Table(name="items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "item_type")
    @Enumerated(EnumType.STRING)
    private ItemType itemType = ItemType.NONE;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "review_id")
    private Review review;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "media_id")
    private Media media;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "seller_information_id")
    private SellerInformation sellerInformation;
    @Column(name = "item_name")
    private String itemName;
    @Column(name = "item_description_name")
    private String itemDescription;
    @Column
    private Double price;
    @Column
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
