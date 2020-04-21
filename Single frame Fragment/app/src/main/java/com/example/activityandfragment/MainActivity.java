package com.example.activityandfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  {
/*
    private Button pmSwitch_Button, lmSwitch_Button;
*/
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Configuration mConfig = getResources().getConfiguration();

/*        pmSwitch_Button = findViewById(R.id.pm_button_id);
        lmSwitch_Button = findViewById(R.id.lm_buttonId);

        pmSwitch_Button.setOnClickListener(this);
        lmSwitch_Button.setOnClickListener(this);*/


        fragmentManager = getFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();

/*
        //Not work in OnclickListener
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
*/

        //Check device orientation and act accordingly
        if (mConfig.orientation == Configuration.ORIENTATION_LANDSCAPE)
        {
            //Now device is in Landscape mode
            L_mode_fragment l_mode_fragment = new L_mode_fragment();
            fragmentTransaction.replace(android.R.id.content, l_mode_fragment);
        }
        else {
            P_mode_fragment p_mode_fragment = new P_mode_fragment();
            fragmentTransaction.replace(android.R.id.content, p_mode_fragment);
        }
        fragmentTransaction.commit();

    }

/*
    //This is also work

@Override
    public void onClick(View v) {
        if (v.getId() == R.id.pm_button_id)
        {
            P_mode_fragment p_mode_fragment = new P_mode_fragment();
//            getSupportFragmentManager().beginTransaction().replace(android.R.id.content, p_mode_fragment);
            fragmentTransaction.replace(android.R.id.content, p_mode_fragment);
        }
        else if (v.getId() == R.id.lm_buttonId)
        {
            L_mode_fragment l_mode_fragment = new L_mode_fragment();
            fragmentTransaction.replace(android.R.id.content, l_mode_fragment);
        }
        fragmentTransaction.commit();
    }*/
}
