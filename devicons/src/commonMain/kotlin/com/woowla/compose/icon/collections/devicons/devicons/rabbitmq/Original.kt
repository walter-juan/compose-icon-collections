package com.woowla.compose.icon.collections.devicons.devicons.rabbitmq

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.RabbitmqGroup

public val RabbitmqGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFff6600)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(119.52f, 51.19f)
                lineTo(79.29f, 51.19f)
                arcToRelative(3.64f, 3.64f, 0.0f, false, true, -3.64f, -3.64f)
                lineTo(75.65f, 5.62f)
                arcTo(5.61f, 5.61f, 0.0f, false, false, 70.03f, 0.0f)
                lineTo(55.66f, 0.0f)
                arcToRelative(5.61f, 5.61f, 0.0f, false, false, -5.63f, 5.62f)
                verticalLineToRelative(41.65f)
                arcToRelative(3.91f, 3.91f, 0.0f, false, true, -3.92f, 3.92f)
                lineToRelative(-13.19f, 0.05f)
                curveToRelative(-2.18f, 0.0f, -3.97f, -1.75f, -3.93f, -3.93f)
                lineToRelative(0.09f, -41.69f)
                arcTo(5.61f, 5.61f, 0.0f, false, false, 23.47f, 0.0f)
                lineTo(9.1f, 0.0f)
                arcToRelative(5.61f, 5.61f, 0.0f, false, false, -5.63f, 5.63f)
                lineTo(3.47f, 122.99f)
                curveToRelative(0.0f, 2.74f, 2.22f, 5.01f, 5.01f, 5.01f)
                horizontalLineToRelative(111.03f)
                arcToRelative(5.01f, 5.01f, 0.0f, false, false, 5.01f, -5.01f)
                lineTo(124.53f, 56.19f)
                arcToRelative(4.97f, 4.97f, 0.0f, false, false, -5.01f, -5.01f)
                close()
                moveTo(100.66f, 95.24f)
                arcToRelative(6.55f, 6.55f, 0.0f, false, true, -6.53f, 6.52f)
                lineTo(82.79f, 101.77f)
                arcToRelative(6.55f, 6.55f, 0.0f, false, true, -6.52f, -6.52f)
                lineTo(76.27f, 83.9f)
                arcToRelative(6.55f, 6.55f, 0.0f, false, true, 6.52f, -6.52f)
                horizontalLineToRelative(11.34f)
                arcToRelative(6.55f, 6.55f, 0.0f, false, true, 6.53f, 6.52f)
                close()
                moveTo(100.66f, 95.24f)
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
