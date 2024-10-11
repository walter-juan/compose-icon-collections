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

public val HealthAndMedicalGroup.HeartAdd2Fill: ImageVector
    get() {
        if (_heartAdd2Fill != null) {
            return _heartAdd2Fill!!
        }
        _heartAdd2Fill = Builder(name = "HeartAdd2Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 3.0f)
                curveTo(19.538f, 3.0f, 22.0f, 5.5f, 22.0f, 9.0f)
                curveTo(22.0f, 10.425f, 21.689f, 11.726f, 21.173f, 12.907f)
                curveTo(20.252f, 12.332f, 19.165f, 12.0f, 18.0f, 12.0f)
                curveTo(14.686f, 12.0f, 12.0f, 14.686f, 12.0f, 18.0f)
                curveTo(12.0f, 19.101f, 12.296f, 20.132f, 12.813f, 21.018f)
                curveTo(12.506f, 21.201f, 12.232f, 21.361f, 12.0f, 21.5f)
                curveTo(9.5f, 20.0f, 2.0f, 16.0f, 2.0f, 9.0f)
                curveTo(2.0f, 5.5f, 4.5f, 3.0f, 7.5f, 3.0f)
                curveTo(9.36f, 3.0f, 11.0f, 4.0f, 12.0f, 5.0f)
                curveTo(13.0f, 4.0f, 14.64f, 3.0f, 16.5f, 3.0f)
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
        return _heartAdd2Fill!!
    }

private var _heartAdd2Fill: ImageVector? = null
