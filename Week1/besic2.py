def minion_game(string):
    # your code goes here
    consonants = ""
    vowels = ""
    for word in string:
        if word == 'A' or word == 'E' or word == 'I' or word == 'O' or word == 'U':
            vowels = vowels + word
        else:
            consonants = consonants + word
    return vowels

if __name__ == '__main__':
    s = input()
    minion_game(s)
