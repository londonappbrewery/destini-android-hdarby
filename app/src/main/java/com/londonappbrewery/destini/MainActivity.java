package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    private TextView storyTextView;
    private Button topButton;
    private Button bottomButton;

    private int storyState;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        storyTextView = (TextView)findViewById(R.id.storyTextView);
        topButton = (Button)findViewById(R.id.buttonTop);
        bottomButton = (Button)findViewById(R.id.buttonBottom);

        storyState = 1;

        updateStoryState();



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (storyState) {
                    case 1:
                        storyState = 3;
                        break;
                    case 2:
                        storyState = 3;
                        break;
                    case 3:
                        storyState = 6;
                        break;
                }

                updateStoryState();

            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        bottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (storyState) {
                    case 1:
                        storyState = 2;
                        break;
                    case 2:
                        storyState = 4;
                        break;
                    case 3:
                        storyState = 5;
                        break;

                }

                updateStoryState();

            }
        });


    }

    private void updateStoryState() {

        switch (storyState) {
            case 1:
                storyTextView.setText(R.string.T1_Story);
                topButton.setVisibility(View.VISIBLE);
                bottomButton.setVisibility(View.VISIBLE);
                topButton.setText(R.string.T1_Ans1);
                bottomButton.setText(R.string.T1_Ans2);
                break;
            case 2:
                storyTextView.setText(R.string.T2_Story);
                topButton.setVisibility(View.VISIBLE);
                bottomButton.setVisibility(View.VISIBLE);
                topButton.setText(R.string.T2_Ans1);
                bottomButton.setText(R.string.T2_Ans2);
                break;
            case 3:
                storyTextView.setText(R.string.T3_Story);
                topButton.setVisibility(View.VISIBLE);
                bottomButton.setVisibility(View.VISIBLE);
                topButton.setText(R.string.T3_Ans1);
                bottomButton.setText(R.string.T3_Ans2);
                break;
            case 4:
                storyTextView.setText(R.string.T4_End);
                topButton.setVisibility(View.GONE);
                bottomButton.setVisibility(View.GONE);
                break;
            case 5:
                storyTextView.setText(R.string.T5_End);
                topButton.setVisibility(View.GONE);
                bottomButton.setVisibility(View.GONE);
                break;
            case 6:
                storyTextView.setText(R.string.T6_End);
                topButton.setVisibility(View.GONE);
                bottomButton.setVisibility(View.GONE);
                break;
        }
    }
}
