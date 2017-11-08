
function menuManage()
{
	var x=document.getElementById('menu');
	if(x.style.display=="none")
	{
		x.style.display="block";
	}
	else
	{
		x.style.display="none";
	}
}


function loginManage()
{
	var x=document.getElementById('login_interface');
	if(x.style.display=="none")
	{
		x.style.display="block";
	}
	else
	{
		x.style.display="none";
	}
}

function openLoginModal()
{
		$("#loginModal").fadeToggle("fast");
}

function toggleMenu()
{
	$("#menu").fadeToggle("fast");
}