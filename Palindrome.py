# palindrome.py

def is_palindrome(text: str) -> bool:
    # Remove spaces and make lowercase for fair comparison
    cleaned = ''.join(text.split()).lower()
    return cleaned == cleaned[::-1]


if __name__ == "__main__":
    # Take input from user
    user_input = input("Enter a word, phrase, or number: ")

    if is_palindrome(user_input):
        print(f"✅ '{user_input}' is a palindrome!")
    else:
        print(f"❌ '{user_input}' is NOT a palindrome.")
