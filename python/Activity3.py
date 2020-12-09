#Rock Paper Sissors, a 2 player game

player1 = input("Enter player 1 name : ")
player2 = input("Enter player 1 name : ")


    print("*********Game starts***********")

    choice1=input("Enter your choice "+player1+" :").lower()
    choice2=input("Enter your choice "+player2+" :").lower()


    #logic
    if choice1==choice2:
        print("Game is a tie between ",player1, " and ",player2)
    elif choice1 == "rock":
        if choice2 == "sissors":
            print(player1, " wins!!")
        elif choice2 == "paper":
            print(player2, "wins!!")
    elif choice1 == "paper":
        if choice2 == "sissors":
            print(player2, " wins!!")
        elif choice2 == "rock":
            print(player1, "wins!!")
    elif choice1 == "sissors":
        if choice2 == "rock":
            print(player2, " wins!!")
        elif choice2 == "paper":
            print(player1, "wins!!")
    else:
        print("Entered value is invalid")