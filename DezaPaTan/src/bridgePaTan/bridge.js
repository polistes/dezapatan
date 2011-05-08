/*
 * Bridge pattern
 * Kosei Moriyama <cou929@gmail.com>
 * 
 * Bridge pattern sample code for #dezapatan (http://inajob.no-ip.org/dev/dezapatan/dezapatan.html)
 * 
 * Reqires:
 * - Klass.js (https://github.com/ded/klass)
 * - Implementation of CommonJS Modules/1.x, for instance Node.js
 */

var klass = require('klass');

/*
 * Abstruction
 */
var Marimo = klass(function(race) {
                     this.race = race;                     
                   })
  .methods({
             attack: function() {
               this.race.attack();
             },
             magic: function() {
               this.race.magic();
             }
           });

/*
 * RefinedAbstruction
 */

// Warrior
var WarriorMarimo = Marimo.extend(function(race) {
                                    // super class is automagically called
                                  })
  .methods({
             // warriror can attack twice
             attack: function() {
               for (var i=0; i<2; i++) {
                 this.race.attack();
               }
             },
             // but cannot use magic
             magic: function() {
               console.log('Cannot cast a spell!!!');
             }
           });

// Magician
var MagicianMarimo = Marimo.extend(function(race) {
                                     // super class is automagically called
                                   })
  .methods({
             // magician sometimes miss attack
             attack: function() {
               if (Math.random() >= 0.5) {
                 this.race.attack();
               } else {
                 console.log('Miss!!!');
               }
             },
             // magician sometimes spell 10 times
             magic: function() {
               if (Math.random() >= 0.7) {
                 for (var i=0; i<10; i++) {
                   this.race.magic();
                 }
               } else {
                 this.race.magic();
               }
             }
           });

/*
 * Implementer
 */
var MarimoRace = klass(function() {
                         this.baseDamage = 10;
                       })
  .methods({
             // interface
             attack: function() {
               throw new Error("Implement me!!!");
             },
             magic: function() {
               throw new Error("Implement me!!!");
             },
             test: function() {
               console.log(this.baseDamage);
             }
           });

/*
 * ConcreteImplementor
 */

// MarimoHuman
var MarimoHuman = MarimoRace.extend(function() {
                                    })
  .methods({
             // human attaks and use magic normally
             attack: function() {
               console.log((this.baseDamage * 1) + ' damage whith attack!');
             },
             magic: function() {
               console.log((this.baseDamage * 1) + ' damage with magic!');
             }
           });

// MarimoDwarf
var MarimoDwarf = MarimoRace.extend(function() {
                                    })
  .methods({
             // dwarf can attack 2 times damage
             attack: function() {
               console.log((this.baseDamage * 2) + ' damage with attack!');
             },
             // but magic with 0 damage
             magic: function() {
               console.log((this.baseDamage * 0) + ' damage with magic!');
             }
           });

// MarimoElf
var MarimoElf = MarimoRace.extend(function() {
                                  })
  .methods({
             // elf's attack is weak
             attack: function() {
               console.log((this.baseDamage * 0.5) + ' damage with attack!');  
             },
             // but magic is strong
             magic: function() {
               console.log((this.baseDamage * 1.5) + ' damage with magic!');
             }
           });

/*
 * Main
 */
var human = new MarimoHuman();
var elf = new MarimoElf();
var dwarf = new MarimoDwarf();

var normal_human = new Marimo(human);
var elf_magician = new MagicianMarimo(elf);
var dwarf_warrior = new WarriorMarimo(dwarf);

console.log('== normal human ==');
normal_human.attack();
normal_human.magic();

console.log('== elf magician ==');
elf_magician.attack();
elf_magician.magic();

console.log('== dwarf warrior ==');
dwarf_warrior.attack();
dwarf_warrior.magic();
