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

public val SolidGroup.Eye: ImageVector
    get() {
        if (_eye != null) {
            return _eye!!
        }
        _eye = Builder(name = "Eye", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 15.0f)
                curveTo(13.657f, 15.0f, 15.0f, 13.657f, 15.0f, 12.0f)
                curveTo(15.0f, 10.343f, 13.657f, 9.0f, 12.0f, 9.0f)
                curveTo(10.343f, 9.0f, 9.0f, 10.343f, 9.0f, 12.0f)
                curveTo(9.0f, 13.657f, 10.343f, 15.0f, 12.0f, 15.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.323f, 11.447f)
                curveTo(2.811f, 6.976f, 7.028f, 3.75f, 12.0f, 3.75f)
                curveTo(16.971f, 3.75f, 21.186f, 6.973f, 22.676f, 11.441f)
                curveTo(22.796f, 11.802f, 22.796f, 12.192f, 22.676f, 12.553f)
                curveTo(21.189f, 17.024f, 16.971f, 20.25f, 11.999f, 20.25f)
                curveTo(7.028f, 20.25f, 2.813f, 17.027f, 1.324f, 12.559f)
                curveTo(1.203f, 12.198f, 1.203f, 11.808f, 1.323f, 11.447f)
                close()
                moveTo(17.25f, 12.0f)
                curveTo(17.25f, 14.899f, 14.899f, 17.25f, 12.0f, 17.25f)
                curveTo(9.101f, 17.25f, 6.75f, 14.899f, 6.75f, 12.0f)
                curveTo(6.75f, 9.101f, 9.101f, 6.75f, 12.0f, 6.75f)
                curveTo(14.899f, 6.75f, 17.25f, 9.101f, 17.25f, 12.0f)
                close()
            }
        }
        .build()
        return _eye!!
    }

private var _eye: ImageVector? = null
