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

public val SolidGroup.AustralSign: ImageVector
    get() {
        if (_australSign != null) {
            return _australSign!!
        }
        _australSign = Builder(name = "AustralSign", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(266.5f, 240.0f)
                lineToRelative(-85.0f, 0.0f)
                lineToRelative(42.5f, -106.4f)
                lineToRelative(42.5f, 106.4f)
                close()
                moveTo(335.4f, 240.0f)
                lineTo(262.9f, 58.3f)
                curveTo(256.5f, 42.4f, 241.1f, 32.0f, 224.0f, 32.0f)
                reflectiveCurveToRelative(-32.5f, 10.4f, -38.9f, 26.3f)
                lineTo(112.6f, 240.0f)
                lineTo(32.0f, 240.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                reflectiveCurveToRelative(10.7f, 24.0f, 24.0f, 24.0f)
                lineToRelative(61.4f, 0.0f)
                lineToRelative(-19.2f, 48.0f)
                lineToRelative(-42.3f, 0.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                reflectiveCurveToRelative(10.7f, 24.0f, 24.0f, 24.0f)
                lineToRelative(23.1f, 0.0f)
                lineToRelative(-20.8f, 52.1f)
                curveToRelative(-6.6f, 16.4f, 1.4f, 35.0f, 17.9f, 41.6f)
                reflectiveCurveToRelative(35.0f, -1.4f, 41.6f, -17.9f)
                lineToRelative(30.3f, -75.9f)
                lineToRelative(200.0f, 0.0f)
                lineToRelative(30.3f, 75.9f)
                curveToRelative(6.6f, 16.4f, 25.2f, 24.4f, 41.6f, 17.9f)
                reflectiveCurveToRelative(24.4f, -25.2f, 17.9f, -41.6f)
                lineTo(392.9f, 384.0f)
                lineTo(416.0f, 384.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.7f, -24.0f, -24.0f, -24.0f)
                lineToRelative(-42.3f, 0.0f)
                lineToRelative(-19.2f, -48.0f)
                lineToRelative(61.4f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.7f, -24.0f, -24.0f, -24.0f)
                lineToRelative(-80.6f, 0.0f)
                close()
                moveTo(285.7f, 288.0f)
                lineToRelative(19.2f, 48.0f)
                lineToRelative(-161.6f, 0.0f)
                lineToRelative(19.2f, -48.0f)
                lineToRelative(123.3f, 0.0f)
                close()
            }
        }
        .build()
        return _australSign!!
    }

private var _australSign: ImageVector? = null
