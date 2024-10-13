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

public val RegularGroup.BxBellOff: ImageVector
    get() {
        if (_bxBellOff != null) {
            return _bxBellOff!!
        }
        _bxBellOff = Builder(name = "BxBellOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                arcToRelative(2.98f, 2.98f, 0.0f, false, false, 2.818f, -2.0f)
                lineTo(9.182f, 20.0f)
                arcTo(2.98f, 2.98f, 0.0f, false, false, 12.0f, 22.0f)
                close()
                moveTo(21.0f, 18.0f)
                verticalLineToRelative(-2.0f)
                arcToRelative(0.996f, 0.996f, 0.0f, false, false, -0.293f, -0.707f)
                lineTo(19.0f, 13.586f)
                lineTo(19.0f, 10.0f)
                curveToRelative(0.0f, -3.217f, -2.185f, -5.927f, -5.145f, -6.742f)
                curveTo(13.562f, 2.52f, 12.846f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(-1.562f, 0.52f, -1.855f, 1.258f)
                curveToRelative(-1.323f, 0.364f, -2.463f, 1.128f, -3.346f, 2.127f)
                lineTo(3.707f, 2.293f)
                lineTo(2.293f, 3.707f)
                lineToRelative(18.0f, 18.0f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-1.362f, -1.362f)
                arcTo(0.993f, 0.993f, 0.0f, false, false, 21.0f, 18.0f)
                close()
                moveTo(12.0f, 5.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.266f, 0.105f, 0.52f, 0.293f, 0.707f)
                lineTo(19.0f, 16.414f)
                lineTo(19.0f, 17.0f)
                horizontalLineToRelative(-0.586f)
                lineTo(8.207f, 6.793f)
                curveTo(9.12f, 5.705f, 10.471f, 5.0f, 12.0f, 5.0f)
                close()
                moveTo(6.707f, 14.707f)
                arcTo(0.996f, 0.996f, 0.0f, false, false, 7.0f, 14.0f)
                verticalLineToRelative(-2.879f)
                lineTo(5.068f, 9.189f)
                curveTo(5.037f, 9.457f, 5.0f, 9.724f, 5.0f, 10.0f)
                verticalLineToRelative(3.586f)
                lineToRelative(-1.707f, 1.707f)
                arcTo(0.996f, 0.996f, 0.0f, false, false, 3.0f, 16.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(10.879f)
                lineToRelative(-2.0f, -2.0f)
                lineTo(5.0f, 17.0f)
                verticalLineToRelative(-0.586f)
                lineToRelative(1.707f, -1.707f)
                close()
            }
        }
        .build()
        return _bxBellOff!!
    }

private var _bxBellOff: ImageVector? = null
