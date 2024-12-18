package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.FigmaFill: ImageVector
    get() {
        if (_figmaFill != null) {
            return _figmaFill!!
        }
        _figmaFill = Builder(name = "FigmaFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.333f, 5.333f)
                curveTo(5.333f, 3.492f, 6.826f, 2.0f, 8.667f, 2.0f)
                horizontalLineTo(12.0f)
                horizontalLineTo(12.0f)
                horizontalLineTo(15.333f)
                curveTo(17.174f, 2.0f, 18.666f, 3.492f, 18.666f, 5.333f)
                curveTo(18.666f, 7.174f, 17.174f, 8.667f, 15.333f, 8.667f)
                horizontalLineTo(12.0f)
                horizontalLineTo(12.0f)
                lineTo(12.0f, 12.0f)
                lineTo(12.0f, 15.333f)
                verticalLineTo(18.667f)
                curveTo(12.0f, 20.508f, 10.507f, 22.0f, 8.666f, 22.0f)
                curveTo(6.825f, 22.0f, 5.333f, 20.508f, 5.333f, 18.667f)
                curveTo(5.333f, 16.826f, 6.825f, 15.333f, 8.666f, 15.333f)
                curveTo(6.825f, 15.333f, 5.333f, 13.841f, 5.333f, 12.0f)
                curveTo(5.333f, 10.159f, 6.825f, 8.667f, 8.666f, 8.667f)
                horizontalLineTo(8.667f)
                curveTo(6.826f, 8.667f, 5.333f, 7.174f, 5.333f, 5.333f)
                close()
                moveTo(12.0f, 12.0f)
                curveTo(12.0f, 13.841f, 13.492f, 15.333f, 15.333f, 15.333f)
                curveTo(17.174f, 15.333f, 18.666f, 13.841f, 18.666f, 12.0f)
                curveTo(18.666f, 10.159f, 17.174f, 8.667f, 15.333f, 8.667f)
                curveTo(13.492f, 8.667f, 12.0f, 10.159f, 12.0f, 12.0f)
                close()
            }
        }
        .build()
        return _figmaFill!!
    }

private var _figmaFill: ImageVector? = null
