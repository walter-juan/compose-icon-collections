package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.Battery0: ImageVector
    get() {
        if (_battery0 != null) {
            return _battery0!!
        }
        _battery0 = Builder(name = "Battery0", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(0.75f, 9.75f)
                curveTo(0.75f, 8.093f, 2.093f, 6.75f, 3.75f, 6.75f)
                horizontalLineTo(18.75f)
                curveTo(20.407f, 6.75f, 21.75f, 8.093f, 21.75f, 9.75f)
                verticalLineTo(9.788f)
                curveTo(22.606f, 9.961f, 23.25f, 10.718f, 23.25f, 11.625f)
                verticalLineTo(13.875f)
                curveTo(23.25f, 14.782f, 22.606f, 15.539f, 21.75f, 15.712f)
                verticalLineTo(15.75f)
                curveTo(21.75f, 17.407f, 20.407f, 18.75f, 18.75f, 18.75f)
                horizontalLineTo(3.75f)
                curveTo(2.093f, 18.75f, 0.75f, 17.407f, 0.75f, 15.75f)
                verticalLineTo(9.75f)
                close()
                moveTo(20.25f, 9.75f)
                curveTo(20.25f, 8.922f, 19.578f, 8.25f, 18.75f, 8.25f)
                horizontalLineTo(3.75f)
                curveTo(2.922f, 8.25f, 2.25f, 8.922f, 2.25f, 9.75f)
                verticalLineTo(15.75f)
                curveTo(2.25f, 16.578f, 2.922f, 17.25f, 3.75f, 17.25f)
                horizontalLineTo(18.75f)
                curveTo(19.578f, 17.25f, 20.25f, 16.578f, 20.25f, 15.75f)
                verticalLineTo(9.75f)
                close()
            }
        }
        .build()
        return _battery0!!
    }

private var _battery0: ImageVector? = null
