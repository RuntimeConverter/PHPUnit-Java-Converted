<?php
declare(strict_types=1);

use PHPUnit\Framework\TestCase;

final class MockTest extends TestCase
{
    public function testMock1Pass(): void
    {
        $testedUnit = $this->getMockBuilder(MockTestObj::class)->setMethods(Array("testMethod"))->getMock();
	$testedUnit->expects($this->once())->method('testMethod');
	$a = $testedUnit->testMethod();
	$this->assertNull($a);
    }

    public function testMock1Fail(): void
    {
        $testedUnit = $this->getMockBuilder(MockTestObj::class)->setMethods(Array("testMethod"))->getMock();
        $testedUnit->expects($this->once())->method('testMethod');
    }
}
