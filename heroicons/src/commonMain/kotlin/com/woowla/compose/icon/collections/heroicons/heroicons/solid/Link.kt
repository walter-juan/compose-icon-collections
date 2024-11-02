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

public val SolidGroup.Link: ImageVector
    get() {
        if (_link != null) {
            return _link!!
        }
        _link = Builder(name = "Link", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.902f, 4.098f)
                curveTo(18.437f, 2.634f, 16.063f, 2.634f, 14.598f, 4.098f)
                lineTo(10.098f, 8.598f)
                curveTo(8.634f, 10.063f, 8.634f, 12.437f, 10.098f, 13.902f)
                curveTo(10.409f, 14.212f, 10.76f, 14.457f, 11.133f, 14.635f)
                curveTo(11.507f, 14.813f, 11.665f, 15.261f, 11.486f, 15.635f)
                curveTo(11.308f, 16.009f, 10.86f, 16.167f, 10.486f, 15.988f)
                curveTo(9.962f, 15.738f, 9.471f, 15.395f, 9.038f, 14.962f)
                curveTo(6.987f, 12.912f, 6.987f, 9.588f, 9.038f, 7.538f)
                lineTo(13.538f, 3.038f)
                curveTo(15.588f, 0.987f, 18.912f, 0.987f, 20.962f, 3.038f)
                curveTo(23.013f, 5.088f, 23.013f, 8.412f, 20.962f, 10.462f)
                lineTo(19.205f, 12.219f)
                curveTo(18.912f, 12.512f, 18.438f, 12.512f, 18.145f, 12.219f)
                curveTo(17.852f, 11.926f, 17.852f, 11.451f, 18.145f, 11.159f)
                lineTo(19.902f, 9.402f)
                curveTo(21.366f, 7.937f, 21.366f, 5.563f, 19.902f, 4.098f)
                close()
                moveTo(12.514f, 8.365f)
                curveTo(12.692f, 7.991f, 13.14f, 7.833f, 13.514f, 8.012f)
                curveTo(14.038f, 8.262f, 14.529f, 8.605f, 14.962f, 9.038f)
                curveTo(17.013f, 11.088f, 17.013f, 14.412f, 14.962f, 16.462f)
                lineTo(10.462f, 20.962f)
                curveTo(8.412f, 23.013f, 5.088f, 23.013f, 3.038f, 20.962f)
                curveTo(0.987f, 18.912f, 0.987f, 15.588f, 3.038f, 13.538f)
                lineTo(4.795f, 11.781f)
                curveTo(5.088f, 11.488f, 5.562f, 11.488f, 5.855f, 11.781f)
                curveTo(6.148f, 12.074f, 6.148f, 12.549f, 5.855f, 12.841f)
                lineTo(4.098f, 14.598f)
                curveTo(2.634f, 16.063f, 2.634f, 18.437f, 4.098f, 19.902f)
                curveTo(5.563f, 21.366f, 7.937f, 21.366f, 9.402f, 19.902f)
                lineTo(13.902f, 15.402f)
                curveTo(15.366f, 13.937f, 15.366f, 11.563f, 13.902f, 10.098f)
                curveTo(13.591f, 9.787f, 13.24f, 9.543f, 12.867f, 9.365f)
                curveTo(12.493f, 9.187f, 12.335f, 8.739f, 12.514f, 8.365f)
                close()
            }
        }
        .build()
        return _link!!
    }

private var _link: ImageVector? = null
