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

public val HealthAndMedicalGroup.StethoscopeLine: ImageVector
    get() {
        if (_stethoscopeLine != null) {
            return _stethoscopeLine!!
        }
        _stethoscopeLine = Builder(name = "StethoscopeLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 3.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.0f)
                curveTo(6.0f, 11.209f, 7.791f, 13.0f, 10.0f, 13.0f)
                curveTo(12.209f, 13.0f, 14.0f, 11.209f, 14.0f, 9.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(15.0f)
                curveTo(15.552f, 3.0f, 16.0f, 3.448f, 16.0f, 4.0f)
                verticalLineTo(9.0f)
                curveTo(16.0f, 11.973f, 13.838f, 14.441f, 11.001f, 14.917f)
                lineTo(11.0f, 16.5f)
                curveTo(11.0f, 18.433f, 12.567f, 20.0f, 14.5f, 20.0f)
                curveTo(15.997f, 20.0f, 17.275f, 19.06f, 17.775f, 17.737f)
                curveTo(16.728f, 17.27f, 16.0f, 16.22f, 16.0f, 15.0f)
                curveTo(16.0f, 13.343f, 17.343f, 12.0f, 19.0f, 12.0f)
                curveTo(20.657f, 12.0f, 22.0f, 13.343f, 22.0f, 15.0f)
                curveTo(22.0f, 16.371f, 21.08f, 17.527f, 19.824f, 17.885f)
                curveTo(19.21f, 20.252f, 17.059f, 22.0f, 14.5f, 22.0f)
                curveTo(11.462f, 22.0f, 9.0f, 19.538f, 9.0f, 16.5f)
                lineTo(9.0f, 14.917f)
                curveTo(6.162f, 14.441f, 4.0f, 11.973f, 4.0f, 9.0f)
                verticalLineTo(4.0f)
                curveTo(4.0f, 3.448f, 4.448f, 3.0f, 5.0f, 3.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(19.0f, 14.0f)
                curveTo(18.448f, 14.0f, 18.0f, 14.448f, 18.0f, 15.0f)
                curveTo(18.0f, 15.552f, 18.448f, 16.0f, 19.0f, 16.0f)
                curveTo(19.552f, 16.0f, 20.0f, 15.552f, 20.0f, 15.0f)
                curveTo(20.0f, 14.448f, 19.552f, 14.0f, 19.0f, 14.0f)
                close()
            }
        }
        .build()
        return _stethoscopeLine!!
    }

private var _stethoscopeLine: ImageVector? = null
