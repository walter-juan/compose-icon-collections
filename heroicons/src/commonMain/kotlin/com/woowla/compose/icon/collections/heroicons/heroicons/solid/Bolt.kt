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

public val SolidGroup.Bolt: ImageVector
    get() {
        if (_bolt != null) {
            return _bolt!!
        }
        _bolt = Builder(name = "Bolt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.615f, 1.595f)
                curveTo(14.916f, 1.763f, 15.064f, 2.115f, 14.974f, 2.447f)
                lineTo(12.982f, 9.75f)
                horizontalLineTo(20.25f)
                curveTo(20.549f, 9.75f, 20.819f, 9.927f, 20.938f, 10.201f)
                curveTo(21.057f, 10.475f, 21.002f, 10.793f, 20.798f, 11.012f)
                lineTo(10.298f, 22.262f)
                curveTo(10.063f, 22.514f, 9.686f, 22.573f, 9.385f, 22.405f)
                curveTo(9.084f, 22.237f, 8.936f, 21.885f, 9.026f, 21.553f)
                lineTo(11.018f, 14.25f)
                horizontalLineTo(3.75f)
                curveTo(3.451f, 14.25f, 3.181f, 14.073f, 3.062f, 13.799f)
                curveTo(2.943f, 13.525f, 2.998f, 13.207f, 3.202f, 12.988f)
                lineTo(13.702f, 1.738f)
                curveTo(13.937f, 1.486f, 14.314f, 1.427f, 14.615f, 1.595f)
                close()
            }
        }
        .build()
        return _bolt!!
    }

private var _bolt: ImageVector? = null
