<template>
  <button @click="get">데이터 가져오기</button>
  <p>{{ data }}</p>
  <div>
    <transition name='toggle'>
 
      <div class='left' v-if='fade'>
        <ul>
          <li id='logo'>
            <div>Inventory</div>
            <div>Manager</div>
          </li>
          <li v-for='list in linklist' v-bind:key="list.content">
            <router-link :to='list.link' >{{ list.content }}</router-link>
          </li>
          <li id='company'>
          
            <div>@copyright </div>
          </li>
        </ul>
      </div>
 
    </transition>
 
   <img id='left_btn' @click='enter' src='../src/assets/logo.png'>
  </div>
  <div>
    <button type="button" class="btn btn-primary">Primary</button>
  </div>
</template>
 
<script>
import axios from "axios";
import SideMenu from "@/components/comm/SideMenu.vue"

import jQuery from 'jquery';
const $ = jQuery;
window.$ = $; 
 
export default {
  name: "App",
  data() {
    return {
      fade: false,
      linklist: [
        {content: 'MyPage'  ,   link: '/mypage'}
        ,{content: 'Remider' ,   link: '/remider'}
        ,{content: 'Rutin'   ,   link: '/rutin'}
      ],
      data: [],
      components: {
        SideMenu
      },
      id: 1,
    };
  },
  methods: {
    get() {
      axios
        .get(`https://jsonplaceholder.typicode.com/todos/${this.id}`)
        .then((result) => {
          console.log(result.data);
          this.data.push(result.data);
          this.id++;
        })
        .catch((error) => {
          console.log(error);
        })
        .finally(() => {
          console.log("finally");
        });
    },
    enter: function () {
      this.fade = !this.fade
    },
    resize: function () {
      $(window).resize(function () {
        var height = (window.innerHeight / 2) + 'px'
        $('#left_btn').css({'top': height})
      })
    },
    created () {
    this.resize()
  }

  },
};
</script>
 
<style>
font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;


  a{color:black}
  a:hover{color:rgb(255,98,124);}
  .left{
    position:relative; 
    top:0px; 
    width:250px;
    height:1000px; 
    background:rgba(255,98,124,0.6); 
    padding:40px 0;
    float:left
  }
  .toggle-enter-active, .toggle-leave-active{
    transition: all 1s
  }
  .toggle-enter , .toggle-leave-to{
    left:-250px;
    width:0px;
  }
  .toggle-enter-to , .toggle-leave {
    left:0px;
    width:250px;
  }
  .left ul {padding: 0 30px; position:fixed}
  .left ul li { font-size:25px;  height:75px;} 
  .left ul li#logo {font-family: 'Passion One', cursive; font-size:50px; height:170px;}
  .left ul li#logo div {line-height: 0.8}
  .left ul li#company {font-size:16px; margin-top:150px; }
  #left_btn {position:fixed; top:495px; left:-60px; cursor:pointer}

</style>