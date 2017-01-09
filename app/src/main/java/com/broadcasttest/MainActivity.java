package com.broadcasttest;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    private IntentFilter intentFilter;

    //  private NetworkChangeReceiver networkChangeReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     //   intentFilter = new IntentFilter();
      //  intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
      //  networkChangeReceiver = new NetworkChangeReceiver();
       // registerReceiver(networkChangeReceiver,intentFilter);

        Button button =(Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.example.broadcasttest.MY_BROADCAST");
                sendBroadcast(intent);
            }
        });
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
    @Override
    protected void onDestroy(){
        super.onDestroy();
       // unregisterReceiver(networkChangeReceiver);
    }

   // class NetworkChangeReceiver extends BroadcastReceiver {
    //    @Override
      //  public void onReceive(Context context, Intent intent){
            //Toast.makeText(context,"network changes", Toast.LENGTH_SHORT).show();
      //      ConnectivityManager connectionManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
      //      NetworkInfo networkInfo = connectionManager.getActiveNetworkInfo();
       //     if(networkInfo!=null && networkInfo.isAvailable()){
        //        Toast.makeText(context,"network is available", Toast.LENGTH_SHORT).show();
       //     }else{
        //        Toast.makeText(context,"network is unavailable", Toast.LENGTH_SHORT).show();
       //     }
      //  }

  //  }
}
