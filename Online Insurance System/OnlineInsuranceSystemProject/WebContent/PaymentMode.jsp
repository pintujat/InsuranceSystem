<!DOCTYPE html>
<html >
<head>
  <meta charset="UTF-8">
  <title></title>
  
  
  
      <style>


body{
  background: #EEE;
}
body, input{
  font-family: "Roboto";
  font-size: 1em;
}
h1, .credit{
  font-family: "Roboto Slab";
}
.credit{
  text-align: center;
  font-size: 0.7em;
  padding: 10px;
}

.item{
  width: 60px;
  vertical-align: middle;
  margin-right: 15px;
}
.card .company{
  box-sizing: border-box;
  float: right;
}
.card{
  position: relative;
  perspective: 600px;
}
.card, .card .side{
  width: 350px;
  height: 200px;
}
.card .side{
  border-radius: 5px 5px;
  transition: all 0.4s linear;
  background: #333;
  color: #FFF;
  box-sizing: border-box;
  transform-style: preserve-3d;
  backface-visibility: hidden;
  position: absolute;
	top: 0;
	left: 0;
}
.card .front{
  padding: 10px;
  transform: rotateX(0deg) rotateY(0deg);
}
.card.flip .front{
  transform: rotateY(180deg);
}
.card .cc-num{
  width: 100%;
  padding-top: 100px;
}
.card input{
  outline: none;
  border: 0px solid;
  background: none;
  color: #FFF;
}
.card[data-type="visa"] input::-webkit-input-placeholder, .card[data-type="mastercard"] input::-webkit-input-placeholder{
  color: #DDD;
}
.card[data-type="visa"] input::-moz-placeholder, .card[data-type="mastercard"] input::-moz-placeholder{
  color: #DDD;
}
.card[data-type="visa"] input:-ms-placeholder, .card[data-type="mastercard"] input:-ms-placeholder{
  color: #DDD;
}
.card[data-type="visa"] .company{
  color: rgba(255,255,255,0.9);
font-style: italic;
text-shadow: 0px 0px 3px rgba(17,123,173,0.9);
}
.card[data-type="visa"] .side{
  background: #1db1cf;
}
.card[data-type="mastercard"] .side{
  background: #4d86ce;
}
.card[data-type="mastercard"] .company div{
  float: left;
width: 15px;
height: 15px;
border-radius: 10px;
background: rgba(239,209,57,0.8);
}
.card[data-type="mastercard"] .company div:first-child{
background: rgba(223,40,40,0.8);
margin-right: -5px;
}
.signature{
  background: #DDD;
  color: #000;
  padding: 10px;
}
.right{
  float: right;
}
.sig{
  font-family: "Allura";
}
.signature input.cc-cvc{
  color: #000;
  width: 40px;
}
.stripe{
  margin: 20px 0;
  height: 40px;
  background: #000;
}
.card .back{
  padding-top: 15px;
  transform: rotateY(-180deg);
}
.card.flip .back{
  transform: rotateX(0deg) rotateY(0deg);
}
.button{
  background: #0099CC;
  padding: 4px;
  color: #FFF;
  cursor: pointer;
  text-align: center;
  margin-top: 20px;
  margin-bottom: 20px;
  border-radius: 5px 5px;
}
.button:hover{
  background: #33B5E5;
}
.checkout{
  margin: 0 auto;
  width: 350px;
}
.addr input{
  width: 100%;
  outline: none;
  border: 0px solid;
  padding: 5px;
}
    </style>

  <script src="https://cdnjs.cloudflare.com/ajax/libs/prefixfree/1.0.7/prefixfree.min.js"></script>

</head>

<body>

 
 	 
   <div class="checkout">
  <h1>Checkout</h1>
  <p></p>
  
  <p>You don't have a card saved with us, so you'll need to add one now</p>
<form method="post" action="./PaymentController"> 
   Policy_id	 <input type=text" name="policy_id" value="<%=request.getParameter("x")%>" readonly="readonly"><br>
Payment Amount<input type=text" name="amount" value="<%=request.getParameter("y")%>" readonly="readonly"><br>


<label>PaymentMode</label><br>
			Card:<input name="paymentmode" type="radio" value="card"/>
			Other:<input name="paymentmode" type="radio" value="Other"/><br>
 


  <div class="card">
    <div class="front side">
      <span class="company">
        CARD
      </span>
      PAYMENT CARD
      <input type="number" placeholder="Card number" class="cardNo"  maxlength="15"  required pattern="[0-9\s]*"/>
      <div>
        Expires:
        <input type="number" placeholder="MM/YY" class="cc-exp"  maxlength="7" required pattern="[0-9\s]*" />
      </div>
    </div>
    <div class="stripe"></div>
      <div class="signature">
        <span class="right">
        CVC: <input type="number" placeholder="000" class="cvv" maxlength="4" />
        </span>
        <span class="sig">
          our lovely customer
        </span>
      </div>
    </div>
    <div class="back side">
      <div class="stripe"></div>
      <div class="signature">
        <span class="right">
        CVC: <input type="number" placeholder="000" class="cvv" maxlength="3" required pattern="[0-9\s]*"/>
        </span>
        <span class="sig">
          our lovely customer
        </span>
      </div>
    </div>
  </div>

  
  <!-- <div class="button flip">
    Flip over
  </div> -->
  <!-- <p>Now, where to send it?</p>
   <div class="addr">
   <input type="text" placeholder="Address Line 1" />
    <input type="text" placeholder="Address Line 2" />
    <input type="text" placeholder="Town" />
    <input type="text" placeholder="Postcode" />
    <input type="text" placeholder="Country" /> -->
   </div> 
<!--    <div class="button">
    Continue
  </div>  -->
 
  <input data-enhanced="true" type="submit" value="Submit" id="button-1"/>
 </form> 
   <div class="credit">

</div>

  <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<script src='http://stripe.github.io/jquery.payment/lib/jquery.payment.js'></script>

    <script>$('input.cc-num').payment('formatCardNumber').on("keyup change", function(){
    	  var type = $.payment.cardType( $(this).val() );
    	  if(type == "visa"){
    	    $(".company").html("VISA");
    	    $(".card").attr("data-type", "visa");
    	  } else if(type == "mastercard"){
    	    $(".company").html("<div></div><div></div>");
    	    $(".card").attr("data-type", "mastercard");
    	  }else{
    	    $(".card").attr("data-type", "unknown");
    	    $(".company").html("CARD");
    	  }
    	});
    	$('input.cc-exp').payment('formatCardExpiry');
    	$('input.cc-cvc').payment('formatCardCVC');
    	$(".button.flip").click(function(){
    	  $(".card").toggleClass("flip");
    	});</script>

</body>
</html>
