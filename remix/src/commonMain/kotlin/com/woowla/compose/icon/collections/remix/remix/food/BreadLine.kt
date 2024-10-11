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

public val FoodGroup.BreadLine: ImageVector
    get() {
        if (_breadLine != null) {
            return _breadLine!!
        }
        _breadLine = Builder(name = "BreadLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 3.0f)
                curveTo(2.791f, 3.0f, 1.0f, 4.791f, 1.0f, 7.0f)
                curveTo(1.0f, 8.482f, 1.805f, 9.773f, 3.0f, 10.465f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.657f, 4.343f, 22.0f, 6.0f, 22.0f)
                horizontalLineTo(18.0f)
                curveTo(19.657f, 22.0f, 21.0f, 20.657f, 21.0f, 19.0f)
                verticalLineTo(10.465f)
                curveTo(22.195f, 9.773f, 23.0f, 8.482f, 23.0f, 7.0f)
                curveTo(23.0f, 4.791f, 21.209f, 3.0f, 19.0f, 3.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(7.0f, 20.0f)
                curveTo(6.448f, 20.0f, 6.0f, 19.552f, 6.0f, 19.0f)
                verticalLineTo(9.122f)
                lineTo(5.333f, 8.886f)
                curveTo(4.555f, 8.611f, 4.0f, 7.869f, 4.0f, 7.0f)
                curveTo(4.0f, 5.895f, 4.895f, 5.0f, 6.0f, 5.0f)
                horizontalLineTo(19.0f)
                curveTo(20.105f, 5.0f, 21.0f, 5.895f, 21.0f, 7.0f)
                curveTo(21.0f, 7.869f, 20.445f, 8.611f, 19.667f, 8.886f)
                lineTo(19.0f, 9.122f)
                verticalLineTo(19.0f)
                curveTo(19.0f, 19.552f, 18.552f, 20.0f, 18.0f, 20.0f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _breadLine!!
    }

private var _breadLine: ImageVector? = null
