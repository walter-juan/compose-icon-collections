package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxReset: ImageVector
    get() {
        if (_bxReset != null) {
            return _bxReset!!
        }
        _bxReset = Builder(name = "BxReset", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 16.0f)
                curveToRelative(1.671f, 0.0f, 3.0f, -1.331f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.329f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.331f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.329f, 3.0f, 3.0f, 3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.817f, 11.186f)
                arcToRelative(8.94f, 8.94f, 0.0f, false, false, -1.355f, -3.219f)
                arcToRelative(9.053f, 9.053f, 0.0f, false, false, -2.43f, -2.43f)
                arcToRelative(8.95f, 8.95f, 0.0f, false, false, -3.219f, -1.355f)
                arcToRelative(9.028f, 9.028f, 0.0f, false, false, -1.838f, -0.18f)
                verticalLineTo(2.0f)
                lineTo(8.0f, 5.0f)
                lineToRelative(3.975f, 3.0f)
                verticalLineTo(6.002f)
                curveToRelative(0.484f, -0.002f, 0.968f, 0.044f, 1.435f, 0.14f)
                arcToRelative(6.961f, 6.961f, 0.0f, false, true, 2.502f, 1.053f)
                arcToRelative(7.005f, 7.005f, 0.0f, false, true, 1.892f, 1.892f)
                arcTo(6.967f, 6.967f, 0.0f, false, true, 19.0f, 13.0f)
                arcToRelative(7.032f, 7.032f, 0.0f, false, true, -0.55f, 2.725f)
                arcToRelative(7.11f, 7.11f, 0.0f, false, true, -0.644f, 1.188f)
                arcToRelative(7.2f, 7.2f, 0.0f, false, true, -0.858f, 1.039f)
                arcToRelative(7.028f, 7.028f, 0.0f, false, true, -3.536f, 1.907f)
                arcToRelative(7.13f, 7.13f, 0.0f, false, true, -2.822f, 0.0f)
                arcToRelative(6.961f, 6.961f, 0.0f, false, true, -2.503f, -1.054f)
                arcToRelative(7.002f, 7.002f, 0.0f, false, true, -1.89f, -1.89f)
                arcTo(6.996f, 6.996f, 0.0f, false, true, 5.0f, 13.0f)
                horizontalLineTo(3.0f)
                arcToRelative(9.02f, 9.02f, 0.0f, false, false, 1.539f, 5.034f)
                arcToRelative(9.096f, 9.096f, 0.0f, false, false, 2.428f, 2.428f)
                arcTo(8.95f, 8.95f, 0.0f, false, false, 12.0f, 22.0f)
                arcToRelative(9.09f, 9.09f, 0.0f, false, false, 1.814f, -0.183f)
                arcToRelative(9.014f, 9.014f, 0.0f, false, false, 3.218f, -1.355f)
                arcToRelative(8.886f, 8.886f, 0.0f, false, false, 1.331f, -1.099f)
                arcToRelative(9.228f, 9.228f, 0.0f, false, false, 1.1f, -1.332f)
                arcTo(8.952f, 8.952f, 0.0f, false, false, 21.0f, 13.0f)
                arcToRelative(9.09f, 9.09f, 0.0f, false, false, -0.183f, -1.814f)
                close()
            }
        }
        .build()
        return _bxReset!!
    }

private var _bxReset: ImageVector? = null
