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

public val RegularGroup.BxBugAlt: ImageVector
    get() {
        if (_bxBugAlt != null) {
            return _bxBugAlt!!
        }
        _bxBugAlt = Builder(name = "BxBugAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 9.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                lineTo(9.0f, 11.0f)
                close()
                moveTo(9.0f, 13.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                lineTo(9.0f, 15.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 5.414f)
                lineToRelative(1.707f, -1.707f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-1.563f, 1.562f)
                curveTo(15.483f, 2.708f, 13.824f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(-3.483f, 0.708f, -4.73f, 1.855f)
                lineTo(5.707f, 2.293f)
                lineTo(4.293f, 3.707f)
                lineTo(6.0f, 5.414f)
                arcTo(6.937f, 6.937f, 0.0f, false, false, 5.0f, 9.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 3.86f, 3.141f, 7.0f, 7.0f, 7.0f)
                reflectiveCurveToRelative(7.0f, -3.14f, 7.0f, -7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(6.937f, 6.937f, 0.0f, false, false, -1.0f, -3.586f)
                close()
                moveTo(17.0f, 13.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                reflectiveCurveToRelative(-5.0f, -2.243f, -5.0f, -5.0f)
                verticalLineTo(9.0f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.243f, 5.0f, 5.0f)
                verticalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _bxBugAlt!!
    }

private var _bxBugAlt: ImageVector? = null
