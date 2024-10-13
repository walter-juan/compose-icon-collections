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

public val RegularGroup.BxBellMinus: ImageVector
    get() {
        if (_bxBellMinus != null) {
            return _bxBellMinus!!
        }
        _bxBellMinus = Builder(name = "BxBellMinus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.707f, 15.293f)
                lineTo(19.0f, 13.586f)
                lineTo(19.0f, 10.0f)
                curveToRelative(0.0f, -3.217f, -2.185f, -5.927f, -5.145f, -6.742f)
                curveTo(13.562f, 2.52f, 12.846f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(-1.562f, 0.52f, -1.855f, 1.258f)
                curveTo(7.185f, 4.074f, 5.0f, 6.783f, 5.0f, 10.0f)
                verticalLineToRelative(3.586f)
                lineToRelative(-1.707f, 1.707f)
                arcTo(0.996f, 0.996f, 0.0f, false, false, 3.0f, 16.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                arcToRelative(0.996f, 0.996f, 0.0f, false, false, -0.293f, -0.707f)
                close()
                moveTo(19.0f, 17.0f)
                lineTo(5.0f, 17.0f)
                verticalLineToRelative(-0.586f)
                lineToRelative(1.707f, -1.707f)
                arcTo(0.996f, 0.996f, 0.0f, false, false, 7.0f, 14.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.243f, 5.0f, 5.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.266f, 0.105f, 0.52f, 0.293f, 0.707f)
                lineTo(19.0f, 16.414f)
                lineTo(19.0f, 17.0f)
                close()
                moveTo(12.0f, 22.0f)
                arcToRelative(2.98f, 2.98f, 0.0f, false, false, 2.818f, -2.0f)
                lineTo(9.182f, 20.0f)
                arcTo(2.98f, 2.98f, 0.0f, false, false, 12.0f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.037f, 10.0f)
                horizontalLineToRelative(7.926f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(8.037f)
                close()
            }
        }
        .build()
        return _bxBellMinus!!
    }

private var _bxBellMinus: ImageVector? = null
