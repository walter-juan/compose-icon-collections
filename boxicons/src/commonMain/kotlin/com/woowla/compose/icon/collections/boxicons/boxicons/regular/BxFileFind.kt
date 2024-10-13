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

public val RegularGroup.BxFileFind: ImageVector
    get() {
        if (_bxFileFind != null) {
            return _bxFileFind!!
        }
        _bxFileFind = Builder(name = "BxFileFind", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.707f, 2.293f)
                arcTo(0.996f, 0.996f, 0.0f, false, false, 13.0f, 2.0f)
                lineTo(6.0f, 2.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                lineTo(20.0f, 9.0f)
                arcToRelative(0.996f, 0.996f, 0.0f, false, false, -0.293f, -0.707f)
                lineToRelative(-6.0f, -6.0f)
                close()
                moveTo(6.0f, 4.0f)
                horizontalLineToRelative(6.586f)
                lineTo(18.0f, 9.414f)
                lineToRelative(0.002f, 9.174f)
                lineToRelative(-2.568f, -2.568f)
                curveToRelative(0.35f, -0.595f, 0.566f, -1.281f, 0.566f, -2.02f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.794f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.794f, 4.0f, 4.0f, 4.0f)
                curveToRelative(0.739f, 0.0f, 1.425f, -0.216f, 2.02f, -0.566f)
                lineTo(16.586f, 20.0f)
                lineTo(6.0f, 20.0f)
                lineTo(6.0f, 4.0f)
                close()
                moveTo(12.0f, 16.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _bxFileFind!!
    }

private var _bxFileFind: ImageVector? = null
