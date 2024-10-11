package com.woowla.compose.icon.collections.remix.remix.food

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.FoodGroup

public val FoodGroup.BreadFill: ImageVector
    get() {
        if (_breadFill != null) {
            return _breadFill!!
        }
        _breadFill = Builder(name = "BreadFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 7.0f)
                curveTo(1.0f, 4.791f, 2.791f, 3.0f, 5.0f, 3.0f)
                horizontalLineTo(7.0f)
                curveTo(4.791f, 3.0f, 3.0f, 4.791f, 3.0f, 7.0f)
                curveTo(3.0f, 8.482f, 3.805f, 9.773f, 5.0f, 10.465f)
                verticalLineTo(19.0f)
                curveTo(5.0f, 20.657f, 6.343f, 22.0f, 8.0f, 22.0f)
                horizontalLineTo(6.0f)
                curveTo(4.343f, 22.0f, 3.0f, 20.657f, 3.0f, 19.0f)
                verticalLineTo(10.465f)
                curveTo(1.805f, 9.773f, 1.0f, 8.482f, 1.0f, 7.0f)
                close()
                moveTo(8.0f, 22.0f)
                verticalLineTo(20.0f)
                curveTo(7.448f, 20.0f, 7.0f, 19.552f, 7.0f, 19.0f)
                verticalLineTo(9.122f)
                lineTo(6.333f, 8.886f)
                curveTo(5.555f, 8.611f, 5.0f, 7.869f, 5.0f, 7.0f)
                curveTo(5.0f, 5.895f, 5.895f, 5.0f, 7.0f, 5.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(19.0f)
                curveTo(21.209f, 3.0f, 23.0f, 4.791f, 23.0f, 7.0f)
                curveTo(23.0f, 8.482f, 22.195f, 9.773f, 21.0f, 10.465f)
                verticalLineTo(19.0f)
                curveTo(21.0f, 20.657f, 19.657f, 22.0f, 18.0f, 22.0f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _breadFill!!
    }

private var _breadFill: ImageVector? = null
