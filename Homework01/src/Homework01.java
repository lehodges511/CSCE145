/*
Lauren Hodges
 */

import java.util.Scanner;
import java.util.Random;

public class Homework01 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        int realNum = r.nextInt(10)+1;
        System.out.println(realNum);

        System.out.println("Welcome to the village. Will you explore the village, talk to the wizard by the well, " +
                "or head towards the forest?\nEnter \"village\" \"man\" or \"forest\".");
        String ans1 = keyboard.nextLine();
        if(ans1.equals("village"))
        {
            System.out.println("You walk around, observing the different shops and people. Suddenly, you hear a cry coming from " +
                    "a woman behind you.\n\"Help! My kid ran off into the forest! Will anyone help?\" Do you help the woman or" +
                    " keep exploring? \nEnter \"help\" or \"explore\".");
            String ans2 = keyboard.nextLine();
            if(ans2.equals("help"))
            {
                System.out.println("You head into the forest, and eventually come to a fork in the path. To the right, the path leads to a river.\n" +
                        "On the left, it goes to some caves. Which way do you go?\n Enter \"right\" or \"left\"");
                String path = keyboard.nextLine();
                if (path.equals("right"))
                {
                    System.out.println("You follow the path to the river. It seems shallow enough, but there are some rapids about halfway across.\n" +
                            "Do you cross? Enter \"yes\" or \"no\"");
                    String ans4 = keyboard.nextLine();
                    if (ans4.equals("yes")) //Ending 1
                    {
                        System.out.println("You go to cross the river. When you are about halfway through, you lose your footing and are swept\n " +
                                "down the river and over the waterfall, falling to your death. The end.");
                    }
                    else if (ans4.equals("no")) //Ending 2
                    {
                        System.out.println("You decide to head back to the caves. When you get there, you hear a noise coming from one of them. You\n" +
                                "go to explore, and find the woman's missing child! You return to the village where you are celebrated as a hero. \nTHE END");
                    }

                }
                else if (path.equals("left")) //Ending 2
                {
                    System.out.println("You head towards the caves. When you get there, you hear a noise coming from one of them. You go to investigate,\n " +
                            "and find the woman's missing child! You return to the village where you are celebrated as a hero. \nTHE END");
                }
            }
            else if(ans2.equals("explore"))
            {
                System.out.println("You explore the rest of the village, finding nothing out of the ordinary. Suddenly, you are called over by the old man\n " +
                        "standing by the well. \"Hello traveler, can you help me with something?\" he calls out to you. Do you go to him, or decide to explore " +
                        "the forest?\n Enter \"man\" or \"forest\"");
                String ans4 = keyboard.nextLine();
                if (ans4.equals("man"))
                {
                    System.out.println("You walk over to the man. \"I have created a new potion that will bring strength and power to whoever drinks it. " +
                            "Supposedly. Will you test it for me?\" Do you drink the potion, or refuse?\nEnter \"drink\" or \"refuse\"");
                    String ans5 = keyboard.nextLine();
                    if (ans5.equals("drink")) //Ending 3
                    {
                        System.out.println("You take the potion and drink it. Suddenly, a warmth overcomes you as it starts to work. \"It's working!\" the man\n" +
                                "cries! But then, he looks concerned. You notice that he is slowly starting to get taller. Soon enough, all you can see is his feet.\n" +
                                "You've been turned into a frog! Before you can hop away, the man picks you up. \"Well, there goes another one.\" He tosses you into \n" +
                                "the well, where you land with a plop at the bottom. Looking around, there are many other frogs around you. You live out the rest of your\n" +
                                "life as a frog at the bottom of the well.\nTHE END");
                    }
                    else if (ans5.equals("refuse"))
                    {
                        System.out.println("You politely refuse his offer. \"Well, I see how it is. Well, if you're going to be rude, I don't want you here.\"\n" +
                                "Suddenly you find yourself in the middle of a glade. You look around. There's something in one of the bushes. You go over to\n" +
                                "investigate, and out pops a fairy! \"Hello!\" she says. \"You found me! Today's your lucky day! I'll grant you one wish,\n" +
                                "but you have to choose wisely. You can either have a ton of gold, or happiness and good fortune for the rest of your life.\"\n" +
                                "Which do you choose? Enter \"gold\" or \"happiness\"");
                        String ans6 = keyboard.nextLine();
                        if (ans6.equals("gold")) //Ending 4
                        {
                            System.out.println("The fairy smiles mischievously, waves her wand, and disappears with a laugh. You hear a thud behind you. Turning\n" +
                                    "around, you see one giant brick of gold taking up the majority of the glade. Engraved on the side, it says \"one ton.\" Unable\n" +
                                    "to move it or do anything with it, you return to the village, disappointed and annoyed, and vow to never trust a fairy again.\n" +
                                    "THE END");
                        }
                        else if (ans6.equals("happiness")) //Ending 5
                        {
                            System.out.println("The fairy smiles happily, waves her wand, and disappears. A happy warmth overcomes you as you walk back to the village.\n" +
                                    "For the rest of your life, you are happy and good things happen to you. And you live happily ever after.\nTHE END");
                        }
                    }
                }
                else if (ans4.equals("forest"))
                {
                    System.out.println("You head into the forest, and eventually come to a fork in the path. To the right, the path leads to a river.\n" +
                            "On the left, it goes to some caves. Which way do you go?\n Enter \"right\" or \"left\"");
                    String path = keyboard.nextLine();
                    if (path.equals("right"))
                    {
                        System.out.println("You follow the path to the river. It seems shallow enough, but there are some rapids about halfway across.\n" +
                                "Do you cross? Enter \"yes\" or \"no\"");
                        String ans6 = keyboard.nextLine();
                        if (ans6.equals("yes")) //Ending 1
                        {
                            System.out.println("You go to cross the river. When you are about halfway through, you lose your footing and are swept\n " +
                                    "down the river and over the waterfall, falling to your death. The end.");
                        }
                        else if (ans6.equals("no")) //Ending 2
                        {
                            System.out.println("You decide to head back to the caves. When you get there, you hear a noise coming from one of them. You\n" +
                                    "go to explore, and find a child! You return to the village with the kid. \"You found my child!\" a woman exclaims as you\n" +
                                    "return. \"Thank you so much!\" The village throws a party for your heroism, and you bask in the glory of being celebrated." +
                                    " \nTHE END");
                        }

                    }
                    else if (path.equals("left")) //Ending 2
                    {
                        System.out.println("You head towards the caves. When you get there, you hear a noise coming from one of them. You\n" +
                                "go to explore, and find a child! You return to the village with the kid. \"You found my child!\" a woman exclaims as you\n" +
                                "return. \"Thank you so much!\" The village throws a party for your heroism, and you bask in the glory of being celebrated." +
                                " \nTHE END");
                    }
                }
            }

        }
        else if (ans1.equals("man"))
        {
            System.out.println("You walk over to the man. \"I have created a new potion that will bring strength and power to whoever drinks it. " +
                    "Supposedly. Will you test it for me?\" Do you drink the potion, or refuse?\nEnter \"drink\" or \"refuse\"");
            String ans5 = keyboard.nextLine();
            if (ans5.equals("drink")) //Ending 3
            {
                System.out.println("You take the potion and drink it. Suddenly, a warmth overcomes you as it starts to work. \"It's working!\" the man\n" +
                        "cries! But then, he looks concerned. You notice that he is slowly starting to get taller. Soon enough, all you can see is his feet.\n" +
                        "You've been turned into a frog! Before you can hop away, the man picks you up. \"Well, there goes another one.\" He tosses you into \n" +
                        "the well, where you land with a plop at the bottom. Looking around, there are many other frogs around you. You live out the rest of your\n" +
                        "life as a frog at the bottom of the well.\nTHE END");
            }
            else if (ans5.equals("refuse"))
            {
                System.out.println("You politely refuse his offer. \"Well, I see how it is. Well, if you're going to be rude, I don't want you here.\"\n" +
                        "Suddenly you find yourself in the middle of a glade. You look around. There's something in one of the bushes. You go over to\n" +
                        "investigate, and out pops a fairy! \"Hello!\" she says. \"You found me! Today's your lucky day! I'll grant you one wish,\n" +
                        "but you have to choose wisely. You can either have a ton of gold, or happiness and good fortune for the rest of your life.\"\n" +
                        "Which do you choose? Enter \"gold\" or \"happiness\"");
                String ans6 = keyboard.nextLine();
                if (ans6.equals("gold")) //Ending 4
                {
                    System.out.println("The fairy smiles mischievously, waves her wand, and disappears with a laugh. You hear a thud behind you. Turning\n" +
                            "around, you see one giant brick of gold taking up the majority of the glade. Engraved on the side, it says \"one ton.\" Unable\n" +
                            "to move it or do anything with it, you return to the village, disappointed and annoyed, and vow to never trust a fairy again.\n" +
                            "THE END");
                }
                else if (ans6.equals("happiness")) //Ending 5
                {
                    System.out.println("The fairy smiles happily, waves her wand, and disappears. A happy warmth overcomes you as you walk back to the village.\n" +
                            "For the rest of your life, you are happy and good things happen to you. And you live happily ever after.\nTHE END");
                }
            }
        }
        else if (ans1.equals("forest"))
        {
            System.out.println("You head into the forest, following the path. You get to a point where there seems to be a beaten down trail leading off the path.\n" +
                    "Do you continue on the path or follow the trail? Enter \"path\" or \"trail\"");
            String ans2 = keyboard.nextLine();
            if (ans2.equals("path"))
            {
                System.out.println("You continue on the path, and eventually come to a fork. To the right, the path leads to a river.\n" +
                        "On the left, it goes to some caves. Which way do you go?\n Enter \"right\" or \"left\"");
                String path = keyboard.nextLine();
                if (path.equals("right"))
                {
                    System.out.println("You follow the path to the river. It seems shallow enough, but there are some rapids about halfway across.\n" +
                            "Do you cross? Enter \"yes\" or \"no\"");
                    String ans6 = keyboard.nextLine();
                    if (ans6.equals("yes")) //Ending 1
                    {
                        System.out.println("You go to cross the river. When you are about halfway through, you lose your footing and are swept\n " +
                                "down the river and over the waterfall, falling to your death. The end.");
                    }
                    else if (ans6.equals("no")) //Ending 2
                    {
                        System.out.println("You decide to head back to the caves. When you get there, you hear a noise coming from one of them. There is also\n" +
                                "a set of footprints leading to a different one. Do you follow the footprints or investigate the noise?\n Enter \"footprints\"" +
                                " or \"noise\"");
                        String ans7 = keyboard.nextLine();

                        if (ans7.equals("footprints")) //Ending 2
                        {
                            System.out.println("You follow the footprints to the cave. Stepping inside, you see a child cowering in the corner. You return to the village with the kid.\n" +
                                    "\"You found my child!\" a woman exclaims as you return. \"Thank you so much!\" The village throws a party for your heroism, and you bask in the glory\n" +
                                    "of being celebrated.\nTHE END");
                        }
                        else if (ans7.equals("noise"))
                        {
                            System.out.println("You head towards the noise, entering the cave carefully. Suddenly, a giant dragon appears, blocking your path. \"WHO DARES TO\n" +
                                    "ENTER MY CAVE UNINVITED??\" the dragon bellows. \"I SHOULD ROAST YOU RIGHT NOW! But that's no fun. Let's play a game instead.\" You have no\n" +
                                    "choice but to go along. \"If you can guess the number I'm thinking of between 1 and 10, I'll give you my golden egg and let you go. If not, your\n" +
                                    "fate will be decided by me.\" What is the number you choose?");
                            int guess = keyboard.nextInt();
                            if(guess==realNum) //Ending 6
                            {
                                System.out.println("\"That is correct. You may go.\" the dragon says. You take the golden egg and return to the village, where you live a wealthy\n" +
                                        "life thanks to the value of the egg.\nTHE END");
                            }
                            else if (guess!=realNum)
                            {
                                System.out.println("\"That is INCORRECT!\" the dragon bellows. \"Time for your fate.\"");
                                if(guess<=5) //Ending 7
                                {
                                    System.out.println("The dragon roasts you alive and you die a fiery death.\nTHE END");
                                }
                                else if ((guess>5)&&(guess<=10)) //Ending 8
                                {
                                    System.out.println("In one big swoop, the dragon eats you alive. You live the rest of your short life in the dragon's stomach.\nTHE END");
                                }
                            }
                        }
                    }

                }
                else if (path.equals("left")) //Ending 2
                {
                    System.out.println("You head towards the caves. When you get there, you hear a noise coming from one of them. There is also\n" +
                            "a set of footprints leading to a different one. Do you follow the footprints or investigate the noise?\n Enter \"footprints\"" +
                            " or \"noise\"");
                    String ans7 = keyboard.nextLine();

                    if (ans7.equals("footprints")) //Ending 2
                    {
                        System.out.println("You follow the footprints to the cave. Stepping inside, you see a child cowering in the corner. You return to the village with the kid.\n" +
                                "\"You found my child!\" a woman exclaims as you return. \"Thank you so much!\" The village throws a party for your heroism, and you bask in the glory\n" +
                                "of being celebrated.\nTHE END");
                    }
                    else if (ans7.equals("noise"))
                    {
                        System.out.println("You head towards the noise, entering the cave carefully. Suddenly, a giant dragon appears, blocking your path. \"WHO DARES TO\n" +
                                "ENTER MY CAVE UNINVITED??\" the dragon bellows. \"I SHOULD ROAST YOU RIGHT NOW! But that's no fun. Let's play a game instead.\" You have no\n" +
                                "choice but to go along. \"If you can guess the number I'm thinking of between 1 and 10, I'll give you my golden egg and let you go. If not, your\n" +
                                "fate will be decided by me.\" What is the number you choose?");
                        int guess = keyboard.nextInt();
                        if (guess == realNum) //Ending 6
                        {
                            System.out.println("\"That is correct. You may go.\" the dragon says. You take the golden egg and return to the village, where you live a wealthy\n" +
                                    "life thanks to the value of the egg.\nTHE END");
                        }
                        else if (guess != realNum)
                        {
                            System.out.println("\"That is INCORRECT!\" the dragon bellows. \"Time for your fate.\"");
                            if (guess <= 5) //Ending 7
                            {
                                System.out.println("The dragon roasts you alive and you die a fiery death.\nTHE END");
                            } else if ((guess > 5) && (guess <= 10)) //Ending 8
                            {
                                System.out.println("In one big swoop, the dragon eats you alive. You live the rest of your short life in the dragon's stomach.\nTHE END");
                            }
                        }
                    }
                }
            }
            else if(ans2.equals("trail"))
            {
                System.out.println("You step off of the path and onto the trail. Suddenly, you hear a noise coming from off of the trail to the left. Do you\n" +
                        "investigate or stay on the trail? Enter \"investigate\" or \"trail\"");
                String ans3 = keyboard.nextLine();
                if (ans3.equals("investigate")) //Ending 9
                {
                    System.out.println("You follow the noise, right into a trap! A group of thieves jump you and steal all of your belongings. You return to the\n" +
                            "village, beaten and sad. \nTHE END");
                }
                else if(ans3.equals("trail"))
                {
                    System.out.println("You continue on the trail, which opens up into a beautiful glade. You look around. There's something in one of the bushes. You go over to\n" +
                            "investigate, and out pops a fairy! \"Hello!\" she says. \"You found me! Today's your lucky day! I'll grant you one wish,\n" +
                            "but you have to choose wisely. You can either have a ton of gold, or happiness and good fortune for the rest of your life.\"\n" +
                            "Which do you choose? Enter \"gold\" or \"happiness\"");
                    String ans6 = keyboard.nextLine();
                    if (ans6.equals("gold")) //Ending 4
                    {
                        System.out.println("The fairy smiles mischievously, waves her wand, and disappears with a laugh. You hear a thud behind you. Turning\n" +
                                "around, you see one giant brick of gold taking up the majority of the glade. Engraved on the side, it says \"one ton.\" Unable\n" +
                                "to move it or do anything with it, you return to the village, disappointed and annoyed, and vow to never trust a fairy again.\n" +
                                "THE END");
                    }
                    else if (ans6.equals("happiness")) //Ending 5
                    {
                        System.out.println("The fairy smiles happily, waves her wand, and disappears. A happy warmth overcomes you as you walk back to the village.\n" +
                                "For the rest of your life, you are happy and good things happen to you. And you live happily ever after.\nTHE END");
                    }
                }
            }
        }

    }
}
