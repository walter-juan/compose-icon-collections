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

public val LogosGroup.BxlPocket: ImageVector
    get() {
        if (_bxlPocket != null) {
            return _bxlPocket!!
        }
        _bxlPocket = Builder(name = "BxlPocket", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.327f, 3.983f)
                lineTo(4.746f, 3.983f)
                curveToRelative(-0.947f, 0.0f, -1.736f, 0.726f, -1.736f, 1.673f)
                verticalLineToRelative(5.396f)
                curveToRelative(0.0f, 4.892f, 4.04f, 8.964f, 9.026f, 8.964f)
                curveToRelative(4.955f, 0.0f, 8.964f, -4.072f, 8.964f, -8.964f)
                lineTo(21.0f, 5.656f)
                curveToRelative(0.0f, -0.947f, -0.758f, -1.673f, -1.673f, -1.673f)
                close()
                moveTo(17.149f, 10.674f)
                lineTo(12.856f, 14.714f)
                curveToRelative(-0.221f, 0.253f, -0.567f, 0.348f, -0.82f, 0.348f)
                curveToRelative(-0.315f, 0.0f, -0.631f, -0.095f, -0.884f, -0.348f)
                lineToRelative(-4.229f, -4.04f)
                curveToRelative(-0.441f, -0.473f, -0.504f, -1.262f, 0.0f, -1.768f)
                curveToRelative(0.475f, -0.441f, 1.263f, -0.504f, 1.736f, 0.0f)
                lineToRelative(3.377f, 3.251f)
                lineToRelative(3.44f, -3.251f)
                curveToRelative(0.441f, -0.504f, 1.23f, -0.441f, 1.673f, 0.0f)
                curveToRelative(0.442f, 0.506f, 0.442f, 1.295f, 0.0f, 1.768f)
                close()
            }
        }
        .build()
        return _bxlPocket!!
    }

private var _bxlPocket: ImageVector? = null
