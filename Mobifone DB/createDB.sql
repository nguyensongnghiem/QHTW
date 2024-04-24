create database if not exists mobifone;
-- table tinh

create table dai_vt (
	ma_dai int primary key auto_increment,
    ten_dai varchar(200)
    );
insert into dai_vt (ma_dai, ten_dai) values 
(1, "Đài  VT Đà Nẵng"),
(2,	"Đài  VT Bình Định"),
(3, "Đài  VT Đắk Lắk");


create table tinh (
	ma_tinh varchar(10) primary key ,
    ten_tinh varchar(50),
    ma_dai int,
    foreign key (ma_dai) references dai_vt(ma_dai)   
);
insert into tinh(ma_tinh,ten_tinh,ma_dai) value ('KT','Kon Tum',3);
insert into tinh(ma_tinh,ten_tinh,ma_dai) value ('DG','Đắk Nông',3);
insert into tinh(ma_tinh,ten_tinh,ma_dai) value ('GL','Gia Lai',3);
insert into tinh(ma_tinh,ten_tinh,ma_dai) value ('QT','Quảng Trị',1);
insert into tinh(ma_tinh,ten_tinh,ma_dai) value ('QN','Quảng Ngãi',2);
insert into tinh(ma_tinh,ten_tinh,ma_dai) value ('PY','Phú Yên',2);
insert into tinh(ma_tinh,ten_tinh,ma_dai) value ('DL','Đắk Lắk',3);
insert into tinh(ma_tinh,ten_tinh,ma_dai) value ('KH','Khánh Hòa',2);
insert into tinh(ma_tinh,ten_tinh,ma_dai) value ('BD','Bình Định',2);
insert into tinh(ma_tinh,ten_tinh,ma_dai) value ('HU','TT-Huế',1);
insert into tinh(ma_tinh,ten_tinh,ma_dai) value ('DN','Đà Nẵng',1);
insert into tinh(ma_tinh,ten_tinh,ma_dai) value ('QA','Quảng Nam',1);

 -- table loai_thiet_bi_td
create table loai_thiet_bi_td (
	ma_loai_thiet_bi_td int primary key auto_increment,
    ten_loai_thiet_bi_td varchar(50)
);
insert into loai_thiet_bi_td(ma_loai_thiet_bi_td,ten_loai_thiet_bi_td) value (1,'MTC');
insert into loai_thiet_bi_td(ma_loai_thiet_bi_td,ten_loai_thiet_bi_td) value (2,'AGG');
insert into loai_thiet_bi_td(ma_loai_thiet_bi_td,ten_loai_thiet_bi_td) value (3,'2GGW');
insert into loai_thiet_bi_td(ma_loai_thiet_bi_td,ten_loai_thiet_bi_td) value (4,'CSG');
insert into loai_thiet_bi_td(ma_loai_thiet_bi_td,ten_loai_thiet_bi_td) value (5,'LSW');
insert into loai_thiet_bi_td(ma_loai_thiet_bi_td,ten_loai_thiet_bi_td) value (6,'Tellabs');
insert into loai_thiet_bi_td(ma_loai_thiet_bi_td,ten_loai_thiet_bi_td) value (7,'OLT');


create table vendor (
	ma_vendor int primary key auto_increment,
    ten_vendor varchar(50)
);
insert into vendor(ma_vendor,ten_vendor) value (1,'Nokia');
insert into vendor(ma_vendor,ten_vendor) value (2,'Juniper');
insert into vendor(ma_vendor,ten_vendor) value (3,'Cisco');
insert into vendor(ma_vendor,ten_vendor) value (4,'Huawei');
insert into vendor(ma_vendor,ten_vendor) value (5,'Dasan');
insert into vendor(ma_vendor,ten_vendor) value (6,'Ericsson');
insert into vendor(ma_vendor,ten_vendor) value (7,'Alcatel');
insert into vendor(ma_vendor,ten_vendor) value (8,'ZTE');
-- 
create table loai_router (
	ma_loai_router int primary key auto_increment, 
    ten_loai_router varchar(50),
    ma_vendor int,
    foreign key (ma_vendor) references vendor(ma_vendor)   
);
insert into loai_router(ma_loai_router,ten_loai_router,ma_vendor) value (1,'MX960',2);
insert into loai_router(ma_loai_router,ten_loai_router,ma_vendor) value (2,'MX480',2);
insert into loai_router(ma_loai_router,ten_loai_router,ma_vendor) value (3,'MX104',2);
insert into loai_router(ma_loai_router,ten_loai_router,ma_vendor) value (4,'ACX2100',2);
insert into loai_router(ma_loai_router,ten_loai_router,ma_vendor) value (5,'7750 SR-12e',1);
insert into loai_router(ma_loai_router,ten_loai_router,ma_vendor) value (6,'7750 SR-3e',1);
insert into loai_router(ma_loai_router,ten_loai_router,ma_vendor) value (7,'7705 SAR-18',1);
insert into loai_router(ma_loai_router,ten_loai_router,ma_vendor) value (8,'7705 SAR-X',1);
insert into loai_router(ma_loai_router,ten_loai_router,ma_vendor) value (9,'7750 SR-12',1);
insert into loai_router(ma_loai_router,ten_loai_router,ma_vendor) value (10,'MX-480',2);
insert into loai_router(ma_loai_router,ten_loai_router,ma_vendor) value (11,'ACX1000',2);
insert into loai_router(ma_loai_router,ten_loai_router,ma_vendor) value (12,'ASR920',3);
insert into loai_router(ma_loai_router,ten_loai_router,ma_vendor) value (13,'ASR901',3);
insert into loai_router(ma_loai_router,ten_loai_router,ma_vendor) value (14,'7750 SR-7s',1);
insert into loai_router(ma_loai_router,ten_loai_router,ma_vendor) value (15,'7250  IXR-e',1);

-- Sở hữu Cơ sở hạ tầng
create table so_huu_csht (
	ma_so_huu_csht int primary key auto_increment, 
    ten_chu_so_huu_csht varchar(50)   
);
insert into so_huu_csht(ma_so_huu_csht,ten_chu_so_huu_csht) value (1,'MobiFone');
insert into so_huu_csht(ma_so_huu_csht,ten_chu_so_huu_csht) value (2,'VNPT');
insert into so_huu_csht(ma_so_huu_csht,ten_chu_so_huu_csht) value (3,'Viettel');
insert into so_huu_csht(ma_so_huu_csht,ten_chu_so_huu_csht) value (4,'CSHT có sẵn');
insert into so_huu_csht(ma_so_huu_csht,ten_chu_so_huu_csht) value (5,'Xã hội hóa');
insert into so_huu_csht(ma_so_huu_csht,ten_chu_so_huu_csht) value (6,'Khác');


create table csht (
	ma_csht int primary key auto_increment, 
    site_id varchar(50),
    site_id_khac varchar(50),
    ten_tram varchar(200),
    vi_do float,
    kinh_do float,
    dia_chi varchar(500),
    ma_so_huu_csht int,
    trang_thai_hoat_dong boolean,
    ghi_chu varchar(500),
    ma_tinh varchar(10),
    foreign key (ma_tinh) references tinh(ma_tinh),
    foreign key (ma_so_huu_csht) references so_huu_csht(ma_so_huu_csht)   
);

set global local_infile=true;
    show global variables like 'local_infile';
    -- .\mysql --local_infile=1 -u root -p mobifone
    -- mysql> LOAD DATA LOCAL INFILE 'E:\\csht.txt' INTO TABLE csht FIELDS TERMINATED BY ',' ENCLOSED BY '"' LINES TERMINATED BY '\r\n';


create table router (
	ma_router int primary key auto_increment, 
    ten_router varchar(50),
    ma_loai_router int ,
    ma_loai_thiet_bi_td int ,
	ma_csht int ,
    ip_quan_ly varchar(30),
    trang_thai_hoat_dong boolean,
    ghi_chu varchar(500),
    foreign key (ma_loai_router) references loai_router(ma_loai_router),
    foreign key (ma_loai_thiet_bi_td) references loai_thiet_bi_td(ma_loai_thiet_bi_td)   ,
    foreign key (ma_csht) references csht(ma_csht)
);
