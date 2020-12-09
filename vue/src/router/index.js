import Vue from 'vue'
import Router from 'vue-router'
import main from "../components/views/main";
import login from "../components/login/login";

Vue.use(Router)

export default new Router({
  mode:"history",
  routes: [
    {
      path: '/',
      name: 'main',
      component: main,
    },
    {
      path: '/login',
      name: 'login',
      component:login
    },
    {
      path:'/main/:username',
      name:'mainIndex',
      component:main,
      props:true,
    }
  ]
})
