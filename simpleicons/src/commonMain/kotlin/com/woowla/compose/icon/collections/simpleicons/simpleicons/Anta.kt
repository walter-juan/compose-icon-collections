package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Anta: ImageVector
    get() {
        if (_anta != null) {
            return _anta!!
        }
        _anta = Builder(name = "Anta", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 15.237f)
                arcToRelative(20.744f, 20.744f, 0.0f, false, false, -9.86f, -7.509f)
                arcToRelative(31.266f, 31.266f, 0.0f, false, true, 6.91f, 1.013f)
                lineToRelative(-1.554f, -1.319f)
                arcTo(29.161f, 29.161f, 0.0f, false, false, 9.05f, 5.509f)
                arcToRelative(29.08f, 29.08f, 0.0f, false, false, -6.405f, 0.704f)
                lineTo(0.0f, 8.032f)
                curveToRelative(0.335f, 0.0f, 0.838f, -0.021f, 1.175f, -0.021f)
                arcToRelative(25.154f, 25.154f, 0.0f, false, true, 20.457f, 10.48f)
                close()
                moveTo(9.196f, 12.976f)
                horizontalLineToRelative(3.333f)
                lineToRelative(-0.333f, 1.183f)
                horizontalLineToRelative(-1.053f)
                lineTo(9.933f, 18.491f)
                lineTo(8.769f, 18.491f)
                lineToRelative(1.206f, -4.332f)
                lineTo(8.866f, 14.159f)
                close()
                moveTo(5.425f, 12.976f)
                lineTo(6.468f, 12.976f)
                lineToRelative(0.438f, 2.954f)
                lineToRelative(0.823f, -2.954f)
                horizontalLineToRelative(1.198f)
                lineToRelative(-1.537f, 5.515f)
                lineTo(6.221f, 18.491f)
                lineToRelative(-0.404f, -2.743f)
                lineToRelative(-0.764f, 2.743f)
                lineTo(3.884f, 18.491f)
                close()
                moveTo(0.0f, 18.491f)
                lineToRelative(2.822f, -5.513f)
                horizontalLineToRelative(1.181f)
                lineTo(3.769f, 18.491f)
                lineTo(2.584f, 18.491f)
                lineToRelative(0.054f, -0.739f)
                lineTo(1.526f, 17.752f)
                lineToRelative(-0.36f, 0.739f)
                close()
                moveTo(2.021f, 16.607f)
                horizontalLineToRelative(0.689f)
                lineToRelative(0.209f, -1.947f)
                close()
                moveTo(10.233f, 18.491f)
                lineTo(13.062f, 12.978f)
                horizontalLineToRelative(1.177f)
                lineToRelative(-0.235f, 5.513f)
                horizontalLineToRelative(-1.181f)
                lineToRelative(0.052f, -0.739f)
                horizontalLineToRelative(-1.108f)
                lineToRelative(-0.364f, 0.739f)
                close()
                moveTo(12.258f, 16.607f)
                horizontalLineToRelative(0.689f)
                lineToRelative(0.209f, -1.947f)
                close()
            }
        }
        .build()
        return _anta!!
    }

private var _anta: ImageVector? = null
