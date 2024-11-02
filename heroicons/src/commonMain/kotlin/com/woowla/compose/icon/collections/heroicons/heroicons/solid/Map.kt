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

public val SolidGroup.Map: ImageVector
    get() {
        if (_map != null) {
            return _map!!
        }
        _map = Builder(name = "Map", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.161f, 2.581f)
                curveTo(8.689f, 2.317f, 9.311f, 2.317f, 9.839f, 2.581f)
                lineTo(14.832f, 5.078f)
                curveTo(14.938f, 5.13f, 15.062f, 5.13f, 15.168f, 5.078f)
                lineTo(19.037f, 3.143f)
                curveTo(20.283f, 2.52f, 21.75f, 3.426f, 21.75f, 4.82f)
                verticalLineTo(17.305f)
                curveTo(21.75f, 18.015f, 21.349f, 18.664f, 20.713f, 18.982f)
                lineTo(15.839f, 21.419f)
                curveTo(15.311f, 21.683f, 14.689f, 21.683f, 14.161f, 21.419f)
                lineTo(9.168f, 18.922f)
                curveTo(9.062f, 18.87f, 8.938f, 18.87f, 8.832f, 18.922f)
                lineTo(4.964f, 20.857f)
                curveTo(3.717f, 21.48f, 2.25f, 20.574f, 2.25f, 19.18f)
                verticalLineTo(6.695f)
                curveTo(2.25f, 5.985f, 2.651f, 5.336f, 3.286f, 5.018f)
                lineTo(8.161f, 2.581f)
                close()
                moveTo(9.0f, 6.0f)
                curveTo(9.414f, 6.0f, 9.75f, 6.336f, 9.75f, 6.75f)
                verticalLineTo(15.0f)
                curveTo(9.75f, 15.414f, 9.414f, 15.75f, 9.0f, 15.75f)
                curveTo(8.586f, 15.75f, 8.25f, 15.414f, 8.25f, 15.0f)
                verticalLineTo(6.75f)
                curveTo(8.25f, 6.336f, 8.586f, 6.0f, 9.0f, 6.0f)
                close()
                moveTo(15.75f, 9.0f)
                curveTo(15.75f, 8.586f, 15.414f, 8.25f, 15.0f, 8.25f)
                curveTo(14.586f, 8.25f, 14.25f, 8.586f, 14.25f, 9.0f)
                verticalLineTo(17.25f)
                curveTo(14.25f, 17.664f, 14.586f, 18.0f, 15.0f, 18.0f)
                curveTo(15.414f, 18.0f, 15.75f, 17.664f, 15.75f, 17.25f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _map!!
    }

private var _map: ImageVector? = null
