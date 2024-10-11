package com.woowla.compose.icon.collections.remix.remix.healthandmedical

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.HealthAndMedicalGroup

public val HealthAndMedicalGroup.DropperFill: ImageVector
    get() {
        if (_dropperFill != null) {
            return _dropperFill!!
        }
        _dropperFill = Builder(name = "DropperFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.535f, 2.807f)
                curveTo(17.098f, 1.245f, 19.63f, 1.245f, 21.192f, 2.807f)
                curveTo(22.754f, 4.37f, 22.754f, 6.902f, 21.192f, 8.464f)
                lineTo(18.364f, 11.293f)
                lineTo(18.718f, 11.647f)
                curveTo(19.108f, 12.037f, 19.108f, 12.67f, 18.718f, 13.061f)
                curveTo(18.327f, 13.451f, 17.694f, 13.451f, 17.303f, 13.061f)
                lineTo(16.95f, 12.707f)
                lineTo(10.735f, 18.922f)
                curveTo(10.177f, 19.48f, 9.465f, 19.861f, 8.691f, 20.016f)
                lineTo(6.937f, 20.367f)
                curveTo(6.55f, 20.444f, 6.194f, 20.635f, 5.915f, 20.914f)
                lineTo(4.929f, 21.9f)
                curveTo(4.538f, 22.29f, 3.905f, 22.29f, 3.515f, 21.9f)
                lineTo(2.101f, 20.486f)
                curveTo(1.71f, 20.095f, 1.71f, 19.462f, 2.101f, 19.071f)
                lineTo(3.087f, 18.085f)
                curveTo(3.366f, 17.806f, 3.556f, 17.45f, 3.633f, 17.063f)
                lineTo(3.984f, 15.309f)
                curveTo(4.139f, 14.535f, 4.52f, 13.823f, 5.078f, 13.265f)
                lineTo(11.293f, 7.05f)
                lineTo(10.939f, 6.697f)
                curveTo(10.549f, 6.306f, 10.549f, 5.673f, 10.939f, 5.283f)
                curveTo(11.33f, 4.892f, 11.963f, 4.892f, 12.354f, 5.283f)
                lineTo(12.707f, 5.636f)
                lineTo(15.535f, 2.807f)
                close()
                moveTo(12.707f, 8.465f)
                lineTo(6.492f, 14.679f)
                curveTo(6.213f, 14.959f, 6.023f, 15.314f, 5.945f, 15.701f)
                lineTo(5.595f, 17.455f)
                curveTo(5.44f, 18.23f, 5.059f, 18.941f, 4.501f, 19.5f)
                curveTo(5.059f, 18.941f, 5.77f, 18.56f, 6.545f, 18.406f)
                lineTo(8.299f, 18.055f)
                curveTo(8.686f, 17.977f, 9.042f, 17.787f, 9.321f, 17.508f)
                lineTo(15.535f, 11.293f)
                lineTo(12.707f, 8.465f)
                close()
            }
        }
        .build()
        return _dropperFill!!
    }

private var _dropperFill: ImageVector? = null
