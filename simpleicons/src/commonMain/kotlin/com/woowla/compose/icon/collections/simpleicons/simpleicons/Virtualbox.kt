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

public val Simpleicons.Virtualbox: ImageVector
    get() {
        if (_virtualbox != null) {
            return _virtualbox!!
        }
        _virtualbox = Builder(name = "Virtualbox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 1.758f)
                lineTo(5.182f, 20.0f)
                curveToRelative(0.129f, 0.455f, 0.25f, 0.691f, 0.421f, 0.945f)
                curveToRelative(0.063f, 0.092f, 0.13f, 0.179f, 0.202f, 0.264f)
                curveToRelative(0.173f, 0.204f, 0.37f, 0.378f, 0.59f, 0.525f)
                curveToRelative(0.243f, 0.163f, 0.49f, 0.286f, 0.763f, 0.371f)
                curveToRelative(0.324f, 0.1f, 0.61f, 0.137f, 0.99f, 0.137f)
                horizontalLineToRelative(4.327f)
                lineToRelative(1.918f, -6.615f)
                horizontalLineToRelative(6.798f)
                verticalLineToRelative(3.699f)
                arcToRelative(0.11f, 0.11f, 0.0f, false, true, -0.109f, 0.11f)
                horizontalLineToRelative(-4.88f)
                lineToRelative(-0.813f, 2.806f)
                horizontalLineToRelative(5.654f)
                arcToRelative(2.92f, 2.92f, 0.0f, false, false, 1.95f, -0.725f)
                arcTo(2.903f, 2.903f, 0.0f, false, false, 24.0f, 19.285f)
                verticalLineToRelative(-6.47f)
                lineTo(12.28f, 12.815f)
                lineToRelative(-1.919f, 6.614f)
                lineTo(7.937f, 19.429f)
                lineTo(3.715f, 4.564f)
                horizontalLineToRelative(2.922f)
                lineToRelative(1.546f, 5.444f)
                lineTo(11.1f, 10.008f)
                lineToRelative(-2.343f, -8.25f)
                close()
                moveTo(15.496f, 1.758f)
                lineTo(13.096f, 10.008f)
                lineTo(24.0f, 10.008f)
                verticalLineToRelative(-5.29f)
                arcToRelative(2.962f, 2.962f, 0.0f, false, false, -1.825f, -2.741f)
                arcToRelative(3.044f, 3.044f, 0.0f, false, false, -1.129f, -0.22f)
                close()
                moveTo(17.606f, 4.564f)
                horizontalLineToRelative(3.476f)
                arcToRelative(0.11f, 0.11f, 0.0f, false, true, 0.11f, 0.112f)
                lineTo(21.192f, 7.2f)
                horizontalLineToRelative(-4.354f)
                close()
            }
        }
        .build()
        return _virtualbox!!
    }

private var _virtualbox: ImageVector? = null
