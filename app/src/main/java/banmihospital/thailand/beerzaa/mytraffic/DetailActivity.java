package banmihospital.thailand.beerzaa.mytraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import static banmihospital.thailand.beerzaa.mytraffic.R.id.imageView2;

public class DetailActivity extends AppCompatActivity {

    //Explicit
    private TextView titleTextView, detailTextView;
    private ImageView trafficImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Initial Widget

        inititilaWiidget();

        //Show View

        showView();

    }//Main method

    public void clickBack(View view) {
        finish();
    }



    private void showView() {

        //Receive Value From Intent
        String strTitle = getIntent().getStringExtra("Title");
        int intImage = getIntent().getIntExtra("Image", R.drawable.traffic_01);
        int intIndex = getIntent().getIntExtra("Index", 0);

        //Show Title

        titleTextView.setText(strTitle);

        //Show Image
        trafficImageView.setImageResource(intImage);

        //Show detial

        String[] detailStrings = getResources().getStringArray(R.array.detail_long);
        detailTextView.setText(detailStrings[intIndex]);


    } // ShowView

    private void inititilaWiidget() {
        titleTextView = (TextView) findViewById(R.id.textView4);
        detailTextView = (TextView) findViewById(R.id.textView5);
        trafficImageView = (ImageView) findViewById(R.id.imageView2);

    }


}//Main Class
