package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsBot: ImageVector
    get() {
        if (_bxsBot != null) {
            return _bxsBot!!
        }
        _bxsBot = Builder(name = "BxsBot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 10.975f)
                lineTo(21.0f, 8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                horizontalLineToRelative(-6.0f)
                lineTo(13.0f, 4.688f)
                curveToRelative(0.305f, -0.274f, 0.5f, -0.668f, 0.5f, -1.11f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                curveToRelative(0.0f, 0.442f, 0.195f, 0.836f, 0.5f, 1.11f)
                lineTo(11.0f, 6.0f)
                lineTo(5.0f, 6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(2.998f)
                lineToRelative(-0.072f, 0.005f)
                arcTo(0.999f, 0.999f, 0.0f, false, false, 2.0f, 12.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineToRelative(-5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-1.938f)
                arcToRelative(1.004f, 1.004f, 0.0f, false, false, -0.072f, -0.455f)
                curveToRelative(-0.202f, -0.488f, -0.635f, -0.605f, -0.928f, -0.632f)
                close()
                moveTo(7.0f, 12.0f)
                curveToRelative(0.0f, -1.104f, 0.672f, -2.0f, 1.5f, -2.0f)
                reflectiveCurveToRelative(1.5f, 0.896f, 1.5f, 2.0f)
                reflectiveCurveToRelative(-0.672f, 2.0f, -1.5f, 2.0f)
                reflectiveCurveTo(7.0f, 13.104f, 7.0f, 12.0f)
                close()
                moveTo(15.998f, 18.0f)
                curveToRelative(-1.001f, -0.003f, -7.997f, 0.0f, -7.998f, 0.0f)
                verticalLineToRelative(-2.0f)
                reflectiveCurveToRelative(7.001f, -0.002f, 8.002f, 0.0f)
                lineToRelative(-0.004f, 2.0f)
                close()
                moveTo(15.5f, 14.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.896f, -1.5f, -2.0f)
                reflectiveCurveToRelative(0.672f, -2.0f, 1.5f, -2.0f)
                reflectiveCurveToRelative(1.5f, 0.896f, 1.5f, 2.0f)
                reflectiveCurveToRelative(-0.672f, 2.0f, -1.5f, 2.0f)
                close()
            }
        }
        .build()
        return _bxsBot!!
    }

private var _bxsBot: ImageVector? = null
