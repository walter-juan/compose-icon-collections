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

public val Simpleicons.Nano: ImageVector
    get() {
        if (_nano != null) {
            return _nano!!
        }
        _nano = Builder(name = "Nano", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.723f, 0.0f)
                lineToRelative(6.875f, 10.76f)
                lineTo(4.775f, 10.76f)
                verticalLineToRelative(1.365f)
                horizontalLineToRelative(5.881f)
                lineToRelative(-1.76f, 2.73f)
                horizontalLineToRelative(-4.12f)
                verticalLineToRelative(1.364f)
                horizontalLineToRelative(3.242f)
                lineTo(3.006f, 24.0f)
                horizontalLineToRelative(1.85f)
                lineToRelative(5.068f, -7.781f)
                horizontalLineToRelative(4.215f)
                lineTo(19.129f, 24.0f)
                horizontalLineToRelative(1.865f)
                lineToRelative(-4.941f, -7.781f)
                horizontalLineToRelative(3.232f)
                verticalLineToRelative(-1.364f)
                horizontalLineToRelative(-4.1f)
                lineToRelative(-1.732f, -2.73f)
                horizontalLineToRelative(5.832f)
                lineTo(19.285f, 10.76f)
                horizontalLineToRelative(-5.803f)
                lineTo(20.45f, 0.0f)
                horizontalLineToRelative(-1.785f)
                lineToRelative(-6.588f, 10.107f)
                lineTo(5.627f, 0.0f)
                lineTo(3.723f, 0.0f)
                close()
                moveTo(12.047f, 12.959f)
                lineTo(13.264f, 14.855f)
                horizontalLineToRelative(-2.451f)
                lineToRelative(1.234f, -1.896f)
                close()
            }
        }
        .build()
        return _nano!!
    }

private var _nano: ImageVector? = null
