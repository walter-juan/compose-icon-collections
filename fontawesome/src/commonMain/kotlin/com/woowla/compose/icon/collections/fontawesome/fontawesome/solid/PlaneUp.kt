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

public val SolidGroup.PlaneUp: ImageVector
    get() {
        if (_planeUp != null) {
            return _planeUp!!
        }
        _planeUp = Builder(name = "PlaneUp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 24.0f)
                curveToRelative(0.0f, -30.9f, 25.1f, -56.0f, 56.0f, -56.0f)
                reflectiveCurveToRelative(56.0f, 25.1f, 56.0f, 56.0f)
                lineToRelative(0.0f, 127.3f)
                lineToRelative(173.6f, 159.2f)
                curveToRelative(6.6f, 6.1f, 10.4f, 14.6f, 10.4f, 23.6f)
                lineToRelative(0.0f, 43.7f)
                curveToRelative(0.0f, 10.9f, -10.7f, 18.6f, -21.1f, 15.2f)
                lineToRelative(-162.9f, -54.3f)
                lineToRelative(0.0f, 99.7f)
                lineToRelative(66.0f, 52.8f)
                curveToRelative(3.8f, 3.0f, 6.0f, 7.6f, 6.0f, 12.5f)
                lineToRelative(0.0f, 19.8f)
                curveToRelative(0.0f, 10.4f, -9.8f, 18.0f, -19.9f, 15.5f)
                lineTo(256.0f, 512.0f)
                lineTo(147.9f, 539.0f)
                curveToRelative(-10.1f, 2.5f, -19.9f, -5.1f, -19.9f, -15.5f)
                lineToRelative(0.0f, -19.8f)
                curveToRelative(0.0f, -4.9f, 2.2f, -9.5f, 6.0f, -12.5f)
                lineToRelative(66.0f, -52.8f)
                lineToRelative(0.0f, -99.7f)
                lineToRelative(-162.9f, 54.3f)
                curveTo(26.7f, 396.4f, 16.0f, 388.7f, 16.0f, 377.8f)
                lineToRelative(0.0f, -43.7f)
                curveToRelative(0.0f, -9.0f, 3.8f, -17.5f, 10.4f, -23.6f)
                lineTo(200.0f, 151.3f)
                lineTo(200.0f, 24.0f)
                close()
            }
        }
        .build()
        return _planeUp!!
    }

private var _planeUp: ImageVector? = null
