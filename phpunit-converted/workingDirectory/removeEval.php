<?php

// grep -r "eval(" .
// grep -r "eval222(" .

$files = Array();
$files[] = __DIR__."/vendor/phpunit/phpunit-mock-objects/src/Generator.php";
$files[] = __DIR__."/vendor/phpunit/phpunit/tests/_files/FatalTest.php";
$files[] = __DIR__."/vendor/phpunit/phpunit/src/Util/PHP/eval-stdin.php";
$files[] = __DIR__."/vendor/phpspec/prophecy/src/Prophecy/Doubler/Generator/ClassCreator.php";
$files[] = __DIR__."/vendor/phpspec/prophecy/src/Prophecy/Prophecy/MethodProphecy.php";
$files[] = __DIR__."/vendor/phpunit/phpunit/src/Framework/TestCase.php";

$old = "eval(";
$new = "eval222(";

$a = $argv[1];
if ($a == "on"){
    $search = $new;
    $replace = $old;
} else if ($a == "off") {
    $search = $old;
    $replace = $new;
} else {
    echo "arg1 should be on/off (was $a)\n";
    exit();
}

foreach ($files as $file){
    $contents = file_get_contents($file);
    if (!$contents){
        echo "no contents $file";exit();
    }
    $contents = str_replace($search, $replace, $contents);
    if (!$contents){
        echo "no contents v2 $file";exit();
    }
    file_put_contents($file, $contents);
}
