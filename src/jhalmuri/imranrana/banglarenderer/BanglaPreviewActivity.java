package jhalmuri.imranrana.banglarenderer;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Typeface;
import android.widget.TextView;

public class BanglaPreviewActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bangla_preview);
		TextView banglaPreviewView = (TextView) findViewById(R.id.textView1);
		banglaPreviewView .setTypeface(Typeface.createFromAsset(getApplicationContext().getAssets(),
				"fonts/banglaFont.ttf"));
        String textToShow = "বেস্ট অফ অনলাইন অ্যাক্টিভিজম অ্যাওয়ার্ডের ‘সামাজিক পরিবর্তন’ বিভাগের জুরি অ্যাওয়ার্ড  English Text এক্টিভিটি বল্লে কক্ষ English Text";
        String convertedText = BanglaRenderer.convert(textToShow);			 
        banglaPreviewView .setText(convertedText);
	}



}
