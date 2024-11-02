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

public val SolidGroup.Bell: ImageVector
    get() {
        if (_bell != null) {
            return _bell!!
        }
        _bell = Builder(name = "Bell", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.25f, 9.0f)
                curveTo(5.25f, 5.272f, 8.272f, 2.25f, 12.0f, 2.25f)
                curveTo(15.728f, 2.25f, 18.75f, 5.272f, 18.75f, 9.0f)
                lineTo(18.75f, 9.049f)
                verticalLineTo(9.75f)
                curveTo(18.75f, 11.873f, 19.551f, 13.807f, 20.868f, 15.27f)
                curveTo(21.035f, 15.455f, 21.099f, 15.71f, 21.039f, 15.952f)
                curveTo(20.98f, 16.193f, 20.804f, 16.389f, 20.571f, 16.476f)
                curveTo(19.027f, 17.045f, 17.41f, 17.466f, 15.74f, 17.719f)
                curveTo(15.747f, 17.812f, 15.75f, 17.906f, 15.75f, 18.0f)
                curveTo(15.75f, 20.071f, 14.071f, 21.75f, 12.0f, 21.75f)
                curveTo(9.929f, 21.75f, 8.25f, 20.071f, 8.25f, 18.0f)
                curveTo(8.25f, 17.906f, 8.254f, 17.812f, 8.26f, 17.719f)
                curveTo(6.589f, 17.466f, 4.973f, 17.045f, 3.429f, 16.476f)
                curveTo(3.195f, 16.389f, 3.02f, 16.193f, 2.96f, 15.952f)
                curveTo(2.901f, 15.71f, 2.965f, 15.455f, 3.131f, 15.27f)
                curveTo(4.449f, 13.807f, 5.25f, 11.873f, 5.25f, 9.75f)
                lineTo(5.25f, 9.0f)
                close()
                moveTo(9.752f, 17.899f)
                curveTo(9.751f, 17.933f, 9.75f, 17.966f, 9.75f, 18.0f)
                curveTo(9.75f, 19.243f, 10.757f, 20.25f, 12.0f, 20.25f)
                curveTo(13.243f, 20.25f, 14.25f, 19.243f, 14.25f, 18.0f)
                curveTo(14.25f, 17.966f, 14.249f, 17.933f, 14.248f, 17.899f)
                curveTo(13.507f, 17.966f, 12.757f, 18.0f, 12.0f, 18.0f)
                curveTo(11.242f, 18.0f, 10.493f, 17.966f, 9.752f, 17.899f)
                close()
            }
        }
        .build()
        return _bell!!
    }

private var _bell: ImageVector? = null
