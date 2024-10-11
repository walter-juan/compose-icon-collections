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

public val HealthAndMedicalGroup.EmpathizeFill: ImageVector
    get() {
        if (_empathizeFill != null) {
            return _empathizeFill!!
        }
        _empathizeFill = Builder(name = "EmpathizeFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.364f, 10.979f)
                curveTo(19.926f, 12.541f, 19.926f, 15.074f, 18.364f, 16.636f)
                lineTo(12.708f, 22.293f)
                curveTo(12.317f, 22.683f, 11.684f, 22.683f, 11.293f, 22.293f)
                lineTo(5.636f, 16.636f)
                curveTo(4.074f, 15.074f, 4.074f, 12.541f, 5.636f, 10.979f)
                curveTo(7.199f, 9.417f, 9.731f, 9.417f, 11.293f, 10.979f)
                lineTo(12.0f, 11.686f)
                lineTo(12.708f, 10.979f)
                curveTo(14.27f, 9.417f, 16.802f, 9.417f, 18.364f, 10.979f)
                close()
                moveTo(12.0f, 1.0f)
                curveTo(14.21f, 1.0f, 16.0f, 2.791f, 16.0f, 5.0f)
                curveTo(16.0f, 7.209f, 14.21f, 9.0f, 12.0f, 9.0f)
                curveTo(9.791f, 9.0f, 8.0f, 7.209f, 8.0f, 5.0f)
                curveTo(8.0f, 2.791f, 9.791f, 1.0f, 12.0f, 1.0f)
                close()
            }
        }
        .build()
        return _empathizeFill!!
    }

private var _empathizeFill: ImageVector? = null
