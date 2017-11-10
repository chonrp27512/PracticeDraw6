package com.hencoder.hencoderpracticedraw6.practice;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.hencoder.hencoderpracticedraw6.R;

public class Practice03Scale extends RelativeLayout {
    Button animateBt;
    ImageView imageView;

    public Practice03Scale(Context context) {
        super(context);
    }

    public Practice03Scale(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice03Scale(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        animateBt = (Button) findViewById(R.id.animateBt);
        imageView = (ImageView) findViewById(R.id.imageView);

        animateBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                // TODO 在这里处理点击事件，通过 View.animate().scaleX/Y() 来让 View 放缩
                imageView.animate().scaleX(1.5F);
                imageView.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        imageView.animate().scaleX(1F);
                        imageView.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                imageView.animate().scaleY(1.5F);
                                imageView.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        imageView.animate().scaleY(1F);
                                        imageView.postDelayed(new Runnable() {
                                            @Override
                                            public void run() {
                                                imageView.animate().scaleXBy(1.5F);
                                                imageView.postDelayed(new Runnable() {
                                                    @Override
                                                    public void run() {
                                                        imageView.animate().scaleXBy(1F);
                                                        imageView.postDelayed(new Runnable() {
                                                            @Override
                                                            public void run() {

                                                            }
                                                        }, 500);
                                                    }
                                                }, 500);
                                            }
                                        }, 500);
                                    }
                                }, 500);
                            }
                        }, 500);
                    }
                }, 500);
            }
        });
    }
}
