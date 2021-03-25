
import 'package:flutter/cupertino.dart';

class Cast{

  List<Actor> actores = new List();

  Cast.fromJsonList(List<dynamic> jsonList){
if(jsonList == null) return;

jsonList.forEach((item) async {
  final actor = await Actor.fromJsonMap(item);
   actores.add(actor);
   });
  }
}

class Actor {
  bool adult;
  int gender;
  int id;
  String name;
  String originalName;
  double popularity;
  String profilePath;
  int castId;
  String character;
  String creditId;
  int order;
  String job;

  Actor({
    this.adult,
    this.gender,
    this.id,
    this.name,
    this.originalName,
    this.popularity,
    this.profilePath,
    this.castId,
    this.character,
    this.creditId,
    this.order,
    this.job,
  });


Actor.fromJsonMap(Map<String, dynamic> json){

    adult                   =  json[adult] as bool;
    gender                  =  json[gender] as int;
    id                      =  json[id] as int;
    name                    =  json[name] as String;
    originalName            =  json[originalName] as String;
    popularity              =  json[popularity] as double;
    profilePath             =  json[profilePath] as String;
    castId                  =  json[castId]as int;
    character               =  json[character] as String;
    creditId                =  json[creditId] as String;
    order                   =  json[order] as int;
    job                     =  json[job] as String;
 
  }

  String getFot(BuildContext context) {
    if (profilePath == null) {
      return 'https://www.intra-tp.com/wp-content/uploads/2017/02/no-avatar.png';
    } else {
      return 'https://image.tmdb.org/t/p/w500/$profilePath';
    }
  }


}