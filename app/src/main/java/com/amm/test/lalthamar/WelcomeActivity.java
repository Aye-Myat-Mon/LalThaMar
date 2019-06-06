package com.amm.test.lalthamar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

public class WelcomeActivity extends Activity {

  @BindView(R.id.btnLogin)
  Button btnLogin;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    setContentView(R.layout.activity_login);
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);
    super.onCreate(savedInstanceState);

    ButterKnife.bind(this);

    btnLogin.setOnClickListener(view -> {
      Intent intent = new Intent(WelcomeActivity.this, MainActivity.class);
      startActivity(intent);
    });

  }

  @Override protected void onResume() {
    super.onResume();
  }

}
