import '../UTILS/Utilities.dart';
import 'Token.dart';
import 'TokenTypes.dart';

class Lexer {
  final Utilities u = Utilities();
  final List tokens = [];

  int _pos = 0;
  List charText;

  String _current_char;

  Lexer(String input) {
    this.charText = input.split("");
    this._current_char = this.charText[_pos];
  }

  void advance() {
    _pos++;
    if (_pos > charText.length - 1)
      _current_char = null;
    else
      _current_char = charText[_pos];
  }

  void tokenizer(int state, String lexeme) {
    if (lexeme == null) lexeme = "";

    switch (state) {
      case 0:
        {
          if (u.validate(_current_char)) {
            if (_current_char == '=') {
              tokens.add(new Token(TokenType.ASSIGN, _current_char));
              lexeme = null;
            }

            if (_current_char == '+') {
              state = 7;
              lexeme += _current_char;
            }

            if (_current_char == '-') {
              state = 9;
              lexeme += _current_char;
            }

            if (_current_char == '*') {
              tokens.add(new Token(TokenType.MULTIPLY, _current_char));
              lexeme = null;
            }

            if (_current_char == '/') {
              tokens.add(new Token(TokenType.DIVIDE, _current_char));
              lexeme = null;
            }
          } else if (isNumeric(_current_char)) {
            //si se recibe un número en el estado 0
            lexeme += _current_char;
            state = 20;
          } else if (_current_char.contains(new RegExp(r'[A-z]'))) {
            //TODO: validar expresión regular
            if (_current_char == 'S') {
              lexeme += _current_char;
              state = 2;
            } else if (_current_char == 'F') {
              lexeme += _current_char;
              state = 15;
            } else {
              lexeme += _current_char;
              state = 13;
            }
          } else {
            tokens.add(new Token(TokenType.ERROR, _current_char));
            lexeme = null;
          }

          advance();
        }
        break;

      case 2:
        {
          if (_current_char == 'A') {
            lexeme += _current_char;
            state = 3;
            advance();
          } else {
            state = 13;
          }
        }
        break;

      case 3:
        {
          if (_current_char == 'L') {
            lexeme += _current_char;
            state = 4;
            advance();
          } else {
            state = 13;
          }
        }
        break;

      case 4:
        {
          if (_current_char == 'I') {
            lexeme += _current_char;
            state = 5;
            advance();
          } else {
            state = 13;
          }
        }
        break;

      case 5:
        {
          if (_current_char == 'D') {
            lexeme += _current_char;
            state = 6;
            advance();
          } else {
            state = 13;
          }
        }
        break;

      case 6:
        {
          if (_current_char == 'A') {
            lexeme += _current_char;
            state = 0;
            advance();

            tokens.add(new Token(TokenType.OUTPUT,
                lexeme)); //se envia el lexema porque contiene la palabra identificada: SALIDA
            lexeme = null;
          } else {
            state = 13;
          }
        }
        break;

      case 7:
        {
          if (u.validate(_current_char) && _current_char == '+') {
            lexeme += _current_char;
            tokens.add(new Token(TokenType.INCREMENT, lexeme));

            advance();
          } else {
            tokens.add(new Token(TokenType.ADD, lexeme));
            lexeme = null;
          }

          state = 0;
        }
        break;

      case 9:
        {
          if (u.validate(_current_char) && _current_char == '-') {
            lexeme += _current_char;
            tokens.add(new Token(TokenType.DECREMENT, lexeme));

            advance();
          } else {
            tokens.add(new Token(TokenType.SUBTRACT, lexeme));
            lexeme = null;
          }

          state = 0;
        }
        break;

      case 13:
        {
          if (_current_char.contains(new RegExp(r'[A-z]'))) {
            lexeme += _current_char;
            advance();
          } else {
            //termina de identificar letras
            tokens.add(new Token(TokenType.STRING, lexeme));
            state = 0;
          }
        }
        break;

      case 15:
        {
          if (_current_char == 'I') {
            lexeme += _current_char;
            state = 16;
            advance();
          } else {
            state = 13;
          }
        }
        break;

      case 16:
        {
          if (_current_char == 'J') {
            lexeme += _current_char;
            state = 17;
            advance();
          } else {
            state = 13;
          }
        }
        break;

      case 17:
        {
          if (_current_char == 'A') {
            lexeme += _current_char;
            state = 18;
            advance();
          } else {
            state = 13;
          }
        }
        break;

      case 18:
        {
          if (_current_char == 'R') {
            lexeme += _current_char;
            state = 0;
            advance();

            tokens.add(new Token(TokenType.SET,
                lexeme)); //se envia el lexema porque contiene la palabra identificada: FIJAR
            lexeme = null;
          } else {
            state = 13;
          }
        }
        break;

      case 20:
        {
          if (isNumeric(_current_char)) {
            lexeme += _current_char;
            advance();
          } else {
            tokens.add(new Token(TokenType.NUMBER, lexeme));
            state = 0;
          }
        }
        break;
    }

    tokenizer(state, lexeme);
  }

  bool isNumeric(String s) => s != null && double.tryParse(s) != null;
}
