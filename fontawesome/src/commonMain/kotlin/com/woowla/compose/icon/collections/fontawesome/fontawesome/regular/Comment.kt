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

public val RegularGroup.Comment: ImageVector
    get() {
        if (_comment != null) {
            return _comment!!
        }
        _comment = Builder(name = "Comment", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(51.9f, 384.9f)
                curveTo(19.3f, 344.6f, 0.0f, 294.4f, 0.0f, 240.0f)
                curveTo(0.0f, 107.5f, 114.6f, 0.0f, 256.0f, 0.0f)
                reflectiveCurveTo(512.0f, 107.5f, 512.0f, 240.0f)
                reflectiveCurveTo(397.4f, 480.0f, 256.0f, 480.0f)
                curveToRelative(-36.5f, 0.0f, -71.2f, -7.2f, -102.6f, -20.0f)
                lineTo(37.0f, 509.9f)
                curveToRelative(-3.7f, 1.6f, -7.5f, 2.1f, -11.5f, 2.1f)
                curveToRelative(-14.1f, 0.0f, -25.5f, -11.4f, -25.5f, -25.5f)
                curveToRelative(0.0f, -4.3f, 1.1f, -8.5f, 3.1f, -12.2f)
                lineToRelative(48.8f, -89.4f)
                close()
                moveTo(89.2f, 354.7f)
                curveToRelative(12.2f, 15.1f, 14.1f, 36.1f, 4.8f, 53.2f)
                lineToRelative(-18.0f, 33.1f)
                lineToRelative(58.5f, -25.1f)
                curveToRelative(11.8f, -5.1f, 25.2f, -5.2f, 37.1f, -0.3f)
                curveToRelative(25.7f, 10.5f, 54.2f, 16.4f, 84.3f, 16.4f)
                curveToRelative(117.8f, 0.0f, 208.0f, -88.8f, 208.0f, -192.0f)
                reflectiveCurveTo(373.8f, 48.0f, 256.0f, 48.0f)
                reflectiveCurveTo(48.0f, 136.8f, 48.0f, 240.0f)
                curveToRelative(0.0f, 42.8f, 15.1f, 82.4f, 41.2f, 114.7f)
                close()
            }
        }
        .build()
        return _comment!!
    }

private var _comment: ImageVector? = null
