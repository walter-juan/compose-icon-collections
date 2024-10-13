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

public val RegularGroup.BxSushi: ImageVector
    get() {
        if (_bxSushi != null) {
            return _bxSushi!!
        }
        _bxSushi = Builder(name = "BxSushi", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(7.51f, 2.0f, 4.0f, 4.2f, 4.0f, 7.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 2.8f, 3.51f, 5.0f, 8.0f, 5.0f)
                reflectiveCurveToRelative(8.0f, -2.2f, 8.0f, -5.0f)
                lineTo(20.0f, 7.0f)
                curveToRelative(0.0f, -2.8f, -3.51f, -5.0f, -8.0f, -5.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(-3.54f, 0.0f, -6.0f, -1.58f, -6.0f, -3.0f)
                verticalLineToRelative(-6.67f)
                arcTo(10.52f, 10.52f, 0.0f, false, false, 12.0f, 12.0f)
                arcToRelative(10.52f, 10.52f, 0.0f, false, false, 6.0f, -1.67f)
                lineTo(18.0f, 17.0f)
                curveToRelative(0.0f, 1.42f, -2.46f, 3.0f, -6.0f, 3.0f)
                close()
                moveTo(12.0f, 10.0f)
                curveToRelative(-3.54f, 0.0f, -6.0f, -1.58f, -6.0f, -3.0f)
                reflectiveCurveToRelative(2.46f, -3.0f, 6.0f, -3.0f)
                reflectiveCurveToRelative(6.0f, 1.58f, 6.0f, 3.0f)
                reflectiveCurveToRelative(-2.46f, 3.0f, -6.0f, 3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 7.0f)
                arcToRelative(3.0f, 1.71f, 0.0f, true, false, 6.0f, 0.0f)
                arcToRelative(3.0f, 1.71f, 0.0f, true, false, -6.0f, 0.0f)
                close()
            }
        }
        .build()
        return _bxSushi!!
    }

private var _bxSushi: ImageVector? = null
