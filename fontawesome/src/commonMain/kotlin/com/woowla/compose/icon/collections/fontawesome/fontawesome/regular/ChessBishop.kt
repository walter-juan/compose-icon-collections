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

public val RegularGroup.ChessBishop: ImageVector
    get() {
        if (_chessBishop != null) {
            return _chessBishop!!
        }
        _chessBishop = Builder(name = "ChessBishop", defaultWidth = 320.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.7f, 24.0f, -24.0f, 24.0f)
                lineToRelative(-16.0f, 0.0f)
                lineToRelative(81.8f, 98.1f)
                curveToRelative(24.7f, 29.6f, 38.2f, 67.0f, 38.2f, 105.6f)
                curveToRelative(0.0f, 43.7f, -17.4f, 85.7f, -48.3f, 116.6f)
                lineToRelative(-8.6f, 8.6f)
                lineToRelative(46.5f, 58.2f)
                curveToRelative(6.7f, 8.4f, 10.4f, 18.8f, 10.4f, 29.6f)
                curveToRelative(0.0f, 26.2f, -21.2f, 47.4f, -47.4f, 47.4f)
                lineTo(47.4f, 512.0f)
                curveTo(21.2f, 512.0f, 0.0f, 490.8f, 0.0f, 464.6f)
                curveTo(0.0f, 453.9f, 3.7f, 443.4f, 10.4f, 435.0f)
                lineToRelative(46.5f, -58.2f)
                lineToRelative(-8.6f, -8.6f)
                curveTo(17.4f, 337.4f, 0.0f, 295.4f, 0.0f, 251.7f)
                curveTo(0.0f, 213.1f, 13.5f, 175.8f, 38.2f, 146.1f)
                lineTo(120.0f, 48.0f)
                lineTo(104.0f, 48.0f)
                curveTo(90.7f, 48.0f, 80.0f, 37.3f, 80.0f, 24.0f)
                reflectiveCurveTo(90.7f, 0.0f, 104.0f, 0.0f)
                lineTo(216.0f, 0.0f)
                close()
                moveTo(94.4f, 406.8f)
                lineToRelative(-45.7f, 57.2f)
                lineToRelative(222.7f, 0.0f)
                lineToRelative(-45.7f, -57.1f)
                lineToRelative(-5.5f, -6.9f)
                lineToRelative(-120.3f, 0.0f)
                lineToRelative(-5.5f, 6.8f)
                close()
                moveTo(156.9f, 78.7f)
                lineTo(75.1f, 176.8f)
                curveToRelative(-15.3f, 18.4f, -24.6f, 41.0f, -26.7f, 64.7f)
                lineTo(48.0f, 251.7f)
                curveToRelative(0.0f, 31.0f, 12.3f, 60.7f, 34.2f, 82.7f)
                lineToRelative(17.7f, 17.7f)
                lineToRelative(120.2f, 0.0f)
                curveToRelative(6.2f, -6.2f, 12.1f, -12.1f, 17.8f, -17.7f)
                curveToRelative(21.9f, -21.9f, 34.2f, -51.6f, 34.2f, -82.6f)
                lineToRelative(-0.4f, -10.2f)
                curveToRelative(-1.5f, -17.0f, -6.7f, -33.3f, -15.2f, -48.0f)
                lineTo(209.0f, 241.0f)
                curveToRelative(-9.4f, 9.4f, -24.6f, 9.4f, -33.9f, 0.0f)
                reflectiveCurveToRelative(-9.4f, -24.6f, 0.0f, -33.9f)
                lineToRelative(51.8f, -51.8f)
                lineToRelative(-63.7f, -76.5f)
                lineToRelative(-3.1f, -3.8f)
                lineToRelative(-3.1f, 3.8f)
                close()
            }
        }
        .build()
        return _chessBishop!!
    }

private var _chessBishop: ImageVector? = null
