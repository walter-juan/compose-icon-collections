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

public val SolidGroup.CentSign: ImageVector
    get() {
        if (_centSign != null) {
            return _centSign!!
        }
        _centSign = Builder(name = "CentSign", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                lineToRelative(0.0f, 25.4f)
                curveToRelative(43.6f, 5.2f, 83.0f, 24.5f, 113.3f, 53.1f)
                curveToRelative(12.9f, 12.1f, 13.4f, 32.4f, 1.3f, 45.2f)
                reflectiveCurveToRelative(-32.4f, 13.4f, -45.2f, 1.3f)
                curveToRelative(-24.4f, -23.0f, -57.2f, -37.1f, -93.3f, -37.1f)
                curveToRelative(-75.1f, 0.0f, -136.0f, 60.9f, -136.0f, 136.0f)
                reflectiveCurveToRelative(60.9f, 136.0f, 136.0f, 136.0f)
                curveToRelative(36.2f, 0.0f, 69.0f, -14.1f, 93.3f, -37.1f)
                curveToRelative(12.9f, -12.1f, 33.1f, -11.5f, 45.2f, 1.3f)
                reflectiveCurveToRelative(11.5f, 33.1f, -1.3f, 45.2f)
                curveTo(323.0f, 430.1f, 283.6f, 449.4f, 240.0f, 454.6f)
                lineToRelative(0.0f, 25.4f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -28.0f)
                curveTo(84.7f, 433.5f, 16.0f, 352.8f, 16.0f, 256.0f)
                reflectiveCurveTo(84.7f, 78.5f, 176.0f, 60.0f)
                lineToRelative(0.0f, -28.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                close()
            }
        }
        .build()
        return _centSign!!
    }

private var _centSign: ImageVector? = null
