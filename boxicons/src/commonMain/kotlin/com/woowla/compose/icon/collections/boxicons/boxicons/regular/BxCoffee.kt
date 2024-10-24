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

public val RegularGroup.BxCoffee: ImageVector
    get() {
        if (_bxCoffee != null) {
            return _bxCoffee!!
        }
        _bxCoffee = Builder(name = "BxCoffee", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                lineTo(5.0f, 5.0f)
                close()
                moveTo(9.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                lineTo(9.0f, 5.0f)
                close()
                moveTo(13.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(19.0f, 9.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(17.0f, 7.0f)
                lineTo(3.0f, 7.0f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(15.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(6.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(5.0f, 9.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(9.0f)
                close()
                moveTo(17.0f, 16.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(0.002f, 5.0f)
                lineTo(17.0f, 16.0f)
                close()
            }
        }
        .build()
        return _bxCoffee!!
    }

private var _bxCoffee: ImageVector? = null