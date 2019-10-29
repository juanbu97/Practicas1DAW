#!/usr/bin/env python
# -*- coding: utf-8 -*-
"""
Modifica la clase Gato vista anteriormente annadiendo el metodo apareaCon.
Este metodo debe comprobar que los gatos son de distinto sexo, tras lo cual, genera un nuevo gato.
Por ejemplo, seria valido algo como Gato cria = garfield.apareaCon(lisa). En caso de que los gatos sean del mismo sexo,
el metodo debe generar la excepcion ExcepcionApareamientoImposible. Crea un programa desde el que se pruebe el metodo.
"""

from excepciones.Gato import Gato
garfield = Gato("macho")
lisa = Gato("hembra")
felix = Gato("macho")

try:
    garfield.apareaCon(lisa)
    felix.apareaCon(garfield)
except:
    print("Excepcion capturada con exito")

