<template>
  <div class="box">
    <h3 class="login-title">用户登录</h3>
    <el-form ref="loginForm" :model="form" label-width="80px" :rules="rules">
      <el-form-item label="用户名" prop="username">
        <el-input type="text" v-model="form.username"></el-input>
      </el-form-item>
      <el-form-item label="密码" prop="password">
        <el-input type="password" v-model="form.password"></el-input>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" @click="onSubmit('loginForm')">立即登录</el-button>
        <el-button>注册</el-button>
      </el-form-item>
    </el-form>

  </div>
</template>

<script>
  import {login} from '@/api/getData'
    export default {
        name: "login",
      data() {
        return {
          form: {
            username: '',
            password: '',

          },
          rules:{
            username:[
              {required:false,message:'用户名不能为空',trigger:'blur'}
            ],
            password:[
              {required:false,message:'密码不能为空',trigger:'blur'}
              ]
          }
        }
      },
      methods: {
        onSubmit(formName) {
          this.$refs[formName].validate((valid) =>{
            if (valid){
              let that=this;
              //使用 vue-router路由到指定页面，该方式称之为编程式导航
              //this.$router.push("main/"+this.form.username);
                const res=login(this.form);
                res.then(function (response) {
                  console.log(response);
                  if(response.data.result=="success"){
                    console.log(response.data.user);
                    that.$router.push("/main/"+response.data.user);
                  }else{
                    if(response.data.result=="error"){
                      console.log("error");
                      that.$message.error('用户名或密码错误');
                    }else{
                      that.$message.error('未知的错误');
                    }
                  }
                })
                .catch(function (error) {
                  console.log(error.data);
                });
            } else {
              this.dialogVisible = true;
              return false;
            }
          });
        }
      }
    }
</script>

<style scoped>
  .box{
    border: 1px solid #DCDFE6;
    width: 400px;
    margin:180px auto;
    padding:35px 35px 15px 35px;
    border-radius: 5px;
    -webkit-border-radius: 5px;
    -moz-border-radius: 5px;
    box-shadow:0 0 25px #909399;
  }
.login-title{
  text-align: center;
}
</style>
