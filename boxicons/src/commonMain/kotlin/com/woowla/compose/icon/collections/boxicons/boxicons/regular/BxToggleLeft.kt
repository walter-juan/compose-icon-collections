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

public val RegularGroup.BxToggleLeft: ImageVector
    get() {
        if (_bxToggleLeft != null) {
            return _bxToggleLeft!!
        }
        _bxToggleLeft = Builder(name = "BxToggleLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 9.0f)
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
                curveToRelative(-3.3f, 0.0f, -5.989f, 2.689f, -6.0f, 6.0f)
                verticalLineToRelative(0.016f)
                arcTo(6.01f, 6.01f, 0.0f, false, false, 8.0f, 18.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(6.01f, 6.01f, 0.0f, false, false, 6.0f, -5.994f)
                lineTo(22.0f, 12.0f)
                curveToRelative(-0.009f, -3.309f, -2.699f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(16.0f, 16.0f)
                lineTo(8.0f, 16.0f)
                arcToRelative(4.006f, 4.006f, 0.0f, false, true, -4.0f, -3.99f)
                curveTo(4.004f, 9.799f, 5.798f, 8.0f, 8.0f, 8.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(2.202f, 0.0f, 3.996f, 1.799f, 4.0f, 4.006f)
                arcTo(4.007f, 4.007f, 0.0f, false, true, 16.0f, 16.0f)
                close()
                moveTo(20.0f, 12.016f)
                lineTo(20.443f, 12.012f)
                lineTo(21.0f, 12.016f)
                horizontalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _bxToggleLeft!!
    }

private var _bxToggleLeft: ImageVector? = null
