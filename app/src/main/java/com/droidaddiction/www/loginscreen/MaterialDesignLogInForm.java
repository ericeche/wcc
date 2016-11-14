package com.droidaddiction.www.loginscreen;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by ericecheverri on 11/13/16.
 */

public class MaterialDesignLogInForm extends AppCompatActivity {


    public static final String TAG="MaterialDesignLoginForm";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.material_design_login_form);
        Log.v(TAG,"OnCreate method");
        Button loginButton = (Button) findViewById(R.id.login_button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                new AboutDialogFragment().show(getSupportFragmentManager(), "AboutDialog");
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v(TAG,"OnStart method");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(TAG,"OnStop method");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.v(TAG,"OnPostResume method");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(TAG,"OnResume method");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(TAG,"OnPause method");
    }
}
