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

public val RegularGroup.BxTimer: ImageVector
    get() {
        if (_bxTimer != null) {
            return _bxTimer!!
        }
        _bxTimer = Builder(name = "BxTimer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.145f, 8.27f)
                lineToRelative(1.563f, -1.563f)
                lineToRelative(-1.414f, -1.414f)
                lineTo(18.586f, 7.0f)
                curveToRelative(-1.05f, -0.63f, -2.274f, -1.0f, -3.586f, -1.0f)
                curveToRelative(-3.859f, 0.0f, -7.0f, 3.14f, -7.0f, 7.0f)
                reflectiveCurveToRelative(3.141f, 7.0f, 7.0f, 7.0f)
                reflectiveCurveToRelative(7.0f, -3.14f, 7.0f, -7.0f)
                arcToRelative(6.966f, 6.966f, 0.0f, false, false, -1.855f, -4.73f)
                close()
                moveTo(15.0f, 18.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.243f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.243f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.243f, 5.0f, -5.0f, 5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 10.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(13.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(3.0f, 8.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 10.0f)
                close()
                moveTo(3.0f, 16.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 18.0f)
                close()
                moveTo(2.0f, 12.0f)
                horizontalLineToRelative(3.99f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 14.0f)
                close()
            }
        }
        .build()
        return _bxTimer!!
    }

private var _bxTimer: ImageVector? = null
