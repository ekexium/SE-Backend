package com.oldpig

//#json-support
import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport
import spray.json.DefaultJsonProtocol

trait JsonSupport extends SprayJsonSupport {
	// import the default encoders for primitive types (Int, String, Lists etc)
	import DefaultJsonProtocol._

//	implicit val userJsonFormat: RootJsonFormat[User] = jsonFormat3(User)
//	implicit val usersJsonFormat: RootJsonFormat[Users] = jsonFormat1(Users)
//	implicit val actionPerformedJsonFormat: RootJsonFormat[ActionPerformed] = jsonFormat1(ActionPerformed)

	implicit val userInfoFormat = jsonFormat7(UserInfo)
	implicit val idForamt = jsonFormat1(Id)
	implicit val registerInfoFormat = jsonFormat8(RegisterInfo)
	implicit val patchResultFormat = jsonFormat1(PatchResult)
	implicit val userPatchInfoFormat= jsonFormat5(UserPatchInfo)
	implicit val loginInfoFormat = jsonFormat2(LoginInfo)
	implicit val orderInfoFormat = jsonFormat6(OrderInfo)
	implicit val orderDeleteInfoFormat = jsonFormat4(OrderDeleteInfo)
	implicit val orderQueryInfoFormat = jsonFormat5(OrderQueryInfo)
	implicit val orderQueryResultFormat = jsonFormat6(OrderQueryResult)
	implicit val orderQueryResultsFormat = jsonFormat1(OrderQueryResults)
	implicit val fundChangeInfoFormat = jsonFormat3(FundChangeInfo)
	implicit val chatPostInfoFormat = jsonFormat2(ChatPostInfo)
	implicit val messageFormat = jsonFormat5(Message)
	implicit val chatInfoFormat = jsonFormat4(ChatInfo)
	implicit val chatListFormat = jsonFormat1(ChatList)
	implicit val chatRecordsFormat = jsonFormat1(ChatRecords)
	implicit val locationFormat = jsonFormat3(Location)
	implicit val itemFormat = jsonFormat12(Item)
	implicit val itemsListFormat = jsonFormat1(ItemsList)
	implicit val searchInfo = jsonFormat6(SearchInfo)
//	implicit val itemPostInfoFormat = jsonFormat10(ItemPostInfo)
	implicit val itemDeleteInfoFormat = jsonFormat1(ItemDeleteInfo)
}
//#json-support
