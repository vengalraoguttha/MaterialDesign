package com.vengalrao.android.materialdesign;


import android.animation.Animator;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    View view;
    Button scroll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scroll= (Button)findViewById(R.id.scroll_design_demo);

        scroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ScrollActivity.class);
                startActivity(intent);
            }
        });

        //for circular_reveal_animation.xml
        //remove the comments to use the code

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
