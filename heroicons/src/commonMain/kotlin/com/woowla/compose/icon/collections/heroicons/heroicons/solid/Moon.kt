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

public val SolidGroup.Moon: ImageVector
    get() {
        if (_moon != null) {
            return _moon!!
        }
        _moon = Builder(name = "Moon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.528f, 1.718f)
                curveTo(9.743f, 1.933f, 9.807f, 2.256f, 9.69f, 2.537f)
                curveTo(9.246f, 3.602f, 9.0f, 4.771f, 9.0f, 6.0f)
                curveTo(9.0f, 10.971f, 13.029f, 15.0f, 18.0f, 15.0f)
                curveTo(19.229f, 15.0f, 20.398f, 14.754f, 21.463f, 14.31f)
                curveTo(21.744f, 14.193f, 22.067f, 14.257f, 22.282f, 14.472f)
                curveTo(22.497f, 14.687f, 22.561f, 15.01f, 22.444f, 15.291f)
                curveTo(20.862f, 19.083f, 17.118f, 21.75f, 12.75f, 21.75f)
                curveTo(6.951f, 21.75f, 2.25f, 17.049f, 2.25f, 11.25f)
                curveTo(2.25f, 6.882f, 4.917f, 3.138f, 8.709f, 1.556f)
                curveTo(8.99f, 1.439f, 9.313f, 1.503f, 9.528f, 1.718f)
                close()
            }
        }
        .build()
        return _moon!!
    }

private var _moon: ImageVector? = null
