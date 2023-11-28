package com.example.root.quiz_app;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class DbHelper extends SQLiteOpenHelper
{
    private static final int DATABASE_VERSION = 1;
    // Database Name
    private static final String DATABASE_NAME = "triviaQuiz";
    // tasks table name
    private static final String TABLE_QUEST = "quest";
    // tasks Table Columns names
    private static final String KEY_ID = "id";
    private static final String KEY_QUES = "question";
    private static final String KEY_ANSWER = "answer"; //correct option
    private static final String KEY_OPTA= "opta"; //option a
    private static final String KEY_OPTB= "optb"; //option b
    private static final String KEY_OPTC= "optc"; //option c
    private static final String KEY_OPTD= "optd"; //option c

    private SQLiteDatabase dbase;
    public DbHelper(Context context) {

        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db)
    {
        dbase=db;
        String sql = "CREATE TABLE IF NOT EXISTS " + TABLE_QUEST + " ( "
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_QUES
                + " TEXT, " + KEY_ANSWER+ " TEXT, "+KEY_OPTA +" TEXT, "
                +KEY_OPTB +" TEXT, "+KEY_OPTC+" TEXT, "+KEY_OPTD+" TEXT)";
        db.execSQL(sql);
        addQuestions();
        //db.close();
    }
    private void addQuestions()
    {
        Question q1=new Question("Who is the hero that played Venkatesh's brother role in the movie Sankranthi ?","Raviteja", "Srikanth", "Yoganand","None of the above", "Srikanth");

        this.addQuestion(q1);
        Question q2=new Question("What do you mean by IP address?","Internet provision","Internal Protocals","Internet protocol","intermediate Protocal","Internet protocol");
        this.addQuestion(q2);
        Question q3=new Question("How many players are there on each side in a baseball match?","5", "7", "6","8", "5");

        this.addQuestion(q3);





        Question q4=new Question("Who directed the movie “Sita Ramam” ?","Hanu Raghavapudi", "Trivikram", "V.V. Vinayak","Puri jaganath", "Hanu Raghavapudi");

        this.addQuestion(q4);
        Question q5=new Question("What is the full form of ISRO?", "Indian Space Research Organization", "International Space Research Organization", "India Space Research Organization","None of the above","Indian Space Research Organization");
        this.addQuestion(q5);
        Question q6=new Question("Which of the following countries won the Under-19 Cricket World Cup held in 2012?", "india","pakistan","england","west indies","india");
        this.addQuestion(q6);





        Question q7=new Question("What is the launch date for the Aditya L1 Mission ?","14 August, 2023", "23 August, 2023", "2 Sept, 2023","22 Sept, 2023", "2 Sept, 2023");

        this.addQuestion(q7);
        Question q8=new Question("Who is the Current Education Minister of India 2023 ?","Dharmendra Pradhan","prakash javadekar","Rajnath singh","arun jaitley","Dharmendra Pradhan");
        this.addQuestion(q8);


        Question q9=new Question("Which one is not a nickname of a version of Android ?","Gingerbread" ,"Muffin","Cupcake","Honeycomb","Muffin");
        this.addQuestion(q9);




        Question q10=new Question("Which is Megastar's 150th Movie ? ","Andarivaadu", "Shankardada Zindabad", "Khaidi No. 150","Shankardada M.B.B.S", "Khaidi No. 150");

        this.addQuestion(q10);
        Question q11=new Question("who wrote the national anthem?","latha mangeshkar","Rabindranath Tagore","Anuradha podwal","Bankim Chandra Chattopadhyay","Rabindranath Tagore");
        this.addQuestion(q11);

        Question q12=new Question("Sachin Tendulkar hit his 100th international century against which among the following team?","england","bangladesh","srilanka","south africa","bangladesh");
        this.addQuestion(q12);



        Question q13=new Question("What is Aditya L1 Mission?","First Indian mission to study Sun", "ISRO mission to study stars", "Another mission to study the moon","Mission to understand the orbit", "First Indian mission to study Sun");

        this.addQuestion(q13);

        Question q14=new Question("who wrote the vandhe mathram?","latha mangeshkar","Rabindranath Tagore","Anuradha podwal","Bankim Chandra Chattopadhyay","Bankim Chandra Chattopadhyay");
        this.addQuestion(q14);

        Question q15=new Question("Which among the following country is the host of 2018 Commonwealth Games?","england","australia","canada","south africa","australia");
        this.addQuestion(q15);




        Question q16=new Question("What is the full form of PSLV ?","Polar Satellite Launch Vehicle", "Pole Space Land Vehicle", "Power Satellite Launch Vehicle","Polar Space Launch Vehicle", "Polar Satellite Launch Vehicle");

        this.addQuestion(q16);

        Question q17=new Question("which is the highest population state in india?","rajasthan","maharashtra","Bihar","Uttar Pradesh","Uttar Pradesh");
        this.addQuestion(q17);

        Question q18=new Question("How many number of Red Balls are in Snooker?","13","15","17","20","15");
        this.addQuestion(q18);




        Question q19=new Question("When is National Sports Day celebrated in India?","August 28th", "August 29th", "August 27th","August 30th", "August 29th");

        this.addQuestion(q19);

        Question q20=new Question("who is the 12 th president of india?","Pratibha Patil","A. P. J. Abdul Kalam","Pranab Mukherjee","Ram Nath Kovind","Pratibha Patil");
        this.addQuestion(q20);

        Question q21=new Question("Who among the following is the first Indian to score a century in Indian Premier League?","Manish Pandey","sachin","V Shewag","Guatham Gambhir","Manish Pandey");
        this.addQuestion(q21);




        Question q22=new Question("what is the first movie of devi sri prasad?","sontham", "abhi", "devi","anandam", "devi");

        this.addQuestion(q22);

        Question q23=new Question("who's BIRTHDAY celebrating the Enggineers Day in India?","Srinivasa Ramanujan","C.V.raman","M.Visvesvaraya","Isaac Newton","M.Visvesvaraya");
        this.addQuestion(q23);

        Question q24=new Question("Who among the following was first Rajiv Gandhi Khel Ratna?","V Anand","Geet seti","Karnam M","Guatham Gambhir","V Anand");
        this.addQuestion(q24);


        Question q25=new Question("Pragyan rover of the Chandrayaan-3 mission, has confirmed the presence of which element on the moon’s surface ?","Potassium", "Sulphur", "Sodium","Chlorine", "Dictator");

        this.addQuestion(q25);

        Question q26=new Question("which is the smallest state in india?","Telangana","Kerala","Goa","Delhi","Goa");
        this.addQuestion(q26);

        Question q27=new Question("Who was the first Indian International Cricket Council President?","sharad Pawar","J M Dalmiya","Gavarkar","Guatham Gambhir","J M Dalmiya");
        this.addQuestion(q27);



        Question q28=new Question("What is the character name of Prabhas in his First Movie","Rajesh", "Eeshwar", "Jay","raghavendra", "Eeshwar");

        this.addQuestion(q28);
        Question q29=new Question("Who invented first super computer in india?","Bhatkar","A. P. J. Abdul Kalam","Srinivasa Ramanujan","Homi j bhabha","Bhatkar");
        this.addQuestion(q29);


        Question q30=new Question("Which was the first brand, Sachin Tendulkar endorsed in the beginning of his career?","Boost","MRF","Toshiba","NIKE","Boost");
        this.addQuestion(q30);



        Question q31=new Question("What was the first movie of mega star chiranjeevi? ","Mana oori pandavulu", "Donga", "Yamakinkarudu","Punaadi raalu", "Punaadi raalu");

        this.addQuestion(q31);

        Question q32=new Question("When Telangana formation Day celebrated?","july 2","june 12","june 2","july 12","june 2");
        this.addQuestion(q32);

        Question q33=new Question("Who among the following is first Indian to win an individual gold medal at any Olympic Games?","Abhinav Bindra","Muhammad Aslam","R S Rathod","M Shahid","Abhinav Bindra");
        this.addQuestion(q33);



        Question q34 =new Question("In which movie tammana was acted with  hero ram ?","Deva das", "Happy days", "Veedokkade","Ready", "Ready");

        this.addQuestion(q34);
        Question q35=new Question("who is the head of RSS?","Mohan Madhukar Bhagwat","amit shah","yogi adithyanath","none of the above","Mohan Madhukar Bhagwat");
        this.addQuestion(q35);

        Question q36=new Question("Which of the following Indian Sports Team is also known as “The Bhangra Boys?","Cricket","Football","Hockey","None of above","Football");
        this.addQuestion(q36);



        Question q37=new Question("Tarun and trisha movie ?","Stalin", "Nuvu leka nenu lenu", "Nee manasu naaku telusu","Nuve kavali", "Nee manasu naaku telusu");

        this.addQuestion(q37);
        Question q38=new Question("____________ Capital of maharashtra?","Nagpur","Pune","Mumbai","Raigard","Mumbai");
        this.addQuestion(q38);


        Question q39=new Question("Who among the following was known as Flying Sikh?","Milkha Singh","Yuvraj singh","Harbhajan singh","G singh","Milkha Singh");
        this.addQuestion(q39);



        Question q40=new Question("First Indian movie submitted for Oscar","The Guide", "Mother India", "Madhumati","Amrapali", "Mother India");

        this.addQuestion(q40);

        Question q41=new Question("When was born Mahatma Gandhi?","1868","1869","1871","1873","1869");
        this.addQuestion(q41);

        Question q42=new Question("Which two countries compete for cricket's "+"Ashes"+"?","ENG Vs AUS","IND Vs PAK","ENG Vs SA","AUS Vs SA","ENG Vs AUS");
        this.addQuestion(q42);



        Question q43=new Question("Filmfare awards started from the year","1952", "1964", "1954","1960", "1954");
        this.addQuestion(q43);
        Question q44=new Question("Where is wardha Ashram situated?","Sevagram","Port bondhar","ahmedhabad","champaran","Sevagram");
        this.addQuestion(q44);


        Question q45=new Question("What does the term "+"LBW"+" stand for in cricket?","Leg Before Wicket","Launch Ball Wicketwards","Lift Bat and Whack","Let's Behave Wickedly","Leg Before Wicket");
        this.addQuestion(q45);

        Question q46=new Question("First Indian to win an Oscar award","Bhanu Athaiya", "AR Rahman", "Rasul Pookutty","None of the Above", "Bhanu Athaiya");

        this.addQuestion(q46);


        Question q47=new Question("When was Jawaharlal Nehru Prime Minister of India?","1940-1944","1947-1964","1965-1968","1977-1980","1947-1964");
        this.addQuestion(q47);

        Question q48=new Question("What colour of caps are worn by the Australian national cricket team?","Green","Blue","White","Gray","Green");
        this.addQuestion(q48);
        Question q49=new Question("First 3D animated film from India is","Roadside Romeo", "Ghayab Aaya", "Hanuman","Bal Ganesh", "Roadside Romeo");
        this.addQuestion(q49);


        Question q50=new Question("When was Jawaharlal Nehru born?","29 February 1896","23 April 1897","26 August 1900","14 November 1889","14 November 1889");
        this.addQuestion(q50);

        Question q51=new Question(" Who among the following is the highest wicket taker in all formats of cricket?"," M Muralidharan"," Shane Warne"," Anil Kumble","GD McGrath"," M Muralidharan");
        this.addQuestion(q51);
        Question q52=new Question("Which one is the first film of Amitabh Bachchan's career","Saat Hindustani", "Anand", "Parwaana","Guddi", "Saat Hindustani");
        this.addQuestion(q52);

        Question q53=new Question("Which of the following cities is the venue of the 12th Aero India 2019?","Bengaluru","New Delhi","Pune","Chennai","Bengaluru");
        this.addQuestion(q53);

        Question q54=new Question("Which country won the first Cricket World Cup in 2011?","India","Australia","Pakistan","England","India");
        this.addQuestion(q54);
        Question q55=new Question("Who is the director for the  movie Syra narasimha reddy?","v.v.vinayak", "boyapati srinu", "surendher reddy","vamshi paidipally", "surendher reddy");

        this.addQuestion(q55);

        Question q56=new Question("DRDO full form?","Defence Research and Develop Organisation","Development Research and Defence Organisation","Defence Research and Development Organisation","none of the above","Defence Research and Development Organisation");
        this.addQuestion(q56);

        Question q57=new Question("How many teams are participating in IPL Twenty20 cricket tournament 2018?","6","7","8","10","8");
        this.addQuestion(q57);
        Question q58=new Question("Which one is the first film of Vijay Devarakonda ?","nuvvila", "yevade subramanyam", "life is beautiful","pelli choopulu", "nuvvila");

        this.addQuestion(q58);
        Question q59=new Question("When DRDO found?","was formed in 1955","was formed in 1957","was formed in 1958","was formed in 1960","was formed in 1958");
        this.addQuestion(q59);


        Question q60=new Question("Who was the champion of IPL t20 tournament 2023?","Mumbai indian","KKR","Chennai Super Kings","Sunrise Hyd","Chennai Super Kings");
        this.addQuestion(q60);
        Question q61=new Question("Who is popularly known as “Iron Man of India”?","Lal Bahadur Shastri", "Sardar Vallabha Bhai Patel", "Mahatma Gandhi","none of the above", "Sardar Vallabha Bhai Patel");

        this.addQuestion(q61);

        Question q62=new Question("Who is the present Chairperson of Congress working commitee?","Sonia Gandhi","Rahul Gandhi","Mallikarjun Kharge","priyanka Gandhi","Mallikarjun Kharge");
        this.addQuestion(q62);

        Question q63=new Question("By which name 2024 season of IPL is known as?","IPL 17"," IPL 18"," IPL 16"," IPL 15","IPL 17");
        this.addQuestion(q63);
        Question q64=new Question("Who is the MUSIC director for BAHUBALI ?","Devisri Prasad", "M.M Keeravani", "Rajamouli","Trivikram", "M.M Keeravani");

        this.addQuestion(q64);
        Question q65=new Question("Who is the present army chief of Bharath?","General Bipin Rawat","General Dalbir Singh","General Rajendrasinhji Jadeja"," General Manoj Pande"," General Manoj Pande");
        this.addQuestion(q65);

        Question q66=new Question("Which two teams had been qualified for 2018 IPL final?","RR and KKR","SRH and CSK","KIXPunjab and CSK","SRH and KKR","SRH and CSK");
        this.addQuestion(q66);
        Question q67=new Question("Vitara Brezza is a car model launched by","Maruti", "Hyundai", "Ford","Honda", "Maruti");

        this.addQuestion(q67);
        Question q68=new Question("Which country have world's largest army?","China","India","United States","North Korea","China");
        this.addQuestion(q68);



        Question q69=new Question(" Which team became the champion of IPL T20 2023?","CSK","MI","KKR","SH","CSK");
        this.addQuestion(q69);
        Question q70=new Question("Which of the following is India's first electric car?","Revaz", "Miva", "Riva","Reva", "Reva");

        this.addQuestion(q70);
        Question q71=new Question("Richest person in india?","Lakshmi Mittal","Mukesh Ambani","Pallonji Mistry","Dilip Shanghvi","Mukesh Ambani");
        this.addQuestion(q71);





        Question q72=new Question("How many teams has been qualified for Fifa World Cup 2023?","31","48","15","32","32");
        this.addQuestion(q72);
        Question q73=new Question("who is the host of TELUGU BIGBOSS 7?","Jr.Ntr", "Nagarjuna", "Nani","Chiranjeevi", "Nagarjuna");

        this.addQuestion(q73);
        Question q74=new Question("Who is inventor of facebook?","Bernard Arnault","Carlos Slim Helu","Mark Zuckerberg","none of the above","Mark Zuckerberg");
        this.addQuestion(q74);



        Question q75=new Question("Fear of heights is known as","Achluophobia","Aerophobia","Androphobia","Acrophobia","Acrophobia");
        this.addQuestion(q75);
        Question q76=new Question("The first vaccine was for which disease?","Chickenpox", "Polio", "Measles","Smallpox", "Smallpox");

        this.addQuestion(q76);


        Question q77=new Question("First woman to climb Mount Everest in India?","Arunima shina","premlata agarwal","Bachendri Pal","Fathima beevi","Bachendri Pal");
        this.addQuestion(q77);



        Question q78=new Question("Which creature has three hearts?","Octopus","Stingray","Jellyfish","Shark","Octopus");
        this.addQuestion(q78);
        Question q79=new Question("Akshay kumar recent movie?","Holiday", "Selfiee", "Gold"," Ram Setu", "Selfiee");

        this.addQuestion(q79);
        Question q80=new Question("Present total number of districts in Andhra Pradesh?","25","26 ","27","22","26 ");
        this.addQuestion(q80);




        Question q81=new Question("Which is the national food of India?","Roti","Khichdi","Dal","None of these","Khichdi");

        this.addQuestion(q81);

        Question q82=new Question("Strawberry is good source of which vitamin?","Vitamin C", "Vitamin A", "Vitamin K","None of these", "Vitamin C");

        this.addQuestion(q82);
        Question q83=new Question("Before Hyderabad was made capital in 1956, which city was the capital of Andhra Pradesh?","Warangal","Vijayawada","Visakhapatnam","Kurnool","Kurnool");
        this.addQuestion(q83);


        Question q84=new Question("In the Indian Premier League, MS Dhoni captained which team?","Delhi Daredevils","Rajasthan Royals","Chennai Super Kings","KKR","Chennai Super Kings");
        this.addQuestion(q84);

        Question q85=new Question("How many characters did  Jr.NTR performed in his movie jay lava kusa?","2", "1", "3","None of the Above", "3");

        this.addQuestion(q85);
        Question q86=new Question("When NT Rama Rao become the first chief Minister of Andhra Pradesh?","1978","1983","1985","1992","1983");
        this.addQuestion(q86);



        Question q87=new Question("How many months have 28 days?","2","1","All of them","Depends if there is a leap year or not","All of them");
        this.addQuestion(q87);
        Question q88=new Question("What is the name of the role PAWAN KALYAN acted in ATHARINTIKI DHAREDHI  movie?","Shiva", "Abhiram", "Siddu","ram", "Siddu");

        this.addQuestion(q88);
        Question q89=new Question("The first book that was printed in Telugu is?","The Bible","Rajasekhara Charitram","Kalapurnodaya","Sathya Harishchandr","Rajasekhara Charitram");
        this.addQuestion(q89);


        Question q90=new Question("What is the DOB of M S Dhoni","7 july"," 7 june","17 june","17 july","7 july");
        this.addQuestion(q90);
        Question q91=new Question("Who is known as the 'The show man' of indian movie?","Dev anand", "Raj kapoor", "Dilip Kumar","Rajesh khanna", "Raj kapoor");

        this.addQuestion(q91);

        Question q92=new Question("Osmania University was established in the year?","1916","1917","1918","1919","1918");
        this.addQuestion(q92);

        Question q93=new Question("What is the highest run score by M S Dhoni in test","183*","183","224","175*","224");
        this.addQuestion(q93);
        Question q94=new Question("Which is the first Indian State to go wholly organic?","Meghalaya", "Sikkim ", "Manipur","Assam", "Sikkim");

        this.addQuestion(q94);

        Question q95=new Question("Total number of districts in Telangana on 2014?","7","8","10","11","10");
        this.addQuestion(q95);

        Question q96=new Question("Name the crickter who marry with bollywood actress?","Sachin","Lokesh rahul","Virat Kholi","M S Dhoni","Virat Kholi");
        this.addQuestion(q96);
        Question q97=new Question("What is the role name of the Aadhi Pinisetty in Ninnu Kori Movie ?","Arun Kumar", "Uma Maheswara Rao", "Aadhi","Arun", "Arun");

        this.addQuestion(q97);


        Question q98=new Question("What was the name of the military operation that conducted to merge Hyderabad with India?","Operation Thunder","Operation Hyderabad","Operation Polo","Operation Strom","Operation Polo");
        this.addQuestion(q98);

        Question q99=new Question("Name the crickter who known as "+"HIT-MAN"+" ?","Rohit Sharma","Virat Kohli","M S Dhoni","Sachin","Rohit Sharma");
        this.addQuestion(q99);
        Question q100=new Question("Which city is known as the Garden city of India?","Trivandram", "Imphal", "Simla","Banglore", "Banglore");

        this.addQuestion(q100);
        Question q101=new Question("Who is appointed as the "+"brand ambassador"+" of Telangana?","Mohammad Azharuddin","p.v sindhu","Saina Nehwal","Sania Mirza","Sania Mirza");
        this.addQuestion(q101);

        Question q102=new Question("Sun Temple is situated at ?","Konark","Banglore","Haridwar","Kerala","Konark");
        this.addQuestion(q102);
        Question q103=new Question("Music director of song “Naatu Naatu..”","DSP", "Mani Sharma", "Mani Sharma","A.R.Rahman", "Mani Sharma");

        this.addQuestion(q103);


        Question q104=new Question("Total number of states that shares borders with Telangana is?","4","5","6","8","4");
        this.addQuestion(q104);

        Question q105=new Question("Who become the first Indian to win a medal in the 2023 IAAF Continental Cup?","Jinson Johnson","Sudha Singh","Neeraj Chopra","Arpinder Singh","Arpinder Singh");
        this.addQuestion(q105);
        Question q106=new Question("What is the name of the role Rakul acted in Venkatadri express movie?","Lucky", "Prarthana", "Rupa","Ria", "Prarthana");

        this.addQuestion(q106);

        Question q107=new Question("India's largest city by populationreading-table?","Delhi","Mumbai","Chennai","Pune","Mumbai");
        this.addQuestion(q107);

        Question q108=new Question("P V Sindhu won __________ medal in badminton at Asian Games.?","Gold","Silver","Bronze","None of above","Silver");
        this.addQuestion(q108);
        Question q109=new Question("This film launched Amitabh Bachchan as the 'angry young man' of Bollywood?","Sholay", "Deewar", "Zanjeer","Saat Hindustani", "Zanjeer");

        this.addQuestion(q109);

        Question q110=new Question("National Motto of India?","vandhe mathram","Satyameva Jayate","jai hind","none of the above","Satyameva Jayate");
        this.addQuestion(q110);

        Question q111=new Question("“Neelakashamlo “ song from Sukumarudu movie was sung by","Sunitha","Geetha Madhuri","Shreya Goshal","Chinmayi","Shreya Goshal");
        this.addQuestion(q111);
        Question q112=new Question("Sr. NTR first movie","Mana desam", "Pathala Biravi", "Yama gola","Major Chandrakanth", "Mana desam");

        this.addQuestion(q112);

        Question q113=new Question("Who first discovered India?","Nepolian","Vasco da Gama","san curze","Ramanujan prime","Vasco da Gama");
        this.addQuestion(q113);


        Question q114=new Question("Which team wins the FIFA U-20 Women's World Cup for the first time?","Japan","China","India","France","Japan");
        this.addQuestion(q114);
        Question q115=new Question("Who played the role of Birju in the 1957 film 'Mother India'?","Rajendra Kumar", "Raaj Kumar", "Manoj Kumar","Sunil Dutt", "Sunil Dutt");

        this.addQuestion(q115);

        Question q116=new Question("Hindi Divas celebrate in India on?","14th September","12th April","10th April","14th December","14th September");
        this.addQuestion(q116);

        Question q117=new Question("India bagged __________ medal in Women's kabaddi at the Asian Games 2018.?","Gold","Silver","Bronze","None of above","Silver");
        this.addQuestion(q117);
        Question q118=new Question("Which of these actors was not one of Priyanka Chopra’s seven husbands in '7 Khoon Maaf'?","Irrfan Khan", "John Abraham", "Neil Nitin Mukesh","Saif Ali Khan", "Saif Ali Khan");

        this.addQuestion(q118);

        Question q119=new Question(" Which state has the highest literacy rate?","Goa","Kerala","Mizoram","Manipur","Kerala");
        this.addQuestion(q119);

        Question q120=new Question("The 2023 Men's Hockey World Cup will be hosted by?","Odisha","Chattissgarh","Rajasthan","Tamil Nadu","Odisha");
        this.addQuestion(q120);
        Question q121=new Question("What profession does Sanjay Dutt fake in 'Lage Raho Munna Bhai'?","Doctor", "Software engineer", "History professor","Film director", "History professor");

        this.addQuestion(q121);

        Question q122=new Question("Who is the RBI governor of 2023?","Y. V. Reddy","D. Subbarao","Shaktikanta Das","Raghuram Rajan","Shaktikanta Das");
        this.addQuestion(q122);


        Question q123=new Question("What is the position of India in the FIFA world rankings?","96","98","99","115","99");
        this.addQuestion(q123);
        Question q124=new Question("Who composed the music in Ashutosh Gowariker’s period drama 'Jodhaa Akbar'?","Shankar-Ehsaan-Loy", "Anu Malik", "Jatin-Lalit","A.R. Rahman", "A.R. Rahman");

        this.addQuestion(q124);

        Question q125=new Question("Which is India's first artificial satellite?","INSAT","Aryabhata","Bhaskara","Rohini","Aryabhata");
        this.addQuestion(q125);

        Question q126=new Question("Which team won the gold medal in the Women's Hockey World Cup 2023?","Netherlands","Ireland","Spain","India","Netherlands");
        this.addQuestion(q126);
        Question q127=new Question("Which famous director made his acting debut in 'Dilwale Dulhania Le Jayenge'?","Karan Johar", "Farhan Akhtar", "Aditya Chopra","Anurag Kashyap", "Karan Johar");

        this.addQuestion(q127);

        Question q128=new Question("First University established in India?","University of Calcutta"," Delhi University","Madras University"," Banaras Hindu University","University of Calcutta");
        this.addQuestion(q128);


        Question q129=new Question("Who won the 2018 women singles Wimbledon tennis tournament?","Maria Sharapova","Simona Halep","Marketa Vondrousova","Serena Williams","Marketa Vondrousova");
        this.addQuestion(q129);
        Question q130=new Question("Which Amrish Puri film features the iconic dialogue 'Mogambo khush hua'?","Nayak: The Real Hero", "Mr. India", "Damini","Diljale", "Mr. India");

        this.addQuestion(q130);


        Question q131=new Question("The first IIT was established in1951 known as?","IIT Delhi","IIT Kanpur","IIT Kharagpur","IIT Madras","IIT Kharagpur");
        this.addQuestion(q131);

        Question q132=new Question("Which team won the 2018 Kabaddi Masters Dubai title?","India","Iran","Argentina","Pakistan","India");
        this.addQuestion(q132);
        Question q133=new Question("Who directed the Shahrukh Khan, Madhuri Dixit and Aishwarya Rai-starrer 'Devdas'?","Sanjay Leela Bhansali", "Prakash Jha", "Ashutosh Gowariker","Karan Johar", "Sanjay Leela Bhansali");

        this.addQuestion(q133);

        Question q134=new Question("Biggest District in India?"," Leh, Jammu and Kashmir","Bikaner, Rajasthan"," Jodhpur, Rajasthan","Kachchh, Gujrat","Kachchh, Gujrat");
        this.addQuestion(q134);

        Question q135=new Question("This team won the 2018 Men's Hockey Champions Trophy?","Belgium","Argentina","India","Australia","India");
        this.addQuestion(q135);
        Question q136=new Question("Name Aamir Khan’s character in the Oscar-nominated film 'Lagaan.'","Sajjan", "Arjan", "Bhuvan","Lallan", "Bhuvan");

        this.addQuestion(q136);

        Question q137=new Question("The first Indian newspaper to offer an online edition on internet?","Times of India","Hindustan Times","Anandabazar Patrika","The Hindu ","The Hindu ");
        this.addQuestion(q137);

        Question q138=new Question("Which country will host the 2018 ICC Women's World T20 tournament?","India","West Indies","England","Australia","Australia");
        this.addQuestion(q138);
        Question q139=new Question("Which of these Amitabh Bachchan films had the tagline 'It’s all about loving your parents'?","Baghban", "Paa", "Kabhi Khushi Kabhie Gham","Waqt: The Race Against Time", "Kabhi Khushi Kabhie Gham");

        this.addQuestion(q139);

        Question q140=new Question("Which state is the largest producer of rice in India?","West Bengal","Andhra Pradesh","Punjab","Uttar Pradesh","West Bengal");
        this.addQuestion(q140);


        Question q141=new Question("Who scores 1st hat-trick of FIFA World Cup 2018?","Sergio Ramos","Cristiano Ronaldo","Neymar","Messi","Cristiano Ronaldo");
        this.addQuestion(q141);
        Question q142=new Question("Who played the infamous villain Gabbar in 'Sholay'?","Pran", "Ajit", "Kader Khan","Amjad Khan", "Amjad Khan");

        this.addQuestion(q142);

        Question q143=new Question("Where the India's first Defence University is located?","Karnataka","Kerla","Uttar Pradesh","Haryana","Haryana");
        this.addQuestion(q143);


        Question q144=new Question("Who hosted the 2019 ICC World Cup?","England","Australia","West Indies","England & Wale","England & Wale");
        this.addQuestion(q144);
        Question q145=new Question("Farhan Akhtar made his directorial debut with this film.","Lakshya", "Dil Chahta Hai", "Don","Luck By Chance", "Dil Chahta Hai");

        this.addQuestion(q145);


        Question q146=new Question("In which state the Rajiv Gandhi National Institute of Youth Development is located?","Tamil Nadu","Karnataka","Kerla","Uttaranchal","Tamil Nadu");
        this.addQuestion(q146);

        Question q147=new Question("Who scored 1st 200 run in ODI?","Sachin Tendulkar","Rohit Sharma","V Shewag","Virat Kholi","Sachin Tendulkar");
        this.addQuestion(q147);
        Question q148=new Question("Which actress debuted opposite Shahrukh Khan in 'Om Shanti Om'?","Sonam Kapoor", "Anushka Sharma", "Asin","Deepika Padukone", "Deepika Padukone");

        this.addQuestion(q148);


        Question q149=new Question("Which is cleanest city in india?","Mysore","Hyderabad","Indore","Bengaluru","Indore");
        this.addQuestion(q149);

        Question q150=new Question("Rohit Sharma`s Highest Run in ODI is?","264","200","255","260","264");
        this.addQuestion(q150);
        Question q151=new Question("Shahrukh and Dilip Kumar hold the joint-record for winning the maximum number of Filmfare Best Actor awards. How many have they won?","9", "7", "10","8", "8");

        this.addQuestion(q151);

        Question q152=new Question("Which Indian State imposed total ban on the use of plastic?","Punjab","Karnataka","Haryana","Maharashtra","Maharashtra");
        this.addQuestion(q152);

        Question q153=new Question("India beat ____ team in 1st T20 world cup final match?","Australia","Pakistan","England","Sri lanka","Pakistan");
        this.addQuestion(q153);
        Question q154=new Question("Which Rajesh Khanna film had the iconic dialogue 'Pushpa, I hate tears'?","Aradhana", "Amar Prem", "Aap Ki Kasam","Kati Patang", "Amar Prem");

        this.addQuestion(q154);
        Question q155=new Question("In which Indian City, World's largest mobile factory is launched?","Gurugram","Noida","Meerut","Chennai","Noida");
        this.addQuestion(q155);

        Question q156=new Question("Who hitted the winning six in last ball of NIDHAN TROPHY against Bangladesh?","Dinesh Kartik","M S Dhoni","Yuvraj Singh","Hardik Pandya","Dinesh Kartik");
        this.addQuestion(q156);
        Question q157=new Question("Which Bollywood actor played TV show host Prem Kumar in 'Slumdog Millionaire'?","Shahrukh Khan", "Anil Kapoor", "Irrfan Khan","Kabir Bedi", "Anil Kapoor");

        this.addQuestion(q157);




        Question q158=new Question("Which company setup the World's largest mobile factory in India?","Apple","Nokia","Samsung","MI","Samsung");
        this.addQuestion(q158);




        Question q159=new Question("Name the crickter who had scored 400* run in test match?","Sachin Tendulkar","Gram Smith","Brain Lara","Steve Smith","Brain Lara");
        this.addQuestion(q159);
        Question q160=new Question("Vishal Bhardwaj’s film 'Haider' is based on which Shakespearean play?","Othello", "Hamlet", "Macbeth","King Lear", "Hamlet");

        this.addQuestion(q160);


        Question q161=new Question("Total number of seats in the Lower House of Parliament is?","545","585","560","520","545");
        this.addQuestion(q161);


        Question q162=new Question("Name the actor who played a role of MS Dhoni in MS Dhoni (the untold story)?","Ranvir Kapoor","Ranbir Kapoor","Sushant S Rajput","Rajkumar Rao","Sushant S Rajput");
        this.addQuestion(q162);
        Question q163=new Question("Which film is an official remake of the Susan Sarandon and Julia Roberts-starrer 'Stepmom'?","We are Family", "Apne", "Ek Rishtaa: The Bond of Love","Ta Ra Rum Pum", "We are Family");

        this.addQuestion(q163);

        Question q164=new Question("Who is the first Woman Governor in India?","Vijayalakshmi Pandit","Sarojini Naidu","Padmaja Naidu"," Fathima Beevi","Sarojini Naidu");
        this.addQuestion(q164);

        Question q165=new Question("Name the cricketer who is known as "+"WALL OF INDIA"+"?","Rahul Dravid","Sachin Tendulkar","MS Dhoni","Yuvraj Singh","Rahul Dravid");
        this.addQuestion(q165);
        Question q166=new Question("This Gulzar film dealt with the subject of Sikh insurgency in the '80s.","Hu Tu Tu", "Lekin...", "Kinara","Maachis", "Maachis");

        this.addQuestion(q166);

        Question q167=new Question("Who is the chairman of Rajya Sabha?","Chief Justice","President","Vice-President","Attorney General","Vice-President");
        this.addQuestion(q167);

        Question q168=new Question("Sachin palyed his 1st international match at age?","20","18","16","19","16");
        this.addQuestion(q168);
        Question q169=new Question("What are John Abraham and Akshay Kumar's professions in Garam Masala?","Reporter ", "Photographers ", "Professors ","Lawyers", "Photographers ");

        this.addQuestion(q169);
        Question q170=new Question("In which state, the President's Rule was first imposed in India?","Andhra Pradesh","Karnataka","Assam","Haryana","Andhra Pradesh");
        this.addQuestion(q170);
        Question q171=new Question("Name the cricketer who known as "+"GOD OF CRICKET"+"?","Rahul Dravid","Sachin Tendulkar","MS Dhoni","Yuvraj Singh","Sachin Tendulkar");
        this.addQuestion(q171);
        Question q172=new Question(" From where does Veeru propose to Basanti in Sholay?","Top of a roof ", "Top of a ladder ", "Top of a hill ","Top of a water tank", "Top of a water tank");

        this.addQuestion(q172);
        Question q173=new Question("Who is the longest serving president of Indian national Congress?","Indira Gandhi","Jawaharlal Nehru","Mahatma Gandhi","Sonia Gandhi","Sonia Gandhi");
        this.addQuestion(q173);

        Question q174=new Question("Who was the first women governer of a state  in independent India ?","Sarojini Naidu","Kiran Bedi","Pratibha Patil","Anandiben Patel","Sarojini Naidu");
        this.addQuestion(q174);
        Question q175=new Question("Who, apart from Aamir Khan, wants to marry Preity Zinta in Dil Chahta Hai?","Shah Rukh Khan ", "Ayub Khan ", "Saif Ali Khan ","Akshaye Khanna ", "Ayub Khan ");

        this.addQuestion(q175);

        Question q176=new Question("Which is the first state to be formed on the basis of language?","Andhra Pradesh","Karnataka","Assam","Haryana","Andhra Pradesh");
        this.addQuestion(q176);

        Question q177=new Question("Who was the indian captain in 2018 squad for Kabaddi Masters Dubai?","Ajay Thakur","Girish Ernak","Surender Nada","Sandeep Narwal","Ajay Thakur");
        this.addQuestion(q177);
        Question q178=new Question("What is Shah Rukh's mantra to woo a girl in Kal Ho Naa Ho?","Saat din ladki in ", "Ek din ladki in ", "Che din ladki in ","Do din ladki in ", "Che din ladki in ");

        this.addQuestion(q178);
        Question q179=new Question("Do you know the full name of Katappa in Baahubali?","Royal slave Kattappa", "Karikala Katappa Nadar", "Sathyaraj Katappa","Karikala Kattappa", "Karikala Katappa Nadar");

        this.addQuestion(q179);



        Question q180=new Question("Dhyan Chand known as _________of hockey for his superb ball control?","The Magician","The Wall","Gold Man","None of the above","The Magician");
        this.addQuestion(q180);

        Question q181=new Question("who is the father of Indian Space programme?","Vikram Sarabhai", "Satish Dhawan", "Brahm Prakash","APJ Kalam", "Vikram Sarabhai");

        this.addQuestion(q181);


        Question q182=new Question("Who is 1st Director of CSIR ,he is also known as Father of research laboratories?", "Vikram Sarabhai","Shanti Swaroop Bhatnagar","Satish Dhawan","None of the above","Shanti Swaroop Bhatnagar");
        this.addQuestion(q182);



        Question q183=new Question("Who is the 1st Director of Vikram Saharabhai Space Center Thiruvanthapuram ?","Vikram Sarabhai","Shanti Swaroop Bhatnagar","APJ Kalam","Brahm Prakash","Brahm Prakash");
        this.addQuestion(q183);


        Question q184=new Question("Who is known as Father of Indian Nuclear Programme?","Homi bhabha","Vikram Sarabhai","Satish Dhawan","Raja Ramanna","Homi bhabha");
        this.addQuestion(q184);


        Question q185=new Question("Who was the inventor of IC & received the nobal prize foe same?","Robert Noyce","Lehove","Jack Kilby","Hoerni","Jack Kilby");
        this.addQuestion(q185);

        Question q186=new Question("After Graduating from MIT Dr. APJ kalam joined_____?","ISRO","DRDO","BARC","CSIR","DRDO");
        this.addQuestion(q186);

        Question q187=new Question("Sriharikota  satellite launching station name in the honor of which scientist?","Brahm Prakash","Vikram Sarabhai","Satish Dhawan","Dr APJ Kalam","Satish Dhawan");
        this.addQuestion(q187);

        Question q188=new Question("Name the scientists involve in the Pokran Test 2?","APJ Kalam, R chidambram, Anil Kakodkar","R chidambaram, Kasturiragam, APJ Kalam"," APJ Kalam, K. Santhanam, Kasturiragam "," APJ Kalam, Kasturiragam, R chidambram","APJ Kalam, R chidambram, Anil Kakodkar");
        this.addQuestion(q188);

        Question q189=new Question("In which District of Rajasthan Pokran is present?","Alwar","Jodhpur","Jaipur","Jaisalmer","Jaisalmer");
        this.addQuestion(q189);


        Question q190=new Question("Who is the Father of DNA Figerprint?","PM Bhargia","Lalji Singh","S chandra","Ch.Mohanrao","Lalji Singh");
        this.addQuestion(q190);

        Question q191=new Question("Name the 1st satellite which was luanched from the Sriharikota?","Rohini","Aryabhatt","Bhaskara","INSAT","Rohini");
        this.addQuestion(q191);


        Question q192=new Question("Who is missile woman of india?","Kamala Sononie","Tessy Thomas","Anandibai joshee","Mangakla Nariakar","Tessy Thomas");
        this.addQuestion(q192);


        Question q193=new Question("First Indian to win Oscar award?","AR Rahman","Satyajit Ray","Bhanu Athaiya","Gulzar","Bhanu Athaiya");
        this.addQuestion(q193);

        Question q194=new Question("Happiest country in the world?","Finland","Norway","Denmark","Iceland","Finland");
        this.addQuestion(q194);


        Question q195=new Question("Name the 1st Submarine class of India?","Arihant class","Akula class","Sindhugosh class","Kaveri class","Kaveri class");
        this.addQuestion(q195);


        Question q196=new Question("Name the largest Desert in the world?","Sahara Desert","Antarctic Polar Desert","Arctic Polar Desert","None of the above","Antarctic Polar Desert");
        this.addQuestion(q196);



        Question q197=new Question("Which country does the airline Sansa come from?","England","USA","Costa Rica","Russia","Costa Rica");
        this.addQuestion(q197);


        Question q198=new Question("Ferrari luxury sports car manufacture is origin from which country ?","Germany","USA","Italy","France","Italy");
        this.addQuestion(q198);


        Question q199=new Question("How many oceans in the world?","4","5","6","7","5");
        this.addQuestion(q199);


        Question q200=new Question("Which one is India's first operational remote sensing satellite?","IRS-1A","INSAT-1A"," GSAT-1","PSLV-D3","IRS-1A");
        this.addQuestion(q200);


        Question q201=new Question(" Which one is India's First Indigenous Satellite Launch Vehicle?","PSLV","ASLV ","GSLV "," SLV-3","SLV-3");
        this.addQuestion(q201);


        Question q202=new Question("First mobile phone conversion take place in India between?","Narasimbha Rao and Sukhram","Jyoti Basu and Sukhram","Ambika Soni and Narasimbha Rao","None of the above","Jyoti Basu and Sukhram");
        this.addQuestion(q202);


        Question q203=new Question("First Nuclear Plants in India ?","Tarapur, Maharashtra","Kakrapar, Gujrat","Rawatbhata, Rajasthan","Narora, Uttar Pradesh","Tarapur, Maharashtra");
        this.addQuestion(q203);



        Question q204=new Question("Total number of indian research station in Antarctica?","3","4","5","2","3");
        this.addQuestion(q204);


        Question q205=new Question("Who is the first woman to win a nobel prize?","Marie curie","Irene Joliot-Curie"," Gertrude B. Elion"," Rosalyn Yalow","Marie curie");
        this.addQuestion(q205);


        Question q206=new Question("Who is known as the inventor of Hydrogen bomb?","Enrico Fermi","George Gamow","Edward Teller","Hans Bethe","Edward Teller");
        this.addQuestion(q206);


        Question q207=new Question("What was the code name of the first nuclear test conducted by USA on 16th July, 1945?"," Hurricane","Trinity","RDS-1","None of the above","Trinity");
        this.addQuestion(q207);

        Question q208=new Question("What was the name of the spaceflight that carried Neil Armstrong to the moon?","Apollo-5","Apollo-11","Apollo-10","Apollo-203","Apollo-11");
        this.addQuestion(q208);


        Question q209=new Question("Who is the first woman in space ?","Valentina Tereshkova","Sally Ride","Kathryn C. Thornton","Judith Resnik","Valentina Tereshkova");
        this.addQuestion(q209);

        Question q210=new Question("Which one is first surface to surface missile in India?","Nag","Trishul","Brahmos","Prithivi","Prithivi");
        this.addQuestion(q210);

        Question q211=new Question("INSAT-3D, India's newest weather satellite in 2013 was launched from?","Rusia","USA","French","India","French");
        this.addQuestion(q211);


        Question q212=new Question(" Who many edges are in a 'icosagon'?","18","14","34","20","20");
        this.addQuestion(q212);



        Question q213=new Question("The blue colour of the clear sky is due to __________ of light?","Reflection","Refraction","Diffraction","Dispersion","Dispersion");
        this.addQuestion(q213);

        Question q214=new Question("Chemically, dry ice is?","ice formed from pure distilled water","solid carbon dioxide","solid sulphur dioxide","ice kept at sub-zero temperatures","solid carbon dioxide");
        this.addQuestion(q214);


        Question q215=new Question("Who is known as the father of internet?","Alan Perlis","Jean E. Sammet","Vint Cerf"," Steve Lawrence","Vint Cerf");
        this.addQuestion(q215);


        Question q216=new Question("Who first developed QWERTY keyboard used in computers and phones?","Raphael Finkel","Wim Ebbinkhuijsen","Shafi Goldwasser","Christopher Latham Sholes","Christopher Latham Sholes");
        this.addQuestion(q216);

        Question q217=new Question("In which year '@' sign was first chosen for its use in e-mail address ?","1976","1980","1977","1972","1972");
        this.addQuestion(q217);


        Question q218=new Question("First computer virus is known as ?","Rabbit Virus","Creeper Virus","Elk Cloner Virus","SCA Virus","Creeper Virus");
        this.addQuestion(q218);


        Question q219=new Question(". Who is the founder of Bluetooth?","Ericsson","IBM","Apple"," Dell","Ericsson");
        this.addQuestion(q219);

        Question q220=new Question("802.11 describes ___________ networks?","Coaxial","Wireless","Fiber Optic","Copper","Wireless");
        this.addQuestion(q220);


        Question q221=new Question("COBOL stands for?","Common Bulck Language","Common Block Oriented Language","Common Business Oriented Languag","None of the above","Common Business Oriented Language");
        this.addQuestion(q221);


        Question q222=new Question("Which of the following countries has agreed to accept the payment of export of oil and petroleum products to India, in rupee terms instead of dollar or any other currency?","Kuwait ","UAE","Iran","Iraq"," Iraq");
        this.addQuestion(q222);


        Question q223=new Question("Which was the first country to launch Artificial satellite in the space?","USA","Russia","China","India","Russia");
        this.addQuestion(q223);


        Question q224=new Question("Which is the first country to host the modern Olympics?","Greece","Russia","Japan","USA","Greece");
        this.addQuestion(q224);
        Question q225=new Question("Which among the following was the first municipal corporation set up in India in the year 1687 ?","Madras Municipal Corporation", "Bombay Municipal Corporation", "Delhi Municipal Corporation","None of the above ",
                "Madras Municipal Corporation");

        this.addQuestion(q225);

        Question q226=new Question("In the context of the Indian defence, what is Dhruv?","Aircraft carrying warship","Missilecarryingsubmarine","Advanced light helicopter","Intercontinental ballistic missile","Advanced light helicopter");
        this.addQuestion(q226);


        Question q227=new Question(" Which is the highest gallantry award in India?","Vir Chakra","Param Vir Chakra","Param Vishishta Seva Medal","Kirti Chakra","Param Vir Chakra");
        this.addQuestion(q227);


        Question q228=new Question("Gandhi Peace Prize for the year 2000 was awarded to the former President of South Africa along with?","Satish Dhawan","Subramaniam","World Health Organisation","Grameen Bank of Bangladesh","Grameen Bank of Bangladesh");
        this.addQuestion(q228);


        Question q229=new Question("The first recipient of Rajiv Gandhi Khel Ratna Award is?","Leander Peas","Kapil Dev","Vishwanathan Anand","Limba Ram","Limba Ram");
        this.addQuestion(q229);


        Question q230=new Question("From which one of the following did india buy the Brank anti missile defence systems?","France","Russia","USA","Israel","Israel");
        this.addQuestion(q230);

        Question q231=new Question("Who is the father of Indian Space programme?","Vikram Sarabhai", "Satish Dhawan", "Brahm Prakash","APJ Kalam", "Vikram Sarabhai");

        this.addQuestion(q231);


        Question q232=new Question("Who is 1st Director of CSIR ,he is also known as Father of research laboratories?", "Vikram Sarabhai","Shanti Swaroop Bhatnagar","Satish Dhawan","None of the above","Shanti Swaroop Bhatnagar");
        this.addQuestion(q232);



        Question q233=new Question("Who is the 1st Director of Vikram Saharabhai Space Center Thiruvanthapuram ?","Vikram Sarabhai","Shanti Swaroop Bhatnagar","APJ Kalam","Brahm Prakash ","Brahm Prakash");
        this.addQuestion(q233);


        Question q234=new Question("Who is known as Father of Indian Nuclear Programme?","Homi bhabha","Vikram Sarabhai","Satish Dhawan","Raja Ramanna","Homi bhabha");
        this.addQuestion(q234);


        Question q235=new Question("Who was the inventor of IC & received the nobal prize foe same?","Robert Noyce","Lehove","Jack Kilby","Hoerni","Jack Kilby");
        this.addQuestion(q235);

        Question q236=new Question("How many dots appear on a pair of die ?","40","42","44","46","42");
        this.addQuestion(q236);

        Question q237=new Question("Sriharikota  satellite launching station name in the honor of which scientist?","Brahm Prakash","Vikram Sarabhai","Satish Dhawan","Dr APJ Kalam","Satish Dhawan");
        this.addQuestion(q237);

        Question q238=new Question("Divide 30 by half and add ten.?","40.5","50","70","None","70");
        this.addQuestion(q238);

        Question q239=new Question("In which District of Rajasthan Pokran is present?","Alwar","Jodhpur","Jaipur","Jaisalmer","Jaisalmer");
        this.addQuestion(q239);


        Question q240=new Question("Jimmy's father has three sons- Paul I and Paul II. Can you guess the name of the third son?","Paul III","Jerin","Jimmy","None","Jimmy");
        this.addQuestion(q240);

        Question q241=new Question("Name the 1st satellite which was luanched from the Sriahrikota?","Rohini","Aryabhatt","Bhaskara","INSAT","Rohini");
        this.addQuestion(q241);


        Question q242=new Question("Who is missile woman of india?","Kamala Sononie","Tessy Thomas","Anandibai joshee","Mangakla Nariakar","Tessy Thomas");
        this.addQuestion(q242);


        Question q243=new Question("First Indian to win Oscar award?","AR Rahman","Satyajit Ray","Bhanu Athaiya","Gulzar","Bhanu Athaiya");
        this.addQuestion(q243);

        Question q244=new Question("Happiest country in the world?","Finland","Norway","Denmark","Iceland","Finland");
        this.addQuestion(q244);


        Question q245=new Question("Name the 1st Submarine class of India?","Arihant class","Akula class","Sindhugosh class","Kaveri class","Kaveri class");
        this.addQuestion(q245);


        Question q246=new Question("Name the largest Desert in the world?","Sahara Desert","Antarctic Polar Desert","Arctic Polar Desert","None of the above","Antarctic Polar Desert");
        this.addQuestion(q246);



        Question q247=new Question("Which country does the airline Sansa come from?","England","USA","Costa Rica","Russia","Costa Rica");
        this.addQuestion(q247);


        Question q248=new Question("What is the official language of the internet?","Emoji", "LOLspeak","Cat memes","Klingon","Emoji");
        this.addQuestion(q248);


        Question q249=new Question("Which word is spelled incorrectly in every dictionary?","Incorrectly","Dictionary","Every","Spelled","Incorrectly");
        this.addQuestion(q249);


        Question q250=new Question("I am taken from a mine and shut up in a wooden case, from which I am never released, and yet I am used by almost every person. What am I?","Gold","A diamond","A pencil","Coal","A pencil");
        this.addQuestion(q250);


        Question q251=new Question(" Which one is India's First Indigenous Satellite Launch Vehicle?","PSLV","ASLV ","GSLV "," SLV-3","SLV-3");
        this.addQuestion(q251);


        Question q252=new Question("First mobile phone conversion take place in India between?","Narasimbha Rao and Sukhram","Jyoti Basu and Sukhram","Ambika Soni and Narasimbha Rao","None of the above","Jyoti Basu and Sukhram");
        this.addQuestion(q252);


        Question q253=new Question("First Nuclear Plants in India ?","Tarapur, Maharashtra","Kakrapar, Gujrat","Rawatbhata, Rajasthan","Narora, Uttar Pradesh","Tarapur, Maharashtra");
        this.addQuestion(q253);



        Question q254=new Question("What word is pronounced the same way when you take away four of its five letters?","Queue","Ruler","Onion","Flower","Queue");
        this.addQuestion(q254);


        Question q255=new Question("Who is the first woman to win a nobel prize?","Marie curie","Irene Joliot-Curie"," Gertrude B. Elion"," Rosalyn Yalow","Marie curie");
        this.addQuestion(q255);


        Question q256=new Question("Who is known as the inventor of Hydrogen bomb?","Enrico Fermi","George Gamow","Edward Teller","Hans Bethe","Edward Teller");
        this.addQuestion(q256);


        Question q257=new Question("What was the code name of the first nuclear test conducted by USA on 16th July, 1945?"," Hurricane","Trinity","RDS-1","None of the above","Trinity");
        this.addQuestion(q257);

        Question q258=new Question("What was the name of the spaceflight that carried Neil Armstrong to the moon?","Apollo-5","Apollo-11","Apollo-10","Apollo-203","Apollo-11");
        this.addQuestion(q258);


        Question q259=new Question("Who is the first woman in space ?","Valentina Tereshkova","Sally Ride","Kathryn C. Thornton","Judith Resnik","Valentina Tereshkova");
        this.addQuestion(q259);

        Question q260=new Question("Which one is first surface to surface missile in India?","Nag","Trishul","Brahmos","Prithivi","Prithivi");
        this.addQuestion(q260);

        Question q261=new Question("INSAT-3D, India's newest weather satellite in 2013 was launched from?","Rusia","USA","French","India","French");
        this.addQuestion(q261);


        Question q262=new Question(" Who many edges are in a 'icosagon'?","18","14","34","20","20");
        this.addQuestion(q262);



        Question q263=new Question("The blue colour of the clear sky is due to __________ of light?","Reflection","Refraction","Diffraction","Dispersion","Dispersion");
        this.addQuestion(q263);

        Question q264=new Question("Chemically, dry ice is?","ice formed from pure distilled water","solid carbon dioxide","solid sulphur dioxide","ice kept at sub-zero temperatures","solid carbon dioxide");
        this.addQuestion(q264);


        Question q265=new Question("Who is known as the father of internet?","Alan Perlis","Jean E. Sammet","Vint Cerf"," Steve Lawrence","Vint Cerf");
        this.addQuestion(q265);


        Question q266=new Question("Who first developed QWERTY keyboard used in computers and phones?","Raphael Finkel","Wim Ebbinkhuijsen","Shafi Goldwasser","Christopher Latham Sholes","Christopher Latham Sholes");
        this.addQuestion(q266);

        Question q267=new Question("In which year '@' sign was first chosen for its use in e-mail address ?","1976","1980","1977","1972","1972");
        this.addQuestion(q267);


        Question q268=new Question("First computer virus is known as ?","Rabbit Virus","Creeper Virus","Elk Cloner Virus","SCA Virus","Creeper Virus");
        this.addQuestion(q268);


        Question q269=new Question(". Who is the founder of Bluetooth?","Ericsson","IBM","Apple"," Dell","Ericsson");
        this.addQuestion(q269);

        Question q270=new Question("802.11 describes ___________ networks?","Coaxial","Wireless","Fiber Optic","Copper","Wireless");
        this.addQuestion(q270);


        Question q271=new Question("COBOL stands for?","Common Bulck Language","Common Block Oriented Language","Common Business Oriented Languag","None of the above","Common Business Oriented Language");
        this.addQuestion(q271);


        Question q272=new Question("Which of the following countries has agreed to accept the payment of export of oil and petroleum products to India, in rupee terms instead of dollar or any other currency?","Kuwait ","UAE","Iran","Iraq"," Iraq");
        this.addQuestion(q272);


        Question q273=new Question("Which was the first country to launch Artificial satellite in the space?","USA","Russia","China","India","Russia");
        this.addQuestion(q273);


        Question q274=new Question("Which is the first country to host the modern Olympics?","Greece","Russia","Japan","USA","Greece");
        this.addQuestion(q274);
        Question q275=new Question("Which among the following was the first municipal corporation set up in India in the year 1687 ?","Madras Municipal Corporation", "Bombay Municipal Corporation", "Delhi Municipal Corporation","None of the above ",
                "Madras Municipal Corporation");

        this.addQuestion(q275);

        Question q276=new Question("In the context of the Indian defence, what is Dhruv?","Aircraft carrying warship","Missilecarryingsubmarine","Advanced light helicopter","Intercontinental ballistic missile","Advanced light helicopter");
        this.addQuestion(q276);


        Question q277=new Question(" Which is the highest gallantry award in India?","Vir Chakra","Param Vir Chakra","Param Vishishta Seva Medal","Kirti Chakra","Param Vir Chakra");
        this.addQuestion(q277);


        Question q278=new Question("Gandhi Peace Prize for the year 2000 was awarded to the former President of South Africa along with?","Satish Dhawan","Subramaniam","World Health Organisation","Grameen Bank of Bangladesh","Grameen Bank of Bangladesh");
        this.addQuestion(q278);


        Question q279=new Question("The first recipient of Rajiv Gandhi Khel Ratna Award is?","Leander Peas","Kapil Dev","Vishwanathan Anand","Limba Ram","Limba Ram");
        this.addQuestion(q279);


        Question q280=new Question("From which one of the following did india buy the Brank anti missile defence systems?","France","Russia","USA","Israel","Israel");
        this.addQuestion(q280);

        Question q281=new Question("Who is the captain of Indian Cricket Team at Women’s Cricket World Cup 2022 ?","Mithali Raj", "Harmanpreet Kaur", "Smriti Mandhana","Deepthi Sharma", "Mithali Raj");

        this.addQuestion(q281);


        Question q282=new Question("Virat kohli captains which team in IPL ?", "Rajasthan Royals","Royal Challengers Banglore","Delhi Daredevils","None of the above","Royal Challengers Banglore");
        this.addQuestion(q282);



        Question q283=new Question("Who is the 1st Director of Vikram Saharabhai Space Center Thiruvanthapuram ?","Vikram Sarabhai","Shanti Swaroop Bhatnagar","APJ Kalam","Brahm Prakash ","Brahm Prakash");
        this.addQuestion(q283);


        Question q284=new Question("What is the Jersey number of Virat Kohli ?","8","18","28","38","18");
        this.addQuestion(q284);


        Question q285=new Question("Who was the inventor of IC & received the nobal prize foe same?","Robert Noyce","Lehove","Jack Kilby","Hoerni","Jack Kilby");
        this.addQuestion(q285);

        Question q286=new Question("After Graduating from MIT Dr. APJ kalam joined_____?","ISRO","DRDO","BARC","CSIR","DRDO");
        this.addQuestion(q286);

        Question q287=new Question("Which Indian Cricketer has written the book “One Day Wonders” ?","Kapil Dev","Sunil Gavaskar","Ravi Shastri","Sachin Tendulkar","Sunil Gavaskar");
        this.addQuestion(q287);

        Question q288=new Question(" “Ranji Trophy” is associated with ","Kabaddi","Cricket","Football ","Hockey","Cricket");
        this.addQuestion(q288);

        Question q289=new Question("“Serana Williams” is one of the top ranked sports women of","Chess","Tennis","Shooting","Badminton","Tennis");
        this.addQuestion(q289);


        Question q290=new Question("Who is the Father of DNA Figerprint?","PM Bhargia","Lalji Singh","S chandra","Ch.Mohanrao","Lalji Singh");
        this.addQuestion(q290);

        Question q291=new Question("Name the 1st satellite which was luanched from the Sriahrikota?","Rohini","Aryabhatt","Bhaskara","INSAT","Rohini");
        this.addQuestion(q291);


        Question q292=new Question("“Free Throw” is associated with","Basketball","Hockey","Volleyball","Football","Basketball");
        this.addQuestion(q292);


        Question q293=new Question("First Indian to win Oscar award?","AR Rahman","Satyajit Ray","Bhanu Athaiya","Gulzar","Bhanu Athaiya");
        this.addQuestion(q293);

        Question q294=new Question("Happiest country in the world?","Finland","Norway","Denmark","Iceland","Finland");
        this.addQuestion(q294);


        Question q295=new Question("Name the 1st Submarine class of India?","Arihant class","Akula class","Sindhugosh class","Kaveri class","Kaveri class");
        this.addQuestion(q295);


        Question q296=new Question("How many number of rings are present in the Olympic flag ?","4","5","6","None of the above","5");
        this.addQuestion(q296);



        Question q297=new Question("Thomus cup is related to ","Tennis","Cricket","Basketball","Badminton","Badminton");
        this.addQuestion(q297);


        Question q298=new Question("The 5 rings in Olympic Symbol represents","5 continents","5 countries","5 members","5 motto","5 continents");
        this.addQuestion(q298);


        Question q299=new Question("What does the acronym URL stand for in web addresses?","Universal Resource Locator","Uniform Reference Link","Unified Resource Locator","Unique Reference Link","Universal Resource Locator");
        this.addQuestion(q299);


        Question q300=new Question("Which Telugu film explores the story of a chess player and was released in 2018?","Goodachari","Rangasthalam","Mahanati","Awe!","Goodachari");
        this.addQuestion(q300);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1)
    {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_QUEST);
        // Create tables again
        onCreate(db);

    }
    // Adding new question
    public void addQuestion(Question quest) {
        //SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_QUES, quest.getQUESTION());
        values.put(KEY_ANSWER, quest.getANSWER());
        values.put(KEY_OPTA, quest.getOPTA());
        values.put(KEY_OPTB, quest.getOPTB());
        values.put(KEY_OPTC, quest.getOPTC());
        values.put(KEY_OPTD, quest.getOPTD());

        // Inserting Row
        dbase.insert(TABLE_QUEST, null, values);
    }
    public List<Question> getAllQuestions() {
        List<Question> quesList = new ArrayList<Question>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_QUEST;
        dbase=this.getReadableDatabase();
        Cursor cursor = dbase.rawQuery(selectQuery, null);
        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Question quest = new Question();
                quest.setID(cursor.getInt(0));
                quest.setQUESTION(cursor.getString(1));
                quest.setANSWER(cursor.getString(2));
                quest.setOPTA(cursor.getString(3));
                quest.setOPTB(cursor.getString(4));
                quest.setOPTC(cursor.getString(5));
                quest.setOPTD(cursor.getString(6));
                quesList.add(quest);
            } while (cursor.moveToNext());
        }
        // return quest list
        return quesList;
    }
   /* public List<Question> getQuiz1Questions(int startposition,int endposition) {
        List<Question> quesList = new ArrayList<Question>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_QUEST;
        dbase=this.getReadableDatabase();
        Cursor cursor = dbase.rawQuery(selectQuery, null);
        // looping through all rows and adding to list
        startposition=0;
        endposition=2;
        for(int i=startposition;i<=endposition;i++){
            Question quest = new Question();
            quest.setID(cursor.getInt(i));
            quest.setQUESTION(cursor.getString(1));
            quest.setANSWER(cursor.getString(2));
            quest.setOPTA(cursor.getString(3));
            quest.setOPTB(cursor.getString(4));
            quest.setOPTC(cursor.getString(5));
            quest.setOPTD(cursor.getString(6));
            quesList.add(quest);
        }


        // return quest list
        return quesList;
    }
   *//* public int rowcount()
    {
        int row=0;
        String selectQuery = "SELECT  * FROM " + TABLE_QUEST;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        row=cursor.getCount();
        return row;
    }*//*
*/
}
