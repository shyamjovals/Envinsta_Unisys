package bluepanther.envirinsta;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import bluepanther.envirinsta.Signing.Off_Sign_Up;
import bluepanther.envirinsta.Signing.Sign_In;
import bluepanther.envirinsta.Signing.Sign_Up;

/**
 * Created by Hariharsudan HHS on 21-03-2017.
 */

public class AA_home extends AppCompatActivity {

    String lol;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aa_home);

        final TextView user = (TextView) findViewById(R.id.user);
        final TextView official = (TextView) findViewById(R.id.official);
        final ImageView imageView4 = (ImageView) findViewById(R.id.imageView4);
        final ImageView imageView5 = (ImageView) findViewById(R.id.imageView5);
        final Button next = (Button) findViewById(R.id.next);
        next.setClickable(false);

        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView4.setImageResource(R.drawable.user);
                user.setTextColor(getResources().getColor(R.color.colorPrimary));
                official.setTextColor(getResources().getColor(R.color.pb_grey));
                next.setClickable(true);
                 lol = "user";


            }
        });

        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView5.setImageResource(R.drawable.official);
                official.setTextColor(getResources().getColor(R.color.colorPrimary));
                user.setTextColor(getResources().getColor(R.color.pb_grey));
                next.setClickable(true);
                lol="official";

            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(lol=="user")
                {
                    Intent i = new Intent(AA_home.this, Sign_Up.class);
                    startActivity(i);
                }
                if(lol=="official")
                {
                    Intent i = new Intent(AA_home.this, Off_Sign_Up.class);
                    startActivity(i);
                }


            }
        });
    }
}
