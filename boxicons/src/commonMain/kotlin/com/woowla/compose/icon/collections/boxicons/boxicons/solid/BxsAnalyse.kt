package com.woowla.compose.icon.collections.boxicons.boxicons.solid

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
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsAnalyse: ImageVector
    get() {
        if (_bxsAnalyse != null) {
            return _bxsAnalyse!!
        }
        _bxsAnalyse = Builder(name = "BxsAnalyse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.626f, 8.878f)
                arcToRelative(7.937f, 7.937f, 0.0f, false, true, 1.71f, -2.541f)
                arcToRelative(7.92f, 7.92f, 0.0f, false, true, 2.542f, -1.71f)
                arcToRelative(8.12f, 8.12f, 0.0f, false, true, 6.13f, -0.041f)
                arcTo(2.49f, 2.49f, 0.0f, false, false, 17.5f, 7.0f)
                curveTo(18.886f, 7.0f, 20.0f, 5.886f, 20.0f, 4.5f)
                reflectiveCurveTo(18.886f, 2.0f, 17.5f, 2.0f)
                curveToRelative(-0.689f, 0.0f, -1.312f, 0.276f, -1.763f, 0.725f)
                curveToRelative(-2.431f, -0.973f, -5.223f, -0.958f, -7.635f, 0.059f)
                curveToRelative(-1.19f, 0.5f, -2.26f, 1.22f, -3.18f, 2.139f)
                arcTo(9.98f, 9.98f, 0.0f, false, false, 2.0f, 12.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -1.086f, 0.211f, -2.136f, 0.626f, -3.122f)
                close()
                moveTo(19.373f, 15.122f)
                curveToRelative(-0.401f, 0.952f, -0.977f, 1.808f, -1.71f, 2.541f)
                reflectiveCurveToRelative(-1.589f, 1.309f, -2.542f, 1.71f)
                arcToRelative(8.12f, 8.12f, 0.0f, false, true, -6.13f, 0.041f)
                arcTo(2.488f, 2.488f, 0.0f, false, false, 6.5f, 17.0f)
                curveTo(5.114f, 17.0f, 4.0f, 18.114f, 4.0f, 19.5f)
                reflectiveCurveTo(5.114f, 22.0f, 6.5f, 22.0f)
                curveToRelative(0.689f, 0.0f, 1.312f, -0.276f, 1.763f, -0.725f)
                arcTo(9.973f, 9.973f, 0.0f, false, false, 12.0f, 22.0f)
                arcToRelative(9.983f, 9.983f, 0.0f, false, false, 9.217f, -6.102f)
                arcTo(9.992f, 9.992f, 0.0f, false, false, 22.0f, 12.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(7.993f, 7.993f, 0.0f, false, true, -0.627f, 3.122f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 7.462f)
                curveToRelative(-2.502f, 0.0f, -4.538f, 2.036f, -4.538f, 4.538f)
                reflectiveCurveTo(9.498f, 16.538f, 12.0f, 16.538f)
                curveToRelative(2.502f, 0.0f, 4.538f, -2.036f, 4.538f, -4.538f)
                reflectiveCurveTo(14.502f, 7.462f, 12.0f, 7.462f)
                close()
            }
        }
        .build()
        return _bxsAnalyse!!
    }

private var _bxsAnalyse: ImageVector? = null
