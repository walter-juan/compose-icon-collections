package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val SolidGroup.RocketLaunch: ImageVector
    get() {
        if (_rocketLaunch != null) {
            return _rocketLaunch!!
        }
        _rocketLaunch = Builder(name = "RocketLaunch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.315f, 7.584f)
                curveTo(12.196f, 3.883f, 16.695f, 1.5f, 21.75f, 1.5f)
                curveTo(21.949f, 1.5f, 22.14f, 1.579f, 22.28f, 1.72f)
                curveTo(22.421f, 1.86f, 22.5f, 2.051f, 22.5f, 2.25f)
                curveTo(22.5f, 7.306f, 20.117f, 11.805f, 16.417f, 14.686f)
                curveTo(16.472f, 15.033f, 16.5f, 15.388f, 16.5f, 15.75f)
                curveTo(16.5f, 19.478f, 13.478f, 22.5f, 9.75f, 22.5f)
                curveTo(9.336f, 22.5f, 9.0f, 22.164f, 9.0f, 21.75f)
                verticalLineTo(17.618f)
                curveTo(8.991f, 17.612f, 8.982f, 17.605f, 8.973f, 17.598f)
                curveTo(8.021f, 16.843f, 7.158f, 15.98f, 6.403f, 15.028f)
                curveTo(6.396f, 15.019f, 6.389f, 15.01f, 6.382f, 15.0f)
                horizontalLineTo(2.25f)
                curveTo(1.836f, 15.0f, 1.5f, 14.664f, 1.5f, 14.25f)
                curveTo(1.5f, 10.522f, 4.522f, 7.5f, 8.25f, 7.5f)
                curveTo(8.612f, 7.5f, 8.968f, 7.529f, 9.315f, 7.584f)
                close()
                moveTo(15.0f, 6.75f)
                curveTo(13.757f, 6.75f, 12.75f, 7.757f, 12.75f, 9.0f)
                curveTo(12.75f, 10.243f, 13.757f, 11.25f, 15.0f, 11.25f)
                curveTo(16.243f, 11.25f, 17.25f, 10.243f, 17.25f, 9.0f)
                curveTo(17.25f, 7.757f, 16.243f, 6.75f, 15.0f, 6.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.26f, 17.242f)
                curveTo(5.592f, 16.994f, 5.661f, 16.524f, 5.413f, 16.192f)
                curveTo(5.165f, 15.86f, 4.695f, 15.792f, 4.363f, 16.039f)
                curveTo(3.082f, 16.995f, 2.25f, 18.526f, 2.25f, 20.25f)
                curveTo(2.25f, 20.525f, 2.271f, 20.797f, 2.312f, 21.062f)
                curveTo(2.363f, 21.384f, 2.616f, 21.637f, 2.938f, 21.688f)
                curveTo(3.203f, 21.729f, 3.474f, 21.75f, 3.75f, 21.75f)
                curveTo(5.474f, 21.75f, 7.005f, 20.918f, 7.96f, 19.636f)
                curveTo(8.208f, 19.305f, 8.14f, 18.834f, 7.808f, 18.587f)
                curveTo(7.476f, 18.339f, 7.006f, 18.407f, 6.758f, 18.74f)
                curveTo(6.073f, 19.658f, 4.981f, 20.25f, 3.75f, 20.25f)
                curveTo(3.75f, 19.019f, 4.342f, 17.927f, 5.26f, 17.242f)
                close()
            }
        }
        .build()
        return _rocketLaunch!!
    }

private var _rocketLaunch: ImageVector? = null
