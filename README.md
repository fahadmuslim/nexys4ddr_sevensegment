## Nexys 4 DDR Seven Segment Decoder and counter

## Seven Segment Decoder

The seven segment decoder verilog file can be obtained by executing the following comman:

sbt run

The printed values can be tested before the verilog code is ported onto the FPGA using the following command:

sbt "testOnly SevenSegDecoderSpec"

The FPGA porting can be done by using Vivado tool and the provided constraint file named as "sevenseg_nexys4ddr.xdc"

## Hex counter using Seven-Segment Display

The seven segment decoder used in the first case can now be used here to print the values produced by implementing a HEX up-counter using Nexys4 ddr board. After the verilog code is produced, it can be used in addition to the constraint file named "sevenseg-cnt_nexys4ddr.xdc" to implement it on the FPGA.

## Materials Used

Digital Design with Chisel by Martin Shoeberl

