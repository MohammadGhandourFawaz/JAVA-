import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		
		String[] options = {"English ", "Arabic "};

        int choice = JOptionPane.showOptionDialog(null,
            "Choose a language:", "Input Dialog",
            JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
            null, options,options[0]);

        switch (choice) {
        
            case 0:
                String input0 = JOptionPane.showInputDialog("The language is English");
                if (input0 != null) {
            		String[][] stateCapital = { { "Lebanon", "Beirut" }, { "Syria", "Damascus" }, { "Palestine", "Qodos" },
            				{ "Jordan", "Amman" }, { "Egypt", "Cairo" }, { "Saudi Arabia", "Riyadh" },
            				{ "Qatar", "Aldoha" }, { "Kuwait", "Kuwait" }, { "Yaman", "Sanaaa" },
            				{ "Oman ", "Muscat" }, { "UAE", "abu dhabi" }, { "Morroco", "Rabat" }, { "Algeria", "Algeria" },
            				{ "Tunisia", "Tunis" }, { "Libia", "Tripoli" }, { "Bahrain", "Manama" },
            				{ "Sudan", "Khartomt" }, { "Somalia", "Mogadishu" }, { "Mauritania "," Nouakchott" },
            				{ "Iraq", "Baghdad" }, { "Comoros", "Moroni" }, { "Djibouti ", "Djibouti " },
            		};
            			 int x = 0;
            			int count=0;

            			for (int i = 0; i < 10; i++) {
            				x=rnd.nextInt(22)+0;
            				String state = stateCapital[x][0];
            				String capital=stateCapital[x][1];

            				String answer =JOptionPane.showInputDialog("What is the capital of "+state);

            				if(answer != null && answer.equalsIgnoreCase(capital)) {
            					JOptionPane.showMessageDialog(null, "Your answer is correct");
            					count++;
            				}
            				else {
            					JOptionPane.showMessageDialog(null,"Incorrect!");
            				}}
            				JOptionPane.showMessageDialog(null,"You get "+count+" out of 10 ");

            			
                	
                }
                break;
            case 1:
                String input1 = JOptionPane.showInputDialog("The language is Arabic");
                if (input1 != null) {
                	{String[][] stateCapitals = { { "لبنان", "بيروت" }, { "سوريا", "دمشق" }, { "فلسطين", "قدس" },
        				{ "الأردن", "عمان" }, { "مصر", "القاهرة" }, { "السعودية ", "الرياض" },
        				{ "قطر", "الدوحة" }, { "الكويت", "الكويت" }, { "اليمن", "Sanaaa" },
        				{ "عمان ", "مسقط" }, { "الإمارات العربية المتحدة", "أبو ظبي" }, { "المغرب", "الرباط" }, { "الجزائر", "الجزائر" },
        				{ "تونس", "تونس" }, { "ليبيا", "طرابلس" }, { "البحرين", "المنامة " },
        				{ "السودان", "خرطوم" }, { "الصومال", "مقديشو" }, { "موريتانيا "," نواكشوط" },
        				{ "العراق", "بغداد" }, { "جزر القمر", "موروني" }, { "جيبوتي ", "جيبوتي " },
        			
        		};
        		int counts=0;

        		for (int i = 0; i < 10; i++) {
        			int y=rnd.nextInt(22)+0;
        			String state = stateCapitals[y][0];
        			String capital=stateCapitals[y][1];

        			String answer =JOptionPane.showInputDialog("ما هي عاصمة "+state);

        			if(answer != null && answer.equalsIgnoreCase(capital)) {
        				JOptionPane.showMessageDialog(null, "إجابتك صحيحة");
        				counts++;
        			}
        			else {
        				JOptionPane.showMessageDialog(null,"غير صحيح!");
        			}
        		}
        			JOptionPane.showMessageDialog(null,"لقد حصلت"+counts+" من أصل 10 ");
       			
        		
                	
                }
                }
                break;
         
        }
        
	}
}










