package com.woowla.compose.icon.collections.boxicons.boxicons.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.LogosGroup

public val LogosGroup.BxlVimeo: ImageVector
    get() {
        if (_bxlVimeo != null) {
            return _bxlVimeo!!
        }
        _bxlVimeo = Builder(name = "BxlVimeo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.062f, 10.414f)
                curveToRelative(-2.036f, 4.349f, -6.949f, 10.267f, -10.054f, 10.267f)
                curveToRelative(-3.06f, 0.0f, -3.501f, -6.527f, -5.173f, -10.869f)
                curveToRelative(-0.823f, -2.138f, -1.354f, -1.646f, -2.896f, -0.567f)
                lineTo(2.0f, 8.031f)
                curveToRelative(2.248f, -1.976f, 4.499f, -4.272f, 5.88f, -4.399f)
                curveToRelative(1.559f, -0.148f, 2.517f, 0.916f, 2.873f, 3.193f)
                curveToRelative(0.475f, 2.994f, 1.137f, 7.641f, 2.291f, 7.641f)
                curveToRelative(0.9f, 0.0f, 3.117f, -3.686f, 3.232f, -5.004f)
                curveToRelative(0.203f, -1.93f, -1.421f, -1.989f, -2.828f, -1.387f)
                curveToRelative(2.228f, -7.295f, 11.494f, -5.95f, 7.614f, 2.339f)
                close()
            }
        }
        .build()
        return _bxlVimeo!!
    }

private var _bxlVimeo: ImageVector? = null
