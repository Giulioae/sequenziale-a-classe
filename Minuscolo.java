/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._4id_orsi_minuscoloapp;

/**
 *
 * @author orsi giulio
 */
public class Minuscolo{

     
    
    public static void main(String[] args) { 
      //Istanziazione dell'oggetto funzionamento_codice appartenente alla classe Minuscolo  
      Minuscolo funzionamento_codice = new Minuscolo();
      
      //richiamo alla funzione che svolge la funzione di input per l'utente
      funzionamento_codice.input_utente();
      
      //richiamo alla funzione che trasforma la stringa in un array
      funzionamento_codice.trasformazione_string_a_array();
      //richiamo alla funzione che trasforma la parola precedentemente immessa dall'utente in minuscolo
      funzionamento_codice.trasformazione_in_minuscolo();
      //richiamo alla funzione che visualizza la parola in minuscolo (array)
      funzionamento_codice.visualizzazione_parola_minuscolo_array();
      //richiamo alla funzione che visualizza la parola in minuscolo (oggetto)
      funzionamento_codice.visualizzazione_parola_minuscolo_oggetto();
    
}
}