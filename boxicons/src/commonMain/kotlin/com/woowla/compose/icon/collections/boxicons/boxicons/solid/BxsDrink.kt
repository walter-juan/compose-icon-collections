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

public val SolidGroup.BxsDrink: ImageVector
    get() {
        if (_bxsDrink != null) {
            return _bxsDrink!!
        }
        _bxsDrink = Builder(name = "BxsDrink", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.832f, 4.555f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.0f, 3.0f)
                lineTo(4.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.832f, 1.554f)
                lineTo(11.0f, 16.303f)
                lineTo(11.0f, 20.0f)
                lineTo(8.0f, 20.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.697f)
                lineToRelative(7.832f, -11.748f)
                close()
                moveTo(18.132f, 5.0f)
                lineTo(16.132f, 8.0f)
                lineTo(7.868f, 8.0f)
                lineToRelative(-2.0f, -3.0f)
                horizontalLineToRelative(12.264f)
                close()
            }
        }
        .build()
        return _bxsDrink!!
    }

private var _bxsDrink: ImageVector? = null
