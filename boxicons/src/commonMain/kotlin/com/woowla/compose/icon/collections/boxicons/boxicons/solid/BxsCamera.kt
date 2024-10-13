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

public val SolidGroup.BxsCamera: ImageVector
    get() {
        if (_bxsCamera != null) {
            return _bxsCamera!!
        }
        _bxsCamera = Builder(name = "BxsCamera", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 9.0f)
                curveToRelative(-1.626f, 0.0f, -3.0f, 1.374f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.374f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.374f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.374f, -3.0f, -3.0f, -3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 5.0f)
                horizontalLineToRelative(-2.586f)
                lineToRelative(-2.707f, -2.707f)
                arcTo(0.996f, 0.996f, 0.0f, false, false, 14.0f, 2.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(0.996f, 0.996f, 0.0f, false, false, -0.707f, 0.293f)
                lineTo(6.586f, 5.0f)
                lineTo(4.0f, 5.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                lineTo(22.0f, 7.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(12.0f, 17.0f)
                curveToRelative(-2.71f, 0.0f, -5.0f, -2.29f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.29f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.29f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.29f, 5.0f, -5.0f, 5.0f)
                close()
            }
        }
        .build()
        return _bxsCamera!!
    }

private var _bxsCamera: ImageVector? = null
