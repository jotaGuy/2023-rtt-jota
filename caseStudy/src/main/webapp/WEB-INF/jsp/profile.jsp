<!DOCTYPE html>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE-edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0,maximum-scale=1.0, user-scalable=no">
    <title>User Profile</title>
    <link rel="stylesheet" href="../../pub/css/screens/home-screen.css" />
    <link rel="stylesheet" href="../../pub/css/screens/profile-screen.css" />
</head>
<body>
<div class="head-container">
    <div class="title-container">
        <h1 class="page-title">Profile</h1>
    </div>
    <div class="nav-container">
        <ul class="nav-list">
            <li class="nav-link">
                <a href="/index">Home |</a>
            </li>
            <li class="nav-link">
                <a href="/profile">Profile |</a>
            </li>
            <li class="nav-link">
                <a href="./messages.html">Direct Messages |</a>
            </li>
            <li class="nav-link">
                <a href="./friends-list.html">Friends List</a>
            </li>
        </ul>
    </div>
</div>
<div class="body-container">
    <div class="user-data">
        <h2 style="text-align: center; justify-content: center;">User Information</h2>
        <div class="user-insight">
            <h4 class="user-insight-title">
                <u>User Stats</u>
            </h4>
            <ul class="user-insight-list">
                <!-- each list child will append a child with the value response -->
                <div>
                    <li class="friends insight-list">Friends: 10</li>
                </div>
                <div class="">
                    <li class="dm insight-list">Private Messages: 20</li>
                </div>
                <div>
                    <li class="unread-dm insight-list">Unread Messages: 30</li>
                </div>
                <div>
                    <li class="group-chat insight-list">
                        Total Messages in Group Chat: 40
                    </li>
                </div>
            </ul>
        </div>
        <div class="user-details">
            <h4 class="user-insight-title">
                <u>User Details</u>
            </h4>
            <ul class="user-personal-details">
                <!-- each list child will append a child with the value response -->
                <div class="user-list user-first-name" id="firstname">
                    First Name:
                </div>
                <div class="user-list user-last-name" id="lastname">Last Name:</div>
                <div class="user-list user-name" id="username">User Name:</div>
                <div class="user-list user-email" id="email">Email:</div>
                <div class="user-list user-phone" id="phonenumber">
                    Phone Number:
                </div>
            </ul>
        </div>
    </div>
    <div class="edit">
        <a href="./update-profile.html">
            <button id="editButton">Edit Profile</button>
        </a>
    </div>
</div>
<!-- external script -->
<script src="../../script/profile.js"></script>
<script>
    // Check if there are no parameters in the URL
    if (window.location.search.length === 0) {
        // Update the button text to "Edit" instead of "Edit Profile"
        document.getElementById('editButton').innerText = 'Add details';
    }
</script>
</body>

</html>