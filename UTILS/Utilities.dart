import 'dart:io' show File;
import 'dart:convert';

class Utilities {
  List _properties;

  Utilities() {
    var json = jsonDecode(new File('_resources/properties.json').readAsStringSync());
    this._properties = json['arithmetic'];
  }

  validate(String charText) => this._properties.contains(charText);
}
