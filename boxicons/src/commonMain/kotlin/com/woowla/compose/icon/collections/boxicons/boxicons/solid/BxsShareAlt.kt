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

public val SolidGroup.BxsShareAlt: ImageVector
    get() {
        if (_bxsShareAlt != null) {
            return _bxsShareAlt!!
        }
        _bxsShareAlt = Builder(name = "BxsShareAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 12.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                curveToRelative(0.794f, 0.0f, 1.512f, -0.315f, 2.049f, -0.82f)
                lineToRelative(5.991f, 3.424f)
                curveToRelative(-0.018f, 0.13f, -0.04f, 0.26f, -0.04f, 0.396f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.346f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.346f, -3.0f, -3.0f, -3.0f)
                curveToRelative(-0.794f, 0.0f, -1.512f, 0.315f, -2.049f, 0.82f)
                lineTo(8.96f, 12.397f)
                curveToRelative(0.018f, -0.131f, 0.04f, -0.261f, 0.04f, -0.397f)
                reflectiveCurveToRelative(-0.022f, -0.266f, -0.04f, -0.397f)
                lineToRelative(5.991f, -3.423f)
                curveToRelative(0.537f, 0.505f, 1.255f, 0.82f, 2.049f, 0.82f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.346f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.346f, -3.0f, 3.0f)
                curveToRelative(0.0f, 0.136f, 0.022f, 0.266f, 0.04f, 0.397f)
                lineTo(8.049f, 9.82f)
                arcTo(2.982f, 2.982f, 0.0f, false, false, 6.0f, 9.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _bxsShareAlt!!
    }

private var _bxsShareAlt: ImageVector? = null
