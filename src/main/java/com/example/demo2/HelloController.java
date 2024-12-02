package com.example.demo2;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.ComboBox;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class HelloController {

    public ArrayList<Image> allImages;
    @FXML
    public Label titleTextLabel;
    public Label creationTextLabel;
    public RadioButton oceanViewRb;
    public RadioButton cityViewRb;
    public ComboBox sunCbx;
    public ComboBox seasonCbx;
    public ImageView currentBackgroundIv;
    public Button uploadOwnButton;

    Image startingBg;
    Image startingCityView;
    Image startingOceanView;
    Image winterNoonOcean;
    Image winterNoonCity;
    Image springNoonOcean;
    Image springNoonCity;
    Image summerNoonOcean;
    Image summerNoonCity;
    Image autumnNoonOcean;
    Image autumnNoonCity;
    Image winterSunriseOcean;
    Image winterSunriseCity;
    Image springSunriseOcean;
    Image springSunriseCity;
    Image summerSunriseOcean;
    Image summerSunriseCity;
    Image autumnSunriseOcean;
    Image autumnSunriseCity;



    public boolean winterOcean;
    public boolean winterCity;
    public boolean springOcean;
    public boolean springCity;
    public boolean summerOcean;
    public boolean summerCity;
    public boolean autumnOcean;
    public boolean autumnCity;


    @FXML
    public void initialize () throws FileNotFoundException {
        titleTextLabel.setText("Choose your background!");
        FileInputStream image1 = new FileInputStream("src/BaseBackgroundV2.jpg");
        startingBg = new Image(image1);
        currentBackgroundIv.setImage(startingBg);
        FileInputStream image2 = new FileInputStream("src/BaseCityView.jpg");
        startingCityView = new Image(image2);
        FileInputStream image3 = new FileInputStream("src/BaseOceanView.jpg");
        startingOceanView = new Image(image3);
        FileInputStream image4 = new FileInputStream("src/noonAC.jpg");
        autumnNoonCity = new Image(image4);
        FileInputStream image5 = new FileInputStream("src/noonAO.jpg");
        autumnNoonOcean = new Image(image5);
        FileInputStream image6 = new FileInputStream("src/noonSpC.jpg");
        springNoonCity = new Image(image6);
        FileInputStream image7 = new FileInputStream("src/noonSpO.jpg");
        springNoonOcean = new Image(image7);
        FileInputStream image8 = new FileInputStream("src/noonSuO.jpg");
        summerNoonOcean = new Image(image8);
        FileInputStream image9 = new FileInputStream("src/noonWC.jpg");
        winterNoonCity = new Image(image9);
        FileInputStream image10 = new FileInputStream("src/noonWO.jpg");
        winterNoonOcean = new Image(image10);
        FileInputStream image11 = new FileInputStream("src/sunriseAO.jpg");
        autumnSunriseOcean = new Image(image11);
        FileInputStream image12 = new FileInputStream("src/SunriseFallPhillyCity.jpg");
        autumnSunriseCity = new Image(image12);
        FileInputStream image13 = new FileInputStream("src/sunriseSpO.jpg");
        springSunriseOcean = new Image(image13);
        FileInputStream image14 = new FileInputStream("src/SunriseSpringPhillyCity.jpg");
        springSunriseCity = new Image(image14);
        FileInputStream image15 = new FileInputStream("src/SunriseSummerPhillyCity.jpg");
        summerSunriseCity = new Image(image15);
        FileInputStream image16 = new FileInputStream("src/sunriseSuO.jpg");
        summerSunriseOcean = new Image(image16);
        FileInputStream image17 = new FileInputStream("src/SunriseWinterPhillyCity.jpg");
        winterSunriseCity = new Image(image17);
        FileInputStream image18 = new FileInputStream("src/sunriseWO.png");
        winterSunriseOcean = new Image(image18);
        FileInputStream image19 = new FileInputStream("src/noonSuC.jpg");














        creationTextLabel.setText("Look here to see what you have made so far!");
        seasonCbx.setItems(FXCollections.observableArrayList(
                 "Winter", "Spring", "Summer", "Autumn"
        ));
        sunCbx.setItems(FXCollections.observableArrayList(
                "Sunrise", "Noon"
        ));

        sunCbx.setVisible(false);

        winterCity = false;
        winterOcean = false;
        springOcean = false;
        springCity = false;
        summerOcean = false;
        summerCity = false;
        autumnOcean = false;
        autumnCity = false;
    }


    public void baseTypeViewSelected(){

        ToggleGroup viewGroup = new ToggleGroup();
        oceanViewRb.setToggleGroup(viewGroup);
        oceanViewRb.setSelected(false);
        cityViewRb.setToggleGroup(viewGroup);
        cityViewRb.setSelected(false);

        cityViewRb.setOnAction(actionEvent -> {
            currentBackgroundIv.setImage(startingCityView);
            creationTextLabel.setText("Basic city view");
        });

        oceanViewRb.setOnAction(actionEvent -> {
            currentBackgroundIv.setImage(startingOceanView);
            creationTextLabel.setText("Basic ocean view");

        });

    }
//seasonArray list index - 0 = Winter, 1 = Spring, 2 = Summer, 3 = Autumn
    public void seasonChoiceDecided(){
        boolean oceanViewDecided = oceanViewRb.isSelected();
        boolean cityViewDecided = cityViewRb.isSelected();
      seasonCbx.setOnAction(actionEvent -> {
          int selectedSeasonIndex = seasonCbx.getSelectionModel().getSelectedIndex();

          if (selectedSeasonIndex == 0 && oceanViewDecided){
              creationTextLabel.setText("Winter ocean view");
              sunCbx.setVisible(true);
              winterOcean = true;

          }

          if (selectedSeasonIndex == 0 && cityViewDecided){
              creationTextLabel.setText("Winter city view");
              sunCbx.setVisible(true);
              winterCity = true;
          }
          if(selectedSeasonIndex == 1 && oceanViewDecided){
              creationTextLabel.setText("Spring ocean view");
              sunCbx.setVisible(true);
              springOcean = true;
          }
          if(selectedSeasonIndex == 1 && cityViewDecided){
              creationTextLabel.setText("Spring city view");
              sunCbx.setVisible(true);
              springCity = true;
          }
          if(selectedSeasonIndex == 2 && oceanViewDecided){
              creationTextLabel.setText("Summer ocean view");
              sunCbx.setVisible(true);
              summerOcean = true;
          }
          if(selectedSeasonIndex == 2 && cityViewDecided){
              creationTextLabel.setText("Summer ciy view");
              sunCbx.setVisible(true);
              summerCity = true;
          }
          if(selectedSeasonIndex == 3 && oceanViewDecided){
              creationTextLabel.setText("Autumn ocean view");
              sunCbx.setVisible(true);
              autumnOcean = true;

          }
          if(selectedSeasonIndex == 3 && cityViewDecided){
              creationTextLabel.setText("Autumn city view");
              sunCbx.setVisible(true);
              autumnCity = true;
          }


      });
    }
    // 0 = Sunrise, 1 = Noon
    public void sunDecisionMade() {
        sunCbx.setOnAction(actionEvent ->{
            int selectedSunIndex = sunCbx.getSelectionModel().getSelectedIndex();
            //winter
            if(selectedSunIndex == 0 && winterOcean) {
                creationTextLabel.setText("Winter sunrise ocean view");
                currentBackgroundIv.setImage(winterSunriseOcean);
            }
            if(selectedSunIndex == 0 && winterCity){
                creationTextLabel.setText("Winter sunrise city view");
                currentBackgroundIv.setImage(winterSunriseCity);
            }
            if(selectedSunIndex == 1 && winterOcean){
                creationTextLabel.setText("Winter noon ocean view");
                currentBackgroundIv.setImage(winterNoonOcean);
            }
            if(selectedSunIndex == 1 && winterCity){
                creationTextLabel.setText("Winter noon city view");
                currentBackgroundIv.setImage(winterNoonCity);
            }
            //spring
            if(selectedSunIndex == 0 && springOcean){
                creationTextLabel.setText("Spring sunrise ocean view");
                currentBackgroundIv.setImage(springSunriseOcean);
            }
            if(selectedSunIndex == 0 && springCity){
                creationTextLabel.setText("Spring sunrise city view");
                currentBackgroundIv.setImage(springSunriseCity);
            }
            if(selectedSunIndex == 1 && springOcean){
                creationTextLabel.setText("Spring noon ocean view");
                currentBackgroundIv.setImage(springNoonOcean);
            }
            if(selectedSunIndex == 1 && springCity){
                creationTextLabel.setText("Spring noon city view");
                currentBackgroundIv.setImage(springNoonCity);
            }
            //summer
            if(selectedSunIndex == 0 && summerOcean){
                creationTextLabel.setText("Summer sunrise ocean view");
                currentBackgroundIv.setImage(summerSunriseOcean);
            }
            if(selectedSunIndex == 0 && summerCity){
                creationTextLabel.setText("Summer sunrise city view");
                currentBackgroundIv.setImage(summerSunriseCity);
            }
            if(selectedSunIndex == 1 && summerOcean){
                creationTextLabel.setText("Summer noon ocean view");
                currentBackgroundIv.setImage(summerNoonOcean);
            }
            if(selectedSunIndex == 1 && summerCity){
                creationTextLabel.setText("Summer noon city view");
                currentBackgroundIv.setImage(summerNoonCity);
            }
            //autumn
            if(selectedSunIndex == 0 && autumnOcean){
                creationTextLabel.setText("Autumn sunrise ocean view");
                currentBackgroundIv.setImage(autumnSunriseOcean);
            }
            if(selectedSunIndex == 0 && autumnCity){
                creationTextLabel.setText("Autumn sunrise city view");
                currentBackgroundIv.setImage(autumnSunriseCity);
            }
            if(selectedSunIndex == 1 && autumnOcean){
                creationTextLabel.setText("Autumn noon ocean view");
                currentBackgroundIv.setImage(autumnNoonOcean);
            }
            if(selectedSunIndex == 1 && autumnCity){
                creationTextLabel.setText("Autumn noon city view");
                currentBackgroundIv.setImage(autumnNoonCity);
            }

        });
    }
}