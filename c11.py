def start_game(character):
    character.attack()
    character.defend()
class warrior:
    def attack(self):
        print("warrior swings sword")
    def defend(self):
        print("warrior blocks with a sheild")
class wizard:
    def attack(self):
        print("wizward casts a fireball")
    def defend(self):
        print("wizward conjures a magic barrier")
    warrior=warrior
    wizard=wizard
    