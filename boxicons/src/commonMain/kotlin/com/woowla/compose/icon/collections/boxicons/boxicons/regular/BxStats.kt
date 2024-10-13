package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxStats: ImageVector
    get() {
        if (_bxStats != null) {
            return _bxStats!!
        }
        _bxStats = Builder(name = "BxStats", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.703f, 0.133f)
                lineToRelative(-2.398f, -1.963f)
                curveToRelative(0.059f, -0.214f, 0.101f, -0.436f, 0.101f, -0.67f)
                curveTo(17.0f, 8.114f, 15.886f, 7.0f, 14.5f, 7.0f)
                reflectiveCurveTo(12.0f, 8.114f, 12.0f, 9.5f)
                curveToRelative(0.0f, 0.396f, 0.1f, 0.765f, 0.262f, 1.097f)
                lineToRelative(-2.909f, 3.438f)
                arcTo(2.06f, 2.06f, 0.0f, false, false, 9.0f, 14.0f)
                curveToRelative(-0.179f, 0.0f, -0.348f, 0.03f, -0.512f, 0.074f)
                lineToRelative(-2.563f, -2.563f)
                curveTo(5.97f, 11.348f, 6.0f, 11.179f, 6.0f, 11.0f)
                curveToRelative(0.0f, -1.108f, -0.892f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.892f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.892f, 2.0f, 2.0f, 2.0f)
                curveToRelative(0.179f, 0.0f, 0.348f, -0.03f, 0.512f, -0.074f)
                lineToRelative(2.563f, 2.563f)
                arcTo(1.906f, 1.906f, 0.0f, false, false, 7.0f, 16.0f)
                curveToRelative(0.0f, 1.108f, 0.892f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.892f, 2.0f, -2.0f)
                curveToRelative(0.0f, -0.237f, -0.048f, -0.46f, -0.123f, -0.671f)
                lineToRelative(2.913f, -3.442f)
                curveToRelative(0.227f, 0.066f, 0.462f, 0.113f, 0.71f, 0.113f)
                arcToRelative(2.48f, 2.48f, 0.0f, false, false, 1.133f, -0.281f)
                lineToRelative(2.399f, 1.963f)
                arcTo(2.077f, 2.077f, 0.0f, false, false, 18.0f, 14.0f)
                curveToRelative(0.0f, 1.108f, 0.892f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.892f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.892f, -2.0f, -2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _bxStats!!
    }

private var _bxStats: ImageVector? = null
