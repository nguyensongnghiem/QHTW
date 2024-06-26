package com.mobifone.qhtw.model;

import javax.persistence.*;

@Entity
public class Site {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    private String siteId;
    private String siteId2;
    private String siteName;
    private Float latitude;
    private Float longitude;
    private String address;
    private Integer siteOwnerId;
    private boolean status;
    private String note;
    @ManyToOne
    @JoinColumn(name = "provinceId",nullable = false)
    private Province province;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getSiteId2() {
        return siteId2;
    }

    public void setSiteId2(String siteId2) {
        this.siteId2 = siteId2;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getSiteOwnerId() {
        return siteOwnerId;
    }

    public void setSiteOwnerId(Integer siteOwnerId) {
        this.siteOwnerId = siteOwnerId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }
}
