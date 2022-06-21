public class Generator {

    public static void booBlahh() {
        String[] gibberishOne = {"Get your game face on", "Think inside the box", "You know what they dont say", "Tomorrow is today and today is yesterday?", "No okay Problem"};
        String[] gibberishTwo = {"Raspberry", "Koolaid", "lemons", "Coconuts", "Trix are for kids", "Mike Tyson will kick your @$$", "Keep my -Will Smith"};

        for (int i = 0; i < gibberishTwo.length; i++) {

            int pile = gibberishTwo.length;

            int total = (int) (Math.random() * pile);

            String flavor = gibberishTwo[total];

            gibberishTwo[i] = flavor;
        }
        for (int i = 0; i < gibberishOne.length; i++) {

            int pile = gibberishOne.length;

            int total = (int) (Math.random() * pile);

            String flavor = gibberishOne[total];

            gibberishOne[i] = flavor;
        }
        System.out.println("AI: " + gibberishTwo[1]+ " " + gibberishOne[2]);

        System.out.println("Computer Scientist: This will all make sense, just give it some time");

        System.out.println("CPU: ahahahahahahahahahahha");

        System.out.println("Some Guy: Im thinking about booking a round trip, idk");

    }
}






