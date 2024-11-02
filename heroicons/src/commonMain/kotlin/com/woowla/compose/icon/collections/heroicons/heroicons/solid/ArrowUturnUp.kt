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

public val SolidGroup.ArrowUturnUp: ImageVector
    get() {
        if (_arrowUturnUp != null) {
            return _arrowUturnUp!!
        }
        _arrowUturnUp = Builder(name = "ArrowUturnUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.53f, 9.53f)
                curveTo(21.237f, 9.823f, 20.763f, 9.823f, 20.47f, 9.53f)
                lineTo(15.75f, 4.811f)
                verticalLineTo(15.0f)
                curveTo(15.75f, 18.728f, 12.728f, 21.75f, 9.0f, 21.75f)
                curveTo(5.272f, 21.75f, 2.25f, 18.728f, 2.25f, 15.0f)
                lineTo(2.25f, 12.0f)
                curveTo(2.25f, 11.586f, 2.586f, 11.25f, 3.0f, 11.25f)
                curveTo(3.414f, 11.25f, 3.75f, 11.586f, 3.75f, 12.0f)
                lineTo(3.75f, 15.0f)
                curveTo(3.75f, 17.899f, 6.101f, 20.25f, 9.0f, 20.25f)
                curveTo(11.899f, 20.25f, 14.25f, 17.899f, 14.25f, 15.0f)
                verticalLineTo(4.811f)
                lineTo(9.53f, 9.53f)
                curveTo(9.237f, 9.823f, 8.763f, 9.823f, 8.47f, 9.53f)
                curveTo(8.177f, 9.237f, 8.177f, 8.763f, 8.47f, 8.47f)
                lineTo(14.47f, 2.47f)
                curveTo(14.763f, 2.177f, 15.237f, 2.177f, 15.53f, 2.47f)
                lineTo(21.53f, 8.47f)
                curveTo(21.823f, 8.763f, 21.823f, 9.237f, 21.53f, 9.53f)
                close()
            }
        }
        .build()
        return _arrowUturnUp!!
    }

private var _arrowUturnUp: ImageVector? = null
