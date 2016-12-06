<div class="well">Change of Address inputs</div>
<form method="post" action="">
	<div class="form-group">
		<label for="bankname">Bank Name</label> <input type="text"
			class="form-control" name="bankname" id="bankname">
	</div>
	<div class="form-group">
		<label for="branchname">Branch Name</label> <input type="text"
			class="form-control" name="branchname" id="branchname">
	</div>
	<div class="form-group">
		<label for="bankadd">Bank Address</label>
		<textarea rows="4" cols="50" class="form-control" name="bankadd"
			id="bankadd"></textarea>
	</div>
	<div class="form-group">
		<label for="actype">Type of Account</label> <select
			class="form-control" id="actype" name="actype">
			<option value="SB">Savings</option>
			<option value="CA">Current</option>
			<option value="TD">Fixed Deposit</option>
			<option value="RD">Recurring Deposit</option>
		</select>
	</div>
	<div class="form-group">
		<label for="acno">Account Number</label> <input type="text"
			class="form-control" name="acno" id="acno">
	</div>
	<div class="form-group">
		<label for="newadd">New Address</label>
		<textarea rows="4" cols="50" class="form-control" name="newadd"
			id="newadd"></textarea>
	</div>
	<div class="form-group">
		<label for="prooftype">Address Proof</label> <select
			class="form-control" id="prooftype" name="prooftype">
			<option value="passport">Passport</option>
			<option value="dl">Driving License</option>
			<option value="aadhar">Aadhar</option>
			<option value="voterid">Voter ID</option>
			<option value="ration">Ration Card</option>
			<option value="others">Others</option>
		</select>
	</div>	
	<div class="form-group">
		<label for="otheraddproof">Other Proof</label> <input type="text"
			class="form-control" name="otheraddproof" id="otheraddproof">
	</div>
	<div class="form-group">
		<label for="acholder">Account Holder's Name</label> <input type="text"
			class="form-control" name="acholder" id="acholder">
	</div>

</form>