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

public val HealthAndMedicalGroup.DislikeFill: ImageVector
    get() {
        if (_dislikeFill != null) {
            return _dislikeFill!!
        }
        _dislikeFill = Builder(name = "DislikeFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.808f, 1.393f)
                lineTo(21.192f, 19.778f)
                lineTo(19.778f, 21.192f)
                lineTo(16.032f, 17.445f)
                lineTo(12.0f, 21.485f)
                lineTo(3.522f, 12.993f)
                curveTo(1.482f, 10.709f, 1.493f, 7.24f, 3.555f, 4.97f)
                lineTo(1.394f, 2.808f)
                lineTo(2.808f, 1.393f)
                close()
                moveTo(20.243f, 4.757f)
                curveTo(22.505f, 7.025f, 22.583f, 10.637f, 20.479f, 12.993f)
                lineTo(18.844f, 14.629f)
                lineTo(7.26f, 3.046f)
                curveTo(8.929f, 2.839f, 10.668f, 3.334f, 12.001f, 4.529f)
                curveTo(14.35f, 2.42f, 17.98f, 2.49f, 20.243f, 4.757f)
                close()
            }
        }
        .build()
        return _dislikeFill!!
    }

private var _dislikeFill: ImageVector? = null
