<!DOCTYPE html>
<html lang="en">
<head>
    <title>Group Chat</title>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE-edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0,maximum-scale=1.0, user-scalable=no">
    <link rel="stylesheet" href="../../pub/css/nav-style.css" />
    <title>User Profile</title>
</head>
<!-- style -->
<style>
    .head-container {
        width: 100%;
        background-color: #f0f0f0;
        padding: 10px;
        box-sizing: border-box;
        display: flex;
        flex-direction: column;
        justify-content: space-between;
        align-items: center;
    }
</style>
<body>
<div class="head-container">
    <div class="title-container">
        <h1 class="page-title">Messages</h1>
    </div>
    <div class="nav-container">
        <div class="icon-container">
            <span class="icon"><i class="fas fa-bars fa-2x"></i></span>
            <div class="nav-list">
                <div class="nav-link">
                    <a href="/">Home</a>
                </div>
                <div class="nav-link">
                    <a href="profile">Profile</a>
                </div>
        </div>
    </div>
</div>
<!-- inline style -->
<div class="body-container">
    <div class="data-container">
        <div class="data-card-header">
            <h3>Data</h3>
        </div>
        <div class="data-list-continer">
            <ul class="data-list">
                <li class="data-point total-messages">
                    Messages - 100
                    <div class="messages dot"></div>
                    |
                </li>
                <li class="data-point total-users">
                    Users - 62
                    <div class="users dot"></div>
                    |
                </li>
                <li class="data-point user-messages">
                    Your Sent Message- 18
                    <div class="sent-messages dot"></div>
                    |
                </li>
                <li class="data-point total-friends">
                    Number of friends - 7
                    <div class="friend dot"></div>
                </li>
            </ul>
        </div>
    </div>
    <div class="card-container">
        <div class="card card-header">
            <h3>World Chat</h3>
        </div>
        <div class="card card-body"></div>
        <div class="card card-footer">
            <form action="${pageContext.request.contextPath}/sendMessage" method="post"> <!-- Specify the action and method -->
                <label for="group-message"></label>
                <textarea name="message" id="group-message" class="message-box" rows="2" cols="30">Enter Message</textarea>
                <input type="submit" class="send-button" value="Submit" />
            </form>
        </div>
    </div>
</div>
</body>
</html>
