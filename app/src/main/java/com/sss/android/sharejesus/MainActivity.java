package com.sss.android.sharejesus;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    Toolbar toolbar;

    /**
     * Called to create the Main Activity
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // configure the action bar and handle its messages
        ActionBar action_bar = getSupportActionBar();
        action_bar.setTitle(R.string.actionbar_title);
        action_bar.setIcon(R.drawable.ic_about);

        // button message handlers
        Button buttonBack = (Button)findViewById(R.id.button_back);
        buttonBack.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // do nothing, we are at the home Activity
            }
        });

        Button buttonHome = (Button)findViewById(R.id.button_home);
        buttonHome.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // do nothing, we are at the home Activity
            }
        });

        Button buttonNext = (Button)findViewById(R.id.button_next);
        buttonNext.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // load the next Activity
                Intent intent = new Intent(getApplicationContext(), Romans3_23Activity.class);
                startActivity(intent);
            }
        });

    }   // end onCreate


    /**
     * creates the action bar actions
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.activity_actionbar_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }


    /**
     * Handles user selection of action bar icons/menu items
     *
     * @param item - selected menu item/icon
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
       switch(item.getItemId())
       {
           case R.id.action_about:
               //Toast.makeText(getApplication(),
               //        "Show About Dialog", Toast.LENGTH_SHORT).show();
               showAboutDialog();
               return true;

           default:
               Toast.makeText(getApplication(),
                       "UNKNOWN Menu Item Selected", Toast.LENGTH_SHORT).show();
               return true;
       }
    }


    private void showAboutDialog()
    {
        TextView text_view = new TextView(this);
        text_view.setPadding(10, 10, 10, 10);
        text_view.setText(R.string.about_message);

        AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
        alertDialog.setTitle("About Share Jesus");
        alertDialog.setView(text_view);

        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });

        alertDialog.show();
    }


}   // end MainActivity
