//import 'dart:js';

import 'dart:ffi';

import 'package:flutter/src/widgets/framework.dart';

class Peliculas {
  List<Pelicula> items = List();

  Peliculas();

  Peliculas.fromJsonList(List<dynamic> jsonList) {
    if (jsonList == null) return;

    for (var item in jsonList) {
      final Pelicula pelicula = Pelicula.fromJsonMap(item);
      items.add(pelicula);
    }
  }
}

class Pelicula {
  int voteCount;
  int id;
  bool video;
  double voteaverage;
  String title;
  double popularity;
  String posterPath;
  String originalLanguage;
  String originalTitle;
  List<int> genreIds;
  String backdropPath;
  bool adult;
  String overview;
  String releaseDate;

  Pelicula({
    this.voteCount,
    this.id,
    this.video,
    this.voteaverage,
    this.title,
    this.popularity,
    this.posterPath,
    this.originalLanguage,
    this.originalTitle,
    this.genreIds,
    this.backdropPath,
    this.adult,
    this.overview,
    this.releaseDate,
  });

  Pelicula.fromJsonMap(Map<String, dynamic> json) {
    voteCount                = json['vote_count'] as int;
    id                       = json['id'] as int;
    video                    = json['video'] as bool;
    voteaverage              = json['voteaverage'] as double;
    title                    = json['title'] as String;
    popularity               = json['popularity'] as double;
    posterPath               = json['poster_path'] as String;
    originalLanguage         = json['original_language'] as String;
    originalTitle            = json['original_title'] as String;
    genreIds                 = json['genre_ids'].cast<int>() as List<int>;
    backdropPath             = json['backdrop_path'] as String;
    adult                    = json['adult'] as bool;
    overview                 = json['overview'] as String;
    releaseDate              = json['release_date'] as String;
  }

  String getPosterImg(BuildContext context) {
    if (posterPath == null) {
      return 'https://sofisis.com/static/webstore/images/image_not_found.png';
    } else {
      return 'https://image.tmdb.org/t/p/w500/$posterPath';
    }
  }

  String getBackgroundImg(BuildContext context) {
    if (posterPath == null) {
      return 'https://sofisis.com/static/webstore/images/image_not_found.png';
    } else {
      return 'https://image.tmdb.org/t/p/w500/$backdropPath';
    }
  }
}
