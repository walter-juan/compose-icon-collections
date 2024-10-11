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

public val LogosGroup.YuqueFill: ImageVector
    get() {
        if (_yuqueFill != null) {
            return _yuqueFill!!
        }
        _yuqueFill = Builder(name = "YuqueFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.281f, 2.955f)
                curveTo(20.25f, 3.158f, 21.036f, 5.297f, 21.12f, 5.552f)
                lineTo(22.417f, 5.648f)
                curveTo(22.547f, 5.648f, 22.586f, 5.828f, 22.471f, 5.884f)
                curveTo(21.148f, 6.6f, 20.744f, 8.055f, 20.981f, 9.002f)
                curveTo(21.071f, 9.36f, 21.235f, 9.692f, 21.393f, 10.022f)
                curveTo(21.7f, 10.664f, 22.044f, 11.44f, 22.1f, 13.003f)
                curveTo(22.217f, 16.242f, 19.59f, 19.178f, 16.312f, 19.596f)
                curveTo(17.481f, 18.409f, 18.126f, 17.152f, 18.431f, 16.221f)
                curveTo(19.037f, 14.375f, 18.939f, 12.905f, 18.486f, 11.781f)
                curveTo(18.038f, 10.673f, 17.281f, 9.99f, 16.704f, 9.64f)
                curveTo(15.021f, 8.62f, 13.485f, 8.549f, 12.26f, 8.878f)
                curveTo(12.725f, 8.284f, 13.136f, 7.677f, 13.46f, 7.014f)
                curveTo(14.044f, 5.364f, 13.358f, 4.166f, 12.756f, 3.495f)
                curveTo(12.564f, 3.249f, 12.695f, 2.84f, 13.061f, 2.84f)
                curveTo(14.47f, 2.84f, 15.874f, 2.86f, 17.281f, 2.955f)
                close()
                moveTo(3.319f, 19.107f)
                curveTo(5.243f, 16.905f, 8.031f, 13.713f, 10.481f, 10.956f)
                curveTo(11.04f, 10.328f, 13.25f, 8.619f, 16.229f, 10.424f)
                curveTo(17.107f, 10.956f, 18.659f, 12.589f, 17.56f, 15.935f)
                curveTo(16.758f, 18.38f, 13.153f, 23.73f, 1.801f, 21.778f)
                curveTo(1.574f, 21.739f, 1.29f, 21.424f, 1.583f, 21.09f)
                curveTo(1.998f, 20.618f, 2.598f, 19.932f, 3.319f, 19.107f)
                close()
            }
        }
        .build()
        return _yuqueFill!!
    }

private var _yuqueFill: ImageVector? = null
