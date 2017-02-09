package edu.wmich.lab1cwienc9061;
/*
Programmer: Craig Wiencek
Class ID: cwienc9061
Lab #1: Android for World Domination
CIS 2610: Business Mobile Programming
Spring 2017
Due date: 2/02/17
Date completed: 02/01/17
**************************************
Program Explanation: This is the mainActivity Java file that runs when the app is initially opened
and displays activity_main.xml. This activity code contains two buttons, one that directs the user
to DataActivity.java and ItemsActivity.java.
*************************************

*/
/*For button widgets to function effectively I imported android.widget.Button class. The Button class
* enables button events to take place, like when the user click/taps a button. Furthermore, .content.Intent
* and .view.View class were necessary imports. Intent class to perform operations with startActivity
* and direct events to the respective class and View class for event handling and basic building blocks for user
* interface components*/
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

/*Public class indicates the class MainActivity and its objects are accessible by other classes.
 * MainActivity is non-static because it contains objects like buttons. Extends indicates that
 * MainActivity.java is the subclass of superclass AppCompactActivity.java*/
public class MainActivity extends AppCompatActivity {




    /*Every application requires the below block of code, onCreate is the method used to bundle the
        * first activity screen of the application together. setContentView is the method that is used
        * to specify which .xml file to display and in what layout, this code will display
        * activity_main.xml in relative layout*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    /*Here I instantiated my first object that take on the properties of the button class, itemBtn.
    * By using the findViewById method we are able to specify which <button> in the
    * activity_main.xml file itemsBtn will interact with, id itemButton*/
        Button itemsBtn = (Button) findViewById(R.id.itemButton);


    /*We then take our button variable (itemsBtn) and use setOnClickListener method to listen for when
* the user clicks/taps button. When triggered, the method onClick executes and startActivity
* holds the argument of a new Intent method that directs from MainActivity to ItemsActivity.*/
        itemsBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, ItemsActivity.class));
            }
        });

    /*Here I instantiated my second object that take on the properties of the button class, dataBtn.
    * By using the findViewById method we are able to specify which <button> in the
    * activity_main.xml file itemsBtn objects will interact with, id dataButton*/
        Button dataBtn = (Button) findViewById(R.id.dataButton);


    /*dataBtn then uses setOnClickListener method to listen for when the user taps/clicks the button
    * and once it does onClick method executes and startActivity directs the event from MainActivity
    * to DataActivity*/
        dataBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View w){
                startActivity(new Intent(MainActivity.this, DataActivity.class));
            }
        });



    }
}

