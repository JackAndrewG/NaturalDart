import 'TokenTypes.dart';

class Token {
  String _value;
  TokenType _type;

  Token(this._type, this._value) {}

  String get value => this._value;
  TokenType get type => this._type;
}
