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
Program Explanation: This is one of the activities the user can choose to be directed to and contains
a button to direct the user back to MainActivity.
*************************************

*/

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class ItemsActivity extends MainActivity {
    /*Every application requires the below block of code, onCreate is the method used to bundle the
           * activity together on the screen of the application. setContentView is the method that is used
           * to specify which .xml file this java code will interact with while being displayed on the users
           * device, activity_items in this instance.*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items);

/*I created a homeBtn variable as a Button to direct the user back to MainActivity. Like the main,
* homeBtn listens for the user to tap/click the button and startActivity directs the user back to
* MainActivity*/
        Button homeBtn = (Button) findViewById(R.id.homeButton);

        homeBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(ItemsActivity.this, MainActivity.class));
            }
        });
    }
}