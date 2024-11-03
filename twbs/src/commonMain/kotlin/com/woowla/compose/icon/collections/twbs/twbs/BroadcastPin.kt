package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.BroadcastPin: ImageVector
    get() {
        if (_broadcastPin != null) {
            return _broadcastPin!!
        }
        _broadcastPin = Builder(name = "BroadcastPin", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.05f, 3.05f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 0.0f, 9.9f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.707f, 0.707f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -11.314f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.707f, 0.707f)
                moveToRelative(2.122f, 2.122f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 5.656f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.708f, 0.708f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.0f, -7.072f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.708f, 0.708f)
                moveToRelative(5.656f, -0.708f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.708f, 0.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.0f, 7.072f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.708f, -0.708f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -5.656f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -0.708f)
                moveToRelative(2.122f, -2.12f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.707f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.313f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.707f, -0.707f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 0.0f, -9.9f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -0.707f)
                close()
                moveTo(6.0f, 8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.5f, 1.937f)
                verticalLineTo(15.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                verticalLineTo(9.937f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 8.0f)
            }
        }
        .build()
        return _broadcastPin!!
    }

private var _broadcastPin: ImageVector? = null
