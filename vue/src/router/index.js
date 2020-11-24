import Vue from 'vue'
import Router from 'vue-router'
import Login from "../views/Login";
import Register from "../views/Register";
import Main from "../views/Main";
import HeadIndex from "../views/HeadIndex";

Vue.use(Router)

export default new Router({
  mode:"history",
  routes: [
    {
      path: '/',
      component: Main,
    },
    {
      path:'/login',
      name:'login',
      component:Login,
    },
    {
      path:'/register',
      name:'register',
      component:Register,
    },
    {
      path: '/main/:username',
      name: 'main',
      component: Main,
      props: true,
    },
    {
      path: '/main',
      name: 'main',
      component: Main,
    },
    {
      path: '/headIndex',
      name: 'head',
      component: HeadIndex,
      props:true,
    },
    {
      path:'/admin/user',
    },

]})
