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

public val SolidGroup.BxsBasket: ImageVector
    get() {
        if (_bxsBasket != null) {
            return _bxsBasket!!
        }
        _bxsBasket = Builder(name = "BxsBasket", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.132f, 2.504f)
                lineTo(4.42f, 9.0f)
                lineTo(3.0f, 9.0f)
                arcToRelative(1.001f, 1.001f, 0.0f, false, false, -0.965f, 1.263f)
                lineToRelative(2.799f, 10.263f)
                arcTo(2.004f, 2.004f, 0.0f, false, false, 6.764f, 22.0f)
                horizontalLineToRelative(10.473f)
                curveToRelative(0.898f, 0.0f, 1.692f, -0.605f, 1.93f, -1.475f)
                lineToRelative(2.799f, -10.263f)
                arcTo(0.998f, 0.998f, 0.0f, false, false, 21.0f, 9.0f)
                horizontalLineToRelative(-1.42f)
                lineToRelative(-3.712f, -6.496f)
                lineToRelative(-1.736f, 0.992f)
                lineTo(17.277f, 9.0f)
                lineTo(6.723f, 9.0f)
                lineToRelative(3.145f, -5.504f)
                lineToRelative(-1.736f, -0.992f)
                close()
                moveTo(14.0f, 13.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(8.0f, 13.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                lineTo(8.0f, 18.0f)
                verticalLineToRelative(-5.0f)
                close()
            }
        }
        .build()
        return _bxsBasket!!
    }

private var _bxsBasket: ImageVector? = null
