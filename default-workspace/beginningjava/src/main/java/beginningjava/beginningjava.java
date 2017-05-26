package beginningjava;

 
import java.util.Scanner;

class beginningjava
{
        public static void main(String[] args)
        {
                Scanner Keyboard = new Scanner(System.in);
               
                String Nightlink, Taxi, Alley, Group, Park, Around, Toes, Buddy, Walk, Cross, Down, House, Cracker, Bus;
               
                System.out.println(" ");
                System.out.println("You have just left a house party late at night in a strange area feeling fairly drunk. You spent most of your money on drink so you don't have enough for the   full fair home. Do you hail a \"Taxi\" and see how far you can get, or walk to the nearest \"Nightlink\" ");
               
                System.out.println(" ");
               
                System.out.print("What do you do: ");
                String userinput = Keyboard.nextLine();
               
                System.out.println(" ");
               
                if (userinput.equals ("Taxi"))
                {
                                System.out.println("You manage to hail a cab, you tell the cab driver you only have 8 euro and will he take you as far as it will go. He say's no problem and starts driving through a lot of strange places you've never seen before. You notice the meter roll    onto to 8 euro and the driver pull's over. Still lost you ask the driver where  you are. He just laugh's and pulls off. Feeling worse off then before you start to walk. Eventually coming to a \"Park\" you recognize, you could walk through    which would leave you ten minutes from your house. But knowing the park is not  the safest place at night you could go \"Around\". ");
                       
                                System.out.println(" ");
                       
                                System.out.print("What do you do: ");
                                userinput = Keyboard.nextLine();
                       
                                System.out.println(" ");
                       
 
                       
                        if (userinput.equals ("Park"))
                        {
                                        System.out.println("You know this park like the back of your hand, but also know that a lot of      unsavioury characters use it at night to shy away from un-wanted attention.     Halfway through you hear a voice calling out \"Hey buddy, come ere will ya\".     Fight or Flight reaction kicks in as you feel adrenaline rush through your veins you have two choices, take it on your \"Toes\" and get the fuck out of there or   wait for \"Buddy\" and see what he wants ");
                       
                                System.out.println(" ");
                       
                                System.out.print("What do you do: ");
                                userinput = Keyboard.nextLine();
                       
                                System.out.println(" ");
                                if (userinput.equals ("Toes"))
                                {
                                        System.out.println("Realising what Buddies game is you take it on your toes, you know your nearly   home anyway ain't nobody got time for that. Out of breath you finally make it   home. Tired fully sober and with a banging headache you get into bed, thinking  to yourself getting lost aside, tonight was a good night. ");
                                }
                                else if (userinput.equals ("Buddy"))
                                {
                                        System.out.println("With the little voice in your head telling you to get the fuck out of the park  you don't listen and decide to hear what buddy has to say, you are able to make out more and more details of buddy as he gets closer and closer. Just as it's   too late you see buddies hands are covered in blood as he is walking and talking fine you realize thats not his blood. Before you know it buddy sticks a lock     knife he had hidden in his pocket into your chest. He says nothing and just     walks off. As you lay dying in the middle of a park on your own, the last     taught you have before you die is how stupid you are. ");
                                }
                        }
               
                        if (userinput.equals ("Around"))
                        {
                                System.out.println("Altough you know the walk is maybe an extra hour longer you decide against going through the park. Starting to sober up you see a dark figure standing in a     doorway just off from the street you are walking on. With the drink worn off you could \"Walk\" by, knowing you can defend yourself if it comes to that or you can just \"Cross\" the street and take the easy way. ");
                               
                       
                                System.out.println(" ");
                       
                                System.out.print("What do you do: ");
                                userinput = Keyboard.nextLine();
                       
                                System.out.print(" ");
                       
                                if (userinput.equals ("Cross"))
                                {
                                        System.out.println("You decide tonight has been a good night so far apart from getting lost, you    think to yourself I'm nearly home no need to ruin it by getting into a fight     with a stranger so you cross the road. You don't even see it coming last thing you hear is screeching tires. You just got knocked down and Died. Thats what you get for being a pussy. ");
                                }
                                else if (userinput.equals ("Walk"))
                                {
                                        System.out.println("You decide to take your chances and walk on by this strange dark figure. Turns  out it's just a homeless old man looking worse for wear. Happy enough with your decisions so far, you walk the rest of the way home feeling tired. Overall      tonight was a good night apart from getting lost of course. ");
                                }
                        }
       
                }      
                if (userinput.equals ("Nightlink"))
                {
                                System.out.println("After walking for an hour, you hear your phone beep and think its a call coming through you quickly take your phone out only to see it flash one last time before going dead. With no phone and not much money you realize you have no idea where the fuck you are and if there is even a Nightlink near by. After walking for 10 more minutes you see a \"Group\" of people up ahead, you look to your right and notice an \"Alley\" way that looks like it could take you around. ");
               
                                       
                                        System.out.println(" ");
               
                                        System.out.print("What do you do: ");
                                        userinput = Keyboard.nextLine();
               
                       
                        if (userinput.equals ("Group"))
                        {
                                                System.out.println("The alley looks too dark and you have no idea were it leads. With this in mind you decide to approach the group of people and try find a way home. The group stop talking when they see you coming, you walk up and explain your situation they all think it's hilarious after the joke is over they tell you were you are and that you are in fact not too far from the nearest nightlink. They all seem nice and in your drunk state you stick around for a bit having a laugh and joke with your new friends. After maybe half an hour you are invited back to one of the groups houses that just happens to be a gorgeous looking woman or man with dark hair, great body, hands down 10 out of 10. You can't believe your luck. You now have two choices go home with a \"Cracker\" or get the \"Bus\" home. ");
                               
                               
                                                System.out.println(" ");
                               
                                                System.out.print("What do you do: ");
                                                userinput = Keyboard.nextLine();
                               
                                if (userinput.equals("Cracker"))
                                {
                                                        System.out.println("Not even giving it a second thought you choose to go home with the perfect 10. You have the most amzing night of your life, for years after you remember that night and nothing ever comes close to how great it was. About ten years later you havent been feeling to good for some time now, you are walking down the street and bump into a familiar face it's one of the group you were talking to that amazing night you had. Your first question is how is perfect 10 doing, with a sad look in his eye he explains he or she started experimenting with heroin around about the time you two hooked up and had apparently caught aids from sharing needles. That's when the penny drops and it hits you. All this time you've been feeling sick now you know, you're fucked. Not too long after finding out you have full blown aids you are on your death bed with the last taught going trough your mind why didn't i wrap up. ");
                                }
                                else if (userinput.equals("Bus"))
                                {      
                                                        System.out.println("Going against everything you believe in and being too tired you decide to give it a miss. You walk to the nightlink stop and see there is one due any minute. After nearly falling asleep and missing your stop, your finally home and in your bed thinking what you missed out on with that cracker but all in all tonight was a good night. ");
                                }
                        }      
                        if (userinput.equals("Alley"))
                        {
                                System.out.println("You decide to walk down the alley, after walking for what seems like hours your still stuck down this alley way and can't see anyway out. There is only large walls on either side with factories lining up behind both walls. With no way out you keep walkin until you see a light off in the distance lighting the ally way. As you approach you see a single garage door open attached to the only house you have seen for ages. The house looks abandoned only for the single light coming from the garage. You could try get through the \"House\" to the other side and get out onto the industrial estate or keep going \"Down\" the alley ");
                       
                               
                                System.out.print("What do you do: \n");
                                userinput = Keyboard.nextLine();
                               
                                if (userinput.equals("House"))
                                {
                                                System.out.println("You take your chances and go through the garage and enter the house, it's abandoned just like you thought. Nothing strange happens and you manage to get out onto the industrial estate. With the sun rising and pain in the bollox walking you see a cab and pull him over it turns out your not too far from home and the little money you have is well enough to get you there. Finally home you fall into bed. Just before you fall asleep you think to yourself aside from getting lost and with a story to tell tonight was a good night. ");
                                }
                                else if (userinput.equals("Down"))
                                {
                                                System.out.println("You don't like the look of this lonely house and decide to take your chances down the alley, you think to yourself how long can it be anyways. Well turns out it can be very long indeed so long you keep walking and walking for days until your dehydrated body can't take it anymore and you end your life down some endless alley in the middle of no wher all alone. ");
                                }
                               
                       
                        }                      
                }      
        }
}
