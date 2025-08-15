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

public val SolidGroup.PenRuler: ImageVector
    get() {
        if (_penRuler != null) {
            return _penRuler!!
        }
        _penRuler = Builder(name = "PenRuler", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(404.0f, 0.0f)
                curveToRelative(19.2f, 0.0f, 37.6f, 7.6f, 51.1f, 21.2f)
                lineToRelative(35.7f, 35.7f)
                curveTo(504.4f, 70.4f, 512.0f, 88.8f, 512.0f, 108.0f)
                reflectiveCurveToRelative(-7.6f, 37.6f, -21.2f, 51.1f)
                lineTo(445.9f, 204.0f)
                lineTo(308.0f, 66.1f)
                lineTo(352.9f, 21.2f)
                curveTo(366.4f, 7.6f, 384.8f, 0.0f, 404.0f, 0.0f)
                close()
                moveTo(58.9f, 315.1f)
                lineTo(274.1f, 100.0f)
                lineTo(412.0f, 237.9f)
                lineTo(196.9f, 453.1f)
                curveToRelative(-10.7f, 10.7f, -24.1f, 18.5f, -38.7f, 22.6f)
                lineTo(30.4f, 511.1f)
                curveToRelative(-8.3f, 2.3f, -17.3f, 0.0f, -23.4f, -6.2f)
                reflectiveCurveToRelative(-8.5f, -15.1f, -6.2f, -23.4f)
                lineTo(36.4f, 353.8f)
                curveToRelative(4.1f, -14.6f, 11.8f, -27.9f, 22.6f, -38.7f)
                close()
                moveTo(225.4f, 80.8f)
                lineTo(80.8f, 225.4f)
                lineTo(11.7f, 156.3f)
                curveToRelative(-15.6f, -15.6f, -15.6f, -40.9f, 0.0f, -56.6f)
                lineToRelative(88.0f, -88.0f)
                curveToRelative(15.6f, -15.6f, 40.9f, -15.6f, 56.6f, 0.0f)
                lineToRelative(5.9f, 5.9f)
                lineToRelative(-56.3f, 56.3f)
                curveToRelative(-7.8f, 7.8f, -7.8f, 20.5f, 0.0f, 28.3f)
                reflectiveCurveToRelative(20.5f, 7.8f, 28.3f, 0.0f)
                lineToRelative(56.3f, -56.3f)
                lineToRelative(34.9f, 34.9f)
                close()
                moveTo(431.2f, 286.6f)
                lineToRelative(34.9f, 34.9f)
                lineToRelative(-56.3f, 56.3f)
                curveToRelative(-7.8f, 7.8f, -7.8f, 20.5f, 0.0f, 28.3f)
                reflectiveCurveToRelative(20.5f, 7.8f, 28.3f, 0.0f)
                lineToRelative(56.3f, -56.3f)
                lineToRelative(5.9f, 5.9f)
                curveToRelative(15.6f, 15.6f, 15.6f, 40.9f, 0.0f, 56.6f)
                lineToRelative(-88.0f, 88.0f)
                curveToRelative(-15.6f, 15.6f, -40.9f, 15.6f, -56.6f, 0.0f)
                lineToRelative(-69.1f, -69.1f)
                lineToRelative(144.6f, -144.6f)
                close()
            }
        }
        .build()
        return _penRuler!!
    }

private var _penRuler: ImageVector? = null
