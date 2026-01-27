package com.woowla.compose.icon.collections.remix.remix.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.OthersGroup

public val OthersGroup.LightbulbAiFill: ImageVector
    get() {
        if (_lightbulbAiFill != null) {
            return _lightbulbAiFill!!
        }
        _lightbulbAiFill = Builder(name = "LightbulbAiFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 21.0f)
                curveTo(16.0f, 22.105f, 15.105f, 23.0f, 14.0f, 23.0f)
                horizontalLineTo(10.0f)
                curveTo(8.895f, 23.0f, 8.0f, 22.105f, 8.0f, 21.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(21.0f)
                close()
                moveTo(12.339f, 2.009f)
                curveTo(12.12f, 2.632f, 12.0f, 3.302f, 12.0f, 4.0f)
                curveTo(12.0f, 7.314f, 14.686f, 10.0f, 18.0f, 10.0f)
                curveTo(18.698f, 10.0f, 19.367f, 9.879f, 19.99f, 9.66f)
                curveTo(19.995f, 9.773f, 20.0f, 9.886f, 20.0f, 10.0f)
                curveTo(20.0f, 11.892f, 19.343f, 13.631f, 18.244f, 15.001f)
                curveTo(17.694f, 15.687f, 16.355f, 16.728f, 16.059f, 18.0f)
                horizontalLineTo(7.941f)
                curveTo(7.644f, 16.727f, 6.304f, 15.686f, 5.754f, 14.999f)
                curveTo(4.656f, 13.63f, 4.0f, 11.891f, 4.0f, 10.0f)
                curveTo(4.0f, 5.582f, 7.582f, 2.0f, 12.0f, 2.0f)
                curveTo(12.113f, 2.0f, 12.226f, 2.004f, 12.339f, 2.009f)
                close()
                moveTo(17.529f, 0.328f)
                curveTo(17.706f, -0.097f, 18.294f, -0.097f, 18.471f, 0.328f)
                lineTo(18.724f, 0.94f)
                curveTo(19.156f, 1.982f, 19.962f, 2.815f, 20.975f, 3.266f)
                lineTo(21.692f, 3.585f)
                curveTo(22.103f, 3.768f, 22.103f, 4.365f, 21.692f, 4.548f)
                lineTo(20.933f, 4.886f)
                curveTo(19.945f, 5.325f, 19.153f, 6.128f, 18.714f, 7.137f)
                lineTo(18.467f, 7.702f)
                curveTo(18.286f, 8.116f, 17.714f, 8.116f, 17.533f, 7.702f)
                lineTo(17.287f, 7.137f)
                curveTo(16.848f, 6.128f, 16.055f, 5.325f, 15.067f, 4.886f)
                lineTo(14.308f, 4.548f)
                curveTo(13.897f, 4.365f, 13.897f, 3.768f, 14.308f, 3.585f)
                lineTo(15.025f, 3.266f)
                curveTo(16.038f, 2.815f, 16.844f, 1.982f, 17.276f, 0.94f)
                lineTo(17.529f, 0.328f)
                close()
            }
        }
        .build()
        return _lightbulbAiFill!!
    }

private var _lightbulbAiFill: ImageVector? = null
