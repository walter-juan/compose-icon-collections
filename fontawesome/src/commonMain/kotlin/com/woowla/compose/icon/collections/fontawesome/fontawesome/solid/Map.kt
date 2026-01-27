package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.Map: ImageVector
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
                curveToRelative(0.0f, -11.1f, -5.7f, -21.4f, -15.2f, -27.2f)
                reflectiveCurveToRelative(-21.2f, -6.4f, -31.1f, -1.4f)
                lineTo(349.5f, 77.5f)
                lineTo(170.1f, 17.6f)
                curveToRelative(-8.1f, -2.7f, -16.8f, -2.1f, -24.4f, 1.7f)
                lineToRelative(-128.0f, 64.0f)
                curveTo(6.8f, 88.8f, 0.0f, 99.9f, 0.0f, 112.0f)
                lineTo(0.0f, 464.0f)
                curveToRelative(0.0f, 11.1f, 5.7f, 21.4f, 15.2f, 27.2f)
                reflectiveCurveToRelative(21.2f, 6.4f, 31.1f, 1.4f)
                lineToRelative(116.1f, -58.1f)
                lineToRelative(179.4f, 59.8f)
                curveToRelative(8.1f, 2.7f, 16.8f, 2.1f, 24.4f, -1.7f)
                lineToRelative(128.0f, -64.0f)
                curveToRelative(10.8f, -5.4f, 17.7f, -16.5f, 17.7f, -28.6f)
                lineToRelative(0.0f, -352.0f)
                close()
                moveTo(192.0f, 376.9f)
                lineToRelative(0.0f, -284.5f)
                lineToRelative(128.0f, 42.7f)
                lineToRelative(0.0f, 284.5f)
                lineToRelative(-128.0f, -42.7f)
                close()
            }
        }
        .build()
        return _map!!
    }

private var _map: ImageVector? = null
