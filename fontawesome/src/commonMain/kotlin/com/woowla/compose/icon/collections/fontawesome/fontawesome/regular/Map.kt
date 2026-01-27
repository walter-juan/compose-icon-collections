package com.woowla.compose.icon.collections.fontawesome.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.RegularGroup

public val RegularGroup.Map: ImageVector
    get() {
        if (_map != null) {
            return _map!!
        }
        _map = Builder(name = "Map", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(512.0f, 48.0f)
                curveToRelative(0.0f, -8.3f, -4.3f, -16.0f, -11.3f, -20.4f)
                reflectiveCurveToRelative(-15.9f, -4.8f, -23.3f, -1.1f)
                lineTo(352.5f, 88.1f)
                lineTo(180.0f, 29.4f)
                curveToRelative(-13.7f, -4.7f, -28.7f, -3.8f, -41.9f, 2.3f)
                lineTo(13.8f, 90.3f)
                curveTo(5.4f, 94.2f, 0.0f, 102.7f, 0.0f, 112.0f)
                lineTo(0.0f, 464.0f)
                curveToRelative(0.0f, 8.2f, 4.2f, 15.9f, 11.1f, 20.3f)
                reflectiveCurveToRelative(15.6f, 4.9f, 23.1f, 1.4f)
                lineToRelative(127.3f, -59.9f)
                lineToRelative(170.7f, 56.9f)
                curveToRelative(13.7f, 4.6f, 28.5f, 3.7f, 41.6f, -2.5f)
                lineToRelative(124.4f, -58.5f)
                curveToRelative(8.4f, -4.0f, 13.8f, -12.4f, 13.8f, -21.7f)
                lineToRelative(0.0f, -352.0f)
                close()
                moveTo(144.0f, 82.1f)
                lineToRelative(0.0f, 299.0f)
                lineToRelative(-96.0f, 45.2f)
                lineToRelative(0.0f, -299.0f)
                lineToRelative(96.0f, -45.2f)
                close()
                moveTo(192.0f, 385.4f)
                lineToRelative(0.0f, -301.1f)
                lineToRelative(128.0f, 43.5f)
                lineToRelative(0.0f, 300.3f)
                lineToRelative(-128.0f, -42.7f)
                close()
                moveTo(368.0f, 134.0f)
                lineToRelative(96.0f, -47.4f)
                lineToRelative(0.0f, 298.2f)
                lineToRelative(-96.0f, 45.2f)
                lineToRelative(0.0f, -296.0f)
                close()
            }
        }
        .build()
        return _map!!
    }

private var _map: ImageVector? = null
