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

public val HealthAndMedicalGroup.EmpathizeLine: ImageVector
    get() {
        if (_empathizeLine != null) {
            return _empathizeLine!!
        }
        _empathizeLine = Builder(name = "EmpathizeLine", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(7.051f, 12.393f)
                curveTo(6.27f, 13.174f, 6.27f, 14.441f, 7.051f, 15.222f)
                lineTo(12.0f, 20.172f)
                lineTo(16.95f, 15.222f)
                curveTo(17.731f, 14.441f, 17.731f, 13.174f, 16.95f, 12.393f)
                curveTo(16.169f, 11.612f, 14.903f, 11.612f, 14.12f, 12.395f)
                lineTo(11.998f, 14.513f)
                lineTo(9.879f, 12.393f)
                curveTo(9.098f, 11.612f, 7.832f, 11.612f, 7.051f, 12.393f)
                close()
                moveTo(12.0f, 1.0f)
                curveTo(14.21f, 1.0f, 16.0f, 2.791f, 16.0f, 5.0f)
                curveTo(16.0f, 7.209f, 14.21f, 9.0f, 12.0f, 9.0f)
                curveTo(9.791f, 9.0f, 8.0f, 7.209f, 8.0f, 5.0f)
                curveTo(8.0f, 2.791f, 9.791f, 1.0f, 12.0f, 1.0f)
                close()
                moveTo(12.0f, 3.0f)
                curveTo(10.896f, 3.0f, 10.0f, 3.895f, 10.0f, 5.0f)
                curveTo(10.0f, 6.105f, 10.896f, 7.0f, 12.0f, 7.0f)
                curveTo(13.105f, 7.0f, 14.0f, 6.105f, 14.0f, 5.0f)
                curveTo(14.0f, 3.895f, 13.105f, 3.0f, 12.0f, 3.0f)
                close()
            }
        }
        .build()
        return _empathizeLine!!
    }

private var _empathizeLine: ImageVector? = null
