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

public val SolidGroup.XMark: ImageVector
    get() {
        if (_xMark != null) {
            return _xMark!!
        }
        _xMark = Builder(name = "XMark", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.47f, 5.47f)
                curveTo(5.763f, 5.177f, 6.237f, 5.177f, 6.53f, 5.47f)
                lineTo(12.0f, 10.939f)
                lineTo(17.47f, 5.47f)
                curveTo(17.763f, 5.177f, 18.237f, 5.177f, 18.53f, 5.47f)
                curveTo(18.823f, 5.763f, 18.823f, 6.237f, 18.53f, 6.53f)
                lineTo(13.061f, 12.0f)
                lineTo(18.53f, 17.47f)
                curveTo(18.823f, 17.763f, 18.823f, 18.237f, 18.53f, 18.53f)
                curveTo(18.237f, 18.823f, 17.763f, 18.823f, 17.47f, 18.53f)
                lineTo(12.0f, 13.061f)
                lineTo(6.53f, 18.53f)
                curveTo(6.237f, 18.823f, 5.763f, 18.823f, 5.47f, 18.53f)
                curveTo(5.177f, 18.237f, 5.177f, 17.763f, 5.47f, 17.47f)
                lineTo(10.939f, 12.0f)
                lineTo(5.47f, 6.53f)
                curveTo(5.177f, 6.237f, 5.177f, 5.763f, 5.47f, 5.47f)
                close()
            }
        }
        .build()
        return _xMark!!
    }

private var _xMark: ImageVector? = null
