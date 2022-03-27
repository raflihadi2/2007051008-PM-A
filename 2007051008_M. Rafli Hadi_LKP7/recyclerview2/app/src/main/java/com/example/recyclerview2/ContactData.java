package com.example.recyclerview2;

import java.util.ArrayList;

public class ContactData {
    public static String[][] data = new String[][]{
            {"Tantyo Costello", "https://upload.wikimedia.org/wikipedia/id/5/5c/Spongebob-squarepants.png"},
            {"Darren Salviore", "https://upload.wikimedia.org/wikipedia/en/thumb/3/33/Patrick_Star.svg/1200px-Patrick_Star.svg.png"},
            {"Willy Efraim", "https://static.wikia.nocookie.net/spongebob/images/3/32/Sheldon_Plankton_stock_art.png/revision/latest?cb=20181202213854&path-prefix=id"},
            {"Mudhy", "https://static.wikia.nocookie.net/spongebob/images/7/7b/Krabs_artwork.png/revision/latest/top-crop/width/360/height/450?cb=20210504121742&path-prefix=id"},
            {"Selina", "https://static.wikia.nocookie.net/spongebob/images/e/e6/Sandy_Cheeks.png/revision/latest?cb=20201122125449&path-prefix=id"},
            {"Banu Breaker", "https://upload.wikimedia.org/wikipedia/en/thumb/8/8f/Squidward_Tentacles.svg/1200px-Squidward_Tentacles.svg.png"},
            {"Fossil Costello", "https://static.wikia.nocookie.net/nickelodeon/images/f/f1/Larry_the_Lobster_Nickelodeon_1.png/revision/latest/top-crop/width/360/height/450?cb=20190220132827&path-prefix=id"},
            {"Max Luciano", "https://static.wikia.nocookie.net/nickelodeon/images/e/ef/Gambar_stok_Bubble_Bass.png/revision/latest?cb=20190128163909&path-prefix=id"},
            {"Thomas Merlyn", "https://static.wikia.nocookie.net/nickelodeon/images/7/7d/Neptune_with_trident_render.png/revision/latest?cb=20190127020014&path-prefix=id"},
            {"Roy Merlyn", "https://static.wikia.nocookie.net/spongebob/images/d/d1/Squilliam.png/revision/latest/top-crop/width/360/height/450?cb=20210714041320&path-prefix=id"}
    };

    public static ArrayList<Contact> getListData() {
        Contact contact = null;
        ArrayList<Contact> list = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            contact = new Contact();
            contact.setName(data[i][0]);
            contact.setPhoto(data[i][1]);
            list.add(contact);
        }
        return list;
    }
}
