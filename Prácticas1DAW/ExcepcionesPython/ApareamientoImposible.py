#!/usr/bin/env python
# -*- coding: utf-8 -*-
'''
Created on 4 abr. 2019

@author: juanbu97
'''
class ApareamientoImposible(Exception):
    def __init__(self):     
        Exception.__init__(self) 
        print("No pueden aparearse dos gatos de mismo sexo.")