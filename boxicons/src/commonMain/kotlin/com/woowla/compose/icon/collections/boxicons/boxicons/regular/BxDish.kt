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

public val RegularGroup.BxDish: ImageVector
    get() {
        if (_bxDish != null) {
            return _bxDish!!
        }
        _bxDish = Builder(name = "BxDish", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 15.0f)
                curveToRelative(0.0f, -4.625f, -3.507f, -8.441f, -8.0f, -8.941f)
                lineTo(13.0f, 4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.059f)
                curveToRelative(-4.493f, 0.5f, -8.0f, 4.316f, -8.0f, 8.941f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(5.0f, 15.0f)
                curveToRelative(0.0f, -3.859f, 3.141f, -7.0f, 7.0f, -7.0f)
                reflectiveCurveToRelative(7.0f, 3.141f, 7.0f, 7.0f)
                lineTo(5.0f, 15.0f)
                close()
                moveTo(2.0f, 18.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 20.0f)
                close()
            }
        }
        .build()
        return _bxDish!!
    }

private var _bxDish: ImageVector? = null
