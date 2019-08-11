<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Example</title>

    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="https://code.getmdl.io/1.3.0/material.indigo-pink.min.css">
    <script defer src="https://code.getmdl.io/1.3.0/material.min.js"></script>
</head>

<body>
<!-- Always shows a header, even in smaller screens. -->
<div class="mdl-layout mdl-js-layout mdl-layout--fixed-header">
    <header class="mdl-layout__header">
        <div class="mdl-layout__header-row">
            <!-- Title -->
            <span class="mdl-layout-title">FreeMarker Ktor Demo</span>
            <!-- Add spacer, to align navigation to the right -->
            <div class="mdl-layout-spacer"></div>
            <!-- Navigation. We hide it in small screens. -->
            <nav class="mdl-navigation mdl-layout--large-screen-only">
<#--                <a class="mdl-navigation__link" href="">Link</a>-->
            </nav>
        </div>
    </header>
    <div class="mdl-layout__drawer">
        <span class="mdl-layout-title">Menu</span>
        <nav class="mdl-navigation">
<#--            <a class="mdl-navigation__link" href="">Link</a>-->
        </nav>
    </div>
    <main class="mdl-layout__content">
        <div class="page-content">
            <!-- Your content goes here -->
            <ul class='mdl-list'>
                <#list users as user>
                    <li class="mdl-list__item">${user.name} /  ${user.email} </li>
                </#list>
            </ul>
        </div>
    </main>
</div>


</body>
</html>

