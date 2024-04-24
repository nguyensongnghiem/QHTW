SELECT count(*) from router;
SELECT count(*) from csht;
SELECT * from router WHERE ma_csht is not null;

SELECT ten_router, site_id , vi_do, kinh_do, ten_loai_thiet_bi_td
from router 
join csht on router.ma_csht = csht.ma_csht
left join loai_router on loai_router.ma_loai_router = router.ma_loai_router
left join loai_thiet_bi_td on loai_thiet_bi_td.ma_loai_thiet_bi_td = router.ma_loai_thiet_bi_td
;


-- All router GE

CREATE view ge_router as
SELECT ten_router as Name ,  vi_do as Latitude , kinh_do as Longitude, ten_loai_thiet_bi_td, loai_router.ten_loai_router
from router 
join csht on router.ma_csht = csht.ma_csht
left join loai_router on loai_router.ma_loai_router = router.ma_loai_router
left join loai_thiet_bi_td on loai_thiet_bi_td.ma_loai_thiet_bi_td = router.ma_loai_thiet_bi_td
LEFT JOIN loai_router lr on lr.ma_loai_router = router.ma_loai_router

;


-- AGG GE
CREATE view ge_router_agg as
SELECT ten_router as Name ,  vi_do as Latitude , kinh_do as Longitude, if(ten_loai_thiet_bi_td = "AGG",242,0) as  Icon, if(ten_loai_thiet_bi_td = "AGG","red",0) as  IconColor
from router 
join csht on router.ma_csht = csht.ma_csht
left join loai_router on loai_router.ma_loai_router = router.ma_loai_router
left join loai_thiet_bi_td on loai_thiet_bi_td.ma_loai_thiet_bi_td = router.ma_loai_thiet_bi_td
LEFT JOIN loai_router lr on lr.ma_loai_router = router.ma_loai_router
WHERE ten_loai_thiet_bi_td = "AGG";


-- CSG GE
CREATE view ge_router_csg as
SELECT ten_router as Name ,  vi_do as Latitude , kinh_do as Longitude, if(ten_loai_thiet_bi_td = "CSG",242,0) as  Icon, if(ten_loai_thiet_bi_td = "CSG","green",0) as  IconColor
from router 
join csht on router.ma_csht = csht.ma_csht
left join loai_router on loai_router.ma_loai_router = router.ma_loai_router
left join loai_thiet_bi_td on loai_thiet_bi_td.ma_loai_thiet_bi_td = router.ma_loai_thiet_bi_td
LEFT JOIN loai_router lr on lr.ma_loai_router = router.ma_loai_router
WHERE ten_loai_thiet_bi_td = "CSG";