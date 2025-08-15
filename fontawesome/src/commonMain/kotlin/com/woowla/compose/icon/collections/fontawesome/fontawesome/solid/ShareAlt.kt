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

public val SolidGroup.ShareAlt: ImageVector
    get() {
        if (_shareAlt != null) {
            return _shareAlt!!
        }
        _shareAlt = Builder(name = "ShareAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(384.0f, 192.0f)
                curveToRelative(53.0f, 0.0f, 96.0f, -43.0f, 96.0f, -96.0f)
                reflectiveCurveToRelative(-43.0f, -96.0f, -96.0f, -96.0f)
                reflectiveCurveToRelative(-96.0f, 43.0f, -96.0f, 96.0f)
                curveToRelative(0.0f, 5.4f, 0.5f, 10.8f, 1.3f, 16.0f)
                lineTo(159.6f, 184.1f)
                curveToRelative(-16.9f, -15.0f, -39.2f, -24.1f, -63.6f, -24.1f)
                curveToRelative(-53.0f, 0.0f, -96.0f, 43.0f, -96.0f, 96.0f)
                reflectiveCurveToRelative(43.0f, 96.0f, 96.0f, 96.0f)
                curveToRelative(24.4f, 0.0f, 46.6f, -9.1f, 63.6f, -24.1f)
                lineTo(289.3f, 400.0f)
                curveToRelative(-0.9f, 5.2f, -1.3f, 10.5f, -1.3f, 16.0f)
                curveToRelative(0.0f, 53.0f, 43.0f, 96.0f, 96.0f, 96.0f)
                reflectiveCurveToRelative(96.0f, -43.0f, 96.0f, -96.0f)
                reflectiveCurveToRelative(-43.0f, -96.0f, -96.0f, -96.0f)
                curveToRelative(-24.4f, 0.0f, -46.6f, 9.1f, -63.6f, 24.1f)
                lineTo(190.7f, 272.0f)
                curveToRelative(0.9f, -5.2f, 1.3f, -10.5f, 1.3f, -16.0f)
                reflectiveCurveToRelative(-0.5f, -10.8f, -1.3f, -16.0f)
                lineToRelative(129.7f, -72.1f)
                curveToRelative(16.9f, 15.0f, 39.2f, 24.1f, 63.6f, 24.1f)
                close()
            }
        }
        .build()
        return _shareAlt!!
    }

private var _shareAlt: ImageVector? = null
