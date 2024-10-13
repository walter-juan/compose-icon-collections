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

public val RegularGroup.BxToggleRight: ImageVector
    get() {
        if (_bxToggleRight != null) {
            return _bxToggleRight!!
        }
        _bxToggleRight = Builder(name = "BxToggleRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 9.0f)
                curveToRelative(-1.628f, 0.0f, -3.0f, 1.372f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.372f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.372f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.372f, -3.0f, -3.0f, -3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 6.0f)
                lineTo(8.0f, 6.0f)
                curveToRelative(-3.296f, 0.0f, -5.982f, 2.682f, -6.0f, 5.986f)
                verticalLineToRelative(0.042f)
                arcTo(6.01f, 6.01f, 0.0f, false, false, 8.0f, 18.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, -2.691f, 6.0f, -6.0f)
                reflectiveCurveToRelative(-2.691f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(16.0f, 16.0f)
                lineTo(8.0f, 16.0f)
                arcToRelative(4.006f, 4.006f, 0.0f, false, true, -4.0f, -3.99f)
                curveTo(4.004f, 9.799f, 5.798f, 8.0f, 8.0f, 8.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.794f, 4.0f, -4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _bxToggleRight!!
    }

private var _bxToggleRight: ImageVector? = null
