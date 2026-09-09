<?php
require_once "KartuParkir.php";

$kartu = new KartuParkir("KP001", "Motor");

echo "=== KARTU PARKIR ===\n";
$kartu->cekStatus();

$kartu->masuk();
$kartu->cekStatus();

try {
    $kartu->masuk();
} catch (Exception $e) {
    echo "Error: " . $e->getMessage() . "\n";
}

$kartu->keluar();

try {
    $kartu->keluar();
} catch (Exception $e) {
    echo "Error: " . $e->getMessage() . "\n";
}