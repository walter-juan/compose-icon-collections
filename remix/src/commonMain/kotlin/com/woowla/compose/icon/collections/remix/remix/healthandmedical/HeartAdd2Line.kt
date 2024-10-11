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

public val HealthAndMedicalGroup.HeartAdd2Line: ImageVector
    get() {
        if (_heartAdd2Line != null) {
            return _heartAdd2Line!!
        }
        _heartAdd2Line = Builder(name = "HeartAdd2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 9.0f)
                curveTo(4.0f, 6.492f, 5.714f, 5.0f, 7.5f, 5.0f)
                curveTo(9.406f, 5.0f, 10.754f, 6.582f, 12.0f, 7.828f)
                curveTo(13.246f, 6.582f, 14.594f, 5.0f, 16.5f, 5.0f)
                curveTo(18.316f, 5.0f, 20.0f, 6.484f, 20.0f, 9.0f)
                curveTo(20.0f, 10.122f, 19.764f, 11.15f, 19.351f, 12.102f)
                lineTo(21.186f, 12.898f)
                curveTo(21.701f, 11.711f, 22.0f, 10.413f, 22.0f, 9.0f)
                curveTo(22.0f, 5.496f, 19.534f, 3.0f, 16.5f, 3.0f)
                curveTo(14.59f, 3.0f, 13.146f, 3.985f, 12.0f, 5.028f)
                curveTo(10.854f, 3.985f, 9.41f, 3.0f, 7.5f, 3.0f)
                curveTo(4.504f, 3.0f, 2.0f, 5.496f, 2.0f, 9.0f)
                curveTo(2.0f, 12.02f, 3.362f, 14.47f, 5.203f, 16.445f)
                curveTo(7.033f, 18.407f, 9.385f, 19.955f, 11.492f, 21.198f)
                lineTo(12.508f, 19.476f)
                curveTo(10.441f, 18.256f, 8.293f, 16.826f, 6.666f, 15.081f)
                curveTo(5.051f, 13.349f, 4.0f, 11.363f, 4.0f, 9.0f)
                close()
                moveTo(19.0f, 17.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(16.999f)
                lineTo(17.0f, 22.0f)
                horizontalLineTo(19.0f)
                lineTo(18.999f, 19.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _heartAdd2Line!!
    }

private var _heartAdd2Line: ImageVector? = null
