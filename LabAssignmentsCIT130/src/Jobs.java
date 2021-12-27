/*
 * @author Joseph Charland
 */
public class Jobs implements RoboJobs3000 {

    @Override
    public void comedian() {
        String[] arr = {"Where do pencils go for vacation? .... ... Pencil vania.", 
            "What does a cloud wear under his raincoat? .... Thunderwear.",
            "What did one toilet say to the other? .... You look a a bit flushed.",
            "How does the moon cut his hair? .... Eclipse it."};
        int randNum = (int)(Math.random()*arr.length);
        System.out.println("\nComedian Method called.");
        System.out.println(arr[randNum]);
    }

    @Override
    public void politician() {
        System.out.println("\nPolitician method called.");
        System.out.println("Vote Robo for president, 2020!");
        System.out.println("");
    }

    @Override
    public void singer() {
        System.out.println("\nSinger Method Called.");
        String[] arr = {"aaa", "eee", "ooo", "beep boop", "yeh"};
        for (int i = 0; i < 9; i++){
            int r1 = (int)(Math.random()*arr.length);
            String song = arr[r1];
            System.out.print(song+ " ");
        }
           System.out.println("");
    }

    @Override
    public void mathTeacher(int n1, int n2) {
        int ans = n1 + n2;
        System.out.println("");
        System.out.println(n1 + " plus " + n2 + " is " + ans);
    }

    @Override
    public void madeUpFact() {
        String[] part1 = {
            "10,000 years ago ",
            "Once upon a time ",
            "In 1677 ",
            "It is believed ",
            "The word on the street is ",
            "If you look closely, "
        };
        String[] part2 = {
            "Terry Bradshaw",
            "Godzilla",
            "Justin Tucker",
            "Mac Miller",
            "Big Bird",
            "Dwight from the office is"
        };
        String part3[] = {
            " who found the lost city of Atlantis",
            " liked his perogies with sour cream",
            " and their love with the color pink",
            " created the Big Mac",
            " enjoyed a McRib",
            " cheered for AFC bournemouth"
        };
        int r1 = (int)(Math.random()*part1.length);
        int r2 = (int)(Math.random()*part2.length);
        int r3 = (int)(Math.random()*part3.length);
        System.out.println(part1[r1] + part2[r2] + part3[r3]);
        
    }

    @Override
    public void quit() {
        System.out.println("\nProgram ending.");
        System.out.println("\nI quit my job");
        System.exit(0);
        
    }
    
}
