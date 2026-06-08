
print("----------------------------------------------------------------- WELCOME TO LEARN HUB -----------------------------------------------------------------")

amount_of_student = int(input("Enter the amount of student enrolled: "))
amount_of_quizzes = int(input("Number of quizzes taken: "))

student_scores = []

only_scores = []

total = 0

for student_count in range(0, amount_of_student):
    name_of_student = f"Student {student_count+1}"
    student_scores.append(name_of_student)
    print(f"student {student_count+1}")
    for quiz_count in range (0, amount_of_quizzes):
        quiz_score = int(input("Enter the score of the student: "))
        cheking_student_score_isValid = True
        if(quiz_score >= 0 and quiz_score <= 100):
            student_scores.append(quiz_score)
            only_scores.append(quiz_score)
            total+=quiz_score
        else:
            while(cheking_student_score_isValid):
                print("Wrong input check that score is within the range of 0-100")
               
                quiz_score = int(input("Please enter the valid score of the student: "))
                if(quiz_score >= 0 and quiz_score <= 100):
                    student_scores.append(quiz_score)
                    only_scores.append(quiz_score)
                    total+=quiz_score
                    cheking_student_score_isValid = False                  
                
#        student_scores.append(quiz_score)
#        total+=quiz_score
    average = total/amount_of_quizzes
    student_scores.append(average)

print(student_scores)
print(only_scores)

quiz_average = []
largest = 0
averages = 0
question_with_highest_average = 0
index_increament = amount_of_quizzes
for index in range(0, amount_of_quizzes):
    question = only_scores[index] + only_scores[index_increament]
    averages = question/amount_of_student
    quiz_average.append(averages)
    total = averages
    if(total > largest):
        largest = total
        question_with_highest_average+=1
   
    index_increament+=1

print("""
========================= QUIZ GRADE REPORT =========================
  
""")
print("STUDENT", end="     ")

for display_count in range(amount_of_quizzes):
    print(f"QZ{display_count +1}", end="   ") 

print("   AVG")

print("-------------------------------------------------------------------------")

score_index = 1
stop_index = amount_of_quizzes
dummy_for_quiz_amount = amount_of_quizzes
increment_by_quiz = 0
for display_student in range(amount_of_student):
#    print(f"Student {display_student +1} ", end="  ")
    for display_scores in range(increment_by_quiz, dummy_for_quiz_amount+2):
#        print(f"{student_scores(score_index, stop_index)}")
        print(f"{student_scores[display_scores]}", end="    ")
    increment_by_quiz+=amount_of_quizzes+2
    dummy_for_quiz_amount+=amount_of_quizzes+2
    print()

    

print("-------------------------------------------------------------------------")
print("The average of", end=" ")
for display_quizzes in range(amount_of_quizzes):
    print(f"Quiz{display_quizzes+1}", end=",")

print(quiz_average)
print(f"Best Quiz: Quiz {question_with_highest_average} (avg:{largest})")
    
