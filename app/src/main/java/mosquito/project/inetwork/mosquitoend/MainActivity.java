package mosquito.project.inetwork.mosquitoend;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
    private ImageButton imageButton;
    private Button btSound1, btSound2, btSound3;
    private ImageView imgMos1,imgMos2, imgMos3, imgTitle, imgBack;
    private Context context = this;
    private View myview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgMos1 = (ImageView) findViewById(R.id.img_mos1);
        imgMos2 = (ImageView) findViewById(R.id.img_mos2);
        imgMos3 = (ImageView) findViewById(R.id.img_mos3);
        imgTitle = (ImageView) findViewById(R.id.img_title);
        imgBack = (ImageView) findViewById(R.id.img_back);

        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SplashActivity.class);
                startActivity(intent);
                setProgressDialog();
                finish();
            }
        });

        imgMos1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Mosquito1Activity.class);
                startActivity(i);
                finish();
            }
        });

        imgMos2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Mosquito2Activity.class);
                startActivity(i);
                finish();
            }
        });

        imgMos3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Mosquito3Activity.class);
                startActivity(i);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(getApplicationContext(), SplashActivity.class);
        startActivity(intent);
        setProgressDialog();
        //overridePendingTransition(R.animator.activity_close_translate, R.animator.activity_open_scale);
        finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void setProgressDialog(){
        final ProgressDialog progressDialog=new ProgressDialog(MainActivity.this);
        progressDialog.setMessage("Loading");
        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        //progressDialog.setIndeterminate(false);
        progressDialog.setCancelable(false);//co the cancel bang phim back
        progressDialog.show();
    }

}
