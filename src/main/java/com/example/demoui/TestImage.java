package com.example.demoui;

import javafx.scene.image.Image;

import java.io.File;
import java.net.MalformedURLException;

public class TestImage {
    //Получаем гифку при помощи Giphy API

    /*
    Giphy giphy = new Giphy(API_KEY);
    SearchFeed feed = giphy.search("cat", 1, 0);
	feed.getDataList().get(0).getImages().getOriginal().getUrl();
    */

    //Показываем ее
    File file = new File("C:/MyImages/myphoto.jpg");
    String localUrl = file.toURI().toURL().toString();
    Image image = new Image(localUrl);

    public TestImage() throws MalformedURLException {
    }
}
