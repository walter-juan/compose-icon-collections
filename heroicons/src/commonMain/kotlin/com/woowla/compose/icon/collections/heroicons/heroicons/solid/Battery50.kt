package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.Battery50: ImageVector
    get() {
        if (_battery50 != null) {
            return _battery50!!
        }
        _battery50 = Builder(name = "Battery50", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 9.75f)
                curveTo(4.086f, 9.75f, 3.75f, 10.086f, 3.75f, 10.5f)
                verticalLineTo(15.0f)
                curveTo(3.75f, 15.414f, 4.086f, 15.75f, 4.5f, 15.75f)
                horizontalLineTo(11.25f)
                curveTo(11.664f, 15.75f, 12.0f, 15.414f, 12.0f, 15.0f)
                verticalLineTo(10.5f)
                curveTo(12.0f, 10.086f, 11.664f, 9.75f, 11.25f, 9.75f)
                horizontalLineTo(4.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.75f, 6.75f)
                curveTo(2.093f, 6.75f, 0.75f, 8.093f, 0.75f, 9.75f)
                verticalLineTo(15.75f)
                curveTo(0.75f, 17.407f, 2.093f, 18.75f, 3.75f, 18.75f)
                horizontalLineTo(18.75f)
                curveTo(20.407f, 18.75f, 21.75f, 17.407f, 21.75f, 15.75f)
                verticalLineTo(15.712f)
                curveTo(22.606f, 15.539f, 23.25f, 14.782f, 23.25f, 13.875f)
                verticalLineTo(11.625f)
                curveTo(23.25f, 10.718f, 22.606f, 9.961f, 21.75f, 9.788f)
                verticalLineTo(9.75f)
                curveTo(21.75f, 8.093f, 20.407f, 6.75f, 18.75f, 6.75f)
                horizontalLineTo(3.75f)
                close()
                moveTo(18.75f, 8.25f)
                curveTo(19.578f, 8.25f, 20.25f, 8.922f, 20.25f, 9.75f)
                verticalLineTo(15.75f)
                curveTo(20.25f, 16.578f, 19.578f, 17.25f, 18.75f, 17.25f)
                horizontalLineTo(3.75f)
                curveTo(2.922f, 17.25f, 2.25f, 16.578f, 2.25f, 15.75f)
                verticalLineTo(9.75f)
                curveTo(2.25f, 8.922f, 2.922f, 8.25f, 3.75f, 8.25f)
                horizontalLineTo(18.75f)
                close()
            }
        }
        .build()
        return _battery50!!
    }

private var _battery50: ImageVector? = null
