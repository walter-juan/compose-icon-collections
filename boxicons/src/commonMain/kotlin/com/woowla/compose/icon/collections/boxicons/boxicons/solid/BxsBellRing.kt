package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsBellRing: ImageVector
    get() {
        if (_bxsBellRing != null) {
            return _bxsBellRing!!
        }
        _bxsBellRing = Builder(name = "BxsBellRing", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.705f, 3.71f)
                lineToRelative(-1.41f, -1.42f)
                curveTo(1.0f, 5.563f, 1.0f, 7.935f, 1.0f, 11.0f)
                horizontalLineToRelative(1.0f)
                lineToRelative(1.0f, -0.063f)
                curveTo(3.0f, 8.009f, 3.0f, 6.396f, 5.705f, 3.71f)
                close()
                moveTo(19.704f, 2.29f)
                lineTo(18.296f, 3.71f)
                curveTo(21.0f, 6.396f, 21.0f, 8.009f, 21.0f, 11.0f)
                lineToRelative(2.0f, -0.063f)
                curveToRelative(0.0f, -3.002f, 0.0f, -5.374f, -3.296f, -8.647f)
                close()
                moveTo(12.0f, 22.0f)
                arcToRelative(2.98f, 2.98f, 0.0f, false, false, 2.818f, -2.0f)
                lineTo(9.182f, 20.0f)
                arcTo(2.98f, 2.98f, 0.0f, false, false, 12.0f, 22.0f)
                close()
                moveTo(19.0f, 14.586f)
                lineTo(19.0f, 10.0f)
                curveToRelative(0.0f, -3.217f, -2.185f, -5.927f, -5.145f, -6.742f)
                curveTo(13.562f, 2.52f, 12.846f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(-1.562f, 0.52f, -1.855f, 1.258f)
                curveTo(7.184f, 4.073f, 5.0f, 6.783f, 5.0f, 10.0f)
                verticalLineToRelative(4.586f)
                lineToRelative(-1.707f, 1.707f)
                arcTo(0.996f, 0.996f, 0.0f, false, false, 3.0f, 17.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(0.996f, 0.996f, 0.0f, false, false, -0.293f, -0.707f)
                lineTo(19.0f, 14.586f)
                close()
            }
        }
        .build()
        return _bxsBellRing!!
    }

private var _bxsBellRing: ImageVector? = null
