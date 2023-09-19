# Clock signal
set_property -dict {PACKAGE_PIN E3 IOSTANDARD LVCMOS33} [get_ports clock]
create_clock -add -name sys_clk_pin -period 10.00 [get_ports clock]

set_property -dict { PACKAGE_PIN J15   IOSTANDARD LVCMOS33 } [get_ports reset]; #IO_L24N_T3_RS0_15 Sch=sw[0]

##Switches

#set_property -dict { PACKAGE_PIN J15   IOSTANDARD LVCMOS33 } [get_ports { io_active }]; #IO_L24N_T3_RS0_15 Sch=sw[0]

# 7-segment display pins
set_property -dict {PACKAGE_PIN T10 IOSTANDARD LVCMOS33} [get_ports {io_seg[0]}]
set_property -dict {PACKAGE_PIN R10 IOSTANDARD LVCMOS33} [get_ports {io_seg[1]}]
set_property -dict {PACKAGE_PIN K16 IOSTANDARD LVCMOS33} [get_ports {io_seg[2]}]
set_property -dict {PACKAGE_PIN K13 IOSTANDARD LVCMOS33} [get_ports {io_seg[3]}]
set_property -dict {PACKAGE_PIN P15 IOSTANDARD LVCMOS33} [get_ports {io_seg[4]}]
set_property -dict {PACKAGE_PIN T11 IOSTANDARD LVCMOS33} [get_ports {io_seg[5]}]
set_property -dict {PACKAGE_PIN L18 IOSTANDARD LVCMOS33} [get_ports {io_seg[6]}]

set_property -dict { PACKAGE_PIN H15   IOSTANDARD LVCMOS33 } [get_ports { io_dp }]; #IO_L19N_T3_A21_VREF_15 Sch=dp

# Anode (common anode 7-segment display)
set_property -dict {PACKAGE_PIN J17 IOSTANDARD LVCMOS33} [get_ports {io_an[0]}]
set_property -dict {PACKAGE_PIN J18 IOSTANDARD LVCMOS33} [get_ports {io_an[1]}]
set_property -dict {PACKAGE_PIN T9 IOSTANDARD LVCMOS33}  [get_ports {io_an[2]}]
set_property -dict {PACKAGE_PIN J14 IOSTANDARD LVCMOS33} [get_ports {io_an[3]}]
set_property -dict {PACKAGE_PIN P14 IOSTANDARD LVCMOS33} [get_ports {io_an[4]}]
set_property -dict {PACKAGE_PIN T14 IOSTANDARD LVCMOS33} [get_ports {io_an[5]}]
set_property -dict {PACKAGE_PIN K2 IOSTANDARD LVCMOS33}  [get_ports {io_an[6]}]
set_property -dict {PACKAGE_PIN U13 IOSTANDARD LVCMOS33} [get_ports {io_an[7]}]