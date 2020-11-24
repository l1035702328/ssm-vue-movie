<template>
  <div class="loginPage">
    <el-form ref="loginForm" :model="form" :rules="rules" label-width="80px" class="login-box">
      <h3 class="login-title">欢迎登录</h3>
      <el-form-item label="账号" prop="username">
        <el-input type="text" placeholder="请输入账号" v-model="form.username"/>
      </el-form-item>
      <el-form-item label="密码" prop="password">
        <el-input type="password" placeholder="请输入密码" v-model="form.password"/>
      </el-form-item>
      <el-form-item>
        <a href="/register"> <el-button type="primary" style="float:left">注册</el-button></a>
        <el-button type="primary" v-on:click="onSubmit('loginForm')">登录</el-button>
      </el-form-item>
    </el-form>

    <el-dialog>
      title="温馨提示"
      :visible.sync="dialogVisible"
      width="30%"
      :before-close="handleClose">
      <span>请输入账号和密码</span>
      <span slot="footer" class="dialog-footer">
        <el-button type="primary" @click="dialogVisible = false">确 定</el-button>
      </span>
    </el-dialog>
  </div>
</template>

<style lang="scss" scoped>
  /*.loginPage{*/
  /*  background: url("../assets/background.jpg");*/
  /*  background-size: 100% 100%;*/
  /*  height: 100%;*/
  /*}*/
  .login-box{
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
    text-align:center;
    margin:0 auto 40px auto;
    color:#303133;
  }
</style>

<script>
  export  default {
    name:"Login",
    data(){
      return {
        form:{
          username: '',
          password: ''
        },
        //表单验证，需要再el-form-item 元素中增加prop属性
        rules:{
          username:[
            {required:true,message:'账号不能为空',trigger:'blur'}
          ],
          password:[
            {required: true,message: '密码不能为空',trigger:'blur'}
          ]
        },
        //对话框显示和隐藏
        dialogVisible:false
      }
    },
    methods:{
      onSubmit(formName) {
        //为表单绑定验证功能
        this.$refs[formName].validate((valid) =>{
          if (valid){
            let that=this;
            //使用 vue-router路由到指定页面，该方式称之为编程式导航
            //this.$router.push("main/"+this.form.username);
            this.axios.post('http://localhost:8080/login_first2',
              this.form
            )
              .then(function (response) {
                console.log(response)
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
      },
      handleClose:function () {
        console.log("Handle Close");
      }
    }
  }
</script>


