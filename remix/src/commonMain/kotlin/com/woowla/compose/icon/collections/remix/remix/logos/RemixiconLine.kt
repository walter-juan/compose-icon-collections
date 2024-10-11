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

public val LogosGroup.RemixiconLine: ImageVector
    get() {
        if (_remixiconLine != null) {
            return _remixiconLine!!
        }
        _remixiconLine = Builder(name = "RemixiconLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.365f, 6.0f)
                lineTo(15.149f, 15.663f)
                lineTo(15.87f, 15.38f)
                curveTo(17.554f, 14.719f, 18.733f, 13.224f, 18.961f, 11.484f)
                curveTo(18.808f, 11.495f, 18.655f, 11.5f, 18.501f, 11.5f)
                curveTo(15.251f, 11.5f, 12.558f, 9.115f, 12.077f, 6.0f)
                horizontalLineTo(6.365f)
                close()
                moveTo(14.001f, 5.0f)
                curveTo(14.001f, 7.485f, 16.016f, 9.5f, 18.501f, 9.5f)
                curveTo(19.306f, 9.5f, 20.062f, 9.289f, 20.715f, 8.918f)
                curveTo(20.901f, 9.536f, 21.001f, 10.189f, 21.001f, 10.865f)
                curveTo(21.001f, 13.756f, 19.179f, 16.229f, 16.601f, 17.242f)
                lineTo(20.001f, 21.0f)
                horizontalLineTo(3.001f)
                verticalLineTo(4.0f)
                horizontalLineTo(14.001f)
                curveTo(14.038f, 4.0f, 14.075f, 4.0f, 14.112f, 4.001f)
                curveTo(14.039f, 4.322f, 14.001f, 4.657f, 14.001f, 5.0f)
                close()
                moveTo(18.501f, 7.5f)
                curveTo(17.12f, 7.5f, 16.001f, 6.381f, 16.001f, 5.0f)
                curveTo(16.001f, 3.619f, 17.12f, 2.5f, 18.501f, 2.5f)
                curveTo(19.882f, 2.5f, 21.001f, 3.619f, 21.001f, 5.0f)
                curveTo(21.001f, 6.381f, 19.882f, 7.5f, 18.501f, 7.5f)
                close()
                moveTo(5.001f, 7.47f)
                verticalLineTo(19.0f)
                horizontalLineTo(15.481f)
                lineTo(5.001f, 7.47f)
                close()
            }
        }
        .build()
        return _remixiconLine!!
    }

private var _remixiconLine: ImageVector? = null
