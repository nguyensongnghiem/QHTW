package com.mobifone.qhtw.model;

import javax.persistence.*;

@Entity
@Table(name = "csht")
public class Csht {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "ma_csht")
    private Long maCSHT ;
    @Column(name = "site_id")
    private String siteId;
    @Column(name = "site_id_khac")
    private String siteIdKhac;
    @Column(name = "ten_tram")
    private String tenTram;
    @Column(name = "vi_do")
    private Float viDo;
    @Column(name = "kinh_do")
    private Float kinhDo;
    @Column(name = "dia_chi")
    private String diaChi;
    @Column(name = "ma_so_huu_csht")
    private Integer maSoHuuCsht;
    @Column(name = "trang_thai_hoat_dong")
    private boolean trangThai;
    @Column(name = "ghi_chu")
    private String ghiChu;
    @Column(name = "ma_tinh")
    private String maTinh;

    public Csht() {
    }

    public Csht(String siteId, String siteIdKhac, String tenTram, Float viDo, Float kinhDo, String diaChi, Integer maSoHuuCsht, boolean trangThai, String ghiChu, String maTinh) {
        this.siteId = siteId;
        this.siteIdKhac = siteIdKhac;
        this.tenTram = tenTram;
        this.viDo = viDo;
        this.kinhDo = kinhDo;
        this.diaChi = diaChi;
        this.maSoHuuCsht = maSoHuuCsht;
        this.trangThai = trangThai;
        this.ghiChu = ghiChu;
        this.maTinh = maTinh;
    }

    public Long getMaCSHT() {
        return maCSHT;
    }

    public void setMaCSHT(Long maCSHT) {
        this.maCSHT = maCSHT;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getSiteIdKhac() {
        return siteIdKhac;
    }

    public void setSiteIdKhac(String siteIdKhac) {
        this.siteIdKhac = siteIdKhac;
    }

    public String getTenTram() {
        return tenTram;
    }

    public void setTenTram(String tenTram) {
        this.tenTram = tenTram;
    }

    public Float getViDo() {
        return viDo;
    }

    public void setViDo(Float viDo) {
        this.viDo = viDo;
    }

    public Float getKinhDo() {
        return kinhDo;
    }


    public void setKinhDo(Float kinhDo) {
        this.kinhDo = kinhDo;
    }
    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Integer getMaSoHuuCsht() {
        return maSoHuuCsht;
    }

    public void setMaSoHuuCsht(Integer maSoHuuCsht) {
        this.maSoHuuCsht = maSoHuuCsht;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public String getMaTinh() {
        return maTinh;
    }

    public void setMaTinh(String maTinh) {
        this.maTinh = maTinh;
    }

    @Override
    public String toString() {
        return "Csht{" +
                "maCSHT=" + maCSHT +
                ", siteId='" + siteId + '\'' +
                ", siteIdKhac='" + siteIdKhac + '\'' +
                ", tenTram='" + tenTram + '\'' +
                ", viDo=" + viDo +
                ", kinhDo=" + kinhDo +
                ", maSoHuuCsht=" + maSoHuuCsht +
                ", trangThai=" + trangThai +
                ", ghiChu='" + ghiChu + '\'' +
                ", maTinh='" + maTinh + '\'' +
                '}';
    }
}
