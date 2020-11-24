<template>
  <div class="register-box">
    <a href="login"> <i class="el-icon-back" style="float: left"></i></a> <h3>注册</h3>
<el-form :label-position="labelPosition" :model="ruleForm" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm" size="medium" >
  <el-form-item label="用户名" prop="username">
    <el-input v-model="ruleForm.username"></el-input>
  </el-form-item>
  <el-form-item label="姓名" prop="name">
    <el-input v-model="ruleForm.name"></el-input>
  </el-form-item>
  <el-form-item label="性别" prop="sex">
    <el-select v-model="ruleForm.sex" placeholder="性别" style="float:left;width: 100px">
      <el-option label="男" value="man"></el-option>
      <el-option label="女" value="woman"></el-option>
    </el-select>
  </el-form-item>
  <el-form-item label="电子邮件" prop="email">
    <el-input v-model="ruleForm.email"></el-input>
  </el-form-item>
  <el-form-item label="密码" prop="pass">
    <el-input type="password" v-model="ruleForm.pass" autocomplete="off"></el-input>
  </el-form-item>
  <el-form-item label="确认密码" prop="checkPass">
    <el-input type="password" v-model="ruleForm.password" autocomplete="off"></el-input>
  </el-form-item>

  <el-form-item>
    <el-button type="primary" @click="submitForm('ruleForm')">立即创建</el-button>
    <el-button @click="resetForm('ruleForm')">重置</el-button>
  </el-form-item>
</el-form>
  </div>
</template>
<style lang="scss" scoped>
  .register-box{
    border: 1px solid #DCDFE6;
    width: 450px;
    margin:50px auto;
    padding:35px 35px 15px 35px;
    border-radius: 5px;
    -webkit-border-radius: 5px;
    -moz-border-radius: 5px;
    box-shadow:0 0 25px #909399;
  }
</style>

<script>
  export default {
    name:'Register',
    data() {
      var validatePass = (rule, value, callback) => {
      if (value === '') {
        callback(new Error('请输入密码'));
      } else {
        if (this.ruleForm.password !== '') {
          this.$refs.ruleForm.validateField('password');
        }
        callback();
      }
    };
      var validatePass2 = (rule, value, callback) => {
        if (value === '') {
          callback(new Error('请再次输入密码'));
        } else if (value !== this.ruleForm.pass) {
          callback(new Error('两次输入密码不一致!'));
        } else {
          callback();
        }
      };
      return {
        labelPosition:'left',
        ruleForm: {
          username:'',
          name: '',
          sex: '',
          email:'',
          pass: '',
          password: '',
        },
        rules: {
          username:[
            { required: true, message: '用户名', trigger: 'blur' },
            { min: 6, max: 16, message: '长度在 6 到 16 个字符', trigger: 'blur' }
          ],
          name: [
            { required: true, message: '请输入姓名', trigger: 'blur' },
            { min: 2, max: 5, message: '长度在 3 到 5 个字符', trigger: 'blur' }
          ],
          sex: [
            { required: true, message: '请输入性别', trigger: 'change' }
          ],
          email:[
            {required: true, message: '请输入邮箱', trigger: 'blur' },
            { type: 'email', message: '请输入正确的邮箱地址', trigger: ['blur', 'change'] }
          ],
          pass: [
            { validator: validatePass, trigger: 'blur' },
            { min: 6, max: 32, message: '长度在 6 到 32 个字符', trigger: 'blur' }
          ],
          password: [
            { validator: validatePass2, trigger: 'blur' },
            { min: 6, max: 32, message: '长度在 6 到 32 个字符', trigger: 'blur' }
          ],
        }
      };
    },
    methods: {
      submitForm(formName) {
        this.$refs[formName].validate((valid) => {
          if (valid) {
            this.axios.post('http://localhost:8080/login_first',
              this.ruleForm,
              )
              .then(function (response) {
                if(response.data==="success"){
                  alert('注册成功');
                }else{
                  if(response.data==="error"){
                    alert('注册失败,用户名已存在');
                  }else{
                    alert("服务器错误");
                  }
                }
              })
              .catch(function (error) {
                console.log(error);
              });
           // console.log(JSON.parse(formJson));

          } else {
            console.log("请填写完整");
            return false;
          }
        });
      },
      resetForm(formName) {
        this.$refs[formName].resetFields();
      }
    }
  };

</script>
