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

public val SolidGroup.BellSnooze: ImageVector
    get() {
        if (_bellSnooze != null) {
            return _bellSnooze!!
        }
        _bellSnooze = Builder(name = "BellSnooze", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.25f)
                curveTo(8.272f, 2.25f, 5.25f, 5.272f, 5.25f, 9.0f)
                lineTo(5.25f, 9.75f)
                curveTo(5.25f, 11.873f, 4.449f, 13.807f, 3.131f, 15.27f)
                curveTo(2.965f, 15.455f, 2.901f, 15.71f, 2.96f, 15.952f)
                curveTo(3.02f, 16.193f, 3.195f, 16.389f, 3.429f, 16.476f)
                curveTo(4.973f, 17.045f, 6.589f, 17.466f, 8.26f, 17.719f)
                curveTo(8.254f, 17.812f, 8.25f, 17.906f, 8.25f, 18.0f)
                curveTo(8.25f, 20.071f, 9.929f, 21.75f, 12.0f, 21.75f)
                curveTo(14.071f, 21.75f, 15.75f, 20.071f, 15.75f, 18.0f)
                curveTo(15.75f, 17.906f, 15.747f, 17.812f, 15.74f, 17.719f)
                curveTo(17.41f, 17.466f, 19.027f, 17.045f, 20.571f, 16.476f)
                curveTo(20.804f, 16.389f, 20.98f, 16.193f, 21.039f, 15.952f)
                curveTo(21.099f, 15.71f, 21.035f, 15.455f, 20.868f, 15.27f)
                curveTo(19.551f, 13.807f, 18.75f, 11.873f, 18.75f, 9.75f)
                verticalLineTo(9.049f)
                lineTo(18.75f, 9.0f)
                curveTo(18.75f, 5.272f, 15.728f, 2.25f, 12.0f, 2.25f)
                close()
                moveTo(9.75f, 18.0f)
                curveTo(9.75f, 17.966f, 9.751f, 17.933f, 9.752f, 17.899f)
                curveTo(10.493f, 17.966f, 11.242f, 18.0f, 12.0f, 18.0f)
                curveTo(12.757f, 18.0f, 13.507f, 17.966f, 14.248f, 17.899f)
                curveTo(14.249f, 17.933f, 14.25f, 17.966f, 14.25f, 18.0f)
                curveTo(14.25f, 19.243f, 13.243f, 20.25f, 12.0f, 20.25f)
                curveTo(10.757f, 20.25f, 9.75f, 19.243f, 9.75f, 18.0f)
                close()
                moveTo(10.5f, 7.5f)
                curveTo(10.086f, 7.5f, 9.75f, 7.836f, 9.75f, 8.25f)
                curveTo(9.75f, 8.664f, 10.086f, 9.0f, 10.5f, 9.0f)
                horizontalLineTo(12.099f)
                lineTo(9.876f, 12.334f)
                curveTo(9.723f, 12.564f, 9.708f, 12.86f, 9.839f, 13.104f)
                curveTo(9.969f, 13.348f, 10.223f, 13.5f, 10.5f, 13.5f)
                horizontalLineTo(13.5f)
                curveTo(13.914f, 13.5f, 14.25f, 13.164f, 14.25f, 12.75f)
                curveTo(14.25f, 12.336f, 13.914f, 12.0f, 13.5f, 12.0f)
                horizontalLineTo(11.901f)
                lineTo(14.124f, 8.666f)
                curveTo(14.278f, 8.436f, 14.292f, 8.14f, 14.161f, 7.896f)
                curveTo(14.031f, 7.652f, 13.777f, 7.5f, 13.5f, 7.5f)
                horizontalLineTo(10.5f)
                close()
            }
        }
        .build()
        return _bellSnooze!!
    }

private var _bellSnooze: ImageVector? = null
