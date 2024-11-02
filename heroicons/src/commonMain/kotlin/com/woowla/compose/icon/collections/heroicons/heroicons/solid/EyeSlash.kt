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

public val SolidGroup.EyeSlash: ImageVector
    get() {
        if (_eyeSlash != null) {
            return _eyeSlash!!
        }
        _eyeSlash = Builder(name = "EyeSlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.53f, 2.47f)
                curveTo(3.237f, 2.177f, 2.763f, 2.177f, 2.47f, 2.47f)
                curveTo(2.177f, 2.763f, 2.177f, 3.237f, 2.47f, 3.53f)
                lineTo(20.47f, 21.53f)
                curveTo(20.763f, 21.823f, 21.237f, 21.823f, 21.53f, 21.53f)
                curveTo(21.823f, 21.237f, 21.823f, 20.763f, 21.53f, 20.47f)
                lineTo(3.53f, 2.47f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.676f, 12.553f)
                curveTo(22.132f, 14.189f, 21.223f, 15.658f, 20.045f, 16.863f)
                lineTo(16.946f, 13.764f)
                curveTo(17.143f, 13.213f, 17.25f, 12.619f, 17.25f, 12.0f)
                curveTo(17.25f, 9.101f, 14.899f, 6.75f, 12.0f, 6.75f)
                curveTo(11.381f, 6.75f, 10.787f, 6.857f, 10.236f, 7.054f)
                lineTo(7.759f, 4.577f)
                curveTo(9.068f, 4.044f, 10.5f, 3.75f, 12.0f, 3.75f)
                curveTo(16.971f, 3.75f, 21.186f, 6.973f, 22.676f, 11.441f)
                curveTo(22.796f, 11.802f, 22.796f, 12.192f, 22.676f, 12.553f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.75f, 12.0f)
                curveTo(15.75f, 12.18f, 15.737f, 12.357f, 15.713f, 12.531f)
                lineTo(11.469f, 8.287f)
                curveTo(11.643f, 8.263f, 11.82f, 8.25f, 12.0f, 8.25f)
                curveTo(14.071f, 8.25f, 15.75f, 9.929f, 15.75f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.531f, 15.713f)
                lineTo(8.287f, 11.469f)
                curveTo(8.263f, 11.643f, 8.25f, 11.82f, 8.25f, 12.0f)
                curveTo(8.25f, 14.071f, 9.929f, 15.75f, 12.0f, 15.75f)
                curveTo(12.18f, 15.75f, 12.357f, 15.737f, 12.531f, 15.713f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.75f, 12.0f)
                curveTo(6.75f, 11.381f, 6.857f, 10.787f, 7.054f, 10.236f)
                lineTo(3.955f, 7.137f)
                curveTo(2.777f, 8.342f, 1.867f, 9.811f, 1.323f, 11.447f)
                curveTo(1.203f, 11.808f, 1.203f, 12.198f, 1.324f, 12.559f)
                curveTo(2.813f, 17.027f, 7.028f, 20.25f, 11.999f, 20.25f)
                curveTo(13.5f, 20.25f, 14.932f, 19.956f, 16.241f, 19.423f)
                lineTo(13.764f, 16.946f)
                curveTo(13.213f, 17.143f, 12.619f, 17.25f, 12.0f, 17.25f)
                curveTo(9.101f, 17.25f, 6.75f, 14.899f, 6.75f, 12.0f)
                close()
            }
        }
        .build()
        return _eyeSlash!!
    }

private var _eyeSlash: ImageVector? = null
