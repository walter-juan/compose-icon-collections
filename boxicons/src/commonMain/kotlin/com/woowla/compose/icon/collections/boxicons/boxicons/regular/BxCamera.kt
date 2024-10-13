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

public val RegularGroup.BxCamera: ImageVector
    get() {
        if (_bxCamera != null) {
            return _bxCamera!!
        }
        _bxCamera = Builder(name = "BxCamera", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 8.0f)
                curveToRelative(-2.168f, 0.0f, -4.0f, 1.832f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.832f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.832f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.832f, -4.0f, -4.0f, -4.0f)
                close()
                moveTo(12.0f, 14.0f)
                curveToRelative(-1.065f, 0.0f, -2.0f, -0.935f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.935f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.935f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.935f, 2.0f, -2.0f, 2.0f)
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
                horizontalLineTo(4.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineTo(7.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(4.0f, 18.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.266f, 0.0f, 0.52f, -0.105f, 0.707f, -0.293f)
                lineTo(10.414f, 4.0f)
                horizontalLineToRelative(3.172f)
                lineToRelative(2.707f, 2.707f)
                arcTo(0.996f, 0.996f, 0.0f, false, false, 17.0f, 7.0f)
                horizontalLineToRelative(3.0f)
                lineToRelative(0.002f, 11.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _bxCamera!!
    }

private var _bxCamera: ImageVector? = null
