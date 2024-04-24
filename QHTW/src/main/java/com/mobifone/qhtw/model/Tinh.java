package com.mobifone.qhtw.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "tinh")
public class Tinh {
    @Id
    @Column(name = "ma_tinh")
    private String maTinh;
    @Column(name = "ten_tinh")
    private String tenTinh;
    @Column(name = "ma_dai")
    private int maDai;
    @OneToMany(mappedBy = "tinh")
    private Set<Csht> CshtSet;
}
