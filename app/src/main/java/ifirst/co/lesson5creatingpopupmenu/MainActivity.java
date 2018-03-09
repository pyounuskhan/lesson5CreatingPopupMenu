package ifirst.co.lesson5creatingpopupmenu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private PopupMenu.OnMenuItemClickListener mOnMenuItemClickListener = new PopupMenu.OnMenuItemClickListener() {
        @Override
        public boolean onMenuItemClick(MenuItem item) {
            // Handle menu selections
             switch (item.getItemId()) {
                 case R.id.menu_reply :
                     Toast.makeText(MainActivity.this, "Reply", Toast.LENGTH_SHORT).show();
                    return true;
                 case R.id.menu_reply_all:
                     Toast.makeText(MainActivity.this,"ReplyAll",Toast.LENGTH_SHORT).show();
                     return true;
                 case R.id.menu_forward :
                     Toast.makeText(MainActivity.this, "Forward", Toast.LENGTH_SHORT).show();
                     return true;
                 default:
                     return false;
             }
        }
    };

    public void showPopupMenu(View view) {
        PopupMenu popupMenu = new PopupMenu(MainActivity.this,view);
        popupMenu.inflate(R.menu.menu_popup);
        popupMenu.setOnMenuItemClickListener(mOnMenuItemClickListener);
        popupMenu.show();
    }
}
