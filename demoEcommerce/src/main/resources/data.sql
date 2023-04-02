INSERT INTO product (
    id, NAME, overview, long_description,
    price, poster, image_local, rating,
    in_stock, best_seller, featured
)
VALUES
    (
        1, "astercook kitchen knife set",
        "lorem", "lorem ipsum", 29, "https://res.cloudinary.com/dawui1ip0/image/upload/v1679716863/ecommerce_demo/item1001_hobvci.jpg",
        "src/assets/images/items/item1001.jpg",
        5, true, true, true
    ),
    (
        2, "digital scale", "lorem", "lorem ipsum",
        19, "https://res.cloudinary.com/dawui1ip0/image/upload/v1679717185/ecommerce_demo/item1002_lyygsu.jpg",
        "src/assets/images/items/item1002.jpg",
        5, false, false, false
    ),
    (
        3, "dough scrapper", "lorem", "lorem ipsum",
        29, "https://res.cloudinary.com/dawui1ip0/image/upload/v1679717190/ecommerce_demo/item1003_pcl33c.jpg",
        "src/assets/images/items/item1003.jpg",
        3, true, false, false
    ),
    (
        4, "measuring cups", "lorem", "lorem ipsum",
        99, "https://res.cloudinary.com/dawui1ip0/image/upload/v1679717194/ecommerce_demo/item1004_bmhqj7.jpg",
        "src/assets/images/items/item1004.jpg",
        5, true, true, false
    ),
    (
        5, "kitchen towels", "lorem", "lorem ipsum",
        19, "https://res.cloudinary.com/dawui1ip0/image/upload/v1679717198/ecommerce_demo/item1005_zm9nzd.jpg",
        "src/assets/images/items/item1005.jpg",
        3, true, false, false
    ),
    (
        6, "scissors", "lorem ipsum", "lorem ipsum",
        99, "https://res.cloudinary.com/dawui1ip0/image/upload/v1679717205/ecommerce_demo/item1006_zrvfqh.jpg",
        "src/assets/images/items/item1006.jpg",
        5, true, false, false
    ),
    (
        7, "digital thermometer", "lorem",
        "lorem ipsum", 19, "https://res.cloudinary.com/dawui1ip0/image/upload/v1679717230/ecommerce_demo/item1007_ct2db6.jpg",
        "src/assets/images/items/item1007.jpg",
        5, true, false, true
    ),
    (
        8, "kitchen tong", "lorem", "lorem ipsum",
        29, "https://res.cloudinary.com/dawui1ip0/image/upload/v1679717258/ecommerce_demo/item1008_ebugph.jpg",
        "src/assets/images/items/item1008.jpg",
        5, true, true, false
    ),
    (
        9, "forks", "lorem", "lorem ipsum",
        29, "https://res.cloudinary.com/dawui1ip0/image/upload/v1679717261/ecommerce_demo/item1009_d07fax.jpg",
        "src/assets/images/items/item1009.jpg",
        5, true, false, false
    ),
    (
        10, "aluminium mixing bowl", "lorem",
        "lorem ipsum", 19, "https://res.cloudinary.com/dawui1ip0/image/upload/v1679717264/ecommerce_demo/item1010_iazlmy.jpg",
        "src/assets/images/items/item1010.jpg",
        4, true, false, false
    ),
    (
        11, "bread kneading mat", "lorem",
        "lorem ipsum", 29, "https://res.cloudinary.com/dawui1ip0/image/upload/v1679717272/ecommerce_demo/item1011_y9ucnw.jpg",
        "src/assets/images/items/item1011.jpg",
        5, true, true, true
    ),
    (
        12, "oven tray", "lorem", "lorem ipsum",
        9, "https://res.cloudinary.com/dawui1ip0/image/upload/v1679717275/ecommerce_demo/item1012_ubq1uk.jpg",
        "src/assets/images/items/item1012.jpg",
        5, true, false, false
    ),
    (
        13, "muffin tray", "lorem", "lorem ipsum",
        19, "https://res.cloudinary.com/dawui1ip0/image/upload/v1679717279/ecommerce_demo/item1013_pfwpbv.jpg",
        "src/assets/images/items/item1013.jpg",
        4, false, false, false
    ),
    (
        14, "small loaf pans", "lorem", "lorem ipsum",
        19, "https://res.cloudinary.com/dawui1ip0/image/upload/v1679717282/ecommerce_demo/item1014_ed0en4.jpg",
        "src/assets/images/items/item1014.jpg",
        4, false, false, false
    ),
    (
        15, "parchment paper", "lorem", "lorem ipsum",
        9, "https://res.cloudinary.com/dawui1ip0/image/upload/v1679717286/ecommerce_demo/item1015_xt12hj.jpg",
        "src/assets/images/items/item1015.jpg",
        2, false, false, false
    );

insert into _order(id, amount_paid, quantity, user_id)
values
    (1, 48, 2, 2),
    (2, 29, 1, 1),
    (3, 19, 1, 2);

insert into order_product(order_id, product_id)
values
    (1, 2),
    (1, 9),
    (2, 1),
    (3, 13);