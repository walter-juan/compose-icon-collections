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

public val RegularGroup.BxAnalyse: ImageVector
    get() {
        if (_bxAnalyse != null) {
            return _bxAnalyse!!
        }
        _bxAnalyse = Builder(name = "BxAnalyse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(7.986f, 7.986f, 0.0f, false, true, 2.337f, -5.663f)
                arcToRelative(7.91f, 7.91f, 0.0f, false, true, 2.542f, -1.71f)
                arcToRelative(8.12f, 8.12f, 0.0f, false, true, 6.13f, -0.041f)
                arcTo(2.488f, 2.488f, 0.0f, false, false, 17.5f, 7.0f)
                curveTo(18.886f, 7.0f, 20.0f, 5.886f, 20.0f, 4.5f)
                reflectiveCurveTo(18.886f, 2.0f, 17.5f, 2.0f)
                curveToRelative(-0.689f, 0.0f, -1.312f, 0.276f, -1.763f, 0.725f)
                curveToRelative(-2.431f, -0.973f, -5.223f, -0.958f, -7.635f, 0.059f)
                arcToRelative(9.928f, 9.928f, 0.0f, false, false, -3.18f, 2.139f)
                arcToRelative(9.92f, 9.92f, 0.0f, false, false, -2.14f, 3.179f)
                arcTo(10.005f, 10.005f, 0.0f, false, false, 2.0f, 12.0f)
                close()
                moveTo(19.373f, 15.122f)
                curveToRelative(-0.401f, 0.952f, -0.977f, 1.808f, -1.71f, 2.541f)
                reflectiveCurveToRelative(-1.589f, 1.309f, -2.542f, 1.71f)
                arcToRelative(8.12f, 8.12f, 0.0f, false, true, -6.13f, 0.041f)
                arcTo(2.488f, 2.488f, 0.0f, false, false, 6.5f, 17.0f)
                curveTo(5.114f, 17.0f, 4.0f, 18.114f, 4.0f, 19.5f)
                reflectiveCurveTo(5.114f, 22.0f, 6.5f, 22.0f)
                curveToRelative(0.689f, 0.0f, 1.312f, -0.276f, 1.763f, -0.725f)
                arcTo(9.965f, 9.965f, 0.0f, false, false, 12.0f, 22.0f)
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
                reflectiveCurveToRelative(4.538f, -2.036f, 4.538f, -4.538f)
                reflectiveCurveTo(14.502f, 7.462f, 12.0f, 7.462f)
                close()
                moveTo(12.0f, 14.538f)
                curveToRelative(-1.399f, 0.0f, -2.538f, -1.139f, -2.538f, -2.538f)
                reflectiveCurveTo(10.601f, 9.462f, 12.0f, 9.462f)
                reflectiveCurveToRelative(2.538f, 1.139f, 2.538f, 2.538f)
                reflectiveCurveToRelative(-1.139f, 2.538f, -2.538f, 2.538f)
                close()
            }
        }
        .build()
        return _bxAnalyse!!
    }

private var _bxAnalyse: ImageVector? = null
