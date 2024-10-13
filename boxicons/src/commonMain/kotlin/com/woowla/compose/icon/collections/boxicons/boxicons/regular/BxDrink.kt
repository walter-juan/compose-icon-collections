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

public val RegularGroup.BxDrink: ImageVector
    get() {
        if (_bxDrink != null) {
            return _bxDrink!!
        }
        _bxDrink = Builder(name = "BxDrink", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.832f, 4.555f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.0f, 3.0f)
                horizontalLineTo(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.832f, 1.554f)
                lineTo(11.0f, 16.303f)
                verticalLineTo(20.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.697f)
                lineToRelative(7.832f, -11.748f)
                close()
                moveTo(12.0f, 14.197f)
                lineTo(8.535f, 9.0f)
                horizontalLineToRelative(6.93f)
                lineTo(12.0f, 14.197f)
                close()
                moveTo(18.132f, 5.0f)
                lineToRelative(-1.333f, 2.0f)
                horizontalLineTo(7.201f)
                lineTo(5.868f, 5.0f)
                horizontalLineToRelative(12.264f)
                close()
            }
        }
        .build()
        return _bxDrink!!
    }

private var _bxDrink: ImageVector? = null
