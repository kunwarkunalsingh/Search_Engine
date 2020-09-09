package com.example.search_engine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class rem extends AppCompatActivity {
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rem);
        t1=findViewById(R.id.txt);
        t2=findViewById(R.id.txt1);
        Intent i=this.getIntent();
        String med=i.getExtras().getString("de");
        t1.setText("Here are some best Homemade Remedies for " + med + ":-");
        if(med.equals("Common Cold")){
            t2.setText("1)Garlic soup helps reduce the harshness of a cold.\n" +
                    "2) A glass of lemon juice a day would raise the body’s resistance.\n" +
                    "3) Onion juice can also help avoid a cold.\n" +
                    "4) Drink plenty of water, at least 6-8 glasses per day.");
        }
        else if(med.equals("Cough")){
            t2.setText("1) Basil leaves and ginger are very effective in relieving an irritating dry cough. You can either chew\n" +
                    "basil leaves or take fresh ginger with hot water.\n" +
                    "2) Eat grapes. Grapes when eaten regularly can also help get rid of severe coughs.\n" +
                    "3) Drinking a few cups of hot water with salt can also help stop coughing.\n" +
                    "4) Take a hot shower. Breathing in the steam can provide temporary relief.");
        }
        else if(med.equals("Fever Blisters")){
            t2.setText("1) Apply petroleum jelly to the skin.\n" +
                    "2) Apply cold compress on the affected area.\n" +
                    "3) Avoid eating nuts and chocolate.");

        }
        else if(med.equals("Common Fever")){
            t2.setText("1) Drink tea made with from saffron.\n" +
                    "2) Eat oranges. Oranges give instant energy and helps the body fight unwanted infections.\n" +
                    "3) A glass of milk also works wonders.");

        }
        else if(med.equals("Sore Throat")){
            t2.setText("1) A mixture of Listerine mouth wash and Hydrogen Peroxide. Pour a little of each liquid into a cup\n" +
                    "(equal parts) and gargle.\n" +
                    "2) Eat three to four marshmallows to soothe a sore throat. The gelatin in the marshmallows is what\n" +
                    "soothes the sore throat.\n" +
                    "3) Drink hot water, lemon juice, and honey mixed together.\n");

        }
        else if(med.equals("Heartburn")){
            t2.setText("1) Dissolve a tsp. of baking soda in 8 ounces (1 cup) of water and drink. Baking soda is a natural\n" +
                    "antacid.\n" +
                    "2) Bananas act as a natural antacid in the body. You can eat either fresh or dried bananas.\n" +
                    "3) Fresh ginger is one of the oldest remedies for heartburn. It can be added to food when its cooked,\n" +
                    "eaten raw, or consumed as ginger tea.\n");

        }
        else if(med.equals("Acidity")){
            t2.setText("1) Drink a glass of lemon juice before each meal, it will help relieve acidity.\n" +
                    "\n" +
                    "2) Avoid too much tea, coffee, fried and fermented food as they stimulate acid production.\n" +
                    "\n" +
                    "3) Take a glass of water, add a pinch of baking soda and drink it at one go. It gives immediate relief.\n" +
                    "\n" +
                    "4) Take a glass of warm water, add a pinch of hing (asafoetida) and have it every morning.\n" +
                    "\n" +
                    "5) Drink coconut water 3-4 times in a day.\n" +
                    "\n" +
                    "6) Eat a serving of cucumber or watermelon 4-5 times in a day.");

        }
        else if(med.equals("Hiccups")){
            t2.setText("1) Take a spoonful of sugar and keep under your tongue until the sugar melts.\n" +
                    "\n" +
                    "2) Suck two to three pieces of ginger. This helps stop hiccups from recurring.\n" +
                    "\n" +
                    "3) Hold your breath for 30 seconds. If the hiccups do not stop, repeat the procedure two more times.\n" +
                    "\n" +
                    "4) Take a glass of water and gulp it down non-stop.\n" +
                    "\n" +
                    "5) Boil 1/2 tsp of cardamom in 1 cup of water and sip like tea.");

        }
        else if(med.equals("Sinus")){
            t2.setText("1) Soak four to five dried pieces of amla (gooseberry) overnight in water." +
                    " Drink the resulting solution in the morning on an empty stomach. " +
                    "Repeat this process for at least one month.");

        }
        else if ((med.equals("Stomach ache"))){
            t2.setText("1) Add a pinch of rock salt (black salt) to 1 tsp of ajwain (carom seeds), chew and swallow with one glass of lukewarm water.\n" +
                    "\n" +
                    "2) Boil 1 tsp of ajwain in one glass of water and keep sipping it through the day.\n" +
                    "\n" +
                    "3) Take 1 tsp of mint juice, add 1 tsp of honey to it and have with a spoon.\n" +
                    "\n" +
                    "4) Sip cinnamon tea throughout the day. Boil 1 tsp of powdered cinnamon in 1 cup of water and sip.\n" +
                    "\n" +
                    "5) Make a paste with 1/2 tsp of hing (asafoetida) and few drops of water and apply on the navel. It helps release the gas.");

        }
        else if(med.equals("Diarrhoea")){
            t2.setText("1) Take 1 tsp of mustard seeds and swallow it with 1 glass of lukewarm water.\n" +
                    "\n" +
                    "2) Take 1 tsp of fenugreek seeds, add 1 tsp of curd and swallow.\n" +
                    "\n" +
                    "3). Eat boiled sweet potatoes seasoned with salt and pepper to cure diarrhoea.\n" +
                    "\n" +
                    "4) Take 1/2 tsp powdered nutmeg, add honey and swallow.\n" +
                    "\n" +
                    "5) Grind lemon with the seed and skin, add a little salt and have three to four times a day.");
        }
        else if(med.equals("Anaemia")){
            t2.setText("1) Soak black raisins overnight in water and have in the morning on an empty stomach, for one month.\n" +
                    "\n" +
                    "2) Add 2 tsp of powdered black til (sesame seeds) to ½ glass lukewarm water, and have every morning.\n" +
                    "\n" +
                    "3) Eat two to three dates everyday.\n" +
                    "\n" +
                    "4) Vitamin C is required for iron to get absorbed in the body. Squeeze lemon juice on iron rich foods like rice flakes, dark green leafy vegetables, etc.");
        }
        else if(med.equals("Constipation")){
            t2.setText("1)  In addition to your regular water intake, have atleast three to four glasses of warm water with honey added to it.\n" +
                    "\n" +
                    "2) Eat apples, along with the skin, daily.\n" +
                    "\n" +
                    "3) Soak black currants overnight and drink this water in the morning. This will increase your iron level.\n" +
                    "\n" +
                    "4) Eat bran rotis. Make them by using 50 percent wheat flour and 50 percent bran flour. It will add fibre to your diet.\n" +
                    "\n" +
                    "5) Eat 1 serving of raw salads with every meal.\n" +
                    "\n" +
                    "6) Eat two to three ripe bananas to add bulk to your stools.");
        }
        else if (med.equals("Backache")){
            t2.setText("1) Use a heating pad or a hot water bottle and apply it on the hurting area to ease the pain. You" +
                    "can also massage the ice on your back, but not directly. Whichever makes you feel better you can" +
                    "try it either hot or cold.\n"+
                    "\n" +
                    "2) Have a Garlic oil massage on your back it also works to provide you a positive\n" +
                    "result.\n" +
                    "3) A mixture of powdered dry ginger, sweet soda and salt if consumed\n" +
                    "with hot milk or water can alleviate your backache problems.\n" +
                    "\n" +
                    "4) Make a concoction by boiling ten tulsi leaves in one cup of water. Keep boiling until the water is" +
                    "reduced to half. Once this solution is cooled, add salt and consume it every day. If suffering from severe backache problems" +
                    "have it twice a day.\n"+
                    "\n"+
                    "5) Make a mixture of five black pepper corns, five cloves and one gram dry ginger powder to be mixed in your tea and" +
                    "consumed at least twice a day.\n" +
                    "6) Mix half a gram of cinnamon powder with one teaspoon of honey and eat this mixture at least twice" +
                    "a day for best results.");
        }
        else if (med.equals("Acne")){
            t2.setText("1) Apply a bit of toothpaste on a visible pimple before you go to sleep helps reduce swelling. It also keeps the area free of oils that could\n" +
                    "make the spot worse. Be sure to use an actual paste because a gel will not" +
                    "have the same effect\n"+
                    "\n"+
                    "2) Holding a cube of ice on acne before bed should visibly decrease the inflammation and swelling. It may also" +
                    "reduce the chances of scarring after your skin has cleared up.\n"+
                    "\n"+
                    "3) Placing a cotton ball into apple cider Vinegar and then applying it to your infected area will almost instantly reduce swelling. " +
                    "This works especially well for large inflamed spots.\n" +
                    "\n"+
                    "4) You are always advised not to squeeze any pimples; however, blackheads will not go away on their own. Opening your pores using steam" +
                    "can assist you when you are cleaning your face. Take a hot shower or put" +
                    "your head over the vapors of a boiling pot of water.\n"+
                    "\n"+
                    "5) Wheat germ, which can be found in most stores, is one of the only acne home remedies taken internally. Taking wheat germ with one meal a" +
                    "day can clear your acne and leave your skin softer than it was before because it is rich in vitamins.");
        }

    }
}
