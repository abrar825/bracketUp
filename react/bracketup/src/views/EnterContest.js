import { Input, Box, HStack, VStack } from "@chakra-ui/react";
import Header from "../components/Header";
import { Picks, ElimPicks } from "../components/PickSubmission";

function EnterContest() {
  const teams = [
    ["NED", "SEN", "QAT", "ECU"],
    ["ENG", "IRN", "WAL", "USA"],
    ["ARG", "KSA", "MEX", "POL"],
  ];
  return (
    <Box bg="blackAlpha.50" bgSize="100%">
      <Header></Header>
      <Input placeholder="Enter a Name!" size="sm" width="200px" m={4}></Input>
      <HStack spacing={7} m={4}>
        <VStack>
          <Picks teams={teams[0]}></Picks>
          <ElimPicks teams={teams[0]}></ElimPicks>
          <ElimPicks teams={teams[0]}></ElimPicks>
        </VStack>
        <VStack>
          <Picks teams={teams[1]}></Picks>
          <ElimPicks teams={teams[1]}></ElimPicks>
          <ElimPicks teams={teams[1]}></ElimPicks>
        </VStack>
        <VStack>
          <Picks teams={teams[2]}></Picks>
          <ElimPicks teams={teams[2]}></ElimPicks>
          <ElimPicks teams={teams[2]}></ElimPicks>
        </VStack>
      </HStack>
    </Box>
  );
}

export default EnterContest;
