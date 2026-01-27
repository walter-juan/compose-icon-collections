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

public val SolidGroup.Language: ImageVector
    get() {
        if (_language != null) {
            return _language!!
        }
        _language = Builder(name = "Language", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                lineToRelative(0.0f, 32.0f)
                lineToRelative(128.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-9.6f, 0.0f)
                lineToRelative(-8.4f, 23.1f)
                curveToRelative(-16.4f, 45.2f, -41.1f, 86.5f, -72.2f, 122.0f)
                curveToRelative(14.2f, 8.8f, 29.0f, 16.6f, 44.4f, 23.5f)
                lineToRelative(50.4f, 22.4f)
                lineToRelative(62.2f, -140.0f)
                curveToRelative(5.1f, -11.6f, 16.6f, -19.0f, 29.2f, -19.0f)
                reflectiveCurveToRelative(24.1f, 7.4f, 29.2f, 19.0f)
                lineToRelative(128.0f, 288.0f)
                curveToRelative(7.2f, 16.2f, -0.1f, 35.1f, -16.2f, 42.2f)
                reflectiveCurveToRelative(-35.1f, -0.1f, -42.2f, -16.2f)
                lineToRelative(-20.0f, -45.0f)
                lineToRelative(-157.5f, 0.0f)
                lineToRelative(-20.0f, 45.0f)
                curveToRelative(-7.2f, 16.2f, -26.1f, 23.4f, -42.2f, 16.2f)
                reflectiveCurveToRelative(-23.4f, -26.1f, -16.2f, -42.2f)
                lineToRelative(39.8f, -89.5f)
                lineToRelative(-50.4f, -22.4f)
                curveToRelative(-23.0f, -10.2f, -45.0f, -22.4f, -65.8f, -36.4f)
                curveToRelative(-21.3f, 17.2f, -44.6f, 32.2f, -69.5f, 44.7f)
                lineTo(78.3f, 380.6f)
                curveToRelative(-15.8f, 7.9f, -35.0f, 1.5f, -42.9f, -14.3f)
                reflectiveCurveToRelative(-1.5f, -35.0f, 14.3f, -42.9f)
                lineToRelative(34.5f, -17.3f)
                curveToRelative(16.3f, -8.2f, 31.8f, -17.7f, 46.4f, -28.3f)
                curveToRelative(-13.8f, -12.7f, -26.8f, -26.4f, -38.9f, -40.9f)
                lineTo(81.6f, 224.7f)
                curveToRelative(-11.3f, -13.6f, -9.5f, -33.8f, 4.1f, -45.1f)
                reflectiveCurveToRelative(33.8f, -9.5f, 45.1f, 4.1f)
                lineToRelative(10.2f, 12.2f)
                curveToRelative(11.5f, 13.9f, 24.1f, 26.8f, 37.4f, 38.7f)
                curveToRelative(27.5f, -30.4f, 49.2f, -66.1f, 63.5f, -105.4f)
                lineToRelative(0.5f, -1.2f)
                lineToRelative(-210.3f, 0.0f)
                curveTo(14.3f, 128.0f, 0.0f, 113.7f, 0.0f, 96.0f)
                reflectiveCurveTo(14.3f, 64.0f, 32.0f, 64.0f)
                lineToRelative(96.0f, 0.0f)
                lineToRelative(0.0f, -32.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                close()
                moveTo(416.0f, 270.8f)
                lineTo(365.7f, 384.0f)
                lineTo(466.3f, 384.0f)
                lineTo(416.0f, 270.8f)
                close()
            }
        }
        .build()
        return _language!!
    }

private var _language: ImageVector? = null
