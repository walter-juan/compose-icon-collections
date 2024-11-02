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

public val SolidGroup.ArrowUturnLeft: ImageVector
    get() {
        if (_arrowUturnLeft != null) {
            return _arrowUturnLeft!!
        }
        _arrowUturnLeft = Builder(name = "ArrowUturnLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.53f, 2.47f)
                curveTo(9.823f, 2.763f, 9.823f, 3.237f, 9.53f, 3.53f)
                lineTo(4.811f, 8.25f)
                horizontalLineTo(15.0f)
                curveTo(18.728f, 8.25f, 21.75f, 11.272f, 21.75f, 15.0f)
                curveTo(21.75f, 18.728f, 18.728f, 21.75f, 15.0f, 21.75f)
                horizontalLineTo(12.0f)
                curveTo(11.586f, 21.75f, 11.25f, 21.414f, 11.25f, 21.0f)
                curveTo(11.25f, 20.586f, 11.586f, 20.25f, 12.0f, 20.25f)
                horizontalLineTo(15.0f)
                curveTo(17.899f, 20.25f, 20.25f, 17.899f, 20.25f, 15.0f)
                curveTo(20.25f, 12.101f, 17.899f, 9.75f, 15.0f, 9.75f)
                horizontalLineTo(4.811f)
                lineTo(9.53f, 14.47f)
                curveTo(9.823f, 14.763f, 9.823f, 15.237f, 9.53f, 15.53f)
                curveTo(9.237f, 15.823f, 8.763f, 15.823f, 8.47f, 15.53f)
                lineTo(2.47f, 9.53f)
                curveTo(2.177f, 9.237f, 2.177f, 8.763f, 2.47f, 8.47f)
                lineTo(8.47f, 2.47f)
                curveTo(8.763f, 2.177f, 9.237f, 2.177f, 9.53f, 2.47f)
                close()
            }
        }
        .build()
        return _arrowUturnLeft!!
    }

private var _arrowUturnLeft: ImageVector? = null
