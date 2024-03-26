<template>
    <div>
      <div class='leftBar'>
        <ul>
          <li id='logo'>
            <div>Inventory</div>
            <div>Manager</div>
          </li>
          <li>HOME</li>
          <li>MANAGER</li>
          <li>STATE</li>
          <li>RESISTER</li>
          <li id='company'>
            <div>Welcomt to Inventory</div>
            <div>Seoul Gangnam <br> ... </div>
            <div>@copyright demnodey</div>
          </li>
        </ul>
      </div>
      <img id='left_btn' @click='toggle' src='/src/assets/logo.png'>
    </div>
  </template>
  <script>

import jQuery from 'jquery';
const $ = jQuery;
window.$ = $; 
  export default {
    name: 'leftBar',
    data () {
      return {}
    },
    methods: {
      resize: function () {
        $(window).resize(function () {
          var height = (window.innerHeight / 2) + 'px'
          $('#left_btn').css({'top': height})
        })
      }
    },
    created () {
      this.resize()
    }
  }
  </script>
  <style>
    a{color:black}
    a:hover{color:rgb(255,98,124);}
    .left{
      position:fixed; 
      top:0px; 
      left:0px; 
      width:250px; 
      height:1000px; 
      background:rgba(255,98,124,0.6); 
      padding:40px 0; 
      overflow: hidden
    }
    .left ul {padding: 0 30px}
    .left ul li { font-size:25px;  height:75px;} 
    .left ul li#logo {font-family: 'Passion One', cursive; font-size:50px; height:170px;}
    .left ul li#logo div {line-height: 0.8}
    .left ul li#company {font-size:16px; margin-top:150px; }
    #left_btn {position:fixed; top:495px; left:-60px; cursor:pointer}
  </style>