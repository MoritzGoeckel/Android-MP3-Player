package moritzgoeckel.com.mp3_player;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //http://www.javatpoint.com/playing-audio-in-android-example
        //http://stackoverflow.com/questions/22323438/how-to-find-mp3-files-from-sdcard-in-android-programatically
        //Find songs
        //http://stackoverflow.com/questions/10209176/extract-album-cover-from-mp3-file-in-android?rq=1
        MediaPlayer mp = new MediaPlayer();
        try{
            mp.setDataSource("/sdcard/Music/maine.mp3");
            mp.prepare();
            mp.start();

        }catch(Exception e){e.printStackTrace();}
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
}
