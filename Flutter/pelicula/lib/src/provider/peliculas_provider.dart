import 'dart:async';
import 'dart:convert';
import 'dart:core';
import 'package:http/http.dart' as http;
import 'package:pelicula/src/models/peliculas_modes.dart';
import 'package:pelicula/src/models/actores_mod.dart';

class PeliculaProvider {
  String _apikey = '853c48807c856acb754c204be0a7a8fb';
  String _url = 'api.themoviedb.org';
  String _lenguage = 'es-ES';
  int _popularespage = 0;
  bool _cargando = false;

  List<Pelicula> _populares = List();
  // ignore: always_specify_types
  final _popularesStremcontroller =
      StreamController<List<Pelicula>>.broadcast();

  Function(List<Pelicula>) get popularesSink =>
      _popularesStremcontroller.sink.add;

  Stream<List<Pelicula>> get popularesStream =>
      _popularesStremcontroller.stream;

  void disposeeStream() {
    _popularesStremcontroller?.close();
  }

  Future _procesarRespuestas(Uri url) async {
    final resp = await http.get(url);
    final dynamic decodedData = json.decode(resp.body);

    final Peliculas peliculas = Peliculas.fromJsonList(decodedData['results']);

    return peliculas.items;
  }

  Future<List<Pelicula>> getEnCines() async {
    final url = Uri.https(_url, '3/movie/now_playing', {
      'api_key': _apikey,
      'language': _lenguage,
    });

    return await _procesarRespuestas(url);
  }

  Future<List<Pelicula>> getPopulares() async {
    if (_cargando) return [];

    _cargando = true;

    _popularespage++;

    final url = Uri.https(_url, '3/movie/popular', {
      'api_key': _apikey,
      'lenguage': _lenguage,
      'page': _popularespage.toString()
    });

    final resp = await _procesarRespuestas(url);

    _populares.addAll(resp);
    popularesSink(_populares);

    _cargando = false;

    return resp;
  }

  Future<List<Actor>> getCast(String peliId) async {
    final url = Uri.http(_url, '3/movie/$peliId/credits', {
      'api_key': _apikey,
      'lenguage': _lenguage,
    });

    final resp = await http.get(url);
    final decodeData = json.decode(resp.body);

    final cast = new Cast.fromJsonList(decodeData['cast']);

    return cast.actores;
  }
}
