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

public val HealthAndMedicalGroup.CapsuleFill: ImageVector
    get() {
        if (_capsuleFill != null) {
            return _capsuleFill!!
        }
        _capsuleFill = Builder(name = "CapsuleFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.779f, 4.222f)
                curveTo(22.122f, 6.565f, 22.122f, 10.364f, 19.779f, 12.707f)
                lineTo(17.656f, 14.828f)
                lineTo(12.708f, 19.778f)
                curveTo(10.364f, 22.121f, 6.565f, 22.121f, 4.222f, 19.778f)
                curveTo(1.879f, 17.435f, 1.879f, 13.636f, 4.222f, 11.293f)
                lineTo(11.293f, 4.222f)
                curveTo(13.636f, 1.879f, 17.435f, 1.879f, 19.779f, 4.222f)
                close()
                moveTo(14.829f, 14.828f)
                lineTo(9.172f, 9.172f)
                lineTo(5.636f, 12.707f)
                curveTo(4.074f, 14.269f, 4.074f, 16.802f, 5.636f, 18.364f)
                curveTo(7.199f, 19.926f, 9.731f, 19.926f, 11.293f, 18.364f)
                lineTo(14.829f, 14.828f)
                close()
            }
        }
        .build()
        return _capsuleFill!!
    }

private var _capsuleFill: ImageVector? = null
