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
Program Explanation: This activity is an alternative direction of the app the user can go in,
 contains one button that directs the user back to MainAtivity.
*************************************

*/

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;


public class DataActivity extends MainActivity {
    /*Every application requires the below block of code, onCreate is the method used to bundle the
          * first activity screen of the application together. setContentView is the method that is used
          * to specify which .xml file this java code will interact with while being displayed on the users
          * device.*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

/*homeBtn is set to the id homeButton, the id of the button in the activity_data.xml file*/
    Button homeBtn = (Button) findViewById(R.id.homeButton);
/*homeBtn listens for the users click/tap and once detected onClick executes and startActivity
* directs the user from DataActivity to MainActivity*/
    homeBtn.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
            startActivity(new Intent(DataActivity.this, MainActivity.class));
        }
    });
}
}








