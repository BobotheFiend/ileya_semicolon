
questions = [

    "(A.) Expend energy, enjoy groups          OR          (B.) Conserve energy, enjoy one-on-one (B)",
    "(A.) Interpret literally          OR          (B.) Look for meaning and possibilities",
    "(A.) Logical, thinking, questioning          OR          (B.) Empathetic, feeling, accommodating ",
    "(A.) Organized, orderly          OR          Flexible, adaptable ",
    "(A.) More outgoing, think out loud          OR          (B.) More reserved, think to yourself",
    "(A.) Practical, realistic, experiential          OR          (B.) Imaginative, innovative, theoretical",
    "(A.) Candid, straight forward, frank          OR          (B.) Tactful, kind, encouraging",
    "(A.) Plan, schedule          OR          Unplanned, spontaneous",
    "(A.) Seek many tasks, public activities, interaction with others          OR          (B.) Seek private, solitary activities with quiet to concentrate ",
    "(A.) Standard, usual, conventional          OR          (B.) Different, novel, unique",
    "(A.) Firm, tend to criticize, hold the line          OR          (B.) Gentle, tend to appreciate, conciliate",
    "(A.) Regulated, structured          OR          (B.) Easy-going, live and let live",
    "(A.) External, communicative, express yourself          OR          (B.) Internal, reticent, keep to yourself",
    "(A.) Focus on here-and-now          OR          (B.) Look to the future, global perspective, big picture",
    "(A.) Tough-minded, just          OR          (B.) Tender-hearted, merciful",
    "(A.) Preparation, plan ahead          OR          (B.) Go with the flow, adapt as you go",
    "(A.) Active, initiate          OR          (B.) Reflective, deliberate",
    "(A.) Facts, things, what is          OR          (B.) Ideas, dreams, what could be, philosophical",
    "(A.) Matter of fact, issue-oriented          OR          (B.) Sensitive, people-oriented, compassionate",
    "(A.) Control, govern          OR          (B.) Latitude, freedom"
]
    
user_choices = [];

extrovert_responses = 0
introvert_responses = 0
sensing_responses = 0
intuitive_responses = 0
thinking_responses = 0
feeling_responses = 0
judging_responses = 0
perceptive_responses = 0


def what_is_your_name():
    
    name = input("Enter your Name: ");

    return name;


def user_response_choices():
             
    for count in range(0, len(questions)):
        print()
        print(questions[count])
        user_response = input("\nEnter either A or B to choose: ")

        while(user_response.upper() != "A" and user_response.upper() != "B"):
            print("Expected A or B as A response\nI knowthis is an error, Please Try-Again\n");
            print(questions[count]);
            user_response =  input("\nEnter either A or B to choose: ")            
            
        user_choices.append(user_response)
        
    return user_choices;
    
def extroverted_VS_introverted():

    global extrovert_responses
    global introvert_responses
    
    extrovert_responses = 0;
    introvert_responses = 0;
    extrovert_vs_introvert = [0,4,8,12,16]
    choice_a = "A";

    for choice in extrovert_vs_introvert:
        if(user_choices[choice].upper() == choice_a):
            extrovert_responses+=1
        else:
            introvert_responses+=1;
                
    if(extrovert_responses > introvert_responses): return "E";

    else: return"I";

def sensing_VS_intuitive():

    global sensing_responses
    global intuitive_responses

    sensing_responses = 0
    intuitive_responses = 0
    sensing_vs_intuitive = [1,5,9,13,17]
    choice_a = "A"
    for choice in sensing_vs_intuitive:
        if(user_choices[choice].upper() == choice_a):
            sensing_responses+=1
        else:
            intuitive_responses+=1
  
    if(sensing_responses > intuitive_responses): return "S";

    else: return "N";

def thinking_VS_feeling():

    global thinking_responses
    global feeling_responses

    thinking_responses = 0
    feeling_responses = 0
    thinking_vs_feeling = [2,6,10,14,18]
    choice_a = "A"
    for choice in thinking_vs_feeling:
        if(user_choices[choice].upper() == choice_a):
            thinking_responses+=1
        else:
            feeling_responses+=1

    if(thinking_responses > feeling_responses): return "T";

    else: return"F";

def judging_VS_perceptive():

    global judging_responses
    global perceptive_responses  
            
    judging_responses = 0;
    perceptive_responses = 0;
    judging_vs_perceptive = [3,7,11,15,19]
    choice_a = "A"
    for choice in judging_vs_perceptive:
        if(user_choices[choice].upper() == choice_a):
            judging_responses+=1;
        else:
            perceptive_responses+=1

    if(judging_responses > perceptive_responses): return "J"

    else: return "P";


def void_selections_output():
    
    questions_display = questions;
    choices_display = user_choices;

    extroverted_VS_introverted();
    sensing_VS_intuitive();
    thinking_VS_feeling();
    judging_VS_perceptive();
        
    count = 0;

    for count in range(0, 16+1,4):
        print(f"The Question was\n{questions_display[count]}\nYour choice was ({choices_display[count]}.)\n")
        
    print(f"Number of A Selected: {extrovert_responses}")
    print(f"Number of B Selected: {introvert_responses}\n")

    
    for second_count in range(1, 17+1,4):
        print(f"The Question was\n{questions_display[second_count]}\nYour choice was ({choices_display[second_count]}.)\n")
        
    print(f"Number of A Selected: {sensing_responses}");
    print(f"Number of B Selected: {intuitive_responses}\n");


    for third_count in range(2, 18+1,4):

         print(f"The Question was\n{questions_display[third_count]}\nYour choice was ({choices_display[third_count]}.)\n")
        
    print(f"Number of A Selected: {thinking_responses}");
    print(f"Number of B Selected: {feeling_responses}\n");


    for fourth_count in range(3, 19+1,4):
        print(f"The Question was\n{questions_display[fourth_count]}\nYour choice was ({choices_display[fourth_count]}.)\n")
        
    print(f"Number of A Selected: {judging_responses}");
    print(f"Number of B Selected: {perceptive_responses}\n");


def void_personality_message():

    personality_type = ""
    personality_type+= extroverted_VS_introverted()
    personality_type+= sensing_VS_intuitive()
    personality_type+= thinking_VS_feeling()
    personality_type+= judging_VS_perceptive()

    match (personality_type):
        case "INFP": 
            print("""

                INFP
        
                    Healer
                    The Thoughtful Idealist (MBTI)
                    The Meditator (16 Personalities)

                The INFP Personality Type
                INFPs are imaginative idealists, guided by their own core values and beliefs. 
                  To a Healer, possibilities are paramount; the realism of the moment is only of passing concern. They see potential for a better future, and pursue 
                  truth and
                  meaning with their own individual flair.
                INFPs are sensitive, caring, and compassionate, and are deeply concerned
                  with the personal growth of themselves and others. Individualistic an nonjudgmental, INFPs believe that each person must find their own path. They 
                  enjoy 
                  spending time exploring their own ideas and values, and are gently encouraging to others to do the same. INFPs are creative and often artistic; 
                  they enjoy 
                  finding new outlets for self-expression.

                What does INFP stand for?
                INFP is one of the sixteen personality types created by Katharine Briggs and Isabel Myers, creators of the Myers-Briggs Type Indicator (MBTI@). INFP 
                  stands for Introversion, iNtuition, Feeling, and Perceving, which are four core personalitiy traits based on the work of psychologist C.G. Jung.
                  Each of the four letters of the INFP code signifies a key personality trait of this type. INFPs are energized by time alone (Introverted), focus on 
                  ideas and concepts rather than facts and details (iNtuitive), make decisions based on feelings and values (Feeling), and prefer to be spontaneous 
                  and flexible rather than planned and organized (Perceiving). """)

        case "INTJ":
            print("""

                INTJ
                    The Architect
                INTJ Personality Type
                  Architects are imaginative and strategic thinkers, with a plan for everything.
                  The Meditator (16 Personalities)
                INTJ (Architect) is a personality type with the Introverted, Intuitive, 
                  Thinking, and Judging traits. These thoughtful tacticians love perfecting 
                  the details of life, applying creativity and rationality to everything 
                  they do. Their inner world is often a private, complex one.

                People with the INTJ personality type (Architects) are intellectually 
                  curious individuals with a deep-seated thirst for knowledge. INTJs tend 
                  to value creative ingenuity, straightforward rationality, and self-
                  improvement. They consistently work toward enhancing intellectual 
                  abilities and are often driven by an intense desire to master any and 
                  every topic that piques their interest. """)
                                
        case "INTP":
            print("""

                INTP
        
                    Logicians are innovative inventors with an unquenchable thirst for knowledge.
                    The Meditator (16 Personalities)
                INTP People with the INTP personality type (Logicians) pride themselves on their unique perspective and vigorous intellect. They can’t help but puzzle
                  over the mysteries of the universe – which may explain why some of the most influential philosophers and scientists of all time have been INTPs.  
                  People with this personality type tend to prefer solitude, as they can easily become immersed in their thoughts when they are left to their own   
                  devices. They are also incredibly creative and inventive, and they are not afraid to express their novel ways of thinking or to stand out from the 
                  crowd """)
       
        case "ENTJ":
            print("""

                ENTJ
                    Commander ENTJ Personality
                    Commanders are bold, imaginative, and strong-willed, always finding a way – or making one.
                    The Meditator (16 Personalities)
                INTP People with the INTP personality type (Logicians) pride themselves on their unique perspective and vigorous intellect. They can’t help but 
                  puzzle over the mysteries of the universe – which may explain why some of the most influential philosophers and scientists of all time have been 
                  INTPs. People with this personality type tend to prefer solitude, as they can easily become immersed in their thoughts when they are left to their 
                  own devices. They are also incredibly creative and inventive, and they are not afraid to express their novel ways of thinking or to stand out from 
                  the crowd """)

        case "ENTP":
            print("""

                ENTP 
                    Debater is a personality type with the Extraverted, Intuitive, Thinking, and Prospecting traits. They tend to be bold and creative, 
                      deconstructing and rebuilding ideas with great mental agility. They pursue their goals vigorously despite any resistance they might encounter.
                      Quick-witted and audacious, people with the ENTP personality type (Debaters) aren’t afraid to disagree with the status quo. In fact, they’re 
                      not afraid to disagree with pretty much anything or anyone. Few things light up these personalities more than a bit of verbal sparring – and if 
                      the conversation veers into controversial terrain, so much the better.
                    ENTPs are known for their rebellious streak. For this personality type, no belief is too sacred to be questioned, no idea is too fundamental to 
                      be scrutinized, and no rule is too important to be broken or at least thoroughly tested. This may make ENTP personalities seem overly cavalier 
                      or defiant, but at their core, their innate tendency to test boundaries has more to do with their desire for innovation and change. """)
        case "INFJ":
            print("""

                INFJ
                    The Advocate
                INFJ Personality Type
                  Advocates are quiet visionaries, often serving as inspiring and tireless idealists.
                  The Advocate is a personality type with the Introverted, Intuitive, Feeling, and Judging traits. They tend to approach life with deep 
                  thoughtfulness and imagination. Their inner vision, personal values, and a quiet, principled version of humanism guide them in all things.
                INFJ (Advocate) Many INFJ personalities feel that their life has a unique purpose – a mission that they were put onto this earth to fulfill. For 
                  them, one of the most rewarding aspects of life is seeking out this purpose – and then, once they’ve found it, striving to do it justice.

                  When INFJs encounter inequity or unfairness, they rarely give up – instead, they consult their intuition and their compassion to find a solution. 
                  With their innate ability to balance the heart with the head, these dedicated types are hardwired to right the wrongs of the world, no matter how 
                  big or small. These personalities just need to remember that while they’re busy taking care of everyone else, they need to pause sometimes and take 
                  care of themselves as well. """)

        case "ENFJ":
            print("""

                ENFJ
                    The Protagonist
                ENFJ Personality Type
                  Protagonists are inspiring optimists, readily taking action to do what they feel is right.
                  The Protagonist (16 Personalities)
                ENFJ (Protagonist) People with the ENFJ personality type (Protagonists) feel called to serve a greater purpose in life. Thoughtful and idealistic, 
                  ENFJs strive to have a positive impact on other people and the world around them. These personalities rarely shy away from an opportunity to do the 
                  right thing, even when doing so is far from easy.

                Speaking Up for What’s Right
                ENFJs tend to be vocal about their values, including authenticity and altruism. When something strikes them as unjust or wrong, they speak up. 
                  People with the ENFJ personality type (Protagonist) People with this personality type are devoted altruists, ready to face slings and arrows in 
                  order to stand up for the people and ideas that they believe in. This strength of conviction bolsters an ENFJ’s ability to guide others to work 
                  together in service of the greater good. """)
        
        case "ENFP":
            print("""

                ENFP
                    The Campaigner
                ENFP Personality Type
                  Campaigner are enthusiastic, creative, and sociable free spirits, who can always find a reason to smile.
                  The Protagonist (16 Personalities)
                ENFP (Campaigner) People with the ENFP personality type (Campaigners) are true free spirits – outgoing, openhearted, and open-minded. With their 
                  lively, upbeat approach to life, ENFPs stand out in any crowd. But even though they can be the life of the party, they don’t just care about having 
                  a good time. 
                  ENFPs are independent and creative, always on the lookout for the magic and meaning in everyday life. They can’t help but ponder the deeper 
                    significance of life – even when they should be paying attention to something else. 

                ENFP personalities are capable of intense thought and feeling – and also of kicking back and having a good time. """)

        case "ISTJ":
            print("""

                ISTJ
                    The Logistician
                    ISTJ (Logistician) is a personality type with the Introverted, Observant, Thinking, and Judging traits. These people tend to be reserved yet 
                      willful, with a rational outlook on life. They compose their actions carefully and carry them out with methodical purpose.
                      People with the ISTJ personality type (Logisticians) mean what they say and say what they mean, and when they commit to doing something, they 
                      make sure to follow through. With their responsible and dependable nature, it might not be so surprising that ISTJ personalities also tend to 
                      have a deep respect for structure and tradition. They are often drawn to organizations, workplaces, and educational settings that offer clear 
                      hierarchies and expectations.
                    While ISTJs may not be particularly flashy or attention seeking, they do more than their share to keep society on a sturdy, stable foundation. In 
                      their families and their communities, people with this personality type often earn respect for their reliability, their practicality, and their 
                      ability to stay grounded and logical in even the most stressful situations. """)

        case "ISFJ":
            print("""

                ISFJ
                    The Defender
                            ISFJ (Defender) is a personality type with the Introverted, Observant, Feeling, and Judging traits. These people tend to be warm and 
                              unassuming in their own steady way. They’re efficient and responsible, giving careful attention to practical details in their daily
                              lives.
                            In their unassuming, understated way, people with the ISFJ personality type (Defenders) help make the world go round. Hardworking and 
                              devoted, these personalities feel a deep sense of responsibility to those around them. ISFJs can be counted on to meet deadlines,     
                              remember birthdays and special occasions, uphold traditions, and shower their loved ones with gestures of care and support. But they 
                              rarely demand recognition for all that they do, preferring instead to operate behind the scenes.
        
                            This is a capable, can-do personality type with a wealth of versatile gifts. Though sensitive and caring, ISFJs also have excellent 
                              analytical abilities and an eye for detail. And despite their reserve, they tend to have well-developed people skills and robust social 
                              relationships. These personalities are truly more than the sum of their parts, and their varied strengths shine in even the most 
                              ordinary aspects of their daily lives.ISTJ (Logistician) is a personality type with the Introverted, Observant """)

        case "ESTJ":
            print("""

                ESTJ
                    The Executive
                    ESTJ (Executive) is a personality type with the Extraverted, Observant, Thinking, and Judging traits. They possess great fortitude, emphatically 
                      following their own sensible judgment. They often serve as a stabilizing force among others, able to offer solid direction amid adversity.
                    People with the ESTJ personality type (Executives) are representatives of tradition and order, utilizing their understanding of what is right, 
                      wrong, and socially acceptable to bring families and communities together. Embracing the values of honesty and dedication, ESTJs are valued for 
                      their mentorship mindset and their ability to create and follow through on plans in a diligent and efficient manner. They will happily lead the 
                      way on difficult paths, and they won’t give up when things become stressful.
                    This personality type is aware of their surroundings and lives in a world of clear, verifiable facts. Their surety of their knowledge means that, 
                      even against heavy resistance, they stick to their principles and push an unclouded vision of what is and is not acceptable. And their opinions 
                      aren’t just empty talk either, as ESTJs are more than willing to dive into the most challenging projects, improving action plans and sorting 
                      details along the way, making even the most complicated tasks seem easy and approachable. """)

        case "ESFJ":
            print("""

                ESFJ
                    The Consul
                    ESFJ (Consul) is a personality type with the Extraverted, Observant, Feeling, and Judging traits. They are attentive and people-focused, and they 
                      enjoy taking part in their social community. Their achievements are guided by decisive values, and they willingly offer guidance to others.
                    For people with the ESFJ personality type (Consuls), life is sweetest when it’s shared with others. These social individuals form the bedrock 
                      of many communities, opening their homes – and their hearts – to friends, loved ones, and neighbors. This doesn’t mean that they are saints or 
                      that they like everyone. In fact, they are much more likely to form close bonds with people who share their same values and opinions. But 
                      regardless of other people’s beliefs, ESFJ personalities still strongly believe in the power of hospitality and good manners, and they tend to 
                      feel a sense of duty to those around them. Generous and reliable, they often take it upon themselves – in ways both large and small – to hold 
                      their families and their communities together. """)

        case "ISTP":
            print("""

                ISTP
                    The Virtuoso
                    ISTP (Virtuoso) is a personality type with the Introverted, Observant, Thinking, and Prospecting traits. They tend to have an individualistic 
                      mindset, pursuing goals without needing much external connection. They engage in life with inquisitiveness and personal skill, varying their 
                      approach as needed.
                People with the ISTP personality type (Virtuosos) love to explore with their hands and their eyes, touching and examining the world around them with 
                  an impressive diligence, a casual curiosity, and a healthy dose of skepticism. They are natural makers, moving from project to project, building 
                  the useful and the superfluous for the fun of it and learning from their environment as they go. They find no greater joy than in getting their 
                  hands dirty pulling things apart and putting them back together, leaving them just a little bit better than they were before.
                ISTPs prefer to approach problems directly, seeking straightforward solutions over convoluted troubleshooting methods. People with this personality 
                  type rely heavily on firsthand experience and trial and error as they execute their ideas and projects. And as they do so, they usually prefer to 
                  work at their own pace, on their own terms, and without unnecessary interruptions. """)

        case "ISFP":
            print("""

                ISFP
                    The Adventurer
                    ISFP (Adventurer) is a personality type with the Introverted, Observant, Feeling, and Prospecting traits. They tend to have open minds, 
                      approaching life, new experiences, and people with grounded warmth. Their ability to stay in the moment helps them uncover exciting potentials.
                    People with the ISFP personality type (Adventurers) are true artists – although not necessarily in the conventional sense. For these types, life 
                      itself is a canvas for self-expression. From what they wear to how they spend their free time, they act in ways that vividly reflect who they 
                      are as unique individuals. With their exploratory spirit and their ability to find joy in everyday life, ISFPs can be among the most 
                      interesting people you’ll ever meet.
                    Driven by their sense of fairness and their open-mindedness, people with this personality type move through life with an infectiously encouraging 
                      attitude. They love motivating those close to them to follow their passions and usually follow their own interests with the same unhindered 
                      enthusiasm. The only irony? Unassuming and humble, ISFPs tend to see themselves as “just doing their own thing,” so they may not even realize 
                      how remarkable they really are. """)

        case "ESTP":
            print("""

                ESTP
                    The Entrepreneur
                    ESTP (Entrepreneur) is a personality type with the Extraverted, Observant, Thinking, and Prospecting traits. They tend to be energetic and action-
                      oriented, deftly navigating whatever is in front of them. They love uncovering life’s opportunities, whether socializing with others or in more 
                      personal pursuits.
                    People with the ESTP personality type (Entrepreneurs) are vibrant individuals brimming with an enthusiastic and spontaneous energy. They tend to 
                      be on the competitive side, often assuming that a competitive mindset is a necessity in order to achieve success in life. With their driven, 
                      action-oriented attitudes, they rarely waste time thinking about the past. In fact, they excel at keeping their attention rooted in their 
                      present – so much so that they rarely find themselves fixated on the time throughout the day.
                    Theory, abstract concepts, and plodding discussions about global issues and their implications don’t keep ESTP personalities interested for long. 
                      They keep their conversations energetic, with a good dose of intelligence, but they like to talk about what is – or better yet, to just go out 
                      and do it. They often leap before they look, fixing their mistakes as they go rather than sitting idle and preparing contingencies and escape 
                      clauses. """)

        case "ESFP":
            print("""

                ESFP
                    The Entertainer
                    ESFP (Entertainer) is a personality type with the Extraverted, Observant, Feeling, and Prospecting traits. These people love vibrant experiences, 
                       engaging in life eagerly and taking pleasure in discovering the unknown. They can be very social, often encouraging others into shared 
                       activities.
                    ESFP personalities are inclined toward putting on a show for others and generally appear to be very comfortable in the spotlight. However, it is 
                       not their love for being the center of attention that drives this sense of confidence but their knack for sensing what’s appropriate in 
                       certain situations. They have an uncanny ability to mirror the behaviors of those around them.
                    ESFPs truly enjoy the simplest things, and there’s no greater joy for them than just having fun with a good group of friends. People with this 
                       personality type would almost always choose to be with friends over spending time alone. With their unique and earthy wit, they love soaking 
                       up attention and making every get-together feel a bit like a party.""")

        case _:
            print("You're Very Special");



