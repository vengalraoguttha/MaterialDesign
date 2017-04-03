package com.vengalrao.android.materialdesign;


import android.animation.Animator;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewAnimationUtils;

public class MainActivity extends AppCompatActivity {

    View view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view =findViewById(R.id.view_cir_anim);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int green=v.getContext().getResources().getColor(R.color.colorAccent);
                int finalRadius = (int)Math.hypot(view.getWidth()/2, view.getHeight()/2);
                boolean flag = ((ColorDrawable)view.getBackground()) != null && ((ColorDrawable)view.getBackground()).getColor() == green;
                if(flag){
                    v.setBackgroundColor(v.getContext().getResources().getColor(R.color.white));
                }else {
                    Animator animator= ViewAnimationUtils.createCircularReveal(v,v.getWidth()/2,v.getHeight()/2,0,finalRadius);
                    v.setBackgroundColor(v.getContext().getResources().getColor(R.color.colorAccent));
                    animator.start();
                }
            }
        });
    }
}
