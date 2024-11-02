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

public val SolidGroup.Star: ImageVector
    get() {
        if (_star != null) {
            return _star!!
        }
        _star = Builder(name = "Star", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.788f, 3.211f)
                curveTo(11.236f, 2.133f, 12.764f, 2.133f, 13.212f, 3.211f)
                lineTo(15.294f, 8.216f)
                lineTo(20.698f, 8.65f)
                curveTo(21.862f, 8.743f, 22.333f, 10.195f, 21.447f, 10.955f)
                lineTo(17.33f, 14.482f)
                lineTo(18.587f, 19.755f)
                curveTo(18.858f, 20.891f, 17.623f, 21.788f, 16.627f, 21.18f)
                lineTo(12.0f, 18.354f)
                lineTo(7.373f, 21.18f)
                curveTo(6.377f, 21.788f, 5.142f, 20.891f, 5.412f, 19.755f)
                lineTo(6.67f, 14.482f)
                lineTo(2.553f, 10.955f)
                curveTo(1.666f, 10.195f, 2.138f, 8.743f, 3.302f, 8.65f)
                lineTo(8.706f, 8.216f)
                lineTo(10.788f, 3.211f)
                close()
            }
        }
        .build()
        return _star!!
    }

private var _star: ImageVector? = null
