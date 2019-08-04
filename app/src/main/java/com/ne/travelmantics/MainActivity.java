 package com.ne.travelmantics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {
    private FirebaseDatabase mFirebaseDatabase;
    private DataReference mDatabaseReference;
    EditText txtTitle;
    EditText txtPrice;
    EditText txtDescription;
    TravelDeal deal;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirebaseUtil.openFbReference("traveldeals");
        mFirebaseDatabase=FirebaseUtil.mFirebaseDatabase;
        mDatabaseReference=FirebaseUtil.mDatabaseReference;
        txtTitle=(EditText) findViewById(R.id.txtTitle);
        txtDescription = (EditText) findViewById(R.id.txtdescription);
        txtPrice =(EditText) findViewById(R.id.txtprice);
    }

    @Override
     public boolean onOptionsItemSelected(MenuItem item)  {
        switch (item.getItemId())  {
            case R.id.save_menu:
                saveDeal();
                Toast.makeText(this, "Deal Saved", Toast.LENGTH_LONG).show();
                clean();
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }

        @Override

                public  boolean onCreateOptionMenu (Menu menu){
            MenuInflater = getMenuInflater();
            inflater.inflate(R.menu.save_menu, menu);

        }

        private void saveDeal () {
            String title =txtTitle.getText () ;
        String description =txtDescription.getText ().toString();
        String price =txtprice.getText().toString ();
        TravelDeal deal =new TravelDeal(title,description,price,imageUrl"");

        private void clean() {
                txtTitle.setText();
        txtDescription.setText("");
        txtTitle.requestFocus();

            }


        }



    }
}

