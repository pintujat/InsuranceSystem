<!DOCTYPE html>
<html>
<title>Insurance System</title>
<head>
<style>
.dropbtn {

    background-color: white;
    color: black;
    padding: 16px;
    font-size: 16px;
    border: none;
    cursor: pointer;
}
.dropdown {
    position: relative;
    display: inline-block;
}
.dropdown-content {
    display: none;
    position: absolute;
    background-color: pink;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
    z-index: 1;
}
.dropdown-content a {
    color: black;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
}
.dropdown-content a:hover {background-color: white}
.dropdown:hover .dropdown-content {
	 background-color: white;
    display: block;
}
.dropdown:hover .dropbtn {
    background-color: white;
}
</style>
</head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<body>
<div class="w3-top">
  <div class="dropbtn">
    <a href="adminhome.jsp" class="w3-bar-item w3-button"><b>Insurance</b> System</a>
 	<div class="dropdown">
	<button class="dropbtn">Claims</button>
 	<div class="dropdown-content">
  	<a href="ViewClaims.jsp" class="dropdown" >Claim Details</a>
     <a href="claimDetails.jsp" class="dropbtn">Add Claims</a>
     <a href="ClaimsUpdate.jsp" class="dropbtn">Edit Claims</a>
     <a href="ClaimsDelete.jsp" class="dropbtn">Delete Claim</a>
     </div>
     </div>
     <div class="dropdown">
     <button class="dropbtn">Insurance</button>
     <div class="dropdown-content">
     <a href="ViewInsurance.jsp" class="dropdown" >Insurance Details</a>
     <a href="InsuranceTypeInsert.jsp" class="dropbtn">Add Insurance</a>
     <a href="InsuranceDelete.jsp" class="dropbtn">Delete Insurance</a>
     </div>
     </div>
</div>
</div>


<!-- Header -->
<header class="w3-display-container w3-content w3-wide" style="max-width:1500px;" id="home">
  <img class="w3-image" src="D:\New folder\11.jpg" alt="INSURANCE" width="1500" height="800">
  <div class="w3-display-middle w3-margin-top w3-center">
    <h1 class="w3-xxlarge w3-text-white"><span class="w3-padding w3-black w3-opacity-min"><b>Insurance</b></span> <span class="w3-hide-small w3-text-light-grey">System</span></h1>
  </div>
</header>

<!-- Page content -->
<div class="w3-content w3-padding" style="max-width:1564px">

  
  <div class="w3-row-padding">
    <div class="w3-col l3 m6 w3-margin-bottom">
      <div class="w3-display-container">
        <div class="w3-display-topleft w3-black w3-padding">Car Policy</div>
        <img src="D:\New folder\car.jpg" alt="House" style="width:99%">
      </div>
    </div>
    <div class="w3-col l3 m6 w3-margin-bottom">
      <div class="w3-display-container">
        <div class="w3-display-topleft w3-black w3-padding">Home Policy</div>
        <img src="D:\New folder\house.jpg" alt="House" style="width:99%">
      </div>
    </div>
    <div class="w3-col l3 m6 w3-margin-bottom">
      <div class="w3-display-container">
        <div class="w3-display-topleft w3-black w3-padding">Health policy</div>
        <img src="D:\New folder\health.jpg" alt="House" style="width:99%">
      </div>
    </div>
    <div class="w3-col l3 m6 w3-margin-bottom">
      <div class="w3-display-container">
        <div class="w3-display-topleft w3-black w3-padding">Travel Policy</div>
        <img src="D:\New folder\travel.jpg" alt="House" style="width:99%">
      </div>
    </div>
  </div>

  <div class="w3-container w3-padding-32" id="about">
    <h3 class="w3-border-bottom w3-border-light-grey w3-padding-16">About</h3>
    <p>
    National Insurance Company Limited was incorporated on 6 December 1906 with its registered office in Kolkata. Consequent to passing of the General Insurance Business Nationalisation Act in 1972, 21 Foreign and 11 Indian Companies were merged with it and National became a subsidiary of General Insurance Corporation of India (GIC) which is fully owned by the Government of India. After the notification of the General Insurance Business and its India's largest General Insurance Company(Nationalisation) Amendment Act, on 7 August 2002, National has been de-linked from its holding company GIC and presently operates as an independent insurance company wholly owned by Govt of India. National Insurance Company Ltd (NIC) is one of the leading public sector insurance companies of India. It transacts non life insurance business. Headquartered in Kolkata, NIC's network of about 2000 offices, manned by more than 16,000 skilled personnels, is spread over the length and breadth of the country covering remote rural areas, townships and metropolitan cities. NIC's foreign operations are carried out from its branch offices in Nepal. Befittingly, the product ranges, of more than 200 policies offered by NIC cater to the diverse insurance requirements of its 14 million policyholders. Innovative and customised policies ensure that even specialised insurance requirements are fully taken care of. 
    </p>
  </div>




<!-- Footer -->
<footer class="w3-center w3-black w3-padding-16">
  <p>We Care for you</p>
</footer>



</body>
</html>
