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

public val SolidGroup.ChessBishop: ImageVector
    get() {
        if (_chessBishop != null) {
            return _chessBishop!!
        }
        _chessBishop = Builder(name = "ChessBishop", defaultWidth = 320.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 384.0f)
                lineTo(48.3f, 368.3f)
                curveTo(17.4f, 337.4f, 0.0f, 295.4f, 0.0f, 251.7f)
                curveTo(0.0f, 213.1f, 13.5f, 175.8f, 38.2f, 146.1f)
                lineTo(106.7f, 64.0f)
                lineTo(96.0f, 64.0f)
                curveTo(78.3f, 64.0f, 64.0f, 49.7f, 64.0f, 32.0f)
                reflectiveCurveTo(78.3f, 0.0f, 96.0f, 0.0f)
                lineTo(224.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-10.7f, 0.0f)
                lineToRelative(47.6f, 57.1f)
                lineToRelative(-85.9f, 85.9f)
                curveToRelative(-9.4f, 9.4f, -9.4f, 24.6f, 0.0f, 33.9f)
                reflectiveCurveToRelative(24.6f, 9.4f, 33.9f, 0.0f)
                lineToRelative(82.3f, -82.3f)
                curveToRelative(18.7f, 27.3f, 28.7f, 59.7f, 28.7f, 93.0f)
                curveToRelative(0.0f, 43.7f, -17.4f, 85.7f, -48.3f, 116.6f)
                lineTo(256.0f, 384.0f)
                lineTo(312.2f, 454.3f)
                curveToRelative(5.0f, 6.3f, 7.8f, 14.1f, 7.8f, 22.2f)
                curveToRelative(0.0f, 19.6f, -15.9f, 35.5f, -35.5f, 35.5f)
                lineTo(35.5f, 512.0f)
                curveToRelative(-19.6f, 0.0f, -35.5f, -15.9f, -35.5f, -35.5f)
                curveToRelative(0.0f, -8.1f, 2.7f, -15.9f, 7.8f, -22.2f)
                lineTo(64.0f, 384.0f)
                close()
            }
        }
        .build()
        return _chessBishop!!
    }

private var _chessBishop: ImageVector? = null
