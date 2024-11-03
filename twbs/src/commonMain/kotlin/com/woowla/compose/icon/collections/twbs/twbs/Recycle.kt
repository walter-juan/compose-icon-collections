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

public val Twbs.Recycle: ImageVector
    get() {
        if (_recycle != null) {
            return _recycle!!
        }
        _recycle = Builder(name = "Recycle", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.302f, 1.256f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.604f, 0.0f)
                lineToRelative(-1.704f, 2.98f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.869f, 0.497f)
                lineToRelative(1.703f, -2.981f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.868f, 0.0f)
                lineToRelative(2.54f, 4.444f)
                lineToRelative(-1.256f, -0.337f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.26f, 0.966f)
                lineToRelative(2.415f, 0.647f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.613f, -0.353f)
                lineToRelative(0.647f, -2.415f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.966f, -0.259f)
                lineToRelative(-0.333f, 1.242f)
                close()
                moveTo(2.973f, 7.773f)
                lineToRelative(-1.255f, 0.337f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.26f, -0.966f)
                lineToRelative(2.416f, -0.647f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.612f, 0.353f)
                lineToRelative(0.647f, 2.415f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.966f, 0.259f)
                lineToRelative(-0.333f, -1.242f)
                lineToRelative(-2.545f, 4.454f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.434f, 0.748f)
                lineTo(5.0f, 13.484f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(1.723f, 14.484f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 0.421f, 12.24f)
                close()
                moveTo(13.863f, 9.236f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.868f, 0.496f)
                lineToRelative(1.716f, 3.004f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.434f, 0.748f)
                horizontalLineToRelative(-5.57f)
                lineToRelative(0.647f, -0.646f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.708f, -0.707f)
                lineToRelative(-1.5f, 1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 0.707f)
                lineToRelative(1.5f, 1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.708f, -0.707f)
                lineToRelative(-0.647f, -0.647f)
                horizontalLineToRelative(5.57f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.302f, -2.244f)
                close()
            }
        }
        .build()
        return _recycle!!
    }

private var _recycle: ImageVector? = null
