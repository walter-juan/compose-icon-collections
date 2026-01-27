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

public val SolidGroup.LandmarkAlt: ImageVector
    get() {
        if (_landmarkAlt != null) {
            return _landmarkAlt!!
        }
        _landmarkAlt = Builder(name = "LandmarkAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                curveToRelative(0.0f, 0.9f, 0.0f, 1.8f, 0.1f, 2.6f)
                curveToRelative(-80.5f, 13.4f, -144.0f, 76.9f, -157.5f, 157.4f)
                lineTo(64.0f, 192.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(0.0f, 160.0f)
                lineToRelative(-51.2f, 38.4f)
                curveTo(4.7f, 460.4f, 0.0f, 469.9f, 0.0f, 480.0f)
                curveTo(0.0f, 497.7f, 14.3f, 512.0f, 32.0f, 512.0f)
                lineToRelative(448.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                curveToRelative(0.0f, -10.1f, -4.7f, -19.6f, -12.8f, -25.6f)
                lineTo(448.0f, 416.0f)
                lineTo(448.0f, 256.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineToRelative(-2.7f, 0.0f)
                curveToRelative(-13.5f, -80.4f, -77.0f, -143.9f, -157.5f, -157.4f)
                curveToRelative(0.1f, -0.9f, 0.1f, -1.7f, 0.1f, -2.6f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                close()
                moveTo(336.0f, 256.0f)
                lineToRelative(64.0f, 0.0f)
                lineToRelative(0.0f, 160.0f)
                lineToRelative(-64.0f, 0.0f)
                lineToRelative(0.0f, -160.0f)
                close()
                moveTo(224.0f, 416.0f)
                lineToRelative(0.0f, -160.0f)
                lineToRelative(64.0f, 0.0f)
                lineToRelative(0.0f, 160.0f)
                lineToRelative(-64.0f, 0.0f)
                close()
                moveTo(112.0f, 256.0f)
                lineToRelative(64.0f, 0.0f)
                lineToRelative(0.0f, 160.0f)
                lineToRelative(-64.0f, 0.0f)
                lineToRelative(0.0f, -160.0f)
                close()
            }
        }
        .build()
        return _landmarkAlt!!
    }

private var _landmarkAlt: ImageVector? = null
