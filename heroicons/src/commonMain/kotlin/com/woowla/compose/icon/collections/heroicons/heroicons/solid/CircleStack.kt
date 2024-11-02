package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.CircleStack: ImageVector
    get() {
        if (_circleStack != null) {
            return _circleStack!!
        }
        _circleStack = Builder(name = "CircleStack", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 6.375f)
                curveTo(21.0f, 9.067f, 16.971f, 11.25f, 12.0f, 11.25f)
                curveTo(7.029f, 11.25f, 3.0f, 9.067f, 3.0f, 6.375f)
                curveTo(3.0f, 3.683f, 7.029f, 1.5f, 12.0f, 1.5f)
                curveTo(16.971f, 1.5f, 21.0f, 3.683f, 21.0f, 6.375f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 12.75f)
                curveTo(14.685f, 12.75f, 17.191f, 12.164f, 19.078f, 11.141f)
                curveTo(19.768f, 10.767f, 20.425f, 10.304f, 20.975f, 9.757f)
                curveTo(20.992f, 9.878f, 21.0f, 10.001f, 21.0f, 10.125f)
                curveTo(21.0f, 12.817f, 16.971f, 15.0f, 12.0f, 15.0f)
                curveTo(7.029f, 15.0f, 3.0f, 12.817f, 3.0f, 10.125f)
                curveTo(3.0f, 10.001f, 3.009f, 9.878f, 3.025f, 9.757f)
                curveTo(3.575f, 10.304f, 4.232f, 10.767f, 4.922f, 11.141f)
                curveTo(6.809f, 12.164f, 9.315f, 12.75f, 12.0f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 16.5f)
                curveTo(14.685f, 16.5f, 17.191f, 15.914f, 19.078f, 14.891f)
                curveTo(19.768f, 14.517f, 20.425f, 14.054f, 20.975f, 13.507f)
                curveTo(20.992f, 13.628f, 21.0f, 13.751f, 21.0f, 13.875f)
                curveTo(21.0f, 16.567f, 16.971f, 18.75f, 12.0f, 18.75f)
                curveTo(7.029f, 18.75f, 3.0f, 16.567f, 3.0f, 13.875f)
                curveTo(3.0f, 13.751f, 3.009f, 13.628f, 3.025f, 13.507f)
                curveTo(3.575f, 14.054f, 4.232f, 14.517f, 4.922f, 14.891f)
                curveTo(6.809f, 15.914f, 9.315f, 16.5f, 12.0f, 16.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 20.25f)
                curveTo(14.685f, 20.25f, 17.191f, 19.664f, 19.078f, 18.641f)
                curveTo(19.768f, 18.267f, 20.425f, 17.804f, 20.975f, 17.257f)
                curveTo(20.992f, 17.378f, 21.0f, 17.501f, 21.0f, 17.625f)
                curveTo(21.0f, 20.317f, 16.971f, 22.5f, 12.0f, 22.5f)
                curveTo(7.029f, 22.5f, 3.0f, 20.317f, 3.0f, 17.625f)
                curveTo(3.0f, 17.501f, 3.009f, 17.378f, 3.025f, 17.257f)
                curveTo(3.575f, 17.804f, 4.232f, 18.267f, 4.922f, 18.641f)
                curveTo(6.809f, 19.664f, 9.315f, 20.25f, 12.0f, 20.25f)
                close()
            }
        }
        .build()
        return _circleStack!!
    }

private var _circleStack: ImageVector? = null
