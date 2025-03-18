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

public val Simpleicons.Open3d: ImageVector
    get() {
        if (_open3d != null) {
            return _open3d!!
        }
        _open3d = Builder(name = "Open3d", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.998f, 1.606f)
                lineTo(0.0f, 12.0f)
                lineToRelative(5.998f, 10.394f)
                horizontalLineToRelative(2.094f)
                lineToRelative(1.954f, -3.383f)
                lineTo(7.952f, 19.011f)
                lineTo(4.06f, 12.268f)
                horizontalLineToRelative(8.149f)
                lineToRelative(3.56f, 6.157f)
                lineTo(19.483f, 12.0f)
                lineToRelative(-3.715f, -6.444f)
                lineToRelative(-3.56f, 6.18f)
                lineTo(4.055f, 11.736f)
                lineToRelative(3.893f, -6.747f)
                horizontalLineToRelative(2.098f)
                lineTo(8.088f, 1.606f)
                close()
                moveTo(8.708f, 1.606f)
                lineTo(10.662f, 4.989f)
                horizontalLineToRelative(5.386f)
                lineTo(20.096f, 12.0f)
                lineToRelative(-4.044f, 7.011f)
                horizontalLineToRelative(-5.394f)
                lineToRelative(-1.954f, 3.383f)
                horizontalLineToRelative(9.294f)
                lineToRelative(0.488f, -0.847f)
                lineTo(24.0f, 12.0f)
                lineTo(18.002f, 1.606f)
                close()
            }
        }
        .build()
        return _open3d!!
    }

private var _open3d: ImageVector? = null
