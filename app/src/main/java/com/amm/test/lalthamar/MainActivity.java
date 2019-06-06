package com.amm.test.lalthamar;

import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.amm.test.lalthamar.utils.ViewFlipperIndicator;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.viewFlipper)
    ViewFlipperIndicator viewFlipperIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        // set values radius and margin for view flipper indicators
        viewFlipperIndicator.setRadius(8);
        viewFlipperIndicator.setMargin(10);

        // set colors for the indicators
        Paint paint = new Paint();
        paint.setColor(getResources().getColor(android.R.color.white));
        viewFlipperIndicator.setPaintCurrent(paint);

        paint = new Paint();
        paint.setColor(getResources().getColor(R.color.colorBlackIndicator));
        viewFlipperIndicator.setPaintNormal(paint);
    }
}
