<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>loan insert</title>
<link rel="stylesheet" href="css/signUp.css">
	
	<style type="text/css">

			body{

		  background-image: url("img/912.jpg");
		  background-position: center;
		  background-size: cover;
		  height: 700px;
		  background-repeat: no-repeat;
          background-attachment: fixed;

		}
		.adminTopic{
			text-align: center;
			color: #fff;
			

		}
	    .form_wrap .submit_btn:hover{
	
	      color:#fff;
	      font-weight: 600;

	    }
	    #decription{
	      width: 100%;
	      border-radius: 3px;
	      border: 1px solid #9597a6;
	      padding: 10px;
	      outline: none;
	      color: black;
	    }
	    .idclass{
	
	      width: 100%;
	      border-radius: 3px;
	      border: 1px solid #9597a6;
	      padding: 10px;
	      outline: none;
	      color: black;
	
	    }


	</style>
</head>
<body>

      <div class="wrapper">
      
             <div class="registration_form">
  
			    <div class="title">
			         loan insert
			    </div>


			<form action="loaninsert" method="post">
			<div class="form_wrap">
			
			 <div class="input_wrap">
                 <label for="title">loan Type</label>
				    <input type="text" name="loantype" required>
		     </div>
		     
		      <div class="input_wrap">
                   <label for="title">prefix</label>		    
			          <input type="text" name="prefix" required>
			  </div>
			  
			   <div class="input_wrap">
                   <label for="title">Min Amount</label>     
				     <input type="number" name="minAmount" required min="20000">
			   </div>
			    <div class="input_wrap">
                    <label for="title">Max Amount</label>	     
				      <input type="number" name="maxAmount" required>
				</div>
				
				 <div class="input_wrap">
                    <label for="title">interest(in presentage %)</label>      
				       <input type="number" name="interest" required>
				 </div>
				 
				  <div class="input_wrap">
                     <label for="title">Terms</label>      
				       <input type="text" name="terms" required>
				  </div>  
				  
				  
				   <div class="input_wrap">
                       <label for="title">status</label>   
				
				<select name="status">
		        
		          <option>Select status</option>
		          <option>Active</option>
		          <option>Inactive</option>
		           
		       </select></div>
		       
		        <div class="input_wrap">
		        
				    <input type="submit" name="submit" value="submit loan details" onclick="myFunction()" class="submit_btn">
				    
				</div></div>
				
			</form></div></div>
			
			<script>
	
	<!--when click submit button work myfunction (below function) -->
	
    function myFunction() {

		 alert("adding successfully !");  
        // alert(true);
         
    }

    </script>
			

</body>
</html>