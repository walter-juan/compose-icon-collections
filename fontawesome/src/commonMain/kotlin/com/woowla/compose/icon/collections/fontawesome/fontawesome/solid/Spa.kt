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

public val SolidGroup.Spa: ImageVector
    get() {
        if (_spa != null) {
            return _spa!!
        }
        _spa = Builder(name = "Spa", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(169.7f, 227.5f)
                curveToRelative(34.3f, 18.7f, 64.5f, 44.1f, 88.8f, 74.5f)
                curveToRelative(11.1f, 13.9f, 21.0f, 28.9f, 29.4f, 44.8f)
                curveToRelative(8.5f, -15.9f, 18.3f, -30.8f, 29.4f, -44.8f)
                curveToRelative(24.3f, -30.5f, 54.5f, -55.9f, 88.8f, -74.5f)
                curveToRelative(41.7f, -22.7f, 89.4f, -35.5f, 139.7f, -35.5f)
                lineToRelative(9.9f, 0.0f)
                curveToRelative(11.1f, 0.0f, 20.1f, 9.0f, 20.1f, 20.1f)
                curveToRelative(0.0f, 148.0f, -119.9f, 267.9f, -267.9f, 267.9f)
                lineToRelative(-40.2f, 0.0f)
                curveTo(119.9f, 480.0f, 0.0f, 360.1f, 0.0f, 212.1f)
                curveTo(0.0f, 201.0f, 9.0f, 192.0f, 20.1f, 192.0f)
                lineToRelative(9.9f, 0.0f)
                curveToRelative(50.4f, 0.0f, 98.1f, 12.8f, 139.7f, 35.5f)
                close()
                moveTo(303.9f, 38.0f)
                curveToRelative(16.9f, 15.9f, 61.4f, 63.4f, 89.0f, 142.3f)
                curveToRelative(-40.1f, 20.2f, -75.8f, 48.2f, -104.9f, 82.1f)
                curveToRelative(-29.2f, -33.9f, -64.8f, -61.8f, -104.9f, -82.1f)
                curveToRelative(27.6f, -78.9f, 72.2f, -126.4f, 89.0f, -142.3f)
                curveToRelative(4.3f, -4.1f, 10.0f, -6.0f, 15.9f, -6.0f)
                reflectiveCurveToRelative(11.6f, 2.0f, 15.9f, 6.0f)
                close()
            }
        }
        .build()
        return _spa!!
    }

private var _spa: ImageVector? = null
