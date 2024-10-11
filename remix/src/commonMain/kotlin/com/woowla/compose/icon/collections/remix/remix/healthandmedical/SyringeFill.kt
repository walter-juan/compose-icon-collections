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

public val HealthAndMedicalGroup.SyringeFill: ImageVector
    get() {
        if (_syringeFill != null) {
            return _syringeFill!!
        }
        _syringeFill = Builder(name = "SyringeFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.678f, 7.979f)
                lineTo(20.264f, 9.393f)
                lineTo(18.142f, 7.272f)
                lineTo(16.021f, 9.393f)
                lineTo(19.557f, 12.929f)
                lineTo(18.142f, 14.343f)
                lineTo(17.435f, 13.636f)
                lineTo(11.071f, 20.0f)
                horizontalLineTo(5.414f)
                lineTo(3.293f, 22.121f)
                lineTo(1.879f, 20.707f)
                lineTo(4.0f, 18.586f)
                verticalLineTo(12.929f)
                lineTo(10.364f, 6.565f)
                lineTo(9.657f, 5.858f)
                lineTo(11.071f, 4.444f)
                lineTo(14.607f, 7.979f)
                lineTo(16.728f, 5.858f)
                lineTo(14.607f, 3.737f)
                lineTo(16.021f, 2.322f)
                lineTo(21.678f, 7.979f)
                close()
                moveTo(9.657f, 14.343f)
                lineTo(6.829f, 11.515f)
                lineTo(5.414f, 12.929f)
                lineTo(8.243f, 15.757f)
                lineTo(9.657f, 14.343f)
                close()
                moveTo(12.486f, 11.515f)
                lineTo(9.657f, 8.686f)
                lineTo(8.243f, 10.101f)
                lineTo(11.071f, 12.929f)
                lineTo(12.486f, 11.515f)
                close()
            }
        }
        .build()
        return _syringeFill!!
    }

private var _syringeFill: ImageVector? = null
