<template>
  <nav class="navbar navbar-default">
    <div class="container-fluid">
      <!-- Brand and toggle get grouped for better mobile display -->
      <div class="navbar-header">
        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
          <span class="sr-only">Toggle navigation</span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="#">多维电影网</a>
      </div>

      <!-- Collect the nav links, forms, and other content for toggling -->
      <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
        <ul class="nav navbar-nav">
          <li class="active"><a href="#">首页 <span class="sr-only">(current)</span></a></li>
          <li><a href="#">热门电影</a></li>
          <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">电影分类 <span class="caret"></span></a>
            <ul class="dropdown-menu">
              <li><a href="#">欧美电影</a></li>
              <li><a href="#">日韩电影</a></li>
              <li><a href="#">港台电影</a></li>
              <li><a href="#">大陆电影</a></li>
<!--              <li role="separator" class="divider"></li>-->
            </ul>
          </li>
        </ul>
        <ul class="nav navbar-nav navbar-right">
          <li><a href="#">注册</a></li>
          <li v-if="username==null"><router-link to="/login">登录</router-link></li>
          <li class="dropdown" v-else>
            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"> {{username}}<span class="caret"></span></a>
            <ul class="dropdown-menu">
              <li><a href="#">Action</a></li>
              <li><a href="#">Another action</a></li>
              <li><a href="#">Something else here</a></li>
              <li role="separator" class="divider"></li>
              <li><a href="#">Separated link</a></li>
            </ul>
          </li>
        </ul>
        <form class="navbar-form navbar-right" style="margin-right: 20px">
          <div class="form-group">
            <input type="text" class="form-control" placeholder="电影名">
          </div>
          <button type="submit" class="btn btn-default">搜索</button>
        </form>

      </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
  </nav>
</template>

<script>
    export default {
      data(){
        return{

        }
      },
      props:['username'],

    }
</script>

<style scoped>

</style>
