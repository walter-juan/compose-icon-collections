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

public val SolidGroup.LariSign: ImageVector
    get() {
        if (_lariSign != null) {
            return _lariSign!!
        }
        _lariSign = Builder(name = "LariSign", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                lineToRelative(0.0f, 41.5f)
                curveToRelative(7.9f, -1.0f, 15.9f, -1.5f, 24.0f, -1.5f)
                reflectiveCurveToRelative(16.1f, 0.5f, 24.0f, 1.5f)
                lineTo(216.0f, 24.0f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                reflectiveCurveToRelative(24.0f, 10.7f, 24.0f, 24.0f)
                lineToRelative(0.0f, 54.0f)
                curveToRelative(58.9f, 23.8f, 103.2f, 76.0f, 116.2f, 139.7f)
                curveToRelative(3.5f, 17.3f, -7.7f, 34.2f, -25.0f, 37.7f)
                reflectiveCurveToRelative(-34.2f, -7.7f, -37.7f, -25.0f)
                curveToRelative(-6.7f, -33.2f, -26.4f, -61.8f, -53.4f, -80.2f)
                lineToRelative(0.0f, 81.8f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.7f, -24.0f, -24.0f)
                lineToRelative(0.0f, -101.8f)
                curveToRelative(-7.8f, -1.5f, -15.8f, -2.2f, -24.0f, -2.2f)
                reflectiveCurveToRelative(-16.2f, 0.8f, -24.0f, 2.2f)
                lineTo(168.0f, 232.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.7f, -24.0f, -24.0f)
                lineToRelative(0.0f, -81.8f)
                curveToRelative(-33.8f, 23.0f, -56.0f, 61.9f, -56.0f, 105.8f)
                curveToRelative(0.0f, 70.7f, 57.3f, 128.0f, 128.0f, 128.0f)
                lineToRelative(160.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(32.0f, 448.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(16.9f, 0.0f)
                curveTo(18.5f, 350.0f, 0.0f, 305.2f, 0.0f, 256.0f)
                curveTo(0.0f, 175.4f, 49.6f, 106.4f, 120.0f, 78.0f)
                lineToRelative(0.0f, -54.0f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                close()
            }
        }
        .build()
        return _lariSign!!
    }

private var _lariSign: ImageVector? = null
