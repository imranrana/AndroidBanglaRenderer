# AndroidBanglaRenderer
Use this project if you face issues like:
  Bangla not showing properly in an Android view (Complex conjugates/juktoborno breaks down)

This code can show both Bangla and English in same view. 


#How To Use
Download BanglaRenderer.zip from following link:
https://www.dropbox.com/s/1mmjahix7zokioo/BanglaRenderer.zip?dl=0

It contains:
1.BanglaConverter.jar
2.fonts

Add the fonts folder in your project's assets folder.
Add BanglaConverter.jar in your project's libs folder. Add this jar to your project's build path.

Code Sample:
Say banglaPreviewView is the TextView where you want to show Bangla and textToShow is the String to show. Then:
```java
TextView banglaPreviewView = (TextView) findViewById(R.id.textView1);
		banglaPreviewView .setTypeface(Typeface.createFromAsset(getApplicationContext().getAssets(),
				"fonts/banglaFont.ttf"));
        String textToShow = "বাংলা English Text";
        String convertedText = BanglaRenderer.convert(textToShow);			 
        banglaPreviewView .setText(convertedText);
```

Sample Output:
![alt tag](https://cloud.githubusercontent.com/assets/12170926/8352522/9e651820-1aea-11e5-87de-27aaaa5b8c55.png)
