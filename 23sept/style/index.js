// Your web app's Firebase configuration

var firebaseConfig = {
    apiKey: "AIzaSyB-FiуVU6MH72wmOVgfFq5939H-insiE",
    authDomain: "login-with-firebase-database.firebaseapp.com",
    projectId: "login-with-firebase-database",
    storageBucket: "login-with-firebase-database.appspot.com",
    messagingSenderId: "334593588938",
    appId: "1:334593588938: web: 0ed42025168a0d7567fe33"

};
// Initialize Firebase
firebase.initializeApp(firebaseConfig);
//Initialize variables
const auth = firebase.auth()
const database = firebase.database()

// set up register function
function register(){
    // Get all our input fields
    username = document.getElementById('username').value
    email = document.getElementById('email').value
    password= document.getElementById('password').value
    
    // Validate input fields
    if(validation_email(email) == false || validation_password(password) == false){
        alert("email or password is outta line!!")
        return
    }
    if(validation_field(field)){
        alert("one or more extra fields is outta line!!")
        return
    }

    auth.createUserWithEmailAndPassword(email,password)
    .then(function(){

        //declare user variable

        var user = auth.currentUser

        //add user to database
        var dtabase_ref = database.ref()

        var user_data = {
            username : username,
            email : email,
            last_login : Date.now()
        }

        database_ref.chid('users/' + username).set(user_data)
    })
    .catch(function(error){
        var error_code = error.error_code
        var error_message = error.message

        alert(error_message)
    })

}


function validation_email(email){
    expression = /^[^@]+@\w+(\.\w+)+\w$/
    if(expression.test(email) == true){
        return true
    }else{
        return false
    }
}

function validation_password(password){
    if(password < 6){
        return false
    }else{
        return true
    }
}

function validation_field(field){
    if(field == null){
        return fasle
    }
    if(field.length <= 0){
        return false
    }
    else{
        return true
    }
}