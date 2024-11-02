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

public val SolidGroup.Funnel: ImageVector
    get() {
        if (_funnel != null) {
            return _funnel!!
        }
        _funnel = Builder(name = "Funnel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.792f, 2.938f)
                curveTo(6.461f, 2.486f, 9.203f, 2.25f, 12.0f, 2.25f)
                curveTo(14.797f, 2.25f, 17.539f, 2.486f, 20.208f, 2.938f)
                curveTo(21.111f, 3.091f, 21.75f, 3.877f, 21.75f, 4.774f)
                verticalLineTo(5.818f)
                curveTo(21.75f, 6.614f, 21.434f, 7.377f, 20.871f, 7.939f)
                lineTo(14.689f, 14.121f)
                curveTo(14.408f, 14.403f, 14.25f, 14.784f, 14.25f, 15.182f)
                verticalLineTo(18.109f)
                curveTo(14.25f, 19.246f, 13.608f, 20.285f, 12.592f, 20.793f)
                lineTo(10.835f, 21.671f)
                curveTo(10.603f, 21.787f, 10.327f, 21.775f, 10.106f, 21.638f)
                curveTo(9.885f, 21.501f, 9.75f, 21.26f, 9.75f, 21.0f)
                verticalLineTo(15.182f)
                curveTo(9.75f, 14.784f, 9.592f, 14.403f, 9.311f, 14.121f)
                lineTo(3.129f, 7.939f)
                curveTo(2.566f, 7.377f, 2.25f, 6.614f, 2.25f, 5.818f)
                verticalLineTo(4.774f)
                curveTo(2.25f, 3.877f, 2.889f, 3.091f, 3.792f, 2.938f)
                close()
            }
        }
        .build()
        return _funnel!!
    }

private var _funnel: ImageVector? = null
