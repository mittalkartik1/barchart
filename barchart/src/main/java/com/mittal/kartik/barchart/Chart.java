package com.mittal.kartik.barchart;

import android.app.Activity;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;

public class Chart {
    int BarNum;
    String backColor="#ffffff";


    public void setbarscolor(String hexcodeColor,LinearLayout barchartlayout){
        barchartlayout.setBackgroundColor(Color.parseColor(hexcodeColor));
    }

    public String getBackColor() {
        return backColor;
    }

    public void setBackColor(String backColor) {
        this.backColor = backColor;
    }

    public void setBarNum(final LinearLayout barchartlayout, final Activity activity,final int barNum, final Integer percentage[]) {
        BarNum = barNum;
        final int[] height = new int[1];
        ViewTreeObserver vto = barchartlayout.getViewTreeObserver();
        vto.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                height[0] =barchartlayout.getHeight();
                barchartlayout.setWeightSum(Float.parseFloat(String.valueOf(barNum+(.5*(barNum-1)))));
                final View minefirstview = new View(activity.getApplicationContext());
                minefirstview.setLayoutParams(new LinearLayout.LayoutParams(0, height[0]-(percentage[0]*height[0]/100),1f));
                minefirstview.setBackgroundColor(Color.parseColor(getBackColor()));
                barchartlayout.addView(minefirstview);
                for(int i=0;i<barNum-1;i++){
                    final View mineemptyview = new View(activity.getApplicationContext());
                    mineemptyview.setLayoutParams(new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.MATCH_PARENT,.5f));
                    mineemptyview.setBackgroundColor(Color.parseColor(getBackColor()));
                    barchartlayout.addView(mineemptyview);

                    final View mineview = new View(activity.getApplicationContext());
                    mineview.setLayoutParams(new LinearLayout.LayoutParams(0, height[0]-(percentage[i+1]*height[0]/100),1f));
                    mineview.setBackgroundColor(Color.parseColor(getBackColor()));
                    barchartlayout.addView(mineview);
                }
            }
        });
    }
}

